/**
 * Interface layer.
 *
 * Acts as an adapter between external systems (HTTP, JSON, UI)
 * and the application layer.
 *
 * Responsibilities:
 * - Handle incoming requests (e.g. REST controllers)
 * - Validate and transform request/response DTOs
 * - Delegate execution to application use cases
 *
 * Dependency rules:
 * - May depend on application layer
 * - Must NOT contain business logic
 * - Must NOT directly access infrastructure implementations
 *
 * This layer should remain thin.
 */


package com.rehab.interfaces.web;
