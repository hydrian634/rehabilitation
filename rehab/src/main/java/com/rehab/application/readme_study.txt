Application 패키지(usecase 계층)
- 비즈니스 흐름을 조합
- "무엇을 언제 어떻게 실행하느냐"

포함 요소

UseCase / Service

Command / Query DTO

Transaction 경계

특징

domain 객체를 조합만 함

비즈니스 규칙은 domain에 위임

트랜잭션 단위가 여기서 결정됨

흔한 실수
❌ application에 비즈니스 로직이 쌓임
✅ application은 orchestration 담당