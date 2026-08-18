# Job Portal Backend

A backend service for a modern job portal, designed to provide reliable REST APIs for managing users, job listings, and job applications.

## Overview

**Job Portal Backend** is a backend engineering project built with **Node.js, Express.js, and MySQL**.

The project is being developed incrementally with an emphasis on clean API design, modular architecture, relational data modelling, authentication, validation, security, and maintainable server-side development.

## Tech Stack

* **Node.js** — JavaScript runtime
* **Express.js** — REST API framework
* **MySQL** — Relational database
* **JWT** — Authentication
* **bcrypt** — Password hashing
* **dotenv** — Environment configuration
* **Postman** — API testing
* **Git & GitHub** — Version control

## Current Status

**In Development**

The backend foundation is currently being established. Features will be added and documented as development progresses.

## Development Roadmap

* [x] Project initialization
* [x] Express server setup
* [ ] Environment configuration
* [ ] MySQL database integration
* [ ] Job management APIs
* [ ] Job search and filtering
* [ ] Application management APIs
* [ ] User authentication
* [ ] Authorization
* [ ] Request validation
* [ ] Centralized error handling
* [ ] API testing
* [ ] API documentation
* [ ] Deployment

## Project Structure

```text
job-portal-backend/
│
├── src/
│   └── server.js
│
├── .env
├── .env.example
├── .gitignore
├── package.json
├── package-lock.json
└── README.md
```

The project structure will evolve as additional modules and features are introduced.

## Getting Started

### Prerequisites

Make sure the following are installed:

* Node.js
* npm
* MySQL
* Git

### Installation

Clone the repository:

```bash
git clone https://github.com/bagichethan-decode/job-portal-backend.git
```

Navigate to the project:

```bash
cd job-portal-backend
```

Install dependencies:

```bash
npm install
```

### Run the Server

Start the development server:

```bash
node src/server.js
```

The server will be available at:

```text
http://localhost:5000
```

## API

The backend follows RESTful API principles.

The API surface will be documented here as endpoints are implemented.

### Health Check

```http
GET /
```

Response:

```text
Job Portal Backend is running
```

## Configuration

Environment-specific configuration will be managed through environment variables.

Example:

```env
PORT=5000
DB_HOST=localhost
DB_USER=your_database_user
DB_PASSWORD=your_database_password
DB_NAME=job_portal
JWT_SECRET=your_secret_key
```

**Never commit `.env` or other files containing credentials or secrets.**

## Development Approach

The project is developed incrementally.

Each major feature follows the workflow:

```text
Implement
   ↓
Test
   ↓
Review
   ↓
Commit
   ↓
Push
```

This keeps the repository history organized and provides a clear record of the project's development.

## Engineering Goals

The project aims to demonstrate practical understanding of:

* REST API architecture
* Backend application design
* Relational database design
* Authentication and authorization
* Secure data handling
* Input validation
* Error handling
* API testing
* Version control
* Production-oriented development practices

## Project Status

 **Active Development**

This repository is continuously evolving as new backend capabilities are implemented.

## Author

**Chethan Lakshman Bagi**

GitHub: https://github.com/bagichethan-decode
