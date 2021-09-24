def checkout() {
    git branch: 'master', url: 'https://github.com/alex-fulop/Fleetserv.git'
}

def build() {
    sh 'gradle build'
}

def dockerBuildAndTag() {
//    sh 'docker build -t fleetserv:latest .'
//    sh 'docker tag fleetserv fulop/fleetserv:latest'
    //sh 'docker tag fleetserv fulop/fleetserv:$BUILD_NUMBER'
}

def publishDockerHub(){
//    withDockerRegistry([ credentialsId: "docker-credentials", url: "" ]) {
//        sh  'docker push fulop/fleetserv:latest'
//        //  sh  'docker push fulop/fleetserv:$BUILD_NUMBER'
//    }
}

def runContainerOnAgent() {
//        checkout scm
//
//        docker.withRegistry('https://hub.docker.com/', 'dockerhub-credentials') {
//
//            def customImage = docker.build("fulop/fleetserv")
//
//            /* Push the container to the custom Registry */
//            customImage.push()
//        }
//    sh "docker run -d -p 5556:5556 fulop/fleetserv"
}

def runContainerOnRemoteHosts() {
//    sh "docker -H ssh://jenkins@172.31.28.25 run -d -p 8003:8080 nikhilnidhi/samplewebapp"
}

return this