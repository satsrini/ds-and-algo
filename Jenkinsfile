pipeline
{
     agent any

     stages 
     {
        stage ('Compile Stage')
        {
           steps
           {
              maven(maven : 'maven_3_8_3')
              {
                 sh 'mvn clean compile'
              }
           }
        }

        stage ('Testing Stage')
        {
           steps
           {
              maven(maven : 'maven_3_8_3')
              {
                 sh 'mvn test'
              }
           }
        }

        stage ('Install Stage')
        {
           steps
           {
              maven(maven : 'maven_3_8_3')
              {
                 sh 'mvn install'
              }
           }
        }


     }


}
