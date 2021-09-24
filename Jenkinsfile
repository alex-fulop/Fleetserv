def gv

pipeline {

    agent any

    parameters {
        string(name: 'VERSION', defaultValue: '', description: 'version to deploy on prod')
        choice(name: 'VERSION', choices: ['1.1.0', '1.1.1', '1.1.2'], description: 'choose between this versions for deploy')
        booleanParam(name :'EXECUTE_TESTS', defaultValue: true, description: 'choose if you want to run the tests or not')
    }

    tools {
        gradle 'fleetserv-be-buildtool'
    }

    environment {
        NEW_VERSION = '1.3.0'
        SERVER_CREDENTIALS = credentials('server-credentials')
    }

    stages {
        stage("Init") {
            steps {
                script{
                    gv = load 'script.groovy'
                }
            }
        }

        stage("Checkout") {
            steps {
                script {
                    gv.checkout()
                }
            }
        }

        stage("Build") {
            steps {
                script {
                    gv.build()
                }
            }
        }

        stage("Docker Build and Tag") {
            steps {
                script{
                    gv.dockerBuildAndTag()
                }
            }
        }

        stage("Publish Image to Docker Hub") {
            steps {
                script {
                    gv.publishDockerHub()
                }
            }
        }

        stage("Run Docker container on Jenkins Agent") {
            steps {
                script {
                    gv.runContainerOnAgent()
                }
            }
        }

        stage("Run Docker container on remote hosts") {
            steps {
                script{
                    gv.runContainerOnRemoteHosts()
                }
            }
        }
    }

    post {
        always {
            echo 'do this everytime'
        }
        success {
            echo 'do this only when the build was successful'
        }
        failure {
            echo 'do this only when the build failed'
        }
    }
}
