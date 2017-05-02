/**
 * 获取要提交的表单数据（json格式）
 * @return
 */
function getValuesToJson(formid){
	var values = {};
	var str = "#" + formid + " input"; 
	var inputs = $(str);
	for ( var int = 0; int < inputs.length; int++) {
		var name = inputs[int].name;
		var aaa = "values."+name+"='"+inputs[int].value+"'";
		eval(aaa);
	}
	return values;
}
/**
 * 
 * @param url//访问地址
 * @param params//发送数据
 * @param successBack//成功回调函数
 * @param failBack//失败回调函数
 * @param beforeSend//发送前调用函数
 * @param complete//完成回调函数
 * @return
 */
function ajaxRequest(url,params,successBack,failBack,beforeSend,complete){
	if (url == null || url == "") {
		return false;
	}
	$.ajax(
		{url:url,//访问地址
		 data:params,//发送数据
		 async:true, //是否异步
		 timeout:5000,//超时时间
		 type: "post",//GET
		 datatype:"json",//返回的数据格式：json/xml/html/script/jsonp/text
		 beforeSend:beforeSend,//发送前调用函数
		 success:successBack,//成功回调函数
		 error:failBack,//失败回调函数
		 complete:complete//完成回调函数
		}
	)
}
/**
 * 
 * @param url//访问地址
 * @param params//发送数据
 * @param successBack//成功回调函数
 * @param failBack//失败回调函数
 * @param beforeSend//发送前调用函数
 * @param complete//完成回调函数
 * @return
 */
function submitRequest(formId,url,params,successBack,failBack,beforeSend,complete){
	if (url == null || url == "") {
		return false;
	}
	if (formId != null) {
		var values = getValuesToJson(formId);
		if (params != null) {
			Object.assign(params,values);
		}else
			params = values;
	}
	$.ajax(
		{url:url,//访问地址
		 data:params,//发送数据
		 async:false, //是否异步
		 timeout:5000,//超时时间
		 type: "post",//GET
		 datatype:"json",//返回的数据格式：json/xml/html/script/jsonp/text
		 beforeSend:beforeSend,//发送前调用函数
		 success:successBack,//成功回调函数
		 error:failBack,//失败回调函数
		 complete:complete//完成回调函数
		}
	)
}	