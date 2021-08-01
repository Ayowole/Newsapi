pipeline {
  agent {
    docker(image: 'maven:3.3-jdk-8')
  }
  stages {
    stage('build') {
      steps {
        sh 'mvn --version'
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
