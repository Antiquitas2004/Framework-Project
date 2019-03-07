# Framework-Project
Eclipse Spark Project

Initial Rough Draft for Spark/Eclipse(Maven?) 

Download/Install Apache Spark Instructions

Download ad Install Spark

Download and Install the latest release of Apache Spark for Mac OS X from spark.apache.org/downloads.html

Go to your user directory and create a directory called Spark

Copy the Spark download to the Spark directory just created

Open the Terminal utility and type the following
- cd Spark
- tar -zxvf  <drag and drop the downloaded Spark file to the next character space following the command you just typed>
- enter

Open Eclipse and create a new folder in the RPG project called lib

drag and drop the Spark jar files to lib

right click on the project name in eclipse and click refresh

expand lib and select the jar files that are needed, right click and navigate to build path which will place jars in referenced library


Download/Install Eclipse Instructions

Code will consist of a character generator for an RPG (GUI to be created?) 
Program will accept pre generate character
An "arena" or test ground will be created to determine character odds against a variety of enemies

(Download and Install Maven

Go to maven.apache.org and download the most current stable version of Maven from downloads.

Open Terminal and type
- cd /usr/local
- sudo mkdir apache-maven
- tar -zxvf <drag and drop the downloaded Maven file to the next character space following the command you just typed>
- type PATH=$PATH:/usr/local/apache-maven/apache-maven-<insert numeric value of version of Maven here>/bin and hit enter
-  echo $PATH <confirms path created properly>
- type export MAVEN_OPTS=“-Xms256m-Xmx512m” <allot memory for Java Virtual Machine>

Download the latest Java Development kit for Mac OS X from www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2… . Locate and download the most recent compatible version of JDK for Mac OS X. Double click to install this compressed file.
)
