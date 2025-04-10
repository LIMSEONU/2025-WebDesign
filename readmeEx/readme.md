# 📘 Markdown 문법 정리 (GitHub용)

Markdown은 README.md 파일을 예쁘고 깔끔하게 꾸밀 수 있는 문서 포맷입니다.  
아래는 GitHub에서 자주 사용하는 Markdown 문법을 하나로 정리한 예시입니다.

---

## 🧾 기본 문법 모음

### ✅ 텍스트 스타일
```markdown
**굵은 글씨**
*기울임*
***굵고 기울임***
~~취소선~~
`인라인 코드`
```

예시:  
**굵게**  
*기울임*  
***둘 다***  
~~취소선~~  
`인라인 코드`

---

### ✅ 링크 & 이미지
```markdown
[링크텍스트](https://example.com)

![이미지설명](https://example.com/image.png)
```

예시:  
[Google](https://google.com)  
![예시이미지](https://via.placeholder.com/150)

---

### ✅ 코드블럭
<pre>
\```언어
여러 줄의 코드
\```
</pre>

```markdown
```javascript
console.log("Hello, Markdown!");
```
```

결과:
```javascript
console.log("Hello, Markdown!");
```

---

### ✅ 제목 (Heading)
```markdown
# 제목1
## 제목2
### 제목3
#### 제목4
##### 제목5
###### 제목6
```

---

### ✅ 목록 (List)
```markdown
- 순서 없는 항목
  - 하위 항목

1. 순서 있는 항목
2. 두 번째 항목
```

---

### ✅ 체크박스 (To-do List)
```markdown
- [ ] 할 일
- [x] 완료된 일
```

결과:
- [ ] 할 일  
- [x] 완료된 일

---

### ✅ 인용문 (Quote)
```markdown
> 인용문입니다.
>> 중첩 인용문
```

결과:
> 인용문입니다.  
>> 중첩 인용문

---

### ✅ 표 (Table)
```markdown
| 제목1 | 제목2 |
|-------|-------|
| 내용1 | 내용2 |
| 내용3 | 내용4 |
```

결과:

| 제목1 | 제목2 |
|-------|-------|
| 내용1 | 내용2 |
| 내용3 | 내용4 |

---

### ✅ 구분선
```markdown
---
```

결과:
---

---

> 이 문서는 GitHub용 README 작성 시 사용할 수 있는 Markdown 문법을 한눈에 보기 쉽게 정리한 예시입니다.

