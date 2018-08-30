/**
 * 管理新增JS
 * @auther 
 */
var add_systemUser = {
	url : 'systemUser/add',
	name : 'systemUser',
	listUrl : 'business/system/user/jsp/list_systemUser.jsp',
	// 提交按钮事件
	submitForm : function() {
		// 设置查询URL
		button_util.listUrl = this.listUrl; 
		// 调用分页插件初始化列表
		button_util.submitForm(this.url,this.name,this.listUrl);
	},
	// 返回按钮事件
	goback : function() {
		button_util.winToUrl(this.listUrl);
	},
	// 初始化加载类
	init : function() {
		// 初始化日期
		this.createDate();
	},
	// 初始化日期
	createDate : function() {
		// 格式化日期
		var createTime = dateFormate(false);
		// 赋值到页面显示
		$('input[name=createTime]').val(createTime);
	}
};

// 初始化加载
add_systemUser.init();

// 日期格式化 yyyy-MM-DD HH:mm:ss 默认带时分秒,false：年月日无时分秒
function dateFormate (type){
	var date = new Date();
	var year = date.getFullYear();
	var month = date.getMonth()+1;
	if(month < 10){
		month = "0" + month;
	}
	var day = date.getDate();
	if(day < 10){
		day = "0" + day;
	}
	var hours = date.getHours();
	if(hours < 10){
		hours = "0" + hours;
	}
	var minutes = date.getMinutes();
	if(minutes < 10){
		minutes = "0" + minutes;
	}
	var seconds = date.getSeconds();
	if(seconds < 10){
		seconds = "0" + seconds;
	}
	
	if(type){
		return year+"-"+month+"-"+day + " " + hours +":"+ minutes +":"+ seconds;
	}else{
		return year+"-"+month+"-"+day;
	}
}
