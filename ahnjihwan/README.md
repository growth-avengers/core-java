# Core-Java

## Gradle로 Java Application 빌드 환경
1. 프로젝트에 생성할 폴더를 만듭니다.
```bash
mkdir demo
cd demo
```

2. `Terminal`에 다음과 같은 명령어를 입력합니다.
```bash
gradle init
```
3. Gradle에 메시지가 표시가 되고 다음과 같은 항목이 나옵니다.

```
Select type of project to generate:
  1: basic
  2: application // (1)
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 2

Select implementation language:
  1: C++
  2: Groovy
  3: Java // (2)
  4: Kotlin
  5: Scala
  6: Swift
Enter selection (default: Java) [1..6] 3

Select build script DSL:
  1: Groovy (3)
  2: Kotlin
Enter selection (default: Groovy) [1..2] 1

Select test framework:
  1: JUnit 4
  2: TestNG
  3: Spock
  4: JUnit Jupiter (4)
Enter selection (default: JUnit 4) [1..4]

Project name (default: demo): {프로젝트명}
Source package (default: demo): {패키지명}

BUILD SUCCESSFUL
2 actionable tasks: 2 executed
```
* (1) Application를 선택합니다.
* (2) Java를 선택합니다.
* (3) Groovy를 선택합니다.
* (4) Junit 5를 선택하기 위해서 선택합니다.

4. 위 항목들을 다 선택 했으면 프로젝트가 생성이 됩니다.

```groovy
├── gradle 
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew 
├── gradlew.bat 
├── settings.gradle 
└── app
    ├── build.gradle 
    └── src
        ├── main
        │   └── java 
        │       └── demo
        │           └── App.java
        └── test
            └── java 
                └── demo
                    └── AppTest.java
```

## 라이브러리 추가하기

테스트 코드를 작성하도록 돕는 AssertJ 라이브러리를 알아봅시다.

### AssertJ의 장점
* 메소드 체이닝을 지원하기 때문에 좀 더 깔끔하고 읽기 쉬운 테스트 코드를 작성할 수 있습니다.
* 개발자가 테스트를 하면서 필요하다고 상상할 수 있는 거의 모든 메소드를 제공합니다.

1. Gradle에 AssertJ 라이브러리를 추가합니다.
```groovy
testImplementation 'org.assertj:assertj-core:3.24.2'
```

2. AssertJ 메소드를 임포트합니다.
```java
import static org.assertj.core.api.Assertions.assertThat; 
```

3. AppTest.java 테스트 코드를 작성합니다.
```java
assertThat(classUnderTest.getGreeting()).isEqualTo("Hello World!");
```
