<%--
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
--%>
<!DOCTYPE html>
<%@ page language="java" import="java.net.URL,
java.io.InputStream,
java.io.InputStreamReader,
java.io.BufferedReader,
java.net.URLConnection" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>疫情地图</title>
<script type="text/javascript">
        <%!//用于缓存的全局变量
            long time=0;//记录时间戳，19700101
            String text;
        %>
        <%//加上获取疫情数据的代码
        if(System.currentTimeMillis()-time>600000){//大于10min
            time=System.currentTimeMillis();
            URL url=new URL("https://zaixianke.com/yq/all");
    		URLConnection conn=url.openConnection();
    		InputStream is=conn.getInputStream();
    		BufferedReader br=new BufferedReader(new InputStreamReader(is,"utf-8"));
    	    text=br.readLine();
		}
		%>
    		var data = <%=text%>;
</script>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/echarts/4.7.0/echarts.min.js"></script> 
<script src="http://cdn.zaixianke.com/china.js"></script>
<script src="http://cdn.zaixianke.com/world.js"></script>
</head>
<body>
<div id="main" style="width: 100%;height:600px;"></div> <br>
<div style="text-align:center">
		<a style="color:#333" class="control" align="center" href="javascript:updateMap(0)">国内累计</a>
		<a style="color:#333" class="control" align="center" href="javascript:updateMap(1)">国内新增</a>
		<a style="color:#333" class="control" align="center" href="javascript:updateMap(2)">全球累计</a>
		<a style="color:#333" class="control" align="center" href="javascript:updateMap(3)">全球新增</a>
</div>
<script src="control.js"></script>
</body>
</html>