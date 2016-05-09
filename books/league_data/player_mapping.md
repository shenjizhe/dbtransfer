### 球员映射 ###
<A NAME="PlayerMapping">PlayerMapping</A>

名称|类型|描述
-|-|-
clubPlayerId        |Integer   |俱乐部球员ID
dataPlayerId        |Long      |中超用户ID

### 1.获取所有球员映射：（GET） ###
[https://localhost/player-mapping](https://localhost/player-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员映射列表|PlayerMapping[]

### 2.获取球员映射：（GET） ###
[https://localhost/player-mapping/{id}](https://localhost/player-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员映射唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员映射|PlayerMapping

### 3.添加球员映射：（POST） ###
[https://localhost/player-mapping](https://localhost/player-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
playerMapping| 球员映射 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员映射|int

### 4.修改球员映射：（PUT） ###
[https://localhost/player-mapping](https://localhost/player-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
playerMapping| 球员映射 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员映射|int

### 5.删除球员映射：（DELETE） ###
[https://localhost/player-mapping/{id}](https://localhost/player-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员映射唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员映射|int


