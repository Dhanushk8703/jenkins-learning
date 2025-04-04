pipeline {
    agent any

    tools {
        jdk 'jdk-17'
        maven 'mvn'
    }

    stages {
        stage('Checkout Code') {
            steps {
                checkout([$class: 'GitSCM', 
                    branches: [[name: 'master']], 
                    extensions: [], 
                    userRemoteConfigs: [[url: 'https://github.com/Dhanushk8703/jenkins-learning.git']]
                ])
            }
        }

        stage('Build Maven') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    bat 'docker build -t dhanushk8703/dhanushk .'
                }
            }
        }

        stage('Push Image to DockerHub') {
            steps {
                script {
					withCredentials([usernamePassword(credentialsId: 'DOCKER_HUB', passwordVariable: 'DOCKER_PASSWORD', usernameVariable: 'DOCKER_USER')]) {
                    bat 'docker login -u %DOCKER_USER% -p %DOCKER_PASSWORD%'
                    bat 'docker push dhanushk8703/dhanushk'
}
                }
            }
        }
    }
}
