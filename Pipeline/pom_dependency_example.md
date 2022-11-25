### Table of Contents
**[pom.xml file](#pom.xml)**<br>
**[Github actions tab](#github-actions-tab)**<br>
**[Useful links](#useful-links)**<br>


## pom.xml

### Copy & Paste example

The XML below is from an example repository to demonstrate automated unit testing using JUnit. The maven surefire dependency is included as this is what will be used to execute the unit tests of the application. Note that versions of dependencies/plugins used are example only and not indicative of the versions used in the end product.

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>ie.atu.example</groupId>
    <artifactId>AutomatedUnitTestExample</artifactId>
    <version>1.0-SNAPSHOT</version>
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.2</version>
                <dependencies>
                    <dependency>
                        <groupId>org.junit.jupiter</groupId>
                        <artifactId>junit-jupiter-engine</artifactId>
                        <version>5.8.2</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
    </build>
    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.8.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

</project>

### Step by step example

Note - the given XML text above can be copy and pasted, meaning this step by step example can be skipped.

1. First select the pom.xml file within the given maven project repository.
2. Enter the Alt+Insert keys to open the generate context menu as seen in the image below. If you are using a laptop that does not have one of these keys, right click anywhere within the pom.xml file and select "Generate".

![generateContextMenu]()

3. Once the context menu is open, select "add dependency". The dependencies window will now be available to you. From here, enter text as indicated in the below images next to the search icon to search for a given dependency package.

![mavenSurefirePlugin]()
![junitJupiterEngine]()
![junitJupiterTestDependency]()

## Github actions tab

To demonstrate how the automated unit tests work, a sample class and subsequent tester class will be provided.

### Addition class

```java
// Simple class to demonstrate automated JUnit tests
package ie.atu.addition;
public class Addition {

    public int addNumber(int numOne, int numTwo) {
        return numOne + numTwo;
    }
}
```

### AdditionTester class
```java
package ie.atu.addition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    @Test
    @DisplayName("Addition test")
    void addsTwoNumbers() {
        Addition add = new Addition();
        assertEquals(10, add.addNumber(5, 5), "5 + 5 should give 10");
    }
}
```
### Successful unit test

In the example tester class above, the assertion is that the result should give 10, which should not result in any failures. This is seen in the image below.

![successfulUnitTest]()

### Unsuccessful unit test

To make sure the automated tests are working correctly, an example was used where the expected returned value was 15. This is seen in the image below where the output lets us know that the test has failed and provides details on which test it was.

![unsuccessfulUnitTest]()
![unsuccessfulUnitTestContd]()
![unsuccessfulUnitTestContd2]()

## Useful links
JUnit 5 dependency: https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html
Surefire plugin dependency: https://maven.apache.org/surefire/maven-surefire-plugin/usage.html
