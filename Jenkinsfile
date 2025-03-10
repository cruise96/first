pipeline {
    agent any
    stages {
        stage('Load Groovy Script') {
            steps {
                script {
                    def myScript = load 'C:/All_Setups/all_extra/myScript.groovy'
                    println "Hello, Groovy!"
                }
            }
        }
    }
}
