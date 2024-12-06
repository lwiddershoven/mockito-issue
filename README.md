# Mockito cannot mock/spy because : final class

This repository reproduces the issue with Mockito + Java 21 + Maven.

The recommendations in https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html#0.3
have been applied but still the issue remains.

```
➜  mockito-issue git:(main) ✗ java -version
\openjdk version "21.0.5" 2024-10-15 LTS
OpenJDK Runtime Environment Temurin-21.0.5+11 (build 21.0.5+11-LTS)

➜  mockito-issue git:(main) ✗ mvn test  
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------------< nl.leonw:mockito-issue >-----------------------
[INFO] Building mockito-issue 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- dependency:3.7.0:properties (default) @ mockito-issue ---
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ mockito-issue ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ mockito-issue ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ mockito-issue ---
[INFO] skip non existing resourceDirectory /Users/leon/IdeaProjects/group9/mockito-issue/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ mockito-issue ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:3.5.0:test (default-test) @ mockito-issue ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running IssueTest
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.271 s <<< FAILURE! -- in IssueTest
[ERROR] IssueTest.issue -- Time elapsed: 0.175 s <<< ERROR!
org.mockito.exceptions.base.MockitoException: 

Cannot mock/spy class java.lang.reflect.Method
Mockito cannot mock/spy because :
 - final class
        at IssueTest.issue(IssueTest.java:12)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   IssueTest.issue:12 Mockito 
Cannot mock/spy class java.lang.reflect.Method
Mockito cannot mock/spy because :
 - final class
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.614 s


```