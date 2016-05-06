### 赛事状态 ###
<A NAME="StateType">StateType</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
name                |String    |

### 1.获取所有赛事状态：（GET） ###
[https://localhost/state-type](https://localhost/state-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事状态列表|StateType[]

### 2.获取赛事状态：（GET） ###
[https://localhost/state-type/{id}](https://localhost/state-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 赛事状态唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事状态|StateType

### 3.添加赛事状态：（POST） ###
[https://localhost/state-type](https://localhost/state-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
stateType| 赛事状态 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事状态|int

### 4.修改赛事状态：（PUT） ###
[https://localhost/state-type](https://localhost/state-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
stateType| 赛事状态 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事状态|int

### 5.删除赛事状态：（DELETE） ###
[https://localhost/state-type/{id}](https://localhost/state-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 赛事状态唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事状态|int


