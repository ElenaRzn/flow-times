<html>
<head>
    <title>Flow Time Search</title>
</head>
<body>
<form action="${flowExecutionUrl}" method="post">
    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
    <input type="text" name="searchString"/><br/>
    <input type="submit" name="_eventId_searchEntered" value="Искать!" />

</form>
</body>
</html>