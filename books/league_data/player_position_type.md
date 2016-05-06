### 球员类型 ###
<A NAME="PlayerPositionType">PlayerPositionType</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
name                |String    |

### 1.获取所有球员类型：（GET） ###
[https://localhost/player-position-type](https://localhost/player-position-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员类型列表|PlayerPositionType[]

### 2.获取球员类型：（GET） ###
[https://localhost/player-position-type/{id}](https://localhost/player-position-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员类型唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员类型|PlayerPositionType

### 3.添加球员类型：（POST） ###
[https://localhost/player-position-type](https://localhost/player-position-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
playerPositionType| 球员类型 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员类型|int

### 4.修改球员类型：（PUT） ###
[https://localhost/player-position-type](https://localhost/player-position-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
playerPositionType| 球员类型 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员类型|int

### 5.删除球员类型：（DELETE） ###
[https://localhost/player-position-type/{id}](https://localhost/player-position-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员类型唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员类型|int


