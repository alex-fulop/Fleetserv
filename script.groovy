def buildApp() {
    echo 'building the application...'
    echo "building version ${NEW_VERSION}"
    sh './gradlew -v'

    sh """
        docker build -f Dockerfile -t fleetserv .
    """
    echo 'dockerfile built'
}

def test() {
    sh './gradlew clean'
    echo 'step 2 complete'
    sh """
        docker run -rm fleetserv
    """
}

def feTest() {
    sh './gradlew build'
    echo 'steps 3 complete'
}

def feCodeAnalysis(){
    sh './gradlew test'
    echo 'steps 4 complete'
}

def e2eTests() {
    echo 'steps 5 complete'
}

def publish() {
    echo 'running docker instance'
    sh 'docker run --name fleetserv -p 5556:5556 fleetserv -d'

    withCredentials([
            usernamePassword(credentialsId: 'server-credentials', usernameVariable: 'USER', passwordVariable: 'PASS')
    ]) {
        echo "some script ${USER} ${PASS}"
    }

    echo 'steps 6 complete'
    echo "deploying with ${SERVER_CREDENTIALS}"
}

return this