/**
 * 管理修改JS
 * @auther 
 */
	var edit_deviceType = {
		url : '/api/v1/deviceType/',
		name : 'deviceType',
		listUrl : '/webapp/module/deviceType/page/list_deviceType.html',
		// 提交按钮事件
		submitForm : function(){
			// 设置查询URL
			button_util.listUrl = this.listUrl;
			//
            var userId = window.location.href.split("id=")[1];
            // 表单校验
            if(validator_util.requiredValidator()) {
                // 调用分页插件初始化列表
                button_util.submitForm(this.url + userId, this.name, this.listUrl, 'put');
            }
		},
		// 返回按钮事件
		goback : function(){
			button_util.winToUrl(this.listUrl);
		},
		// 初始化加载类
		init : function(){
            // 初始化数据
            this.initData();
        },
		// 初始化数据
	     initData : function () {
			var id = window.location.href.split("id=")[1];
             $.ajax({
                 url:'/api/v1/deviceType/'+id,
                 type:"get",
                 contentType:"application/json",
                 dataType:"json",
                 timeout:10000,
                 success:function(data){
                 	var jsonObject = data.data;
                     for(var item in  jsonObject){
                     	if($('input[name='+item+']')){
                            $('input[name='+item+']').val(jsonObject[item]);
						}
                   	  }
                     }
             });
         }
		
	};
$(function(){
    // 初始化加载
    edit_deviceType.init();
})

