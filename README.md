# GitHub Actions CD Tutorial
This is the example code used in a Tutorial Series about Continuous Deployment with GitHub Actions.

This app is built with Java11.

# Starting the App

You can build this app with Gradle. Just use 

` ./gradlew build `

to build the application and 

` ./gradlew bootRun `

to run it locally. 

You can build a docker image with 

` ./gradlew bootBuildImage --imageName=ct-example/myapp `

And afterwards use this image tagged with `--imageName` to deploy it on a container runtime.

# Starting the Workflows

In order for the workflows to start you need to set up two secrets in your Repositories Config: 
- **SERVICE_KEY** holding the key of your Google Cloud Service Account to access the Google Container Registry
- **IMAGE_PATH** holding the path to your image you want to deploy in your GCR

Once those two variables have been set up a push to the main branch will trigger the run of the build workflow, releasing your app to the GCR.

You can use the **build.yml** workflow as a starting point to test out the tutorial or check out the finished **build-and-deploy.yml** to compare your results.

In order to test out the already finished workflow in **build-and-deploy.yml* you need those additional secrets set up in your repositories config: 
- **PROJECT_ID** holding the id of your Google Cloud Project you want to use for the Deployment
- **REGION_ID** holding the id of the region you want your code to be deployed in.