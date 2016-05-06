### 转换日志 ###
<A NAME="Translog">Translog</A>

名称|类型|描述
-|-|-
id                  |Integer   |唯一主键
time                |Date      |操作时间
operator            |String    |操作
tables              |String    |表明
sourceCount         |Integer   |源表数量
destinationCount    |Integer   |目标数量
sameCount           |Integer   |相同数量
sourceDiff          |Integer   |源表不同数量
destinationDiff     |Integer   |目的表不同数量
check               |Boolean   |数量检查

### 1.获取所有转换日志：（GET） ###
[https://localhost/translog](https://localhost/translog)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |转换日志列表|Translog[]

### 2.获取转换日志：（GET） ###
[https://localhost/translog/{id}](https://localhost/translog/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 转换日志唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |转换日志|Translog

### 3.添加转换日志：（POST） ###
[https://localhost/translog](https://localhost/translog)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
translog| 转换日志 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |转换日志|int

### 4.修改转换日志：（PUT） ###
[https://localhost/translog](https://localhost/translog)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
translog| 转换日志 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |转换日志|int

### 5.删除转换日志：（DELETE） ###
[https://localhost/translog/{id}](https://localhost/translog/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 转换日志唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |转换日志|int


