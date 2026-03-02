pipeline {
    agent any

    environment {
        // Fix Playwright EPERM issue on Windows (SYSTEM user)
        PLAYWRIGHT_BROWSERS_PATH = "${env.WORKSPACE}\\ms-playwright"
    }

    tools {
        maven 'Maven3'     // Configure in Jenkins Global Tool Configuration
        jdk 'Java25'
    }

    stages {

        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Verify Project') {
            steps {
                bat 'dir'
                bat 'dir pom.xml'
            }
        }

        stage('Clean Build') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Publish Test Results') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }

        stage('Publish HTML Report') {
            steps {
                publishHTML([
                    reportDir: 'target/surefire-reports',
                    reportFiles: '*.html',
                    reportName: 'Automation Test Report',
                    allowMissing: true,
                    alwaysLinkToLastBuild: true,
                    keepAll: true
                ])
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished'
        }
        success {
            echo 'All tests passed successfully'
        }
        failure {
            echo 'Pipeline failed'
        }
    }
}
