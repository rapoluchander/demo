pipeline {
    agent any
    tools{
        maven 'maven_3.9.9'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rapoluchander/demo']])
            }
        }

        stage('Setup Maven') {
            steps {
                echo 'Setting up Maven environment...'
                sh 'mvn --version'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project...'
                sh 'mvn clean install'
            }
        }

        stage('Build Docker Image') {
            steps {
                echo 'Creating Docker Image..'
                sh '''
                    docker build -t demo-jenkins .
                '''
            }
        }
        stage('Run Docker Image') {
            steps {
                echo 'Running Docker container from the image...'
                sh '''
                    docker run -d --name my-java-app-container -p 8282:8282 demo-jenkins
                '''
            }
        }


        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Add deployment steps here, e.g., scp to a server or upload to a repository
                sh 'echo Deploy step not implemented yet'
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution finished.'
        }
        success {
            echo 'Pipeline executed successfully.'
        }
        failure {
            echo 'Pipeline execution failed.'
        }
    }
}
