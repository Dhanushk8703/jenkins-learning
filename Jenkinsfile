pipeline{
    agent any
        tools{
            jdk 'jdk-17'
            maven 'mvn'
        }
        stages{
            stage('Build Maven'){
                steps{
                    checkout scmGit(branches: [[name: '*/master]], extensions: [], userRemoteConfigs: [[url:"https://github.com/Dhanushk8703/jenkins-learning"]])
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
                        bat "docker login"
                    bat 'docker push dhanushk8703/dhanuhk'
                }
            }
        }
    }
}