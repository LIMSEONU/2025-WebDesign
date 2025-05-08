# 📄 AndroidManifest.xml 및 그래프 구현 설명

이 문서는 설문조사 앱 `surveyapp`의 AndroidManifest.xml 설정과 결과 화면에 그래프를 구현하기 위한 방법을 포함합니다.

---

## ✅ AndroidManifest.xml 역할

`AndroidManifest.xml`은 Android 앱의 **기본 정보**, **구성 요소 등록**, **권한 및 테마 설정** 등을 정의하는 핵심 파일입니다.

---

## ⚙️ 적용된 구성 요소

### 📌 기본 설정
```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
          xmlns:tools="http://schemas.android.com/tools"
          package="com.example.surveyapp">
```
- **패키지명**: 앱의 고유 ID 역할
- **tools:targetApi="31"**: 개발 타겟 API를 명시

### 📦 application 태그 내부 설정
```xml
<application
    android:allowBackup="true"
    android:dataExtractionRules="@xml/data_extraction_rules"
    android:fullBackupContent="@xml/backup_rules"
    android:icon="@mipmap/ic_launcher"
    android:label="@string/app_name"
    android:roundIcon="@mipmap/ic_launcher_round"
    android:supportsRtl="true"
    android:theme="@style/Theme.Surveyapp"
    tools:targetApi="31">
```
- **아이콘, 라벨, 백업 정책 등 기본 앱 속성** 정의
- **테마 설정**: `Theme.Surveyapp`

---

## 🧩 등록된 액티비티 목록

### 1️⃣ `MainActivity`
```xml
<activity
    android:name=".MainActivity"
    android:exported="true">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```
- 앱을 실행할 때 가장 먼저 뜨는 화면입니다.
- 런처 아이콘 클릭 시 시작되는 진입점입니다.

### 2️⃣ `QuestionActivity`
```xml
<activity android:name=".QuestionActivity" />
```
- 설문 항목을 보여주는 액티비티입니다.
- `MainActivity`에서 버튼 클릭 시 이동합니다.

### 3️⃣ `ResultActivity`
```xml
<activity android:name=".ResultActivity" />
```
- 설문 결과를 요약하고 그래프로 보여주는 화면입니다.

---

## 📊 결과 그래프 구현 (BarChart)

### 🔧 1. 의존성 추가
**`build.gradle(:app)`** 파일의 `dependencies` 블록 안에 다음 라인을 추가:
```gradle
implementation 'com.github.PhilJay:MPAndroidChart:v3.1.0'
```

### 🔧 2. 저장소 설정
**`settings.gradle` 또는 `build.gradle(Project)`** 파일에 `jitpack.io` 추가:
```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io") // ✅ 그래프 라이브러리 위한 저장소
    }
}
```

### 🔧 3. BarChart 레이아웃 (XML)
**`activity_result.xml`** 예시:
```xml
<com.github.mikephil.charting.charts.BarChart
    android:id="@+id/barChart"
    android:layout_width="match_parent"
    android:layout_height="300dp"
    app:layout_constraintTop_toBottomOf="@id/resultText" />
```

### 🔧 4. 결과 액티비티에서 BarChart 설정 (Java)
**`ResultActivity.java`** 내부:
```java
ArrayList<BarEntry> entries = new ArrayList<>();
for (int i = 0; i < SurveyManager.answers.length; i++) {
    entries.add(new BarEntry(i, SurveyManager.answers[i]));
}

BarDataSet dataSet = new BarDataSet(entries, "디지털 피로 점수");
dataSet.setColor(Color.parseColor("#FF9800"));
BarData data = new BarData(dataSet);
chart.setData(data);

XAxis xAxis = chart.getXAxis();
xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
chart.invalidate();
```

📌 위 코드를 통해 설문 점수별로 그래프가 그려지고, 평균 점수에 따른 메시지를 출력합니다.

---
