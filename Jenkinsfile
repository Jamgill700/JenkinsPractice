pipeline{

    agent any

    stages{
        stage('Checkout'){
            steps{
                git url: 'https://github.com/Jamgill700/JenkinsPractice.git',
                branch: 'master'
            }
        }

        stage('Build'){
            steps{
                sh: './mvnw clean package'
            }
        }


    }
}