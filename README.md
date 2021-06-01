# Programmers_42891
## 프로그래머스 - 무지의 먹방(https://programmers.co.kr/learn/courses/30/lessons/42891)  
주어진 문제 그대로를 구현하려 하다보니 효율성이 최악인 코드를 완성할 수 있었다,,  
다른 고수님들 코드를 통해 '정렬'을 사용한 걸 확인할 수 있었다...    
아직 갈길이 먼 것 같다..    

실행 순서는 다음과 같습니다 :  
1. Food 객체(instance 변수 : long time, int index)
2. ArrayList 에 input 정보를 담은 Food 객체들 입력
3. Index, Time 오름차순 정렬을 위한 Comparator 생성
4. Time 기준으로 ArrayList 정렬
5. 방송이 중단되는 시간까지 각 음식의 시간 차감 
6. 방송 중단 시점에서 남은 음식들만 index기준 정렬
7. 정렬된 음식 중 
