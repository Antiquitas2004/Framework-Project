# Framework-Project
Eclipse Spark Project

Initial Rough Draft: This will create a local development environment. Spark is designed though as a cluster computation environment designed to run across multiple systems. In this case the local system will be the Master Node.

Platform used will be Apple OSX with JDK 1.8, the Eclipse Java IDE (incl. Maven), Spark Framework

Download the JDK 1.8 from the Oracle website

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

Download the Java Development Kit (JDK) 1.8 for Mac OS X from www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2… . Locate and download the most recent compatible version of JDK 1.8 for Mac OS X. Double click to install this compressed file.
)

Alternate Instruction

Create a Maven Project (control click on left pane in Eclipse and select New/Other/Maven(expand)/Maven Project Next. Click check box for "create simple Maven project". The Group ID can be your name or company name.The Artifact ID will be the name of the project (i.e. SparkTest).

The next part can be a bit compicated as it involves linking to Spark and creating settings. Open the pom.xml file on the left. For this component I relied heavily upon other GitHub creations relying upon Spark. All Spark elements wil fall under "dependencies" after the project identifier fields and "properties" which will include the Java version, Scala, Spark and Maven information. Once all information has been edited save the pom.xml and refresh (F5 or control clcik and refresh) the side menu which should now present "Dependencies"

