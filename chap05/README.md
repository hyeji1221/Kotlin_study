# chapter 5 클래스와 객체

## 05-1 클래스와 객체의 정의

|    개념     |                        설명                        |
| :---------: | :------------------------------------------------: |
|   추상화    |  특정 클래스를 만들 때 기본 형식을 규정하는 방법   |
|  인스턴스   |              클래스로부터 생성한 객체              |
|    상속     | 부모 클래스의 내용을 자식 클래스가 그대로 물려받음 |
|   다형성    |         하나의 이름으로 다양한 처리를 제공         |
|   캡슐화    |          내용을 숨기고 필요한 부분만 사용          |
| 메시지 전송 |             객체 간에 주고받는 메시지              |
|    연관     |                  클래스 간의 관계                  |

### 객체 지향 프로그래밍과 용어

| 코틀린에서 사용하는 용어 | 다른 언어에서 사용하는 용어 |
| :----------------------: | :-------------------------: |
|          클래스          |         분류, 범주          |
|         프로퍼티         |  속성, 변수, 필드, 데이터   |
|          메서드          |      함수, 동작, 행동       |
|           객체           |          인스턴스           |

### 클래스와 추상화

**추상화** : 목표로 하는 대상에 대해 필요한 만큼 속성과 동작을 정의하는 과정

**클래스**로부터 **객체**를 생성해야만 비로소 클래스라는 개념의 실체인 객체가 물리적인 메모리 영역에서 실행된다

메모리에올라간 객체를 **인스턴스**라고 한다

## 05-2 생성자

**생성자** : 클래스를 통해 객체가 만들어질 때 기본적으로 호출되는 함수

- 주 생성자
- 부 생성자
  + 필요하면 매개변수를 다르게 여러 번 정의 가능
  + constructor 키워드 사용

### 부 생성자

클래스의 본문에 함수처럼 선언

### 주 생성자

클래스의 이름과 함께 생성자 정의를 이용할 수 있는 기법

클래스 이름과 블록 시작 부분 사이에 선언

#### 초기화 블록을 가진 주 생성자

객체 생성 시 변수 초기화 이외에 코드를 실행하는 법

init{...} 초기화 블록을클래스 선언부에 넣어준다

## 05-3 상속과 다형성

**상속** : 자식 클래스를 만들 때 상위 클래스의 속성과 기능을 물려받아 계승하는 것

**다형성** : 메서드가 같은 이름을 사용하지만 구현 내용이 다르거나 매개변수가 달라서 하나의 이름으로 다양한 기능을 수행할 수 있는 개념

### 상속과 클래스의 계층

코틀린 모든 클래스는 Any 클래스의 하위 클래스가 된다 -> 클래스를 명시하지 않으면 Any 클래스를 상속받게 된다

**open** 없이 기본 클래스를 선언하면 상속할 수 없는 기본 클래스가 된다. -> open 키워드를 사용해야 파생 클래스에서 상속할 수 있다.

### 다형성

이름이 동일하지만 매개변수가 서로 다른 형태를 취하거나 실행 결과를 다르게 가질 수 있는 것

**오버로딩** 

- 동작은 동일하지만 인자의 형식만 달라지는 것
- 동일한 클래스 안에서 같은 이름의 메서드가 매개변수만 달리해서 여러 번 정의될 수 있는 개념으로 반환값은 동일하거나 달라질 수 있다
- 구현되는 동작은 대부분 동일하다
- 클래스의 메서드뿐만 아니라 일반 함수도 오버로딩 가능
- 같은 이름의 메서드로 다양한 인자를 처리할 수 있기 때문에 메서드 손쉽게 확장 가능

#### 오버라이딩

- 하위의 새로운 메서드는 상위 클래스의 메서드의 내용을 완전히 새로 만들어 다른 기능을 하도록 정의 -> **재정의한다**
- 기반 클래스 -> **open** 키워드, 파생 클래스 -> **override**
- 아예 오버라이딩을 막기 위해서는 **final** 키워드 사용
- 코틀린에서는 메서드 뿐만 아니라 프로퍼티도 오버라이딩 가능

## 05-4 super와 this의 참조

**super와 this 키워드의 이용**

|                       super                        |                       this                        |
| :------------------------------------------------: | :-----------------------------------------------: |
| super.프로퍼티 이름 -> 상위 클래스의 프로퍼티 참조 | this.프로퍼티 이름 -> 현재 클래스의 프로퍼티 참조 |
| super. 메서드 이름() -> 상위 클래스의 메서드 참조  |  this.메서드 이름() -> 현재 클래스의 메서드 참조  |
|        super() -> 상위 클래스의 생성자 참조        |        this() -> 현재 클래스의 생성자 참조        |

- 주 생성자와 부 생성자가 함께 있는 경우 this를 사용해 주  생성자를 가리킬 수 있다
- 클래스 안에 클래스 선언이 가능하다
  + 이너 클래스에서 바깥 클래스의 상위 클래스를 호출하려면 super 키워드와 함께 @ 기호 옆에 바깥 클래스 이름을 작성한다

### 인터페이스에서 참조하기

- 일종의 구현 약속으로 인터페이스를 구현하는 클래스에서 생성해야 한다
- 자바처럼 다중 상속이 되지 않는다
- 인터페이스로는 필요한 만큼 다수의 인터페이스를 지정해 구현해줄 수 있다

# 05-5 정보 은닉 캡슐화

**캡슐화** : 클래스를 작성할 때 숨겨야 하는 속성이나 기능

**가시성** : 각 클래스나 메서드, 프로퍼티의 접근 범위

| 가시성 지시자 |                             설명                             |
| :-----------: | :----------------------------------------------------------: |
|    private    | 외부에서 접근할 수 없다<br />그 클래스 안의 멤버만 접근 가능 |
|    public     |               어디서든 접근이 가능하다(기본값)               |
|   protected   |       외부에서 접근 불가하나 하위 상속 요소에서는 가능       |
|   internal    | 같은 정의의 모듈 내부에서 접근 가능<br />패키지 이름이 다르다면 import 구문을 이용해 사용 가능 |

 주 생성자 앞에 가시성 지시자를 사용하는 경우 constructor 키워드를 생략할 수 없다

# 05-6 클래스와 클래스의 관계

## 클래스 혹은 객체 간의 관계

**연관이나 의존 관계**: 약하게 참조 -> 소유의 개념 없이 어떤 객체에서 다른 객체를 이용하는 개념

**집합 관계** : 제로, 하나 혹은 다수의 객체와 연관을 가질 수 있는 개념

**합성 혹은 구성 관계** : 아주 밀접하게 관련되어 있어 독립적으로 존재하기 힘든 것

1. 클래스가 서로 참조하는지에 따라 나뉜다
2. 생명주기에 영향을 주는지에 따라 나뉜다