pipeline {

    agent any

    tools {
        jdk 'jdk-17'
        maven 'mvn'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/varun21807/Jenkins.git'
            }
        }

        stage('Build Maven') {
            steps {
                bat 'mvn clean install'
            }
        }

    }

    post {

        success {
            emailext(
                to: '2k21csbs22@kiot.ac.in,2k21csbs20@kiot.ac.in,2k21csbs15@kiot.ac.in,2k21csbs27@kiot.ac.in',
                subject: "Jenkins Build SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """Hey Team,

                The build for ${env.JOB_NAME} #${env.BUILD_NUMBER} was successful! 🚀

                Check the details here: ${env.BUILD_URL}

                Keep up the great work!
                """
            )
        }

        failure {
            emailext(
                to: '2k21csbs22@kiot.ac.in,2k21csbs20@kiot.ac.in,2k21csbs15@kiot.ac.in,2k21csbs27@kiot.ac.in',
                subject: "Jenkins Build FAILED: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """Hello Team,

                Oops! The build for ${env.JOB_NAME} #${env.BUILD_NUMBER} has failed. 😞

                Please check the logs and fix the issue.

                Build URL: ${env.BUILD_URL}
                """
            )
        }

    }

}
