/**
 * 管理查询JS
 * @auther
 */
	var list_deviceType = {
		// 用户管理JS
		init:function(){
			// caption:标题
			var caption = "用户信息";
			// colNames:列名
			var  colNames = [
			'userId'
				 ,'名称'
				 ,'编号'
				 ,'备注'
				 ,'创建时间'
				 ,'更新时间'
			];
			// colModel:列对应实体类名
			var colModel = [  
		               { name: 'id', index: 'id', width: 10, key: true, hidden: true  }
		               ,{ name: 'typeName', index: 'typeName', width: 10, formatter:'showlink',
						// 设置点击详情页面URL
						formatoptions:{baseLinkUrl:"/webapp/module/deviceType/page/detail_deviceType.html",idName: "id"}}
		               ,{ name: 'typeNum', index: 'typeNum', width: 10}
		               ,{ name: 'comment', index: 'comment', width: 10}
		               ,{ name: 'createTime', index: 'createTime', width: 10,
		            	   formatter:function(cellvalue, options, rowObject){
		               			return cellvalue;
		            		  // return cellvalue.substring(0,11);
		            	   }
		               }
		               ,{ name: 'updateTime', index: 'updateTime', width: 10,
		            	   formatter:function(cellvalue, options, rowObject){
		               			return cellvalue;
		            		  // return cellvalue.substring(0,11);
		            	   }
		               }
		           ];
			// 设置查询URL
			button_util.listUrl = "/api/v1/deviceType";
			// 设置新增跳转页面地址
			button_util.addUrl = "/webapp/module/deviceType/page/add_deviceType.html";
			// 设置 编辑跳转页面URL
			button_util.editUrl = "/webapp/module/deviceType/page/edit_deviceType.html?id=";
			// 设置 删除参数URL
			button_util.delUrl = "/api/v1/deviceType/";
			// 设置业务模块名称
			button_util.moduleName = "deviceType";
			// 调用分页插件初始化列表
			page_util.tablePlugin("/api/v1/deviceType",caption,colNames,colModel);
		},// 查询
		search:function(){
			button_util.search('systemUser/list/notDelRole','systemUser');
		}
	};
$(function(){
    // 初始化加载
    list_deviceType.init();
})
