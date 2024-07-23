<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Mobile AppsAutomated TestingAppiumQuick_7c3cb1</name>
   <tag></tag>
   <elementGuidId>8254fd6d-fdb2-44da-bd8c-478aa88ec858</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='__docusaurus_skipToContent_fallback']/div/div/main/div/div/div</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.col.docItemCol_VOVn</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>internal:role=main >> div >> internal:has-text=&quot;Mobile AppsAutomated TestingAppiumQuickstartOn this pageAppium QuickstartAppium &quot;i >> nth=2</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>52b48089-3824-42d7-9666-9062f49fd754</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>col docItemCol_VOVn</value>
      <webElementGuid>fc727230-c4db-4ea0-9649-fef489c34530</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>Mobile AppsAutomated TestingAppiumQuickstartOn this pageAppium QuickstartAppium is an automation testing framework that allows you to write tests using the Selenium syntax that are for use in testing native, mobile web, and hybrid apps on iOS and Android devices. Run your Appium tests on Sauce Labs to benefit from speed, parallelization, clear test result history, failure analysis, issue tracking, and more.

Don't have Appium tests but want to try? The Appium Demo Repo includes a sample project structure, working configuration specifications, and sample Java tests so you can get up and running in less than 10 minutes using the instructions on this page.
Already have Appium tests to run? Take advantage of the Sauce Labs library of real devices, Emulators and Simulators, and OS/browser combinations to maximize your digital confidence on every version of every device.

What You'll Need​
The following list of prerequisites are specific to running tests written in Java, per this demonstration. For information about other supported languages, refer to the demo projects in the Sauce Labs Training Repo.

A Sauce Labs account (if you don't have one, start a free trial)
Your Sauce Labs Username and Access Key
The Sauce Labs Appium Demo Project
A GitHub account
Git
The Swag Labs iOS Real Device Sample App
Local installation of JDK, Maven, and an IDE such as IntelliJ.

Step 1: Clone the Sample Project​
The Appium Quickstart for Java demo repository contains all the project files necessary to run a test against a mobile app or a web app accessed through a mobile browser. Clone the project in your local environment to get started.
git clone https://github.com/saucelabs-training/quickstart-appium-java.git
Step 2: Link your Sauce Labs Account​
Set your SAUCE_USERNAME and SAUCE_ACCESS_KEY as environment variables to avoid having to enter them with each command and to protect them from exposure in your tests.

Check to see whether your credentials are already set using the following command:

Check Environment Variablesecho $SAUCE_USERNAMEecho $SAUCE_ACCESS_KEY

If nothing is returned, use the following command to set your credentials:

export SAUCE_USERNAME=&quot;your Sauce username&quot;export SAUCE_ACCESS_KEY=&quot;your Sauce access key&quot;
Step 3: Upload the Sample App​

Download the iOS Real Device Swag Labs App from here.
Rename the app from iOS-Real-Device-MyRNDemoApp.*.*.*-*.ipa to iOS-Real-Device-MyRNDemoApp.ipa .
Upload it to your Sauce Labs account, either through the Sauce Labs UI or by calling the API.


Sauce Labs UI: From Sauce Labs > App Management, select Upload App and browse to find the iOS-Real-Device-MyRNDemoApp.ipa file you just downloaded and renamed.
API: Use the Upload File to App Storage API request to upload the sample app to your account.
curl -u &quot;$SAUCE_USERNAME:$SAUCE_ACCESS_KEY&quot; --location \--request POST 'https://api.us-west-1.saucelabs.com/v1/storage/upload' \--form 'payload=@&quot;&lt;path to the iOS file>/iOS-Real-Device-MyRNDemoApp.ipa&quot;' \--form 'name=&quot;iOS-Real-Device-MyRNDemoApp.ipa&quot;'


Step 4: Run the Tests​
cautionYou must have JDK and Maven installed to run this sample test, and you must have set their paths in your .bash_profile, for example:## Maven Variablesexport M2_HOME=/Applications/apache-maven-3.8.2export M2=$M2_HOME/binexport PATH=$PATH:$M2:$JAVA_HOME/bin:$PATH
If you are using an IDE, such as IntelliJ, open the quickstart-appium-java project you cloned in step 2, then right-click the src/test/java/tests/RDC/AppiumIosRdcAppTest and choose Run.
Alternatively, you can run the following command in your terminal:
Terminal Commandcd quickstart-appium-javamvn clean install -DtestngXmlFile=appium_ios_rdc_app_test.xml -Dregion=us
Once your tests complete, you should be able to see the results in your Sauce Labs account under Automated > Test Results > Real Devices.Edit this pageLast updated on May 15, 2023 by aoleszynPreviousAppium 2 MigrationNextReal Devices</value>
      <webElementGuid>e0069fd6-df73-4fda-a57a-9753a7bfda14</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;__docusaurus_skipToContent_fallback&quot;)/div[@class=&quot;docsWrapper_hBAB&quot;]/div[@class=&quot;docRoot_UBD9&quot;]/main[@class=&quot;docMainContainer_TBSr&quot;]/div[@class=&quot;container padding-top--md padding-bottom--lg&quot;]/div[@class=&quot;row&quot;]/div[@class=&quot;col docItemCol_VOVn&quot;]</value>
      <webElementGuid>8132b3a5-b1a2-46a3-aba7-24acc22db654</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='__docusaurus_skipToContent_fallback']/div/div/main/div/div/div</value>
      <webElementGuid>489739da-beca-47c4-9b88-0b8feebd11e9</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Low Code'])[1]/following::div[5]</value>
      <webElementGuid>12b65ee1-e2be-407d-b7fc-5026d867c6c2</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Mobile FAQ'])[1]/following::div[12]</value>
      <webElementGuid>2d00f02d-41e7-4765-948f-767ad1ab48c2</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//main/div/div/div</value>
      <webElementGuid>cbfc43e1-4e18-4bb5-a63f-5dae12dfb5e0</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot;Mobile AppsAutomated TestingAppiumQuickstartOn this pageAppium QuickstartAppium is an automation testing framework that allows you to write tests using the Selenium syntax that are for use in testing native, mobile web, and hybrid apps on iOS and Android devices. Run your Appium tests on Sauce Labs to benefit from speed, parallelization, clear test result history, failure analysis, issue tracking, and more.

