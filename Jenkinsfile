pipeline {
  agent any
  stages {
    stage('git repo & clean') {
      steps {
        //bat "rmdir /s /q Springbootrestapi"
        //bat "git clone https://github.com/abinayap2000/Springbootrestapi.git"
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
