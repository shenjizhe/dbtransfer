### 球队主客关系 ###
<A NAME="ClubType">ClubType</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
name                |String    |名称

### 1.获取所有球队主客关系：（GET） ###
[https://localhost/club-type](https://localhost/club-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队主客关系列表|ClubType[]

### 2.获取球队主客关系：（GET） ###
[https://localhost/club-type/{id}](https://localhost/club-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球队主客关系唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队主客关系|ClubType

### 3.添加球队主客关系：（POST） ###
[https://localhost/club-type](https://localhost/club-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
clubType| 球队主客关系 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队主客关系|int

### 4.修改球队主客关系：（PUT） ###
[https://localhost/club-type](https://localhost/club-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
clubType| 球队主客关系 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队主客关系|int

### 5.删除球队主客关系：（DELETE） ###
[https://localhost/club-type/{id}](https://localhost/club-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球队主客关系唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队主客关系|int


