# FAQ Management System

This project is a FAQ Management System that allows users to manage frequently asked questions (FAQs). It consists of a Spring Boot backend and a React frontend, both containerized using Docker.

## Features

### Backend:

- REST API for managing FAQs.
- Multi-language support using Google Translate API.

### Frontend:

- User-friendly interface for viewing and creating FAQs.
- Multi-language support with a language selector.

## Technologies Used

- **Backend**: Spring Boot, Java.
- **Frontend**: React, Axios, Bootstrap.
- **Containerization**: Docker, Docker Compose.

## Prerequisites

Before running the project, ensure you have the following installed:

- **Docker**: [Install Docker](https://docs.docker.com/get-docker/)
- **Docker Compose**: [Install Docker Compose](https://docs.docker.com/compose/install/)
- **Node.js** (for frontend development): [Install Node.js](https://nodejs.org/)
- **Java Development Kit (JDK)** (for backend development): [Install JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

## Project Structure

```
faq-project/
├── backend/              # Spring Boot backend
│   ├── src/              # Source code
│   ├── Dockerfile        # Dockerfile for backend
│   └── pom.xml           # Maven dependencies
├── frontend/             # React frontend
│   ├── src/              # Source code
│   ├── Dockerfile        # Dockerfile for frontend
│   └── package.json      # Node.js dependencies
├── docker-compose.yml    # Docker Compose configuration
└── README.md             # Project documentation
```

## Setup and Running the Project

### 1. Clone the Repository

Clone the project repository to your local machine:

```sh
git clone https://github.com/your-username/faq-project.git
cd faq-project
```

### 2. Build and Run with Docker Compose

Run the following command to build and start the containers:

```sh
docker-compose up --build
```

This will:

- Build the Docker images for the backend and frontend.
- Start the following services:
  - Backend: Spring Boot app on port 8080.
  - Frontend: React app on port 3000.

### 3. Access the Application

- **Frontend**: Open your browser and navigate to [http://localhost:3000](http://localhost:3000).
- **Backend API**: Access the API at [http://localhost:8080/api/faqs](http://localhost:8080/api/faqs).

## Running Without Docker

### 1. Backend

Navigate to the backend directory:

```sh
cd backend
```

Build and run the Spring Boot application:

```sh
./mvnw spring-boot:run
```

### 2. Frontend

Navigate to the frontend directory:

```sh
cd frontend
```

Install dependencies and start the development server:

```sh
npm install
npm start
```

## API Endpoints

### Backend API

- **Get FAQs**: `GET /api/faqs?lang={language}`
  - Example: [http://localhost:8080/api/faqs?lang=hi](http://localhost:8080/api/faqs?lang=hi)
- **Create FAQ**: `POST /api/faqs`
  - Example: [http://localhost:8080/api/faqs](http://localhost:8080/api/faqs)

## Docker Commands

### Build Docker Images

```sh
docker-compose build
```

### Start Containers

```sh
docker-compose up
```

### Stop Containers

```sh
docker-compose down
```

### View Logs

```sh
docker-compose logs -f
```

## Troubleshooting

### 1. Docker Issues

- Ensure Docker is running.
- Check if ports 8080 (backend) and 3000 (frontend) are available.

### 2. Backend Issues

- Ensure the Spring Boot application is running and accessible at [http://localhost:8080](http://localhost:8080).

### 3. Frontend Issues

- Ensure the React app is running and accessible at [http://localhost:3000](http://localhost:3000).



## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Contact

For questions or feedback, please contact:

- **Email: nitheshnaik8\@gmail.com**
- **GitHub**: nithieshnaik

Enjoy using the FAQ Management System! 🚀

