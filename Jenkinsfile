pipeline{
    
    agent any
    environment{
        MY_ENV_VARIABLE = 'TEST DEMO'
    }
    parameters{
        string(name: 'DEMO_STRING', defaultValue: 'Some default value', description: 'Demo of string parameter')
        choice(name: 'DEMO_CHOICE', choices: ['1', '2', '3'], description: 'Demo of choice parameter')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'Demo of boolean parameter')
    }
    stages{

        stage("build"){
            steps {
                echo "building ${MY_ENV_VARIABLE}" 
                sh './gradlew clean assemble'
            }
        }

        stage("test"){
            when {
                expression{
                    params.executeTests == true
                }
            }
            steps {
                    echo 'running tests'
                    sh './gradlew clean check'
            }
        }

        stage("deploy"){
            when {
                expression{
                    env.BRANCH_NAME == 'master'
                }
            }
            steps {
                echo 'Deploy succesfull'
            }
        }
    }
    post{
        always{
            echo 'do some post build work'
        }
        success{
            echo 'Build was succesfull'
        }
        failure{
            echo 'send notification'
        }
    }

}