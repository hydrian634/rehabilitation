/**
 * Infrastructure layer.
 *
 * Contains technical implementations such as:
 * - Database persistence (JPA, JDBC)
 * - External API clients
 * - Messaging, caching, file systems
 *
 * Dependency rules:
 * - May depend on domain and application layers
 * - Must NOT be depended on by domain layer
 *
 * Implementation details in this layer should be
 * replaceable without affecting core business logic.
 */

package com.rehab.infrastructure;
