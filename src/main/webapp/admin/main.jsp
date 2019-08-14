<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>悟空充电桩后台</title>
<link rel="stylesheet" href="../static/layui/css/layui.css" media="all">
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
<link rel="stylesheet" href="../static/css/style.css" />
<script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
<script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
</head>
<body>
	<div class="navi">
		<div class="layui-row navi">
			<div class="layui-col-xs1 navi">
				<div class="grid-demo grid-demo-bg1">
					<img src="../static/images/logo.jpg" height="60px" />
				</div>
			</div>
			<div class="layui-col-xs2 navi">
				<div class="grid-demo grid-demo-bg1">
					<p class="font">悟空充电桩后台</p>
				</div>
			</div>
			<div class="layui-col-xs1 navi">
				<div class="grid-demo"></div>
			</div>
			<div class="layui-col-xs5 navi">
				<div class="grid-demo"></div>
			</div>
			<div class="layui-col-xs3 navi">
				<div class="grid-demo">
					<ul class="layui-nav">
						<li class="layui-nav-item"><a href="">控制台<span
								class="layui-badge">9</span></a></li>
						<li class="layui-nav-item"><a href="">个人中心<span
								class="layui-badge-dot"></span></a></li>
						<li class="layui-nav-item" lay-unselect=""><a
							href="javascript:;"><img src="//t.cn/RCzsdCq"
								class="layui-nav-img">我</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="javascript:;">修改信息</a>
								</dd>
								<dd>
									<a href="javascript:;">安全管理</a>
								</dd>
								<dd>
									<a href="javascript:;">退了</a>
								</dd>
							</dl></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="content">
		<div class="verticalNav">
			<ul class="layui-nav layui-nav-tree layui-inline" lay-filter="demo"
				style="margin-right: 10px;">
				<!-- 
				<li class="layui-nav-item"><a href="javascript:;">实时监控</a>
					<dl class="layui-nav-child">
						<dd class="site-demo-active" data-id="1" data-title="全局监控">
							<a href="javascript:">全局监控</a>
						</dd>
						<dd class="site-demo-active" data-id="2" data-title="电站监控">
							<a href="javascript:;">电站监控</a>
						</dd>
						<dd class="site-demo-active" data-id="3" data-title="电桩监控">
							<a href="javascript:;">电桩监控</a>
						</dd>
					</dl>
				</li>

				<li class="layui-nav-item"><a href="javascript:;">数据统计</a>
					<dl class="layui-nav-child">
						<dd class="site-demo-active" data-id="4" data-title="全局统计">
							<a href="javascript:;">全局统计</a>
						</dd>
						<dd class="site-demo-active" data-id="5" data-title="电站统计">
							<a href="javascript:;">电站统计</a>
						</dd>
						<dd class="site-demo-active" data-id="6" data-title="服务清单">
							<a href="javascript:;">服务清单</a>
						</dd>
					</dl>
				</li>
				<li class="layui-nav-item"><a href="javascript:;">电站管理</a>
					<dl class="layui-nav-child">
						<dd class="site-demo-active" data-id="7" data-title="电站管理">
							<a href="javascript:">电站管理</a>
						</dd>
						<dd class="site-demo-active" data-id="8" data-title="电桩管理">
							<a href="javascript:">电桩管理</a>
						</dd>
						<dd class="site-demo-active" data-id="9" data-title="远程升级">
							<a href="javascript:">远程升级</a>
						</dd>
						<dd class="site-demo-active" data-id="10" data-title="电桩操作">
							<a href="javascript:">电桩操作</a>
						</dd>
						<dd class="site-demo-active" data-id="11" data-title="故障管理">
							<a href="javascript:">故障管理</a>
						</dd>
						<dd class="site-demo-active" data-id="12" data-title="通讯调试">
							<a href="javascript:">通讯调试</a>
						</dd>
						<dd class="site-demo-active" data-id="13" data-title="异常警告">
							<a href="javascript:">异常警告</a>
						</dd>
						<dd class="site-demo-active" data-id="14" data-title="工作数据">
							<a href="javascript:">工作数据</a>
						</dd>
					</dl>
				</li>
				-->
				<li class="layui-nav-item site-demo-active" data-id="1" data-title="用户管理"><a href="javascript:">用户管理</a></li>
				<li class="layui-nav-item site-demo-active" data-id="2" data-title="管理员管理"><a href="javascript:">管理员管理</a></li>
				<li class="layui-nav-item site-demo-active" data-id="3" data-title="充电桩管理"><a href="javascript:">充电桩管理</a></li>
				<li class="layui-nav-item site-demo-active" data-id="4" data-title="订单管理"><a href="javascript:">订单管理</a></li>
				<li class="layui-nav-item site-demo-active" data-id="5" data-title="资金管理"><a href="javascript:">资金管理</a></li>
				<li class="layui-nav-item site-demo-active" data-id="6" data-title="故障管理"><a href="javascript:">故障管理</a></li>
				<!--
				<li class="layui-nav-item"><a href="javascript:;">系统配置</a>
					<dl class="layui-nav-child">
						<dd class="site-demo-active" data-id="15" data-title="运营公司管理">
							<a href="javascript:;">运营公司管理</a>
						</dd>
						<dd class="site-demo-active" data-id="16" data-title="营运人员管理">
							<a href="javascript:;">运营人员管理</a>
						</dd>
						<dd class="site-demo-active" data-id="17" data-title="角色权限管理">
							<a href="javascript:;">角色权限管理</a>
						</dd>
						<dd class="site-demo-active" data-id="18" data-title="电动车主管理">
							<a href="javascript:;">电动车主管理</a>
						</dd>
					</dl>
				</li>
				-->
			</ul>
		</div>
		<div class="tab">
			<div class="layui-tab layui-tab-card" lay-filter="demo"
				lay-allowclose="true" overflow>
				<ul class="layui-tab-title layui-tab-more"></ul>
				<div class="layui-tab-content tabContent"></div>
			</div>
		</div>
	</div>
