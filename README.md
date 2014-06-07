QlRSS
=====

Insane RSS reader

If you want to edit this file please use markdown syntax
https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet#headers

----------------
#### Tools needed:

1. Java 7 http://www.oracle.com/technetwork/java/javase/downloads/index.html?ssSourceSiteId=otnjp

2. IntelliJ Community Edition http://www.jetbrains.com/idea/download/

3. Maven 3  http://www.mkyong.com/maven/how-to-install-maven-in-windows/

4. Git http://git-scm.com/downloads

5. Tomcat - only for local deploy without Maven

----------------
### Use Maven

1. Open terminal

2. Navigate to: $project_src/QlRSS/Main
 
#### Testing

1. mvn clean test

2. Add, brake, play with tests and see results

3. You can run app on maven automatically installed Tomcat - just run:
```
mvn clean install tomcat:run 
```

#### Deploying to local Tomcat server 

1. Enable Tomcat users http://www.mkyong.com/tomcat/tomcat-default-administrator-password/

2. Add to your Maven setting.xml in <servers> (located in e.g. Maven\apache-maven-3.0.4\conf\settings.xml)
```
  <server>
		<id>TomcatServer</id>
		<username>tomcat</username>
		<password>tomcat</password> 
	</server>
```  
Add created jar/war files to Tomcat via localhost:8080\manager

Navigate to http://localhost:8080/Main/

----------------------
###Using Jenkins 
App can be checked under url: https://qlrss-ijo.rhcloud.com/

Jenkins - https://jenkins-ijo.rhcloud.com/ user: a  and pass: abbreviation of lecture name 

Everytime you commit changes to GitHub master branch then application is builded on Jenkins CI server - if everything is fine then is deployed under ttps://qlrss-ijo.rhcloud.com/

----------------------
### Using IntelliJ
TODO
