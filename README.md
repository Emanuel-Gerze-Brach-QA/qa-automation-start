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
