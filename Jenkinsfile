pipeline {
    agent any
    tools {
        jdk 'jdk-17'
        maven 'mvn'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Dhanushk8703/jenkins-learning.git'
            }
        }
        stage('Build Maven') {
            steps {
                bat 'mvn clean install'
            }
        }
    }
    post {
        failure {
            emailext(
                to: '2k21csbs22@kiot.ac.in,2k21csbs20@kiot.ac.in,2k21csbs15@kiot.ac.in,2k21csbs27@kiot.ac.in',
                subject: "Jenkins Build FAILED: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
                The build for ${env.JOB_NAME} #${env.BUILD_NUMBER} has failed.
                Check the logs for more details.

                Build URL: ${env.BUILD_URL}
                """,
                from: 'dhanushk8703@gmail.com'
            )
        }
    }
}
