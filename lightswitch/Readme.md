In this context, I have modeled Light as an object that "has a" Switch. So the association is 1:1 for this case. Although in real world one switch can operate many lights, I left that out for simplicity.

###Build 

To compile & build classes run: `mvn clean compile`

###Jar

To build a deployable jar file for runtime: `mvn jar:jar`

###Test
To run: `mvn test`




