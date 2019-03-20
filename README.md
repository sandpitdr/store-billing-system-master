retail-store-billing-system
====================

Bill Amount Calculator for a Sample Retail Store

 * Following is the goal of this program
 * 
 * On a retail website, the following discounts apply: 
 * 
 * 1. If the user is an employee of the store, he gets a 30% discount 
 * 2. If the user is an affiliate of the store, he gets a 10% discount 
 * 3. If the user has been a customer for over 2 years, he gets a 5% discount. 
 * 4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount). 
 * 5. The percentage based discounts do not apply on groceries. 
 * 6. A user can get only one of the percentage based discounts on a bill.  
 
 * Finds the net payable amount.
 
 Few Notes :- 
 
 1. Since i have created this project using Maven, this can be imported in eclipse as a Maven Project specifying the pom file. Run [mvn clean eclipse:eclipse] to generate eclipse files for the project.
 
 2. Run [mvn clean install] to install and run all the test cases.
 
 3. I have included Cobertura for Coverage Analysis and Reporting. I have created a seperate Profile named 'qualitycheck' in maven with Cobertura plugin.
    To generate Cobertura reports run [mvn clean cobertura:cobertura -Pqualitycheck] . Reports will be generated in the target folder of the project.
    
 4. The Cobertura branch coverage for the project is 100% and line coverage is 84% till last noticed. I have kept the coverage threshold to be above 75% for the build to pass.
 
 5. I have kept this exercise as simple and tried not to overcode. This project contains 10 test cases testing all the smoke conditions testing all the branches.
 
 6. I have used Joda-Time for efficient Date related calculations.
 
 7. This Application uses Java 1.8 and JUnit4.10.
 