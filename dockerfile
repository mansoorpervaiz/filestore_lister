# Use the official openjdk image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory in the Docker container
WORKDIR /app

# Copy the file into the Docker container
COPY FileStoreLister.java .

# Compile the file
RUN javac FileStoreLister.java

# Specify the command to run when the Docker container starts
CMD ["java", "FileStoreLister"]
