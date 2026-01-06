interface 패키지 (외부와의 접점)

- 외부 요청을 내부 모델로 변환
- Controller / API / UI 어댑터

포함 요소

= REST Controller
= Request / Response DTO
= Validation

특징

HTTP, JSON, Validation 어노테이션 존재
application UseCase를 호출
domain 객체 직접 노출 ❌

Controller는 얇아야 합니다. (단순해야 한다는 뜻인 듯.)
변환 → 호출 → 반환만 수행