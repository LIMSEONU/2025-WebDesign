# 🎬 작품 갤러리 앱 (학생 창작 작품 전시)

안드로이드 스튜디오로 제작한 ViewPager2 기반의 갤러리 앱입니다.  
영화, 뮤지컬, 연극 등 다양한 문화 콘텐츠를 이미지와 함께 소개합니다.

---

## 📱 주요 기능

- ViewPager2를 활용한 **가로 슬라이드 갤러리**
- 각 페이지에 **작품 이미지**와 **제목 텍스트** 표시
- 제목은 이미지 하단에 **흰색 반투명 배경**으로 겹쳐 표시되어 가독성이 높음

---

## 🖼️ 전시된 작품 예시

1. **2025 영화 베스트 작품** (야당)  
2. **2024-25 뮤지컬 베스트 작품** (시지프스)  
3. **2024 연극 베스트 작품** (맥베스)

> 모든 이미지는 `res/drawable` 폴더에 `art1.jpg`, `art2.jpg`, `art3.jpg` 형식으로 저장되어 있습니다.  
> 파일명은 **소문자 + 언더스코어** 규칙을 따릅니다.

---

## 🛠 개발 환경

- **개발 도구**: Android Studio (Java)
- **타겟 SDK**: 33
- **최소 SDK**: 21 이상
- **라이브러리**: ViewPager2, AppCompat

---

## 📂 파일 구조
```
com.example.recyclerview/
│
├── MainActivity.java // ViewPager2 초기화 및 작품 목록 연결
├── Artwork.java // 데이터 클래스 (제목 + 이미지 ID)
├── ArtworkAdapter.java // 어댑터: 이미지와 텍스트 View 생성
├── res/
│ ├── layout/
│ │ ├── activity_main.xml // ViewPager2 UI 구성
│ │ └── item_artwork.xml // 각 페이지에 들어갈 작품 레이아웃
│ └── drawable/
│ ├── art1.jpg
│ ├── art2.jpg
│ └── art3.jpg
```


