/**
 * 管理查询JS
 * @auther
 */
	var list_user = {
		// 用户管理JS
		init:function(){
			// caption:标题
			var caption = "用户信息";
			// colNames:列名
			var  colNames = [
			'userId'
				 ,'用户名'
				 ,'password'
				 ,'真实姓名'
				 ,'部门'
				 ,'员工编号'
				 ,'联系电话'
				 ,'邮箱地址'
				 ,'delFlag'
				 ,'所属角色'
				 ,'注册时间'
			];
			// colModel:列对应实体类名
			var colModel = [  
		               { name: 'userId', index: 'userId', width: 10, key: true, hidden: true  }
		               ,{ name: 'userName', index: 'userName', width: 10, formatter:'showlink',
						// 设置点击详情页面URL
						formatoptions:{baseLinkUrl:"/webapp/module/user/page/detail_user.html",idName: "userId"}}
		               ,{ name: 'password', index: 'password', width: 10, hidden: true}
		               ,{ name: 'realName', index: 'realName', width: 10}
		               ,{ name: 'departmentName', index: 'departmentName', width: 10, hidden: true}
		               ,{ name: 'userNumber', index: 'userNumber', width: 10, hidden: true}
		               ,{ name: 'phone', index: 'phone', width: 10}
		               ,{ name: 'email', index: 'email', width: 10}
		               ,{ name: 'delFlag', index: 'delFlag', width: 10, hidden: true}
		               ,{ name: 'roleName', index: 'roleName', width: 10, hidden: false}
		               ,{ name: 'createTime', index: 'createTime', width: 10,
		            	   formatter:function(cellvalue, options, rowObject){
		               			return cellvalue;
		            		  // return cellvalue.substring(0,11);
		            	   }
		               }
		           ];
			// 设置查询URL
			button_util.listUrl = "/api/v1/users";
			// 设置新增跳转页面地址
			button_util.addUrl = "/webapp/module/user/page/add_user.html";
			// 设置 编辑跳转页面URL
			button_util.editUrl = "/webapp/module/user/page/edit_user.html?userId=";
			// 设置 删除参数URL
			button_util.delUrl = "/api/v1/users/";
			// 设置业务模块名称
			button_util.moduleName = "user";
			// 调用分页插件初始化列表
			page_util.tablePlugin("/api/v1/users",caption,colNames,colModel);
		},// 查询
		search:function(){
			button_util.search('systemUser/list/notDelRole','systemUser');
		}
	};
$(function(){
    // 初始化加载
    list_user.init();
})
