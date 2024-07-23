# Selenium Cucumber Java Project

This project is a Selenium Cucumber Java application tested and automated through an Azure DevOps pipeline.
Prerequisites

    Java 17: Ensure Java 17 is installed.
    Maven: Ensure Maven is installed.
    Git: Ensure Git is installed.

Project Setup

    Clone the repository:

    bash

git clone <repository-url>
cd <repository-directory>

Install dependencies:

bash

    mvn clean install

Running Tests Locally

To run the tests locally using Maven, use the following command:

bash

mvn test

Azure DevOps Pipeline Configuration

This project is configured to run tests in an Azure DevOps pipeline. Below is the pipeline configuration.

yaml

trigger:
- master

pool:
  vmImage: ubuntu-latest

steps:
- task: Maven@4
  inputs:
    mavenPomFile: 'pom.xml'
    goals: 'test'
    publishJUnitResults: true
    testResultsFiles: '**/surefire-reports/TEST-*.xml'
    javaHomeOption: 'JDKVersion'
    jdkVersionOption: '1.17'
    mavenVersionOption: 'Default'
    mavenAuthenticateFeed: false
    effectivePomSkip: false
    sonarQubeRunAnalysis: false
    jdkArchitectureOption: 'x64'

Steps Explanation

    Trigger: The pipeline is triggered on changes to the master branch.
    Pool: The pipeline uses the ubuntu-latest image.
    Steps:
        Maven Task: This task runs the Maven test goal, publishes JUnit test results, and sets up Java 17.

Reporting

Test results are published to Azure DevOps and can be viewed in the pipeline run summary.
