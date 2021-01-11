# chapter 4 프로그램의 흐름 제어

## 4-1 조건문

### in 연산자와 범위 연산자

```kotlin
else if (score >= 80.0 && score <= 89.9)와
else if (score in 80.0..89.9)는 같은 표현
```

### when문

조건이 많이 필요한 경우 더 편리하고 간단한 문장 구성 가능

자바 등 다른 언어에서 쓰이는 switch~case문과 비슷하지만 break와 같은 문장 필요x

위에서 설명한 **in 연산자**와 **is 키워드** 사용 가능

인자가 없이도 사용 가능

```kotlin
when (인자) {
    인자에 일치하는 값 혹은 표현식 -> 수행할 문장
    인자에 일치하는 범위 -> 수행할 문장
    ...
    
    else -> 수행할 문장
}
```

## 4-2 반복문

### for문

자바의 for문과 달리 세미콜론을 사용하지 않는다 -> 위에서 설명한 in 연산자와 사용

감소하는 방향은 **downTo** 사용, 규칙적으로 증감 연산에는 **step**사용

```kotlin
for (요소 변수 in 컬렉션 또는 범위) { 반복할 본문 }
```

### while문

조건식이 true를 만족하는 경우 while문의 블록을 무한히 반복

### do~while문

do 블록에 작성한 본문을 한 번은 실행한 다음 마지막에 조건식을 검사하여 true가 나오면 작업을 반복

## 4-3 흐름의 중단과 반환

### return문

함수에서 결괏값을 반환하거나 지정된 라벨로 이동한다

코드 자체에서 Unit과 return을 생략할 경우 컴파일러는 Unit을 반환하는 것으로 가정한다.
