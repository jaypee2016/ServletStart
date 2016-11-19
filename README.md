# ServletStart
Minimum Project to execute the servlet

The servlet will get the current date and time of the server.

To run the project:

* go to ServletStart dir on your PC and compile the java file using the command:
javac -cp "\<path_to_your_server_dir\>/apache-tomcat-9.0.0.M13/lib/servlet-api.jar" -d classes src\CurrentDateAndTimeServlet.java

as a result you should see the generated CurrentDateAndTimeServlet.class file in the classes directory

* create the webapp directory structure as follow:
\<path_to_your_server_dir\>\apache-tomcat-9.0.0.M13\webapps\servletstart\WEB-INF

* copy compiled .class file and web.xml into project directory on the server:
\<path_to_your_server_dir\>\apache-tomcat-9.0.0.M13\webapps\servletstart\WEB-INF\classes\CurrentDateAndTimeServlet.class
\<path_to_your_server_dir\>\apache-tomcat-9.0.0.M13\webapps\servletstart\WEB-INF\web.xml

* startup the server by executing:
\<path_to_your_server_dir\>apache-tomcat-9.0.0.M13\bin>startup.bat

* go to URL:
http://localhost:8080/servletstart/curdate

RESULT
==========
Current Servlet Date and Time:

Sat Nov 19 15:03:17 GMT 2016 
