### 赛事视频 ###
<A NAME="MatchVideo">MatchVideo</A>

名称|类型|描述
-|-|-
id                  |Long      |视频ID
clubId              |Long      |俱乐部ID
matchId             |Long      |比赛ID
logo                |String    |视频主图
title               |String    |视频标题
url                 |String    |视频链接
publicTime          |Date      |发布时间
playTimes           |Integer   |播放次数
createAt            |Date      |
updateAt            |Date      |

### 1.获取所有赛事视频：（GET） ###
[https://localhost/match-video](https://localhost/match-video)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事视频列表|MatchVideo[]

### 2.获取赛事视频：（GET） ###
[https://localhost/match-video/{id}](https://localhost/match-video/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 赛事视频唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事视频|MatchVideo

### 3.添加赛事视频：（POST） ###
[https://localhost/match-video](https://localhost/match-video)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
matchVideo| 赛事视频 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事视频|int

### 4.修改赛事视频：（PUT） ###
[https://localhost/match-video](https://localhost/match-video)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
matchVideo| 赛事视频 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事视频|int

### 5.删除赛事视频：（DELETE） ###
[https://localhost/match-video/{id}](https://localhost/match-video/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 赛事视频唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事视频|int


