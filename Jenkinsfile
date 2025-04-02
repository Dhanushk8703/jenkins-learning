pipeline{
    agent any
        tools{
            jdk 'jdk-17'
            maven 'mvn'
        }
        stages{
            stage('Build Maven'){
                steps{
                    checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Dhanushk8703/jenkins-learning.git']])
                    bat 'mvn clean install'
                }
            }
           
        }
}