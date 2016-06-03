### 错误日志 ###
<A NAME="Errlog">Errlog</A>

名称|类型|描述
-|-|-
title               |String    |错误标题
key                 |String    |字典主键
table               |String    |出错表格
time                |Date      |出错时间
data                |String    |出错记录

### 1.获取所有错误日志：（GET） ###
[https://localhost/errlog](https://localhost/errlog)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |错误日志列表|Errlog[]

### 2.获取错误日志：（GET） ###
[https://localhost/errlog/{id}](https://localhost/errlog/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 错误日志唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |错误日志|Errlog

### 3.添加错误日志：（POST） ###
[https://localhost/errlog](https://localhost/errlog)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
errlog| 错误日志 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |错误日志|int

### 4.修改错误日志：（PUT） ###
[https://localhost/errlog](https://localhost/errlog)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
errlog| 错误日志 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |错误日志|int

### 5.删除错误日志：（DELETE） ###
[https://localhost/errlog/{id}](https://localhost/errlog/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 错误日志唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |错误日志|int


