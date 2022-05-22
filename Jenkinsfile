pipeline {
  agent any
  stages {
    stage('git repo & clean') {
      steps {
        //bat "rmdir /s /q Springbootrestapi"
        bat "mvn clean -f Springbootrestapi"
      }
    }
    steps('package') {
      steps {
        bat "mvn package -f Springbootrestapi"
      }
    }
  }
}
