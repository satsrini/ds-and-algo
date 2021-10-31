pipeline
{
     agent any
     tools{
        maven 'maven_3_8_3'
     }
     stages 
     {
        stage ('Compile Stage')
        {
           steps
           {
              dir('handson')
              {
                 sh 'pwd'
                 sh 'mvn clean compile'
              }
           }
        }

        stage ('Testing Stage')
        {
           steps
           {
              dir('handson')
              {
                 sh 'pwd'
                 sh 'mvn test'
              }
           }
        }

        stage ('Install Stage')
        {
           steps
           {
              dir('handson')
              {
                 sh 'pwd'
                 sh 'mvn install'
              }
           }
        }


     }


}
