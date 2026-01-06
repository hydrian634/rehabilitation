## Architecture

This project follows a layered architecture inspired by
DDD and Clean Architecture.

### Dependency Rule

Dependencies must point inward.

interface
→ application
→ domain

infrastructure
→ application / domain

### Forbidden Dependencies

- domain must NOT depend on Spring Framework
- domain must NOT depend on infrastructure implementations
- domain must NOT depend on controllers or web layers
