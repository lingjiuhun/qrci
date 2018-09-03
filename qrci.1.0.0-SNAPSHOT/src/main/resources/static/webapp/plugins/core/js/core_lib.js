/**  核心基础库JS core  @author baitao*/
 /**
     * 通用插件 - 工具
     * 
     * @author baitao 2016/7/10 
     */
     var tool_util = {
    		 uploadPath : '',
    		 basePath : '',
    		 path : '',
    		 init : function(){
    				// 获取上传URL地址
    			 tool_util.uploadPath = $('#uploadPath').val();
    				// 获取web工程地址
    			 tool_util.basePath = $('#basePath').val();
    				// 获取工程名称
    			 tool_util.path = $('#path').val();
    		},
    		 /**js中文转换 ---解决浏览器JS get请求传递出现中文的情况
    		 */
    		// 转为unicode 编码   --传递前编码
    		  encodeUnicode : function(str) {  
    		     var res = [];  
    		     for ( var i=0; i<str.length; i++ ) {  
    		     res[i] = ( "00" + str.charCodeAt(i).toString(16) ).slice(-4);  
    		     }  
    		     return "\\u" + res.join("\\u");  
    		 } ,
    		 // 解码   --传递前编码解码
    		  decodeUnicode: function(str) {  
    		     str = str.replace(/\\/g, "%");  
    		     return unescape(str);  
    		 }// 日期格式化 yyyy-MM-DD HH:mm:ss 默认带时分秒,false：年月日无时分秒
    			,dateFormate : function(type){
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
    			}//判断是否null 
    			 ,isNull : function(param){ 
    				  if(param == "" || param == undefined || param == null){
    					  return true;
    				  }else{
    					  return false;
    				  }
    			}// 获取当天日期
    			 ,getcurrentTime : function(format){
    			    var date = new Date();
    			    var seperator1 = "-";
    			    var seperator2 = ":";
    			    var month = date.getMonth() + 1;
    			    var strDate = date.getDate();
    			    if (month >= 1 && month <= 9) {
    			        month = "0" + month;
    			    }
    			    if (strDate >= 0 && strDate <= 9) {
    			        strDate = "0" + strDate;
    			    }
    			    if(format == 'yyyy'){
    			    	  var currentdate = date.getFullYear();
    			    	 return currentdate;
    			    }else if(format == 'yyyy-MM'){
    			    	  var currentdate = date.getFullYear() + seperator1 + month;
      			    	 return currentdate;
    			    }else if(format == 'yyyy-MM-dd'){
    			    	  var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
      			    	 return currentdate;
    			    }else if(format == 'yyyy-MM-dd HH'){
    			    	  var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
    			            + " " + date.getHours();
      			    	 return currentdate;
    			    }else if(format == 'yyyy-MM-dd HH:mm'){
    			    	  var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
    			            + " " + date.getHours() + seperator2 + date.getMinutes();
      			    	 return currentdate;
    			    }else{
    			    	  var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
    			            + " " + date.getHours() + seperator2 + date.getMinutes()
    			            + seperator2 + date.getSeconds();
      			    	 return currentdate;
    			    }
				 }// 获取当天时间
    			 ,getcurrentDate : function(){
					    var date = new Date();
					    var seperator1 = "-";
					    var month = date.getMonth() + 1;
					    var strDate = date.getDate();
					    if (month >= 1 && month <= 9) {
					        month = "0" + month;
					    }
					    if (strDate >= 0 && strDate <= 9) {
					        strDate = "0" + strDate;
					    }
					    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
					    return currentdate;
			 }// 获取当年
    			 ,getcurrentYear : function(){
					    var date = new Date();
					    var currentdate = date.getFullYear();
					    return currentdate;
			 } // 截取URL参数
    			 ,getId:function(name){
			        var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
			        var r = window.location.search.substr(1).match(reg);
			        if (r != null) {
			            return unescape(r[2]);
			        }
			        return null;
			    }
     };
