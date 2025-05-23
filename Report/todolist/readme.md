# ✅ To-Do List with Notification (알림 포함)

안드로이드 스튜디오로 구현한 간단한 To-Do List 앱입니다.  
할 일을 등록하고, 원하는 시간에 알림으로 받아볼 수 있습니다.  
또한, 항목을 길게 누르면 삭제할 수 있습니다.

---

## 📱 주요 기능

- 📝 할 일 등록 및 SQLite 저장
- ⏰ 원하는 시간에 알림(Notification) 예약
- 🕒 실시간 현재 시각 표시
- 🗑️ 할 일 롱클릭 시 삭제 다이얼로그 표시
- Android 13 이상 알림 권한 요청 처리

---

## 🔧 사용 기술

- Java
- Android SDK
- SQLite (내장 DB)
- BroadcastReceiver + AlarmManager
- RecyclerView

---

## 📂 주요 파일 구조

```
TodoListApp/
├── AndroidManifest.xml
├── MainActivity.java # 메인 화면 (리스트 + 시계)
├── AddTaskActivity.java # 할 일 추가 화면 (알림 설정)
├── AlarmReceiver.java # 알림 리시버
├── TaskAdapter.java # RecyclerView 어댑터
├── TaskDBHelper.java # SQLite DB 헬퍼
├── Task.java # Task 모델
└── res/layout/
├── activity_main.xml
├── activity_add_task.xml
└── item_task.xml
```

