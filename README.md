# QA Automation – Learning Project

This project marks my transition from Senior Manual QA to QA Automation Engineer.

## Goal
- Build automation skills step by step
- Focus on API and UI automated testing
- Learn automation tools through practice

## Background
- 5+ years of Manual QA experience
- Experience in Agile teams

## Status
🚧 Work in progress
---

## ✅ Milestone – API Testing (Postman → Java Automation)

This milestone covers my first complete API testing workflow, from manual exploration to automated validation.

### Manual API Testing (Postman)
- Endpoint tested: `GET /users/{id}`
- Scenario: Non-existing user (id = 9999)
- Observed behavior:
    - HTTP Status Code: **404 Not Found**
    - Response body: empty

Manual exploration was done using Postman, and the collection is stored in the `postman/` directory.

### Automated API Test (Java)
- Tools used:
    - Java
    - REST Assured
    - JUnit 5
- Automated scenario:
    - `GET /users/9999`
    - Assertion: HTTP **404**

The automated test validates that the API behavior observed manually is consistent and can be reliably checked in an automated way.

---

## ✅ Milestone – API Testing with Query Parameters (Postman → Java)

This milestone covers API testing for endpoints that use query parameters and return collections.

### Manual API Testing (Postman)
- Endpoint tested: `GET /posts?userId=1`
- Scenario: Retrieve posts filtered by userId
- Observed behavior:
  - HTTP Status Code: **200 OK**
  - Response body is a list of posts
  - All returned posts have `userId = 1`

### Automated API Test (Java)
- Tools used:
  - Java
  - REST Assured
  - JUnit 5
- Automated validations:
  - Status code is **200**
  - All items in the response have `userId = 1` using `everyItem`

This test demonstrates data consistency validation for filtered API responses.

---

## ✅ Milestone – API Filtering with Empty Results (Postman → Java)

This milestone covers API behavior when a query parameter returns no matching data.

### Manual API Testing (Postman)
- Endpoint tested: `GET /posts?userId=9999`
- Scenario: Filter posts by a non-existing userId
- Observed behavior:
  - HTTP Status Code: **200 OK**
  - Response body: **empty list (`[]`)**

A Postman test was added to validate that the response array is empty.

### Automated API Test (Java)
- Tools used:
  - Java
  - REST Assured
  - JUnit 5
- Automated validations:
  - Status code is **200**
  - Response body is an empty list using `hasSize(0)`

This test validates correct API behavior when a filter does not return any data, a common real-world scenario in backend services.

---

## ✅ Milestone – API Resource Creation with POST (Postman → Java)

This milestone covers creating a new resource using an HTTP POST request and validating the response behavior.

### Manual API Testing (Postman)
- Endpoint tested: `POST /posts`
- Request body sent as JSON:
  - `title`
  - `body`
  - `userId`
- Observed behavior:
  - HTTP Status Code: **201 Created**
  - Response contains the submitted fields
  - Response includes a generated `id`

Postman tests were added to validate:
- Status code **201**
- Presence of the `id` field in the response

### Automated API Test (Java)
- Tools used:
  - Java
  - REST Assured
  - JUnit 5
- Automated validations:
  - Status code is **201**
  - Response contains a non-null `id`

This milestone demonstrates creating resources via API requests and validating successful creation behavior, a core scenario for backend and API-driven systems.
