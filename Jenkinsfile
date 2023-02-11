#!/usr/bin/env groovy

pipeline {

//       parameters{
//       string(name:'param1',  defaultValue:''  ?: '')
//       string(name:'param2',  defaultValue:''  ?: 'test')
//       string(name:'param3',  defaultValue:''  ?: '')
//   }

    agent any
    stages {
        stage('Version') {
            steps {
                sh 'pwsh --version'
            }
        }

        stage('hello') {
            steps {
                sh 'pwsh test.ps1'
            }
        }

        // stage('Deploy') {
        //     steps {
        //         sh 'echo ${param3}'
        //     }
        // }
    }

}
