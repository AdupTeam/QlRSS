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

------------------------
### GIT
After installing GIT - default install option should be enough
Create folder for project
Open GitBash terminal and run
```
git clone https://github.com/AdupTeam/QlRSS
```
Always do before making changes 
```
git pull
```
Do changes - when you finish - add changes to stage
```
git add -A
```
To avoid conflicts 
```
git stash save "my changes description"
git pull
git stash apply
```
Commit changes 
```
git commit -m "my changes description"
```
Push changes to repository
```
git push
```
You should see your changes on GitHub 

----------------------
### Using IntelliJ
Open IntelliJ

1. Use Import Project 
  * http://www.particlewave.com/wordpress/wp-content/uploads/2013/05/CaptureJUnit.jpg
  * or go to File->Import Project...
  * choose directory of your project
  * choose maven http://1.bp.blogspot.com/-TEKdt2YI1LY/US32FWVXDsI/AAAAAAAAAiU/OmjRf36MAFI/s1600/Screenshot+from+2013-02-27+06:40:35.png
http://2.bp.blogspot.com/-WbOLOpQmAkk/US32pZZSBuI/AAAAAAAAAis/miPdVGzGWXA/s1600/Screenshot+from+2013-02-27+06:40:53.png
  * click next, and again next, do not tick openshift profile
  * click next, when SDK window appear add JDK http://2.bp.blogspot.com/-WbOLOpQmAkk/US32pZZSBuI/AAAAAAAAAis/miPdVGzGWXA/s1600/Screenshot+from+2013-02-27+06:40:53.png
  * click next and use finish option
  * if you spot message about Maven then enable Auto Import (right uper corner
http://2.bp.blogspot.com/-J-Jwp7ANMbQ/US34FhuL4FI/AAAAAAAAAjI/hPuwlfBNd7c/s1600/Screenshot+from+2013-02-27+06:41:45.png)
2. If some problems appear you can always go to File->Project Structure and find what errors are presented in submenus of Project Setting menu

----------------
### Using Maven

1. Open terminal

2. Navigate to: $project_src/QlRSS/Main
 
#### Testing

1. mvn clean test

2. Add, brake, play with tests and see results

3. You can run app on maven automatically installed Tomcat - just run:
```
mvn clean install tomcat:run 
```
4. Production server is JBoss 7 - checking if everything is working on this server run:
```
mvn clean install org.jboss.as.plugins:jboss-as-maven-plugin:7.5.Final:run -Dusername=lol -Dpassword=lol
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

Awesome:

Every time you commit changes to GitHub master branch then application is builded on Jenkins CI server - if everything is fine then is deployed under https://qlrss-ijo.rhcloud.com/  - how cool is that? :)


