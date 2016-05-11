
function showAddBookForm()
{
	alert('helllkooooooo');
	var str="<form name='loginForm' method='post' action='loginServlet'>"+
	"Username: <input type='text' name='usesername'/>'+' <br/>"+
	"Password: <input type='password' name='password'/> '+'<br/>"+
	"<input type='submit' value='Login' />"+
	"</form>";
		
	document.getElementById("form1").innerHTML=str;

}


