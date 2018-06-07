To be able to ship this project, I have packaged it using maven pom.xml with compile & jar plugins. Please see instructions below to run the project:

###Build 

To compile & build classes run: `mvn clean compile`

###Jar

To build a deployable jar file for runtime: `mvn jar:jar`

###Test
Assuming using Junit was allowed all unit tests  go under `src/test/java/com/bam/contact/service/ContactServiceJUnitTest`

To run: `mvn test`

Note: 
Since I was asked not to use any frameworks, I have followed an unconventional approach of adding test class  (using main) to `src/main/java/com/bam/contact/service/ContactServiceTest`. 
This is not something I would do normally but it's just to demonstrate how code could be unit-tested using main method alone.
To run test using main method class: `java -jar target/media-eng-1.0-SNAPSHOT.jar`



