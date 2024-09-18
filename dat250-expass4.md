# Rapport: DAT250 Experiment 4

<h3>Technical difficulties: </h3>
<p> 1. I, like most I assume, had some technical difficulties running the testing of the example in the README.md due to outdated imports from JUnit4. Because I worked on this early in the week I tried to quickly find some solutions to this, which I did not succeed with. I managed to get one of the two tests in JpaTest to complete successfully, but the 'expected' keyword is something I could not find a replacement for. Therefore, the deleteUser did not complete. Furthermore, due to this I decided to delete the JpaTest and the three classes from my final commit so the Actions tests would run and complete successfully.</p>
<p> 2. The second point is more something I struggled with, and that was me using Collections instead of Set's in my program which made the test unexpectedly fail. I spent some time figuring this out, but once this was resolved the assignment went pretty well.</p>
<h3>Pending Issues</h3>
<p>Because I have not included the three classes and the test class from the README.md and couldn't get one of the test cases to pass, I guess this is something which is a pending issue.</p>
<h3>Other Comments</h3>
<p>To inspect the tables I changed the 'false' value of the property 'hibernate.show_sql' in my persistence.xml to 'true'. This displayed my tables in the output window.</p>

<hlink>Link: https://github.com/h599025/DAT250-Exp4</hlink>