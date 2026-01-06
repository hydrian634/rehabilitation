# Rehabilitation Project - MILESTONE

### 코딩근육 재활 프로젝트

------

Github Issue 기반 개발 프로젝트로 행동 로그 기반 콘텐츠/서비스 분석 플랫폼을 구현할 예정입니다.<br>

Language: Java 17<br>
Framework: Spring Boot<br>
Architecture: Domain-driven, UseCase-oriented<br>
Interfaces: REST API, Scheduler (Web UI is optional)<br>

========

## Description

1-2년 간 쉬었음 청년으로 살았던 청년의 코딩근육 재활 프로젝트입니다.<br>

이 프로젝트는 GitHub Issue 기반 워크플로우로 개발됩니다.<br>

각 Issue는 1~3시간 내에 완료 가능한, 명확하게 범위가 정의된 작업 단위이며<br> 

 - **해당 작업이 왜 필요한지**
 - **어떤 문제를 해결하는지**
 - **완료 기준(Completion Criteria) 이 무엇인지**

포함합니다.<br>

모든 커밋은 Issue와 연결되며, 이를 통해 프로젝트 전반의 설계 의도와 의사결정 과정을 추적 가능하게 유지하였습니다.<br>

또한 이 프로젝트는 ChatGPT를 사용하여 제작됨을 밝힙니다.

--------
#마일스톤 (Milestones)
Milestone 0 — 프로젝트 초기 구성 (Project Bootstrap)<br>

애플리케이션 정상 기동 여부 확인<br>

상태 확인을 위한 최소한의 HTTP 인터페이스 구성<br>

패키지 구조 확립<br>
(domain / application / interface / infrastructure)<br>

--------

###Milestone 1 — 핵심 도메인 모델링 (Core Domain Modeling)

행동(Action) / 이벤트(Event) 도메인 모델 정의

도메인 수준의 검증 로직 및 정책 구현

웹 및 영속성 계층에 대한 의존성 제거

--------

###Milestone 2 — 유즈케이스 구현 (UseCase Implementation)

애플리케이션 유즈케이스 정의

도메인 객체들의 흐름 및 조합 관리

트랜잭션 경계 명확화

--------

###Milestone 3 — 인터페이스 통합 (Interface Integration)

여러 인터페이스 중 하나로서의 REST API 제공

Controller를 얇게 유지하고, 프레임워크 의존 코드 격리

--------

###Milestone 4 — 비동기 처리 (Asynchronous Processing)

스케줄링 기반 집계 작업 구현

이벤트 기반 처리 개념 적용

--------

###Milestone 5 — 선택적 UI / 조회 인터페이스 (Optional UI / Query Interface)<br>

데이터 확인을 위한 최소한의 웹 UI 제공<br>

핵심 비즈니스 로직과 분리된 보조적 구성 요소로 유지<br>

각 Milestone은 여러 개의 GitHub Issue로 구성되며,
프로젝트의 진행 상황은 대규모 기능 단위 커밋이 아닌 Issue 단위로 관리됩니다.<br>

==========

이 프로젝트는 각 마일스톤을 여러 이슈로 나누어 관리합니다. 한 번에 큰 기능을 커밋하기보다, 개별 이슈를 통해 개발 과정을 투명하게 기록하고 추적합니다.<br>
각 마일스톤은 여러 개의 이슈로 구성되며, 대규모 커밋 대신 이슈 단위로 진행 상황을 관리합니다. 이를 통해 코드 리뷰의 효율성을 높이고 작업 히스토리를 명확히 유지하고 있습니다.<br>
