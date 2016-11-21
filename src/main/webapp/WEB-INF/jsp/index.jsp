<!DOCTYPE HTML>
<%@ include file="/WEB-INF/jsp/include/namespace.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>宁宝宝</title>
		<link href="${ctx}/css/bootstrap.css" rel='stylesheet' type='text/css' />
		<script src="${ctx}/js/jquery.min.js"></script>
		<link href="${ctx}/css/style.css" rel='stylesheet' type='text/css' />
		<link rel="shortcut icon" href="${ctx}/images/fav-icon.png" />

		<script type="text/javascript" src="${ctx}/js/move-top.js"></script>
		<script type="text/javascript" src="${ctx}/js/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>

		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<script>
			$(function() {
				var pull 		= $('#pull');
					menu 		= $('nav ul');
					menuHeight	= menu.height();
				$(pull).on('click', function(e) {
					e.preventDefault();
					menu.slideToggle();
				});
				$(window).resize(function(){
	        		var w = $(window).width();
	        		if(w > 320 && menu.is(':hidden')) {
	        			menu.removeAttr('style');
	        		}
	    		});
			});
		</script>

	</head>

	<body>

		<!----- start-header---->
			<div id="home" class="header">
					<div class="top-header">
						<div class="container">
						<div class="logo">
							<a href="/index"><img src="${ctx}/images/4n.jpg" title="love"  width="50px" height="50px"/></a>
						</div>
						<!----start-top-nav---->
						 <nav class="top-nav">
							<ul class="top-nav">
								<li class="active"><a href="/index">主页</a></li>
								<li><a href="/#">宝宝</a></li>
								<li><a href="/#">哥哥</a></li>
								<li><a href="/#">We</a></li>
								<li><a href="/#">Love</a></li>
								<div class="clearfix"> </div>
							</ul>
							<a href="#" id="pull"><img src="${ctx}/images/nav-icon.png" title="menu" /></a>
						</nav>
						<div class="clearfix"> </div>
					</div>
				</div>
			</div>
		<!----- //End-header---->

		<!---banner---->
		<div class="banner text-center">
			<h1><span>宁宝宝</span><br /><label>生日快乐</label></h1>
		</div>
		<!---//banner---->
		<div class="clearfix"> </div>
		<!---welcome-note--->
			<div class="welcome-note text-center">
				<div class="container">
					<h2>一切都是最好的安排</h2>
					<p>我喜欢画眉喜欢一方芦苇。喜欢真诚。喜欢无理头。不要虚情假意。不要冷眼待人。</p>
					<ul class="note-btns unstyled-list list-inline">
						<li><a href="#">宝宝</a></li>
						<li>VS</li>
						<li><a href="#">哥哥</a></li>
						<div class="clearfix"> </div>
					</ul>
				</div>
			</div>
		<!--//welcome-note--->
		<!---row1---->
		<div class="row1">
			<div class="container">
				<div class="col-md-6 row1-col1">
					<div class="col-md-3 col-icon">
						<span class="jet"> </span>
					</div>
					<div class="col-md-9 col-info">
						<h3>宝宝</h3>
						<span>兜兜转转。</span>
						<p>一生一次青春</p>
						<a class="m-btn" href="#">More</a>
					</div>
					<div class="border-r"> </div>
				</div>
				<div class="col-md-6 row1-col2">
					<div class="col-md-3 col-icon">
						<span class="spe"> </span>
					</div>
					<div class="col-md-9 col-info">
						<h3>哥哥</h3>
						<span>千千万万。</span>
						<p>从头到尾有你</p>
						<a class="m-btn" href="#">More </a>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<!---row1---->
		<!---row2---->
		<div class="row2">
			<div class="container">
				<div class="row2-cols">
					<div class="col-md-4 row2-col-divice">
						<img src="${ctx}/images/2n.jpg" title="name" />
					</div>
					<div class="col-md-8 row2-col-info">
						<h3>我希望有个如你一般的人</h3>
						<span>一切问题的答案都很简单</span>
						<p>&nbsp;&nbsp;&nbsp;&nbsp;我希望有个如你一般的人。如这山间清晨一般明亮清爽的人，如奔赴古城道路上阳光一般的人，温暖而不炙热，覆盖我所有肌肤。由起点到夜晚，由山野到书房，一切问题的答案都很简单。我希望有个如你一般的人，贯彻未来，数遍生命的公路牌。
						</p>
						<a class="r2-btn" href="#">More</a>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<!---row2---->
		<!---row3---->
		<div class="row3">
			<div class="container">
				<div class="row3-head text-center">
					<h4>能感受的到,并且能写下来</h4>
					<span>是一种幸运</span>
					<p>我爱他时,他亦爱我,我鼓起勇气走了一步,他便领悟,用接下来的九十九步予以回应. 从此,世间只有他,有我. 我俩会步入婚姻的殿堂, 会剩下一个,两个,三个,娃娃....</p>
				</div>
				<!----sreen-gallery-cursual---->
						<div class="sreen-gallery-cursual">
							 <!-- requried-jsfiles-for owl -->
							<link href="${ctx}/css/owl.carousel.css" rel="stylesheet">
							    <script src="${ctx}/js/owl.carousel.js"></script>
							        <script>
							    $(document).ready(function() {
							      $("#owl-demo").owlCarousel({
							        items : 1,
							        lazyLoad : true,
							        autoPlay : true,
							        navigation : true,
							        navigationText :  false,
							        pagination : false,
							      });
							    });
							    </script>
							 <!-- //requried-jsfiles-for owl -->
							 <!-- start content_slider -->
						       <div id="owl-demo" class="owl-carousel">
							       <div class="item">
								       <img class="lazyOwl" data-src="${ctx}/images/7n.png" alt="screen-name">
							       </div>
					                <div class="item">
					                	<img class="lazyOwl" data-src="${ctx}/images/1n.jpg" alt="screen-name">
					                </div>
					                <div class="item">
					                	<img class="lazyOwl" data-src="${ctx}/images/2n.jpg" alt="screen-name">
					                </div>
							       <div class="item">
								       <img class="lazyOwl" data-src="${ctx}/images/4n.jpg" alt="screen-name">
							       </div>
							       <div class="item">
								       <img class="lazyOwl" data-src="${ctx}/images/5n.png" alt="screen-name">
							       </div>
							       <div class="item">
								       <img class="lazyOwl" data-src="${ctx}/images/6n.png" alt="screen-name">
							       </div>
							       <div class="item">
								       <img class="lazyOwl" data-src="${ctx}/images/7n.png" alt="screen-name">
							       </div>
							       <div class="item">
								       <img class="lazyOwl" data-src="${ctx}/images/8n.png" alt="screen-name">
							       </div>
							       <div class="item">
								       <img class="lazyOwl" data-src="${ctx}/images/3n.jpg" alt="screen-name">
							       </div>
				              </div>
						<!--//sreen-gallery-cursual---->
			</div>
		</div>
		</div>
		<!---row3---->
		<!---copy-right--->
		<div class="copy-right text-center">
			<p align="center">Copyright &copy; 2016-10-23(农历).Owner name 王晓宁 All rights reserved.<a target="_blank" href=""></p>
								<script type="text/javascript">
									$(document).ready(function() {
										/*
										var defaults = {
								  			containerID: 'toTop', // fading element id
											containerHoverID: 'toTopHover', // fading element hover id
											scrollSpeed: 1200,
											easingType: 'linear' 
								 		};
										*/
										
										$().UItoTop({ easingType: 'easeOutQuart' });
										
									});
								</script>
			<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
		</div>
		<!---//copy-right--->
	<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>

