1. 비즈니스 핵심(domain)을 기술적 요소로부터 보호
2. 의존성 방향을 안쪽(domain)으로만 흐르게 설계
Domain은 어떤 프레임워크도 몰라야 하고
Infrastructure는 Domain을 알고 있지만, 반대는 성립하지 않습니다.

Domain은 핵심 비즈니스 영역
- 비즈니스 규칙 그 자체.(이곳에서 Policy를 세운다.)
- 시스템이 "무엇을 하는가"에 대한 정의

특징

Spring, JPA, DB, Web, JSON 전혀 몰라야 함

순수 Java 객체(POJO) 중심

테스트하기 가장 쉬운 계층

❗ “이 클래스가 Spring 없이도 의미가 있는가?”
→ YES면 domain에 있음