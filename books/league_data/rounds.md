### 轮次 ###
<A NAME="Rounds">Rounds</A>

名称|类型|描述
-|-|-
id                  |Integer   |轮次ID
roundsId            |Integer   |轮次号
name                |String    |轮次名称
leagueTypeId        |Integer   |联赛子类型

### 1.获取所有轮次：（GET） ###
[https://localhost/rounds](https://localhost/rounds)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |轮次列表|Rounds[]

### 2.获取轮次：（GET） ###
[https://localhost/rounds/{id}](https://localhost/rounds/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 轮次唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |轮次|Rounds

### 3.添加轮次：（POST） ###
[https://localhost/rounds](https://localhost/rounds)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
rounds| 轮次 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |轮次|int

### 4.修改轮次：（PUT） ###
[https://localhost/rounds](https://localhost/rounds)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
rounds| 轮次 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |轮次|int

### 5.删除轮次：（DELETE） ###
[https://localhost/rounds/{id}](https://localhost/rounds/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 轮次唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |轮次|int


