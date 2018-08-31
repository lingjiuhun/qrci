/**
 * 管理修改JS
 * @auther 
 */
	var detail_deviceType = {
		name : 'deviceType',
		listUrl : '/webapp/module/deviceType/page/list_deviceType.html',
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
                     	if($('label[name='+item+']')){
                            $('label[name='+item+']').html(jsonObject[item]);
						}
                   	  }
                     }
             });
         }
		
	};
$(function(){
    // 初始化加载
    detail_deviceType.init();
})

