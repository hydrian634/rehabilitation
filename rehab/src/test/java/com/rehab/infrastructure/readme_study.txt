Infrastructure 패키지(기술 구현체)

-기술적인 세부 구현
- DB, 외부 API, 메시지 브로커 등

포함 요소
-JPA Repository 구현
-Entity Mapping
-외부 API Client
-메시지 큐, 파일, 캐시

특징
-domain의 인터페이스를 구현
-가장 바깥 계층
-교체 가능해야 한다.(DB 변경 등)
