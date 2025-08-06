Kubernetes Two-Tier Train Booking Application
This project demonstrates the deployment of a multi-tier application Kubernetes Engine. The architecture consists of a Java Spring Boot REST API that connects to a MySQL database, all managed by Kubernetes.

This project was created to fulfill the requirements of the NAGP 2025 Home Assignment.

Required Links
GitHub Repository: https://github.com/samyak1903/kubernetes-trainbooking-app

Docker Hub Image: https://hub.docker.com/repository/docker/samyak1903/trainbooking/general

Live Service API URL: http://34.8.158.58/api/bookings

Project Overview
The application is composed of two main tiers:

Service API Tier: A stateless Spring Boot application that exposes REST endpoints for booking operations. It is deployed as a Kubernetes Deployment with 4 replicas to ensure high availability and scalability.

Database Tier: A MySQL database for data persistence. It is deployed as a Kubernetes StatefulSet to provide a stable network identity and persistent storage, ensuring data is not lost when the pod is restarted.

Configuration is managed externally using a ConfigMap for non-sensitive data and a Secret for the database password. The application is exposed to the internet via a GKE Ingress which provisions a Google Cloud Load Balancer.

