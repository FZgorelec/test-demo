pipeline{
    
    agent any
    environment{
        APPLICATION_NAME = 'TEST_DEMO'
    }
    parameters{
        booleanParam(name: 'RUN_TESTS', defaultValue: true, description: 'Demo of boolean parameter')
        choice(name: 'DEMO_CHOICE', choices: ['1', '2', '3'], description: 'Demo of choice parameter')
        string(name: 'string_param', defaultValue: 'default value', description: 'Demo of string parameter')
    }
    stages{

        stage('Build app'){
            steps{
                echo "Building ${APPLICATION_NAME}"

            }
        }

        stage('Test app'){
            when{
                expression{
                    params.RUN_TESTS == true
                }
            }
            steps{
                echo 'Testing application'
            }
        }

        stage('Deploy app'){
            when{
                expression{
                    env.BRANCH_NAME == 'master'
                }
            }
            steps{
                echo 'Deploying application'
            }
        }
    }
    post{
        always{
            echo 'Post build actions'
        }
        success{
            echo 'Build was succesfull'
        }
        failure{
            echo 'Sending mail'
        }
    }

}