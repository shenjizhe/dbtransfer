### 俱乐部教练信息 ###
<A NAME="ClubCoachReClub">ClubCoachReClub</A>

名称|类型|描述
-|-|-
id                  |Long      |教练关系ID
cirAvatar           |String    |半身像圆角图
infoAvatar          |String    |带文字描述的头像
fullAvatar          |String    |全身像

### 1.获取所有俱乐部教练信息：（GET） ###
[https://localhost/club-coach-re-club](https://localhost/club-coach-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部教练信息列表|ClubCoachReClub[]

### 2.获取俱乐部教练信息：（GET） ###
[https://localhost/club-coach-re-club/{id}](https://localhost/club-coach-re-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部教练信息唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部教练信息|ClubCoachReClub

### 3.添加俱乐部教练信息：（POST） ###
[https://localhost/club-coach-re-club](https://localhost/club-coach-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
clubCoachReClub| 俱乐部教练信息 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部教练信息|int

### 4.修改俱乐部教练信息：（PUT） ###
[https://localhost/club-coach-re-club](https://localhost/club-coach-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
clubCoachReClub| 俱乐部教练信息 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部教练信息|int

### 5.删除俱乐部教练信息：（DELETE） ###
[https://localhost/club-coach-re-club/{id}](https://localhost/club-coach-re-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部教练信息唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部教练信息|int


