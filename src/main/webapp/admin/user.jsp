<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../static/layui/css/layui.css" media="all">
</head>
<body>
	<table class="layui-hide" id="users" lay-filter="test"></table>
	<script src="../static/js/jquery.min.js"></script>
	<script src="../static/layui/layui.js"></script>
	<script type="text/html" id="barDemo">
		<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
	</script>
	<script>
		layui.use('table', function() {
			var table = layui.table;
			table.render({
				elem : '#users',
				url : '/WukongCharge/user/admin/list.do',
				page : true,
				skin : 'line' //行边框风格
				,
				even : true //开启隔行背景
				,
				size : 'sm' //小尺寸的表格
				,
				cols : [ [ {
					field : 'id',
					title : 'id',
					edit : 'text',
					width : 100
				},{
					field : 'nickName',
					width : 100,
					title : '昵称',
					edit : 'text'
				}, {
					field : 'gender',
					width : 100,
					title : '用户性别',
					edit : 'text'
				}, {
					field : 'country',
					width : 150,
					title : '国家',
					edit : 'text'
				}, {
					field : 'province',
					width : 100,
					title : '省份',
					edit : 'text'
				}, {
					field : 'city',
					width : 100,
					title : '城市',
					edit : 'text'
				}, {
					field : 'language',
					width : 100,
					title : '语言',
					edit : 'text',
				}, {
					field : 'telephone',
					width : 100,
					title : '电话号码',
					edit : 'text',
				}, {
					field : 'uniqueId',
					title : '唯一标识',
					edit : 'text',
					width : 100
				},  {
					fixed : 'right',
					title : '操作',
					toolbar : '#barDemo',
					width : 100
				} ] ]
			});
			//监听行工具事件
			table.on('tool(test)', function(obj) {
				var data = obj.data;
				var layEvent = obj.event;
				switch (layEvent) {
				case 'del':
					layer.confirm('确定要删除该用户？', function(index) {
						$.post("/WukongCharge/user/admin/delete.do", {
							id : data.id
						}, function(ret) {
							var data = JSON.parse(ret)
							if (data.code == "1") {
								layer.msg('删除成功', function() {
									//删除成功
									obj.del();
									layer.close(index);
								});
							} else {
								layer.alert('删除成功', function() {
									layer.close(index);
									window.location.reload();
								});
							}
						});
					});
					break;
				}
			});
			//编辑（test）是layui过滤器
			table.on('edit(test)', function(obj) {
				var value = obj.value //得到修改后的值
				, data = obj.data //得到所在行所有键值
				, field = obj.field; //得到字段
				$.post("/WukongCharge/user/admin/update.do", {
					updateid : data.id,
					updatefield : field,
					updatevalue : value
				}, function(ret) {
					var data = JSON.parse(ret)
					if (data.code == 1) {
						layer.msg('[ID: ' + data.id + '] ' + field
								+ ' 字段更改为：' + value);
					} else {
						layer.msg('保存失败');
					}
				});
			});
		});
	</script>
</body>
</html>