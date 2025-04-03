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
        
 stage('Check Paths') {
            steps {
                bat 'echo %PATH%'
                bat 'where cmd'
                bat 'where docker'
                bat 'where java'
                bat 'where mvn'
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
                    bat 'docker login'
                    bat 'docker push dhanushk8703/dhanushk'
                }
            }
        }
    }
}
