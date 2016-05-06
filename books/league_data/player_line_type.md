### 球员阵容类型 ###
<A NAME="PlayerLineType">PlayerLineType</A>

名称|类型|描述
-|-|-
id                  |Integer   |唯一主键
name                |String    |队员阵容类型

### 1.获取所有球员阵容类型：（GET） ###
[https://localhost/player-line-type](https://localhost/player-line-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员阵容类型列表|PlayerLineType[]

### 2.获取球员阵容类型：（GET） ###
[https://localhost/player-line-type/{id}](https://localhost/player-line-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员阵容类型唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员阵容类型|PlayerLineType

### 3.添加球员阵容类型：（POST） ###
[https://localhost/player-line-type](https://localhost/player-line-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
playerLineType| 球员阵容类型 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员阵容类型|int

### 4.修改球员阵容类型：（PUT） ###
[https://localhost/player-line-type](https://localhost/player-line-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
playerLineType| 球员阵容类型 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员阵容类型|int

### 5.删除球员阵容类型：（DELETE） ###
[https://localhost/player-line-type/{id}](https://localhost/player-line-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员阵容类型唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员阵容类型|int


