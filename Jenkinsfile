pipeline
{
     agent any
     tools{
        maven 'maven_3_8_3'
     }
     stages 
     {

        stage ('move to the right module')
        {
           steps
           {
              cd handson
           }
        }

        stage ('Compile Stage')
        {
           steps
           {
              sh 'mvn clean compile'
           }
        }

        stage ('Testing Stage')
        {
           steps
           {
              sh 'mvn test'
           }
        }

        stage ('Install Stage')
        {
           steps
           {
              sh 'mvn install'
           }
        }


     }


}
