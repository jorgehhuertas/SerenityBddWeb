pipeline {
    agent any
    tools { maven 'M3' }

    stages {
        stage('Checkout') {
            steps { git url: 'https://github.com/jorgehhuertas/SerenityBddWeb.git' }
        }

        stage('Instalar Dependencias') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Run @smoke Tests') {
            steps {
                sh 'mvn verify -Dtags="@smoke"'
            }
            post {
                always {
                    junit 'target/surefire-reports/**/*.xml'
                    publishHTML target: [
                        reportDir: 'target/site/serenity',
                        reportFiles: 'index.html',
                        reportName: 'Serenity Report'
                    ]
                }
            }
        }
    }
}