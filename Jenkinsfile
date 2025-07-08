pipeline {
    agent any

    triggers {
        cron('0 6 * * *')       // 🔁 Runs daily at 6 AM
        pollSCM('* * * * *')    // 🔄 Polls every minute (lightweight alternative to full webhook for testing)
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/yogeshyadava/sample-maven-projectt.git'
            }
        }

        stage('Run Maven Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
