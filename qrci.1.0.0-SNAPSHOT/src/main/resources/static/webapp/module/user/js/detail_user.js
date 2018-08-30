/**
 * 管理修改JS
 * @auther 
 */
	var detail_user = {
		name : 'user',
		listUrl : '/webapp/module/user/page/list_user.html',
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
			var userId = window.location.href.split("userId=")[1];
             $.ajax({
                 url:'/api/v1/users/'+userId,
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
    detail_user.init();
})

