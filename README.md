QlRSS
=====

Insane RSS reader

----------------
Tools needed:

1. Java 7 http://www.oracle.com/technetwork/java/javase/downloads/index.html?ssSourceSiteId=otnjp

2. IntelliJ Community Edition http://www.jetbrains.com/idea/download/

3. Maven 3  http://www.mkyong.com/maven/how-to-install-maven-in-windows/

4. Git http://git-scm.com/downloads

5. Tomcat

----------------
Use Maven

1. Open terminal

2. Navigate to: $project_src/QlRSS/Main

Testing

1. mvn clean test

2. Add, brake, play with tests and see results

//in progress
Deploing to local tomcat server 

1. Enable Tomcat users http://www.mkyong.com/tomcat/tomcat-default-administrator-password/

2. Add to your Maven setting.xml in <servers> (located in e.g. Maven\apache-maven-3.0.4\conf\settings.xml)
```
  <server>
		<id>TomcatServer</id>
		<username>tomcat</username>
		<password>tomcat</password> 
	</server>
```  
You can run app on Tomcat: mvn clean install tomcat:run

Navigate to http://localhost:8080/Main/
