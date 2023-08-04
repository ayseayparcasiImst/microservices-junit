

pipeline {
    agent any
    tools{
        maven "maven 3.5.0"
    }
    
    stages{   
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
	stage('Test') {
            steps {
                sh 'chmod +r pom.xml'
                sh 'chmod +r .mvn'
                sh 'chmod +r mvnw'
                sh 'chmod +r mvnw.cmd'
                sh 'chmod +x mvnw'
                sh 'chmod +x ./mvnw'
                sh './mvnw test'
                // bat '.\\mvnw test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
	}		   
          stage('docker-compose-microservices') {
           	steps {
              	   sh "docker compose up -d"
           }
       	   }


}
}
