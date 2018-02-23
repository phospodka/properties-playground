Properties Playground
========================

This is a multi project test repo for testing spring boot properties and auto completion in 
`application.properties` / `application.yml`.  There is a project for both gradle and maven.  

I intended this for Intellij but should work for any IDE.  Checking out with Intellij is 
seemingly awkward when letting it auto determine the modules.  If it behaves weird for you 
(creating a module for each main and test folder) then it may be easier to checkout separately
with git and then import the two modules from their `build.gradle` and `pom.xml` files, respectively. 
