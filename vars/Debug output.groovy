pipeline {
    agent any
 
    stages {
        stage('Debug') {
            steps {
                script {
sh 'bash scripts/your_debug_script.sh'
                }
            }
        }
 
        // Add other stages as needed
    }
}
