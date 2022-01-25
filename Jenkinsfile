pipeline{

    agent any

    stages{

        stage('Compile Stage'){
            steps{
                shell 'mvn clean compile install'
            }
        }

        stage('Test Stage'){
            steps{
                shell 'mvn surefire:test -Dtest=*.java'
            }
        }

        stage('Package Stage'){
            steps{
                shell 'mvn clean package'
            }
        }

        stage('User Control Stage'){
            steps{
                input 'mDo you want to deploy?'
            }
        }

    }
}