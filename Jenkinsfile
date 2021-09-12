CODE_CHANGES = true
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
                    gv.buildApp()
                }
            }
        }

        stage("Unit & Integration Tests") {
            when {
                expression {
                    BRANCH_NAME == 'GAMMA/.*' || BRANCH_NAME == 'OMEGA/.*'
                    params.EXECUTE_TESTS == true
                }
            }
            steps {
                script {
                    gv.test()
                }
            }
        }

        stage("Frontend Unit Tests") {
            steps {
                script{
                    gv.feTest()
                }
            }
        }

        stage("Frontend Static Code Analysis") {
            steps {
                script {
                    gv.feCodeAnalysis()
                }
            }
        }

        stage("End 2 End Tests") {
            when {
                expression {
                    BRANCH_NAME == 'GAMMA/.*' || CODE_CHANGES == true
                }
            }
            steps {
                script {
                    gv.e2eTests()
                }
            }
        }

        stage("Publish Artifact to Nexus") {
            steps {
                script{
                    gv.publish()
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
