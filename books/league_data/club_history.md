### 俱乐部历史 ###
<A NAME="ClubHistory">ClubHistory</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
clubId              |Long      |俱乐部ID   FK-> data_club.id
year                |String    |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
logo                |String    |图片
name                |String    |队名
enName              |String    |英文名
fullName            |String    |中文全名
enFullName          |String    |英文全名
createdAt           |Date      |创建时间
updatedAt           |Date      |最后修改时间
court               |String    |主场场地
color               |String    |俱乐部主体颜色

### 1.获取所有俱乐部历史：（GET） ###
[https://localhost/club-history](https://localhost/club-history)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部历史列表|ClubHistory[]

### 2.获取俱乐部历史：（GET） ###
[https://localhost/club-history/{id}](https://localhost/club-history/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部历史唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部历史|ClubHistory

### 3.添加俱乐部历史：（POST） ###
[https://localhost/club-history](https://localhost/club-history)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
clubHistory| 俱乐部历史 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部历史|int

### 4.修改俱乐部历史：（PUT） ###
[https://localhost/club-history](https://localhost/club-history)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
clubHistory| 俱乐部历史 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部历史|int

### 5.删除俱乐部历史：（DELETE） ###
[https://localhost/club-history/{id}](https://localhost/club-history/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部历史唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部历史|int


