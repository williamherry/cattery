<h1>hello</h1>
<h2>this file is under cats directory</h2>
<table>
	<tr>
		<th>Name</th>
	</tr>

	<#list cats as cat>
	<tr>
		<td>${cat.name}</td>
	</tr>
	</#list>
</table>