/**
 * 基础核心插件 - 按钮控件
 * 
 * @author baitao 2016/7/10 
 */
 var button_util = {
	addUrl : '',// 跳转新增页面URL
	editUrl : '',// 跳转编辑页面URL
	commonUrl : '',// 跳转通用页面URL
	delUrl : '',// 删除请求参数地址
	searchName : '',//搜索字段
	exportUrl:'',//导出url
	// 跳转新增页面
	addPage : function() {
		button_util.winToUrl(button_util.addUrl);
	},// 跳转编辑页面(单选)
	editPage : function() {
		var url = button_util.editUrl;
		var rows = $('#'+page_util.id).getGridParam("selarrrow");
		if (rows.length != 1) {
			layer.msg('只能选择一个!');
		} else {
			url += rows[0];
			button_util.winToUrl(url);
		}
	},// 跳转编辑Frame页面(单选)
	editFrame : function(width,hight) {
		var url = button_util.editUrl;
		var rows = $('#'+page_util.id).getGridParam("selarrrow");
		if (rows.length != 1) {
			layer.msg('只能选择一个!');
		} else {
			url += rows[0];
			layer.open({
		        type: 2,
		        title: false,
		        closeBtn: 0, //不显示关闭按钮
		        shade: [0],
		        area: [width, hight],
		        content: [url, 'yes']//iframe的url，no代表不显示滚动条
			})
		}
	},// 预览(单选)
	commonPage : function(){
		var url = button_util.commonUrl;
		var rows = $('#'+page_util.id).getGridParam("selarrrow");
		if (rows.length != 1) {
			layer.msg('只能选择一个!');
		} else {
			url += rows[0];
			button_util.winToUrl(url);
		}
	},// 多行选择事件
	selectRows : function() {
		var rows = $('#'+page_util.id).getGridParam("selarrrow");
		if(rows.length > 0){
			var rowids ="";
			var rowDatas ="";
			for(var i=0;i<rows.length;i++){
				var rowData = $('#'+page_util.id).jqGrid("getRowData",rows[i]);
				if(i == 0){
					rowids =   rows[i];
					rowDatas =   rowData[button_util.searchName];
				}else{
					rowids += "," + rows[i];
					rowDatas += "," + rowData[button_util.searchName];
				}
			}
			window.parent.$('#'+button_util.searchWinValue+"_"+button_util.moduleName).val(rowids);
			window.parent.$('#'+button_util.searchWinText+"_"+button_util.moduleName).val(rowDatas);
			 parent.layer.close(parent.layer.getFrameIndex(window.name)); //获取窗口索引
		}else{
			layer.msg('请选择一个!');
		}
	},// 删除(可多选) delUrl:删除参数 delToUrl:删除请求地址
	del : function() {
		var urls = button_util.delUrl;
		var rows = $('#'+page_util.id).getGridParam("selarrrow");
		if (rows.length > 0) {
			for (var i = 0; i < rows.length; i++) {
				if (i == 0) {
					urls = urls + rows[i];
				} else {
					urls = urls + "," + rows[i];
				}
			}
		} else {
			layer.msg('必须选择一个!');
			return;
		}
		 layer.confirm('确认删除这条信息?', {
             closeBtn: false,
             skin: 'layui-layer-molv', //样式类名弹出层
             btn: ['取消', '确认'], 
             btn2 : function () {
                 $.ajax({
                     url:urls,
                     type:"delete",
                     contentType:"application/json",
                     dataType:"json",
                     success:function(result){
                         layer.msg(result.message);
                         $('#'+page_util.id).trigger("reloadGrid");
                     },
                     error:function(xhr,textstatus,thrown){

                     }
                 });
             },yes : function(index){
            	 layer.close(index);
             },
             // 按钮
         }, function (index) {
             layer.close(index);
         });
	},// 新增或修改表单提交
	submitForm : function(url, params,list_url,type) {
		var params = "{'date':'" + new Date().getTime() + "'";
		$('form input:text[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
		});
		$('form input:password[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
		});
		$('form textarea[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
		});
		$('form input:radio:checked[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
		});
		$('form select[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
		});
		$('form input:hidden[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
		});
		var box_name = '';
		if($('form input:checkbox:checked[ gps="form"]').length>0){
			$('form input:checkbox:checked[ gps="form"]').each(function(index) {
			if(box_name != $(this).attr('name')){
				if(index){
					params += "','";
				}else{
					params += ",'";
				}
				params += $(this).attr('name') + "':'";
				params += $(this).attr('value');
				box_name = $(this).attr('name');
			}else{
				params += ","+ $(this).attr('value');
			}
			});
			params += "'";
		}
		params += "}";
        var jsonObj = eval("("+params+")");
        $.ajax({
            url:url,
            type:type,
            contentType:"application/json;charset=utf-8",
            dataType:"json",
            timeout:10000,
           // data:JSON.stringify(params),
            data:JSON.stringify(jsonObj),
            success:function(result){
                layer.msg(result.message, {
                    time : 500
                }, function() {
                    if(result.success){
                        button_util.winToUrl(list_url);
                    }else{
                        return false;
                    }
                });
            }
        });
	},// 新增或修改表单提交
	submitFormFrame : function(url, params,list_url) {
		params += "={'date':'" + new Date().getTime() + "'";
		$('form input:text[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
		});
		$('form input:password[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
		});
		$('form textarea[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
		});
		$('form input:radio:checked[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
		});
		$('form select[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
		});
		$('form input:hidden[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
		});
		var box_name = '';
		if($('form input:checkbox:checked[ gps="form"]').length>0){
			$('form input:checkbox:checked[ gps="form"]').each(function(index) {
			if(box_name != $(this).attr('name')){
				if(index){
					params += "','";
				}else{
					params += ",'";
				}
				params += $(this).attr('name') + "':'";
				params += $(this).attr('value');
				box_name = $(this).attr('name');
			}else{
				params += ","+ $(this).attr('value');
			}
			});
			params += "'";
		}
		params += "}";
		$.post(url, params, function(result) {
			layer.msg(result.message, {
				time : 500
			}, function() {
				if(result.success){
					parent.$('#'+page_util.id).trigger("reloadGrid");
					var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
					parent.layer.close(index); //再执行关闭  
				}else{
					return false;
				}
			});
		});
	},// 搜索
	search : function(url, params) {
		// 开始时间和结束时间对比
        var startDate = $.trim($('.startDate').val());
        var endDate = $.trim($('.endDate').val());
        if (endDate != '' && startDate != '' && startDate >  endDate) {
            layer.msg("开始时间不能大于结束时间！！");
            return ;
        } 
		var text = "";
		params += "={'date':'" + new Date().getTime() + "'";
		$('form input[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			if(!$(this).hasClass("startDate") && !$(this).hasClass("endDate") && $.trim($(this).val()) != '' ){
				params += ":'" + tool_util.encodeUnicode($.trim($(this).val())) + "'";
			}else{
				params += ":'" + $.trim($(this).val()) + "'";
			}
			text += $.trim($(this).val());
		});
		$('form select[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
			text += $.trim($(this).val());
		});
		$('form input:hidden[ gps="form"]').each(function() {
			params += ",'" + $(this).attr('name') + "'";
			params += ":'" + $.trim($(this).val()) + "'";
			text += $.trim($(this).val());
		});
		params += "}";
		if(text == ""){params = "date=" + new Date().getTime() + "";}
		if(url.indexOf('?') != -1){
			url = url+"&"+ params;
		}else{
			url = url+"?"+ params;
		}
		$('#'+page_util.id).jqGrid('setGridParam', {
			url : url,
			datatype : 'json',
			mtype : 'GET',
			page:1 
		}).trigger("reloadGrid"); // 重新载入
	}, 
	// 导出
	exportExcel:function(){
		button_util.text = "";
		button_util.params = "";
		 button_util.params = this.moduleName + "={'date':'" + new Date().getTime() + "'";
		$('form input[ gps="form"]').each(function() {
			button_util.params += ",'" + $(this).attr('name') + "'";
			button_util.params += ":'" + $.trim($(this).val()) + "'";
			button_util.text += $.trim($(this).val());
		});
		$('form select[ gps="form"]').each(function() {
			button_util.params += ",'" + $(this).attr('name') + "'";
			button_util.params += ":'" + $.trim($(this).val()) + "'";
			button_util.text += $.trim($(this).val());
		});
		$('form input:hidden[ gps="form"]').each(function() {
			button_util.params += ",'" + $(this).attr('name') + "'";
			button_util.params += ":'" + $.trim($(this).val()) + "'";
			button_util.text += $.trim($(this).val());
		});
		button_util.params += "}";
		if(button_util.text == ""){button_util.params = "date=" + new Date().getTime() + "";}
		$.post(button_util.exportUrl, button_util.params, function(result) {
			var uri = "../" + result;
			window.open(uri, "_self");
		},'text');
	},
	// 窗口跳转
	winToUrl : function(url) {
	 if (!!window.ActiveXObject || "ActiveXObject" in window){
		 window.location.href = tool_util.basePath + url;
		}else{
	    	  window.location.href = url;
	    }
	},
	// 返回
	goBack : function(url) {
		winToUrl(url);
	}
};
 /**
  * 基础核心插件 - 时间
  * 
  * @author baitao 2016/7/10 
  */
  var date_util = {
 		 startDate:'',// 开始时间
 		 endDate:'',// 结束时间
 		 skin:'danlan',// 皮肤
 		 istoday:false,// 是否默认显示今天
 		 format:'yyyy-MM-dd',// 日期格式
 		// 获取日期控件
 		getDate : function(id,format,istoday,skin){
 			if(typeof (arguments[1]) == "undefined"){
 				format = date_util.format;
 			}if(typeof (arguments[2]) == "undefined"){
 				istoday = date_util.istoday;
 			}if(typeof (arguments[3]) == "undefined"){
 				skin = date_util.skin;
 			}
 			WdatePicker({
 				startDate:'%y-%M-%D',
 				dateFmt:format,
 				alwaysUseStartDate:true
 				});
 			if(istoday)
 			$('#' + id).val(tool_util.getcurrentTime(format));
 		}// 获取时间控件
 		,getTime : function(id,istoday,skin){
 			 if(typeof (arguments[1]) == "undefined"){
 				istoday = date_util.istoday;
 			}if(typeof (arguments[2]) == "undefined"){
 				skin = date_util.skin;
 			}
 			WdatePicker({
 				startDate:'%y-%M-%D %H:%m:%d',
 				dateFmt:'yyyy-MM-dd HH:mm:ss',
 				alwaysUseStartDate:true
 				});
 			if(istoday)
 				$('#' + id).val(tool_util.getcurrentTime('yyyy-MM-dd HH:mm:ss'));
 		}
 };
  /**
   * 基础核心插件 - 分页
   * 
   * @author baitao 2016/7/10 
   */
   var page_util = {
      id : 'dtable',// table的id
      page : 'jqGridPager',// table的pageid
      styleUI : 'Bootstrap',// table的styleUI
      viewrecords : true,// 默认显示结果数
      multiselect : true,// 是否多选框，默认多选
      multiboxonly:true,//默认
      rownumbers : true,// 是否显示行数，默认显示
      mtype : "GET",// 是否显示行数，默认显示
  	rowNum : 10, // 默认每页10条
  	//listUrl : '',// 查询页面URL
  	searchWinText: 'seachText', //弹出框搜索栏ID
  	searchWinValue: 'seachValue', //弹出框搜索栏值
  	text:'',// 搜索条件
  	params:'',// 搜索参数
  	searchName : '',//搜索字段
  	rowId : '',//rowId
  	rowName : '',//rowName
  	shrinkToFit : true,
	autoScroll : false,//滚动条
	openCols :null,
  	 // 集成jqgrid插件 url:查询URL caption:标题 colNames:列名 colModel:列对应实体类名 --用于弹出框查询 @2016.7.18 baitao(多参数版)
  	tablePlugin : function(url,caption, colNames, colModel) {
  		$("#"+page_util.id).jqGrid({
            repeatitems : false,
            jsonReader : {root:'data.list',total:'data.total',pageSize:'pageSize'},
                url : url,
  			caption : caption,
  			mtype : page_util.mtype,
  			styleUI : page_util.styleUI,// 设置jqgrid的全局样式为bootstrap样式
  			datatype : "json",
  			colNames : colNames,
  			colModel : colModel,
  			viewrecords : page_util.viewrecords,
  			multiselect : page_util.multiselect,
  			multiboxonly : page_util.multiboxonly,
  			rownumbers : page_util.rownumbers,
  			shrinkToFit:page_util.shrinkToFit,
  			autoScroll: page_util.autoScroll,
  			autowidth : true,
  			height : "50%",
  			rowNum : page_util.rowNum,
  			searchName:'',
  			rownumbers : false, // 显示行号
  			pager : "#"+page_util.page,// 分页控件的id
  			subGrid : false,
  			onSelectRow: function(rowId,status){  //点击事件
//  				page_util.onSelectRow(rowId,status);
  				page_util.rowId = rowId;
  				if(typeof myOnSelectRow != "undefined"){
  					myOnSelectRow(rowId,status);
  				}
  			},gridComplete : function(){
  				if(typeof mygridComplete != "undefined"){
  					mygridComplete();
  				}
  			},beforeSelectRow(rowid, e){
  				if(typeof mybeforeSelectRow != "undefined"){
  					mybeforeSelectRow(rowid, e);
  				}
  			},loadComplete(){
  				if(typeof myloadComplete != "undefined"){
  					myloadComplete();
  				}
  			},loadError(){
  				if(typeof myloadError != "undefined"){
  					myloadError();
  				}
  			}
  		});
  		// jqgrid -- 样式调整
  		page_util.tableCss();
  	},onSelectRow : function(rowId,status){
  		var rowData = $("#dtable").jqGrid("getRowData",rowId);
//  		for(var i =0 ;i < colIdValues.length;i++){
//  			 window.parent.$('#'+utilButtons.searchWinValue+"_"+colIdValues[i]).val(rowData[colIdValues[i]]);
//  			 window.parent.$('#'+utilButtons.searchWinText+"_"+colNameValues[i]).val(rowData[colNameValues[i]]);
//  		}
//  		 parent.layer.close(parent.layer.getFrameIndex(window.name)); //获取窗口索引
  	},// 多行选择事件
	selectRows : function(moduleName) {
		if(typeof(flag) == "undefined"){
			flag = page_util.multiselect;
		}
		if(!flag){
			var rowData = $("#dtable").jqGrid("getRowData",page_util.rowId);
			if(page_util.openCols == null){
				window.parent.$('#'+page_util.searchWinValue+"_"+ moduleName).val(page_util.rowId);
				window.parent.$('#'+page_util.searchWinText+"_"+moduleName).val(rowData[page_util.searchName]);
			}else{
				// 支持同时获取多个值
				for(var i=0;i<page_util.openCols.length;i++){
					window.parent.$('input[name='+page_util.openCols[i]+"]").val(rowData[page_util.openCols[i]]);
				}
			}
			
			parent.layer.close(parent.layer.getFrameIndex(window.name)); //获取窗口索引
		}else{
			var rows = $("#"+page_util.id).getGridParam("selarrrow");
			if(rows.length > 0){
				var rowids ="";
				var rowDatas ="";
				for(var i=0;i<rows.length;i++){
					var rowData = $("#"+page_util.id).jqGrid("getRowData",rows[i]);
					if(i == 0){
						rowids =   rows[i];
						rowDatas =   rowData[page_util.searchName];
					}else{
						rowids += "," + rows[i];
						rowDatas += "," + rowData[page_util.searchName];
					}
				}
				window.parent.$('#'+page_util.searchWinValue+"_"+ moduleName).val(rowids);
				window.parent.$('#'+page_util.searchWinText+"_"+moduleName).val(rowDatas);
				 parent.layer.close(parent.layer.getFrameIndex(window.name)); //获取窗口索引
			}else{
				layer.msg('请选择一个!');
			}
		}
		if(typeof parent.myselectRows != "undefined"){
			parent.myselectRows();
		}
	},
  	// jqgrid -- 样式调整
  	tableCss : function(){
  	// 是否启用子表格
  	$("#"+page_util.id).jqGrid('navGrid', '#jqGridPager', {
  		edit : false,
  		add : false,
  		del : false,
  		search : false,
  		refresh : true
  	});
  	// 设置jqgrid的宽度
  	$(window).bind('resize', function() {
  		var width = $('.jqGrid_wrapper').width();
  		$("#"+page_util.id).setGridWidth(width);
  	});
  	} 
  };
   /**
    * 基础核心插件 -通用校验插件
    *
    * @author baitao 2016/8/4 必填项，数字检验，邮箱校验等
    */
   var validator_util = {
       isIDCard1Reg: /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$/,//身份证正则表达式(15位)
       isIDCard2Reg: /^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/,//身份证正则表达式(18位)
       phoneReg: /^1[3|4|5|7|8]\d{9}$/,//手机号正则表达式
       simReg:  /^[1-9]\d{10}$/, 
       simReg13:  /^[1-9]\d{12}$/, 
       amountReg: /^(([1-9]\d{0,9}))(\.\d{1,2})?$/,//金额正在表达式
       floatNumReg: /^[0-9]+\.?[0-9]*$/,// 验证整数或者小时
       emailReg:/^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/,//邮箱正则表单式
       numberReg:/^[0-9]*$/,//数字正则表单式
       definedReg:'',//自定义正则
       definedValidator : function(className,msg){
       	 var flag = true;
            $('.'+className).each(function () {
                var value = $.trim($(this).val());
                if (!validator_util.definedReg.test(value)) {
                    flag = false;
                }
            });
            if (!flag) {
                layer.msg(msg);
            }
            return flag;
       },
       // 必填项校验
       requiredValidator: function () {
           var flag = true;
           $('form input[ gps="form"]').each(function () {
               if (typeof($(this).attr("required")) != "undefined") {
                   var value = $.trim($(this).val());
                   if (value == '') {
                       flag = false;
                   }
               }
           });
           $('form textarea[ gps="form"]').each(function() {
           	 if (typeof($(this).attr("required")) != "undefined") {
                    var value = $.trim($(this).val());
                    if (value == '') {
                        flag = false;
                    }
                }
   		});
           var checknum = 0;
           var checkcount = 0;
           $('form input:checkbox[ gps="form"]').each(function (index) {
               checknum = index;
           });
           $('form input:checkbox:checked[ gps="form"]').each(function (index1) {
               checkcount = index1;
           });
           if (checknum > 0 && checkcount == 0) {
               flag = false;
           }
           var radionum = 0;
           var radiocount = 0;
           $('form input[required]').each(function (j) {
               $('form input:radio:checked[ gps="form"]').each(function (index) {
                   radionum = index;
                   var value = $.trim($(this).attr('value'));
                   if (value != '') {
                       radiocount++;
                   }
               });
           });
           $('form select[ gps="form"]').each(function () {
               if (typeof($(this).attr("required")) != "undefined") {
                   var value = $.trim($(this).val());
                   if (value == '' || value == '-1') {
                       flag = false;
                   }
               }
           });
           
           if (radionum > 0 && radiocount == 0) {
               flag = false;
           }
           if (!flag) {
               layer.msg("请填写完整信息和正确的值！");
           }
           return flag;
       },  // 身份证校验
       cardValidator: function () {
           var cardValue = $.trim($('.cardValidator').val());
           if (!validator_util.isIDCard1Reg.test(cardValue) && !validator_util.isIDCard2Reg.test(cardValue)) {
               layer.msg("请填写正确的身份证号！");
               return false;
           } else {
               return true;
           }
       },// 手机号码
       phoneValidator: function () {
       	var flag = true;
       	$('.phoneValidator').each(function(){
       		 var phoneValue = $.trim($(this).val());
       	        if (!validator_util.phoneReg.test(phoneValue)) {
       	            layer.msg("请填写正确的手机号码！");
       	            flag = false;
       	        } 
       	});
    	        return flag;
      
          
       },// 密码一致
       passwordValidator: function () {
           var passwordValue = $.trim($('.passwordValidator').val());
           var passwordValueSec = $.trim($('.passwordValidatorSec').val());
           if (passwordValue != passwordValueSec) {
               layer.msg("两次密码不一致！");
               return false;
           } else {
               return true;
           }
       },// SIM号码
       simValidator: function () {
           var phoneValue = $.trim($('.simValidator').val());
           if (validator_util.simReg.test(phoneValue) || validator_util.simReg13.test(phoneValue) ) {
           	return true;
           } else {
       	  layer.msg("请填写首位不能为0的11位或13位SIM卡号！");
             return false;
           }
       },// 精度校验
       lonValidator: function () {
           var patternLongitudeVal = $.trim($('.patternLongitude').val());
           if (Math.abs(patternLongitudeVal) > eval(180) || !validator_util.floatNumReg.test(patternLongitudeVal)) {
               //if (!validator_util.patternLongitude.test(patternLongitudeVal)) {
               layer.msg("请填写正确的经度！");
               return false;
           } else {
               return true;
           }
       },// 纬度校验
       latValidator: function () {
           var patternLatitudeVal = $.trim($('.patternLatitude').val());
           if (eval(patternLatitudeVal) > eval(90) || !validator_util.floatNumReg.test(patternLatitudeVal)) {
               //if(!validator_util.patternLatitude.test(patternLatitudeVal)){
               layer.msg("请填写正确的纬度！");
               return false;
           } else {
               return true;
           }
       },// 整数校验
       integerValidator: function () {
       	var flag = true;
       	$('.patternInteger').each(function(){
      		 var patternInteger = $.trim($(this).val());
   	   		if (!validator_util.floatNumReg.test(patternInteger)) {
   	            layer.msg("有整数格式的请填写整数！");
   	            flag = false;
   	        } 
      	});
   	 return flag;
       },//数字校验
       numberValidator: function () {
       	var flag = true;
       	$('.patternNumber').each(function(){
      		 var patternNumber = $.trim($(this).val());
   	   		if (!validator_util.numberReg.test(patternNumber)) {
   	            layer.msg("有数字格式的请填写正确的数字！");
   	            flag = false;
   	        } 
      	});
   	 return flag;
       },// 邮箱校验
       eamilValidator: function () {
       	var flag = true;
       	$('.eamilValidator').each(function(){
       		 var eamilValidator = $.trim($(this).val());
       	        if (!validator_util.emailReg.test(eamilValidator)) {
       	        	 layer.msg("请填写正确的邮箱格式！");
       	            flag = false;
       	        } 
       	});
    	        return flag;
       },// 日期校验
       dateValidator: function () {
     	  var startDate = $.trim($('.startDate').val());
           var endDate = $.trim($('.endDate').val());
           if (startDate > endDate) {
               layer.msg("开始时间不能大于结束时间！");
               return false;
           } else {
               return true;
           }
     }
   };
   /**
    * 基础核心插件 - 弹出框
    * 
    * @author baitao 2016/7/10 
    */
    var window_util = {
   		 	layerIndex : 0,
   			 width : '600',
   			 height : '600',
   			 closeBtn : 0,
   			 shadeClose : true,
   			 title : false,
   			 // 弹出框
   			 openLayer : function(moduleName,width,height,params){
   			var url = 'common/openWin?name='+moduleName;
   			if(typeof (arguments[1]) == "undefined"){
   				width = window_util.width;
   			}if(typeof (arguments[2]) == "undefined"){
   				height = window_util.height;
   			}if(typeof (arguments[3]) != "undefined"){
   				url += url+'&'+params;
   			}
   			window_util.layerIndex = layer.open({
   				  type: 2,
   				  area: [width+'px', height+'px'],
   				  fix: false, //不固定
   				  closeBtn :0,
   				  shadeClose :true,
   				  title: false,
   				  content: url
   				});
   		},openFrame : function(frameParams){
   			if(typeof (frameParams.width) == "undefined"){
   				frameParams.width = window_util.width;
   			}if(typeof (frameParams.height) == "undefined"){
   				frameParams.height = window_util.height;
   			}if(typeof (frameParams.closeBtn) == "undefined"){
   				frameParams.closeBtn = window_util.closeBtn;
   			}if(typeof (frameParams.shadeClose) == "undefined"){
   				frameParams.shadeClose = window_util.shadeClose;
   			}if(typeof (frameParams.title) == "undefined"){
   				frameParams.title = window_util.title;
   			}
   			window_util.layerIndex = layer.open({
   				  type: 2,
   				  area: [frameParams.width+'px', frameParams.height+'px'],
   				  fix: false, //不固定
   				  closeBtn :frameParams.closeBtn,
   				  shadeClose :frameParams.shadeClose,
   				  title: frameParams.title,
   				  content: frameParams.url
   				});
   		},openWin : function(content,width,height,closeBtn,shadeClose,title){
   			if(typeof (arguments[1]) == "undefined"){
   				width = window_util.width;
   			}if(typeof (arguments[2]) == "undefined"){
   				height = window_util.height;
   			}if(typeof (arguments[3]) == "undefined"){
   				height = window_util.closeBtn;
   			}if(typeof (arguments[4]) == "undefined"){
   				height = window_util.shadeClose;
   			}if(typeof (arguments[5]) == "undefined"){
   				height = window_util.title;
   			}
   			window_util.layerIndex = layer.open({
   				  type: 1,
   				  area: [width+'px', height+'px'],
   				  fix: false, //不固定
   				  closeBtn :0,
   				  shadeClose :true,
   				  title: false,
   				  content: content
   				});
   		}
   };
$(function(){
	tool_util.init();
})