pipeline{
    agent any
    stages{
        stage('Jenkis Monitoria'){
            steps{
                echo 'Jankins monitoria interface'
            }
        }
        stage('Build'){
            steps{
                sh 'mvn clean install'
            }
        }
       
    }
}