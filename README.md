FAQ Management System

This project is a FAQ Management System that allows users to manage frequently asked questions (FAQs). It consists of a Spring Boot backend and a React frontend, both containerized using Docker.

Features
Backend:

REST API for managing FAQs.

Multi-language support using Google Translate API.

Frontend:

User-friendly interface for viewing and creating FAQs.

Multi-language support with a language selector.

Technologies Used
Backend: Spring Boot, Java.

Frontend: React, Axios, Bootstrap.

Containerization: Docker, Docker Compose.

Prerequisites
Before running the project, ensure you have the following installed:

Docker: Install Docker

Docker Compose: Install Docker Compose

Node.js (for frontend development): Install Node.js

Java Development Kit (JDK) (for backend development): Install JDK

Project Structure
Copy
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
Setup and Running the Project
1. Clone the Repository
Clone the project repository to your local machine:

bash
Copy
git clone https://github.com/your-username/faq-project.git
cd faq-project
2. Build and Run with Docker Compose
Run the following command to build and start the containers:

bash
Copy
docker-compose up --build
This will:

Build the Docker images for the backend and frontend.

Start the following services:

Backend: Spring Boot app on port 8080.

Frontend: React app on port 3000.

3. Access the Application
Frontend: Open your browser and navigate to http://localhost:3000.

Backend API: Access the API at http://localhost:8080/api/faqs.

Running Without Docker
1. Backend
Navigate to the backend directory:

bash
Copy
cd backend
Build and run the Spring Boot application:

bash
Copy
./mvnw spring-boot:run
2. Frontend
Navigate to the frontend directory:

bash
Copy
cd frontend
Install dependencies and start the development server:

bash
Copy
npm install
npm start
API Endpoints
Backend API
Get FAQs: GET /api/faqs?lang={language}

Example: http://localhost:8080/api/faqs?lang=hi

Create FAQ: POST /api/faqs

Example: http://localhost:8080/api/faqs

Docker Commands
Build Docker Images
bash
Copy
docker-compose build
Start Containers
bash
Copy
docker-compose up
Stop Containers
bash
Copy
docker-compose down
View Logs
bash
Copy
docker-compose logs -f
Troubleshooting

1. Docker Issues
Ensure Docker is running.

Check if ports 8080 (backend) and 3000 (frontend) are available.

2. Backend Issues
Ensure the Spring Boot application is running and accessible at http://localhost:8080.

3. Frontend Issues
Ensure the React app is running and accessible at http://localhost:3000.

Contributing
Fork the repository.

Create a new branch: git checkout -b feature/your-feature-name.

Commit your changes: git commit -m "Add your feature".

Push to the branch: git push origin feature/your-feature-name.

Submit a pull request.

License
This project is licensed under the MIT License. See the LICENSE file for details.

Contact
For questions or feedback, please contact:

Your Name: ntiheishnaik8@gmail.com

GitHub: nithieshnaik

Enjoy using the FAQ Management System! 🚀

