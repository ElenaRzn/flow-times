<html>
<head>
    <title>Flow Time Search</title>
</head>
<body>
<table align="center">
    <tr>
        <th>Найденный сотрудник</th>
    </tr>
     <#list search.personList as data>
        <table border="1">
                    <tr>
                        <td>ФИО:</td><td>${data.surname} ${data.name} ${data.patronymic}</td>
                    </tr>
                    <tr>
                        <td>Пол, возраст, город проживания:</td><td>${data.sex} ${data.age} ${data.city}</td>
                    </tr>
                    <tr>
                        <td>Компания, навыки:</td><td>${data.company}, ${data.skills}</td>
                    </tr>
                    <tr>
                        <td>Телефон, электронная почта, хобби, наличие прав:</td><td>${data.phone}, ${data.mail}, ${data.hobby} ${data.driverLicense?string('Права есть', 'Прав нет') }</td>
                    </tr>
                </table>
    </#list>
</table>
</body>
</html>