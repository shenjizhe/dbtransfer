### 事件类型 ###
<A NAME="EventType">EventType</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
name                |String    |赛事事件名称
icon                |String    |图标

### 1.获取所有事件类型：（GET） ###
[https://localhost/event-type](https://localhost/event-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |事件类型列表|EventType[]

### 2.获取事件类型：（GET） ###
[https://localhost/event-type/{id}](https://localhost/event-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 事件类型唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |事件类型|EventType

### 3.添加事件类型：（POST） ###
[https://localhost/event-type](https://localhost/event-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
eventType| 事件类型 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |事件类型|int

### 4.修改事件类型：（PUT） ###
[https://localhost/event-type](https://localhost/event-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
eventType| 事件类型 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |事件类型|int

### 5.删除事件类型：（DELETE） ###
[https://localhost/event-type/{id}](https://localhost/event-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 事件类型唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |事件类型|int


