### 教练类型 ###
<A NAME="CoachType">CoachType</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
name                |String    |

### 1.获取所有教练类型：（GET） ###
[https://localhost/coach-type](https://localhost/coach-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练类型列表|CoachType[]

### 2.获取教练类型：（GET） ###
[https://localhost/coach-type/{id}](https://localhost/coach-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练类型唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练类型|CoachType

### 3.添加教练类型：（POST） ###
[https://localhost/coach-type](https://localhost/coach-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
coachType| 教练类型 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练类型|int

### 4.修改教练类型：（PUT） ###
[https://localhost/coach-type](https://localhost/coach-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
coachType| 教练类型 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练类型|int

### 5.删除教练类型：（DELETE） ###
[https://localhost/coach-type/{id}](https://localhost/coach-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练类型唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练类型|int


