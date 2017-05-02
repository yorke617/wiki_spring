function regist(){
	//var params = "{'name':'"+$("#name").val()+"','password':'"+$("#pass").val()+"'}";
	var url = 'registUser.do';
	submitRequest("form",url,null,function(re){
    	alert("success");
    },function(re){
    	alert(re);
    })
    /*
    var json = {};
	json.name = $("#name").val();
	json.password = $("#pass").val();
    var params = getValuesToJson("form");
	$.ajax({url:'registUser.do',
		    data:json,
		    type: "post",
		    datatype:"json",  
		    success:function(re){
		    	$("#loginname").html(re.loginname);
		    	$("#password").html(re.password);
		    	$("#usertype").html(re.usertype);
	        }
	})*/
}
function query(){
	var params = "{'a':'aaaaa','b':'bbbbb','c':'cccccc'}";
	
	$.ajax({url:'queryUser.do',
		    data:{'params':params},
		    type: "post",
		    datatype:"json",  
		    success:function(re){
		    	$("#loginname").html(re.loginname);
		    	$("#password").html(re.password);
		    	$("#usertype").html(re.usertype);
	        },
	        error:function(re,re1,re2){
	        	alert(re.responseText);
	        }
	})
}