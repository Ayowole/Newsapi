pipeline {
  agent {
    docker(image: 'maven:3.3-jdk-8')
  }
  stages {
    stage('build') {
      steps {
        sh 'echo building...'
      }
    }
    
    stage('test') {
      steps {
        sh 'echo testing...'
      }
    }
    
    stage('deploy') {
      steps {
        sh 'echo deploying...'
      }
    }
  }
}