</body>
<script src="../static/js/jquery.min.js"></script>
<script src="../static/layui/layui.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
	layui.use('element', function() {
		var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

		//监听导航点击
		element.on('nav(demo)', function(elem) {
			//console.log(elem)
			layer.msg(elem.text());

		});
	});
	layui.use("layer", function() {
		var layer = layui.layer;
	})
</script>
<script>
	layui.use('element', function() {
		var $ = layui.jquery, element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块

		//触发事件
		var active = {
			// 点击后添加tab
			tabAdd : function(id, name, url) {

				element.tabAdd('demo', {
					title : name,
					id : id,
					content : '<iframe data-frameid="' + id
							+ '" scrolling="no" frameborder="0" src="' + url
							+ '" style="width:100%; height:100%"></iframe>'
				})
			},
			// 让点击的tab有选中的样式
			tabChange : function(id) {

				element.tabChange('demo', id);
			},
			// 删除
			tabDelete : function(id) {
				element.tabDelete("demo", id);
			}
		};

		$('.site-demo-active').on(
				'click',
				function() {
					var that = $(this);
					var contenId = $(".tab > .layui-tab > div div");
					var address = ""
					switch (that.attr("data-id")) {
					case '1':
						address = "user.jsp"
						break;
					case '2':
						address = "admin.jsp"
						break;
					case '3':
						address = "charge.jsp"
						break;
					case '4':
						address = "order.jsp"
						break;
					case '5':
						address = "capital.jsp"
						break;
					case '6':
						address = "malfunction.jsp"
						break;
					case '7':
						address = ".html"
						break;
					case '8':
						address = ".html"
						break;
					case '9':
						address = ".html"
						break;
					case '10':
						address = ".html"
						break;
					case '11':
						address = ".html"
						break;
					case '12':
						address = ".html"
						break;
					case '13':
						address = ".html"
						break;
					case '14':
						address = ".html"
						break;
					case '15':
						address = ".html"
						break;
					case '16':
						address = ".html"
						break;
					case '17':
						address = ".html"
						break;
					case '18':
						address = ".html"
						break;
					case '19':
						address = ".html"
						break;
					}
					console.log(address)
					console.log(that.attr("data-id"))
					console.log(typeof (that.attr("data-id")))
					if ($(".tab > .layui-tab ul li[lay-id]").length <= 0) {
						active.tabAdd(that.attr("data-id"), that
								.attr("data-title"), address)
					} else {
						var flag = false;
						$(".tab > .layui-tab ul li[lay-id]").each(
								function() {
									if ($(this).attr("lay-id") == that
											.attr("data-id")) {
										flag = true
									}
								})
						if (flag == false) {
							active.tabAdd(that.attr("data-id"), that
									.attr("data-title"), address)
						}
					}
					active.tabChange(that.attr("data-id"))

				});

		//Hash地址的定位
		var layid = location.hash.replace(/^#test=/, '');
		element.tabChange('test', layid);

		element.on('tab(test)', function(elem) {
			location.hash = 'test=' + $(this).attr('lay-id');
		});
	});

	// content高度,iframe高度
	$(".content").css({
		"height" : innerHeight - 60 + "px"
	})
	console.log(typeof ($(".tab > .layui-tab-card").css("height")))
	$(".tabContent").css(
			{
				"height" : parseInt($(".tab > .layui-tab-card").css("height"))
						- 40 + "px"
			})
	console.log($(".tabContent").css("height"))
</script>
</html>