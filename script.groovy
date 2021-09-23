def checkout() {
    git branch: 'master', url: 'https://github.com/devops4solutions/CI-CD-using-Docker.git'
}

def build() {
    sh 'gradle assemble'
}

def dockerBuildAndTag() {
    sh 'docker build -t fleetserv:latest .'
    sh 'docker tag fleetserv fulop/fleetserv:latest'
    //sh 'docker tag fleetserv fulop/fleetserv:$BUILD_NUMBER'
}

def publishDockerHub(){
    withDockerRegistry([ credentialsId: "docker-credentials", url: "" ]) {
        sh  'docker push fulop/fleetserv:latest'
        //  sh  'docker push fulop/fleetserv:$BUILD_NUMBER'
    }
}

def runContainerOnAgent() {
    sh "docker run -d -p 5556:5556 fulop/fleetserv"
}

def runContainerOnRemoteHosts() {
//    sh "docker -H ssh://jenkins@172.31.28.25 run -d -p 8003:8080 nikhilnidhi/samplewebapp"
}

return this