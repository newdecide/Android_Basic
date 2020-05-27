# 01_액티비티 생명주기
# 액티비티 생명주기 개념
- onCreate() : Activity 생성
- onStart() : Activity 시작
- onResume() : Activity 재개
- onPause() : Activity 일시 정지
- onStop() : Activity 활동 중단
- onDestroy() : Activity 활동 종료

![image](https://user-images.githubusercontent.com/6762927/82819981-4d97a900-9edc-11ea-88d1-73d14a069d51.png)

# 액티비티 상태 저장
- onSaveInstanceState() : 데이터 화면 전환시 데이터가 날라가지 않도록 저장
- onRestoreInstanceState() : 데이터 번들에 저장한 데이터로 상태 유지