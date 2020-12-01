<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Spring Boot Form Submission</title>
    </head>
    <body>
        <h1>Spring Boot Form Submission</h1>
        <#if cat?? >
            Your submitted data<br>
            Name: ${cat.name}<br>
        <#else>
            <form action="/cats" method="post">
                <div>Name:</div>
                <input type="text" name="name"/>
                <br/><br/>
                <br/><br/>
                <input type="submit" value="Submit"/>
                <input type="reset" value="Reset"/>
            </form>
        </#if>
    </body>
</html>