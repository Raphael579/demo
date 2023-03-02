pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Sonar Analysis') {
            steps {
                bat 'mvn clean verify sonar:sonar -Dsonar.projectKey=PrintCustomBackEnd -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_093fa6800bcfa38a11d33b643f98248e292d0c66'
            }
        }
    }
}
