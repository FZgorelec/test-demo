pipeline{
    
    agent any

    stages{

        stage("build"){
            steps {
                echo 'building'
                sh './gradlew clean assemble'
            }
        }

        stage("test"){
            steps {
                    echo 'running tests'
                    sh './gradlew clean check'
            }
        }

        stage("deploy"){
            steps {
                echo 'Deploy succesfull'
            }
        }
    }

}