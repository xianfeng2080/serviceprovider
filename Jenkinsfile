pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package docker:build'
            }
        }
        stage('Test') {
            steps {
				echo 'Testing....'
                //sh 'mvn test'
            }
            //post {
            //    always {
            //        junit 'target/surefire-reports/*.xml'
            //    }
            //}
        }
        stage('Deliver') {
            steps {
                echo 'Service provider Deploying....'
			
				echo 'OK works....'
            }
        }
    }
}
