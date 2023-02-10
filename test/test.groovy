 #!/usr/bin/env groovy

pipeline {

      parameters{
      string(name:'param1',  defaultValue:''  ?: '')
      string(name:'param2',  defaultValue:''  ?: 'test')
      string(name:'param3',  defaultValue:''  ?: '')
  }

    agent any
    stage('Build') {
        steps {
            sh 'echo ${param1}'
        }
    }

    stage('Test') {
        steps {
            sh 'echo ${param2}'
        }
    }

        stage('Deploy') {
        steps {
            sh 'echo ${param3}'
        }
    }
}