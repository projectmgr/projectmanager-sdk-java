[![Maven Central](https://img.shields.io/maven-central/v/com.projectmanager/projectmanagersdk?style=plastic)](https://central.sonatype.com/artifact/com.projectmanager/projectmanagersdk)

# ProjectManager.com SDK for API v4

This software development kit contains all API definitions for the [ProjectManager.com](https://www.projectmanager.com) REST API v4.  

# Why use the SDK?

The ProjectManager API v4 is available as a REST definition in OpenAPI format.  You can read the documentation online at [developer.projectmanager.com](https://developer.projectmanager.com/).

This SDK provides a few capabilities that developers may find more useful than hand-writing REST API code:
* Documentation is available in your editor via autocomplete and hover docblocks
* Patch notes are available detailing changes
* Automated updates whenever new API endpoints are added

# Using this SDK

Here's how to add this SDK to create a project.  

First, you must add a reference in your `pom.xml` file.  Check [the SonaType central page](https://central.sonatype.com/artifact/com.projectmanager/projectmanagersdk/overview) for the latest version number:

```xml
<dependency>
    <groupId>com.projectmanager</groupId>
    <artifactId>projectmanagersdk</artifactId>
    <version>97.0.2178</version>
</dependency>
```

Next, run `mvn install`.

To create an API client for ProjectManager within Java, you must specify:
* Your API key, and
* Your environment URL.

For the ProjectManager production environment, the environment URL is `https://api.projectmanager.com`.

To [obtain a ProjectManager.com API key](https://developer.projectmanager.com/reference/api-keys):
* Log on to ProjectManager.com
* Click your name in the bottom left hand corner
* Select Account, then API
* Follow the instructions on the page to create a new API key

```java
import com.projectmanager.ProjectManagerClient;

public class JavaExample
{
    public static ProjectManagerClient GetProjectManagerClient(String apiKey, String env)
    {
        return ProjectManagerClient
            .withEnvironment(env)
            .withBearerToken(apiKey)
            .WithAppName("MyApplicationName");
    }
}
```

        
        
        
