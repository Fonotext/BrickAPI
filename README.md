# BrickAPI (Richard Joseph for CACI)

Let me first apologise as the code I'm submitting here fulfils *none* of the tasks specified by CACI - I am under no illusions regarding the implications of that concerning the role. 

After using [SpringBoot Initializr][springinit] to generate the current project, on 3x (three) separate occasions, **I have decided to 'throw in the towel'**, but to at least present the issues I have faced (outside of an out of date local java environment). Cutting to the chase:

- Using `./gradlew bootRun [--info]` does not start/maintain a running web server, with *no* visible errors.

Although I should have been able to code further, using mockMVC etc. to test my endpoints, the mere fact that I couldn't get the basic web server to run with a single endpoint was 'frustrating' to say the least. It is also not unprecedented, here I provide 2 links at Jetbrains which attest to this issue (I was *unable* to implement/execute their rudimentary-sounding fixes):

"Spring Boot application stops immediately after start-up":

<https://intellij-support.jetbrains.com/hc/en-us/community/posts/360009853079-Spring-Boot-application-stops-immediately-after-start-up>

Spring Boot stops immediately after start up:

<https://intellij-support.jetbrains.com/hc/en-us/community/posts/360009249140-Spring-Boot-stop-immediately-after-start-up>

Again, I'd like to apologise for the 'lag', I do admit to a little 'ring rust' with Java/my previous local environment (IJ2019/Java 11, had to upgrade), **I would be happy for someone amongst you to tell me what I was doing wrong or simply that this code worked on your own machine(s)**.

Regards

Richard Joseph

[springinit]: https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.0.4&packaging=jar&jvmVersion=17&groupId=com.fonotext&artifactId=brickapi&name=brickapi&description=Brick%20API%20Demo%20project%20for%20Spring%20Boot&packageName=com.fonotext.brickapi
