/**
 * 管理新增JS
 * @auther 
 */
var add_deviceType = {
	url : '/api/v1/deviceType/',
	name : 'deviceType',
	listUrl : '/webapp/module/deviceType/page/list_deviceType.html',
	// 提交按钮事件
	submitForm : function() {
		// 设置查询URL
		button_util.listUrl = this.listUrl;
		// 表单校验
		if(validator_util.requiredValidator()){
            // 调用分页插件初始化列表
            button_util.submitForm(this.url,this.name,this.listUrl,'post');
		}

	},
	// 返回按钮事件
	goback : function() {
		button_util.winToUrl(this.listUrl);
	},
	// 初始化加载类
	init : function() {
	},
};
$(function(){
    // 初始化加载
    add_deviceType.init();
})

