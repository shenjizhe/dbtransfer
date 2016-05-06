### 俱乐部球员信息 ###
<A NAME="ClubPlayerReClub">ClubPlayerReClub</A>

名称|类型|描述
-|-|-
id                  |Long      |球员俱乐部关系ID
cirAvatar           |String    |半身像圆角图
fullAvatar          |String    |全身像
infoAvatar          |String    |带文字描述的头像

### 1.获取所有俱乐部球员信息：（GET） ###
[https://localhost/club-player-re-club](https://localhost/club-player-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部球员信息列表|ClubPlayerReClub[]

### 2.获取俱乐部球员信息：（GET） ###
[https://localhost/club-player-re-club/{id}](https://localhost/club-player-re-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部球员信息唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部球员信息|ClubPlayerReClub

### 3.添加俱乐部球员信息：（POST） ###
[https://localhost/club-player-re-club](https://localhost/club-player-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
clubPlayerReClub| 俱乐部球员信息 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部球员信息|int

### 4.修改俱乐部球员信息：（PUT） ###
[https://localhost/club-player-re-club](https://localhost/club-player-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
clubPlayerReClub| 俱乐部球员信息 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部球员信息|int

### 5.删除俱乐部球员信息：（DELETE） ###
[https://localhost/club-player-re-club/{id}](https://localhost/club-player-re-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部球员信息唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部球员信息|int


