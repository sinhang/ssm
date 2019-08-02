# ssm

#### 介绍
一个Java的ssm学习项目

#### 软件架构
当前软件使用的spring+springboot+mybatis开发的


#### 安装教程
0. clone下来后第一步是使用IDEA打开此项目，第二部进入终端[View -> To Windows -> Terminal] 然后输入：mvn clean install
1. 第一步先启动register服务
2. 第二步启动config服务
3. 第三步启动gateway服务
4. 后面可以启动web，api

#### 使用说明

1. 在使用的过程中需要把数据库及redis配置修改一下，你可以只修改数据库配置然后注释redis配置来运行当前项目
2. 启动web服务之后你可以使用http://localhost:8085 来进行访问项目或者使用http://localhost:8085/rest 来进行restful接口访问
3. 启动api服务后你可以使用http://localhost:8090/goods 进行访问
4. 如果你启动了gateway那么你可以使用http://localhost:9001/ooo/goods 访问api服务下面的goods接口
5. 如果你启动了config服务那么你可以进入http://localhost:8889/ssm-api/dev 来访问配置信息其中的ssm-api可以时ssm-web或者ssm-gateway,其中的dev可以是test
6. 启动register服务之后你可以使用http://localhost:8762/ 访问spring eureka，在里面你可以看到已经发现的服务
7. 如果你对里面的配置参数不是很了解那么建议你从以下地址进行了解：https://www.jozhi.com.cn/59 https://www.jozhi.com.cn/60 
https://www.jozhi.com.cn/61 https://www.jozhi.com.cn/64 https://www.jozhi.com.cn/65
7. 如果你的web访问为404那么请进入：https://www.jozhi.com.cn/66 查看如何处理