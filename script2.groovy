def buildApp() {
    echo "building the application..."
    
} 

def TestApp() {
    echo "testing the application.."
    
} 

def deployApp() {
    echo 'deploying the application...'
    echo 'deploying version ${params.VERSION}'
} 

return this
