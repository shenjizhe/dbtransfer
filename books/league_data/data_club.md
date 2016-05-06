### 俱乐部 ###
<A NAME="DataClub">DataClub</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
bgImage             |String    |俱乐部背景图
bgPlayerImage       |String    |球员背景图
dataColor           |String    |俱乐部数据的颜色(主题色)
name                |String    |中文名称,常用,比如:广州恒大
introUrl            |String    |俱乐部介绍资料(一个网页URL)
foundedAt           |Date      |创立时间
createdAt           |Date      |创建时间
updatedAt           |Date      |更新时间

### 1.获取所有俱乐部：（GET） ###
[https://localhost/data-club](https://localhost/data-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部列表|DataClub[]

### 2.获取俱乐部：（GET） ###
[https://localhost/data-club/{id}](https://localhost/data-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部|DataClub

### 3.添加俱乐部：（POST） ###
[https://localhost/data-club](https://localhost/data-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataClub| 俱乐部 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部|int

### 4.修改俱乐部：（PUT） ###
[https://localhost/data-club](https://localhost/data-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataClub| 俱乐部 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部|int

### 5.删除俱乐部：（DELETE） ###
[https://localhost/data-club/{id}](https://localhost/data-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部|int


