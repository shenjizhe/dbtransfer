###  ###
<A NAME="MatchPosition">MatchPosition</A>

名称|类型|描述
-|-|-
name                |String    |位置名称
x                   |Integer   |x坐标
y                   |Integer   |y坐标
clubTypeId          |Integer   |主客关系ID

### 1.获取所有：（GET） ###
[https://localhost/match-position](https://localhost/match-position)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |列表|MatchPosition[]

### 2.获取：（GET） ###
[https://localhost/match-position/{id}](https://localhost/match-position/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||MatchPosition

### 3.添加：（POST） ###
[https://localhost/match-position](https://localhost/match-position)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
matchPosition|  |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int

### 4.修改：（PUT） ###
[https://localhost/match-position](https://localhost/match-position)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
matchPosition|  |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int

### 5.删除：（DELETE） ###
[https://localhost/match-position/{id}](https://localhost/match-position/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int


