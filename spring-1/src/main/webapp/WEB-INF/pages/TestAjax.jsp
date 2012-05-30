<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="js/jquery-1.7.2.js">
</script>
<script type="text/javascript">
    function doAjax() {
      $.ajax({
        url: 'ajax2.htm',
        type: 'POST',
        beforeSend: function(x) {
        if(x && x.overrideMimeType) {
            x.overrideMimeType("application/j-son;charset=UTF-8");
        }},
        data: ({name : "me"}),
        dataType: "json",
        success: function(data) {
          alert(data.name);
          alert(data);
          $('#time').html(data);
          console.log(data);
          var alertText='';
          for(property in data) {
        	  alertText += property+":"+data[property]+";";
          }
          alert (alertText);
        },
        error: function(data) {
        	alert("Failed: "+data);
        }
      });
    }
    
    $(document).ready(function() {
       alert("HEEEEEE");
 	});
    
    function doAjax3() {
        $.ajax({
          url: 'ajax3.htm',
          type: 'GET',
          data: ({name : "me"}),
          success: function(data) {
            $('#time').html(data);
          },
          error: function(data) {
          	alert("Failed: "+data);
          }
        });
      }
    
  </script>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${message}
<button id="demo" onclick="doAjax()" title="Button">Get the time!</button>
<button id="demo2" onclick="doAjax3()" title="Button">Get the page!</button>
<div id="time">
</div>

</body>
</html>