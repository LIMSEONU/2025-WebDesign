# 📝 Android 메모장 앱 과제

## 📌 과제 개요

Android Studio를 활용해 다양한 저장 방식을 적용한 메모장 앱을 개발하였습니다.

총 3가지 저장 방식을 구현하였습니다:

| 저장 방식 | 설명 |
|-----------|------|
| ✅ 파일 저장 | FileOutputStream을 이용해 내부 저장소에 `.txt` 형식으로 저장 |
| ✅ SQLite 저장 | SQLite를 활용하여 메모 데이터를 DB에 저장하고 검색/삭제 가능 |
| ✅ 기존 To-Do 앱 | 지난 미션에서 만든 SQLite 기반 To-Do 리스트 기능 포함 |

---

## 🎨 주요 기능

- 메모 입력 UI
- 메모 저장 (파일 + SQLite)
- SQLite 검색 기능
- 전체 메모 리스트 보기 (ListView)
- 리스트 항목 길게 클릭 시 삭제
- 뒤로가기 버튼으로 메인화면 복귀

---

## 📱 앱 화면 구성

| 시작 화면 | 메모 입력 및 버튼 |
|------------|-------------------|
| 중앙 이미지, 입력창, 버튼 3개 (저장, 찾기, 전체보기) |

### ✅ 버튼 기능 설명
- `저장하기`: 파일 + SQLite에 동시에 저장
- `찾기`: SQLite에서 키워드로 검색
- `전체 목록 보기`: 모든 메모 출력 (삭제 가능)
- `← 뒤로가기`: MainActivity로 이동

---

## 📂 저장 파일 구조

- `/app/src/main/java/com/example/simplememo/`
  - `MainActivity.java`
  - `SearchActivity.java`
  - `ViewAllActivity.java`
  - `MemoDBHelper.java`
- `/res/layout/`
  - `activity_main.xml`
  - `activity_search.xml`
  - `activity_view_all.xml`
- `/res/drawable/`
  - `note_image.png`, `round_button.xml`, `edittext_background.xml`
- `/AndroidManifest.xml`

---

## 🛠 개발 환경

- Android Studio
- Java
- Min SDK: 21 이상
- Gradle: 최신 버전

---

## ✅ 실행 화면 캡처

### 📱 메인 화면
![메인 화면](images/screenshot_main.png)

### 🔍 검색 화면
![검색 화면](images/screenshot_search.png)

### 📋 전체 목록 화면
![전체 목록](images/screenshot_list.png)
---

