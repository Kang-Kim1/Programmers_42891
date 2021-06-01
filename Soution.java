import java.util.*;

class Solution {
    class Food {
        Food(int i, int t) {
            this.index = i;
            this.time = t;
        }
        int index;
        long time;
    }
    
    public int solution(int[] food_times, long k) {
        ArrayList<Food> foodList = new ArrayList<Food>();
        

        for(int i = 0; i < food_times.length; i++) 
        {
            Food f = new Food(i + 1, food_times[i]);
            foodList.add(f);
        }
        

        Comparator<Food> compIndex = new Comparator<Food>() {
            @Override
            public int compare(Food fA, Food fB) {
                return fA.index - fB.index;
            }
        };
        
        Comparator<Food> compTime = new Comparator<Food>() {
            @Override
            public int compare(Food fA, Food fB) {
                return (int)(fA.time - fB.time);
            }
        };
        
        foodList.sort(compTime);
        
        int i = 0;
        int l = foodList.size();
        long prevTime = 0;
        
        for(Food food : foodList) {
            long diff = food.time - prevTime;
            
            if(diff != 0) {
                long timeSpent = diff * l;
                
                if(timeSpent <= k) {
                    k -= timeSpent;
                    prevTime = food.time;
                } else {
                    // 0일 경우 첫번째 index에 위치
                    k %= l;
                    
                    // 아직 time이 남은 영역만 index 기준으로 정렬
                    foodList.subList(i,foodList.size()).sort(compIndex);
                    
                    return foodList.get(i + (int)k).index;
                    
                }
            }   
            // 확인한 index에 대한 업데이트
            i++;
            l--;
            
        }
        return -1;
    }
}