Don&quot; , &quot;'&quot; , &quot;t have Appium tests but want to try? The Appium Demo Repo includes a sample project structure, working configuration specifications, and sample Java tests so you can get up and running in less than 10 minutes using the instructions on this page.
Already have Appium tests to run? Take advantage of the Sauce Labs library of real devices, Emulators and Simulators, and OS/browser combinations to maximize your digital confidence on every version of every device.

What You&quot; , &quot;'&quot; , &quot;ll Need​
The following list of prerequisites are specific to running tests written in Java, per this demonstration. For information about other supported languages, refer to the demo projects in the Sauce Labs Training Repo.

A Sauce Labs account (if you don&quot; , &quot;'&quot; , &quot;t have one, start a free trial)
Your Sauce Labs Username and Access Key
The Sauce Labs Appium Demo Project
A GitHub account
Git
The Swag Labs iOS Real Device Sample App
Local installation of JDK, Maven, and an IDE such as IntelliJ.

Step 1: Clone the Sample Project​
The Appium Quickstart for Java demo repository contains all the project files necessary to run a test against a mobile app or a web app accessed through a mobile browser. Clone the project in your local environment to get started.
git clone https://github.com/saucelabs-training/quickstart-appium-java.git
Step 2: Link your Sauce Labs Account​
Set your SAUCE_USERNAME and SAUCE_ACCESS_KEY as environment variables to avoid having to enter them with each command and to protect them from exposure in your tests.

Check to see whether your credentials are already set using the following command:

Check Environment Variablesecho $SAUCE_USERNAMEecho $SAUCE_ACCESS_KEY

If nothing is returned, use the following command to set your credentials:

export SAUCE_USERNAME=&quot;your Sauce username&quot;export SAUCE_ACCESS_KEY=&quot;your Sauce access key&quot;
Step 3: Upload the Sample App​

Download the iOS Real Device Swag Labs App from here.
Rename the app from iOS-Real-Device-MyRNDemoApp.*.*.*-*.ipa to iOS-Real-Device-MyRNDemoApp.ipa .
Upload it to your Sauce Labs account, either through the Sauce Labs UI or by calling the API.


Sauce Labs UI: From Sauce Labs > App Management, select Upload App and browse to find the iOS-Real-Device-MyRNDemoApp.ipa file you just downloaded and renamed.
API: Use the Upload File to App Storage API request to upload the sample app to your account.
curl -u &quot;$SAUCE_USERNAME:$SAUCE_ACCESS_KEY&quot; --location \--request POST &quot; , &quot;'&quot; , &quot;https://api.us-west-1.saucelabs.com/v1/storage/upload&quot; , &quot;'&quot; , &quot; \--form &quot; , &quot;'&quot; , &quot;payload=@&quot;&lt;path to the iOS file>/iOS-Real-Device-MyRNDemoApp.ipa&quot;&quot; , &quot;'&quot; , &quot; \--form &quot; , &quot;'&quot; , &quot;name=&quot;iOS-Real-Device-MyRNDemoApp.ipa&quot;&quot; , &quot;'&quot; , &quot;


Step 4: Run the Tests​
cautionYou must have JDK and Maven installed to run this sample test, and you must have set their paths in your .bash_profile, for example:## Maven Variablesexport M2_HOME=/Applications/apache-maven-3.8.2export M2=$M2_HOME/binexport PATH=$PATH:$M2:$JAVA_HOME/bin:$PATH
If you are using an IDE, such as IntelliJ, open the quickstart-appium-java project you cloned in step 2, then right-click the src/test/java/tests/RDC/AppiumIosRdcAppTest and choose Run.
Alternatively, you can run the following command in your terminal:
Terminal Commandcd quickstart-appium-javamvn clean install -DtestngXmlFile=appium_ios_rdc_app_test.xml -Dregion=us
Once your tests complete, you should be able to see the results in your Sauce Labs account under Automated > Test Results > Real Devices.Edit this pageLast updated on May 15, 2023 by aoleszynPreviousAppium 2 MigrationNextReal Devices&quot;) or . = concat(&quot;Mobile AppsAutomated TestingAppiumQuickstartOn this pageAppium QuickstartAppium is an automation testing framework that allows you to write tests using the Selenium syntax that are for use in testing native, mobile web, and hybrid apps on iOS and Android devices. Run your Appium tests on Sauce Labs to benefit from speed, parallelization, clear test result history, failure analysis, issue tracking, and more.

Don&quot; , &quot;'&quot; , &quot;t have Appium tests but want to try? The Appium Demo Repo includes a sample project structure, working configuration specifications, and sample Java tests so you can get up and running in less than 10 minutes using the instructions on this page.
Already have Appium tests to run? Take advantage of the Sauce Labs library of real devices, Emulators and Simulators, and OS/browser combinations to maximize your digital confidence on every version of every device.

What You&quot; , &quot;'&quot; , &quot;ll Need​
The following list of prerequisites are specific to running tests written in Java, per this demonstration. For information about other supported languages, refer to the demo projects in the Sauce Labs Training Repo.

A Sauce Labs account (if you don&quot; , &quot;'&quot; , &quot;t have one, start a free trial)
Your Sauce Labs Username and Access Key
The Sauce Labs Appium Demo Project
A GitHub account
Git
The Swag Labs iOS Real Device Sample App
Local installation of JDK, Maven, and an IDE such as IntelliJ.

Step 1: Clone the Sample Project​
The Appium Quickstart for Java demo repository contains all the project files necessary to run a test against a mobile app or a web app accessed through a mobile browser. Clone the project in your local environment to get started.
git clone https://github.com/saucelabs-training/quickstart-appium-java.git
Step 2: Link your Sauce Labs Account​
Set your SAUCE_USERNAME and SAUCE_ACCESS_KEY as environment variables to avoid having to enter them with each command and to protect them from exposure in your tests.

Check to see whether your credentials are already set using the following command:

Check Environment Variablesecho $SAUCE_USERNAMEecho $SAUCE_ACCESS_KEY

If nothing is returned, use the following command to set your credentials:

export SAUCE_USERNAME=&quot;your Sauce username&quot;export SAUCE_ACCESS_KEY=&quot;your Sauce access key&quot;
Step 3: Upload the Sample App​

Download the iOS Real Device Swag Labs App from here.
Rename the app from iOS-Real-Device-MyRNDemoApp.*.*.*-*.ipa to iOS-Real-Device-MyRNDemoApp.ipa .
Upload it to your Sauce Labs account, either through the Sauce Labs UI or by calling the API.


Sauce Labs UI: From Sauce Labs > App Management, select Upload App and browse to find the iOS-Real-Device-MyRNDemoApp.ipa file you just downloaded and renamed.
API: Use the Upload File to App Storage API request to upload the sample app to your account.
curl -u &quot;$SAUCE_USERNAME:$SAUCE_ACCESS_KEY&quot; --location \--request POST &quot; , &quot;'&quot; , &quot;https://api.us-west-1.saucelabs.com/v1/storage/upload&quot; , &quot;'&quot; , &quot; \--form &quot; , &quot;'&quot; , &quot;payload=@&quot;&lt;path to the iOS file>/iOS-Real-Device-MyRNDemoApp.ipa&quot;&quot; , &quot;'&quot; , &quot; \--form &quot; , &quot;'&quot; , &quot;name=&quot;iOS-Real-Device-MyRNDemoApp.ipa&quot;&quot; , &quot;'&quot; , &quot;


Step 4: Run the Tests​
cautionYou must have JDK and Maven installed to run this sample test, and you must have set their paths in your .bash_profile, for example:## Maven Variablesexport M2_HOME=/Applications/apache-maven-3.8.2export M2=$M2_HOME/binexport PATH=$PATH:$M2:$JAVA_HOME/bin:$PATH
If you are using an IDE, such as IntelliJ, open the quickstart-appium-java project you cloned in step 2, then right-click the src/test/java/tests/RDC/AppiumIosRdcAppTest and choose Run.
Alternatively, you can run the following command in your terminal:
Terminal Commandcd quickstart-appium-javamvn clean install -DtestngXmlFile=appium_ios_rdc_app_test.xml -Dregion=us
Once your tests complete, you should be able to see the results in your Sauce Labs account under Automated > Test Results > Real Devices.Edit this pageLast updated on May 15, 2023 by aoleszynPreviousAppium 2 MigrationNextReal Devices&quot;))]</value>
      <webElementGuid>f96916c3-3878-4fcc-8e68-f2d3f5e68b72</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
