###  ###
<A NAME="UserRePlayer">UserRePlayer</A>

名称|类型|描述
-|-|-
userId              |String    |用户ID
playID              |Integer   |球员ID
type                |Integer   |关系类型（1.关注）
time                |Date      |关系建立时间

### 1.获取所有：（GET） ###
[https://localhost/user-re-player](https://localhost/user-re-player)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |列表|UserRePlayer[]

### 2.获取：（GET） ###
[https://localhost/user-re-player/{id}](https://localhost/user-re-player/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||UserRePlayer

### 3.添加：（POST） ###
[https://localhost/user-re-player](https://localhost/user-re-player)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
userRePlayer|  |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int

### 4.修改：（PUT） ###
[https://localhost/user-re-player](https://localhost/user-re-player)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
userRePlayer|  |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int

### 5.删除：（DELETE） ###
[https://localhost/user-re-player/{id}](https://localhost/user-re-player/{id})

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


