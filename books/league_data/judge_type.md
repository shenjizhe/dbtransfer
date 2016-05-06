### 裁判类型 ###
<A NAME="JudgeType">JudgeType</A>

名称|类型|描述
-|-|-
id                  |Integer   |唯一主键
name                |String    |裁判类型名称

### 1.获取所有裁判类型：（GET） ###
[https://localhost/judge-type](https://localhost/judge-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |裁判类型列表|JudgeType[]

### 2.获取裁判类型：（GET） ###
[https://localhost/judge-type/{id}](https://localhost/judge-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 裁判类型唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |裁判类型|JudgeType

### 3.添加裁判类型：（POST） ###
[https://localhost/judge-type](https://localhost/judge-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
judgeType| 裁判类型 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |裁判类型|int

### 4.修改裁判类型：（PUT） ###
[https://localhost/judge-type](https://localhost/judge-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
judgeType| 裁判类型 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |裁判类型|int

### 5.删除裁判类型：（DELETE） ###
[https://localhost/judge-type/{id}](https://localhost/judge-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 裁判类型唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |裁判类型|int


