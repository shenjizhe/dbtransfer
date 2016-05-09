### 教练映射 ###
<A NAME="CoachMapping">CoachMapping</A>

名称|类型|描述
-|-|-
clubCoachId         |Integer   |教练ID
dataCoachId         |Long      |

### 1.获取所有教练映射：（GET） ###
[https://localhost/coach-mapping](https://localhost/coach-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练映射列表|CoachMapping[]

### 2.获取教练映射：（GET） ###
[https://localhost/coach-mapping/{id}](https://localhost/coach-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练映射唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练映射|CoachMapping

### 3.添加教练映射：（POST） ###
[https://localhost/coach-mapping](https://localhost/coach-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
coachMapping| 教练映射 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练映射|int

### 4.修改教练映射：（PUT） ###
[https://localhost/coach-mapping](https://localhost/coach-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
coachMapping| 教练映射 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练映射|int

### 5.删除教练映射：（DELETE） ###
[https://localhost/coach-mapping/{id}](https://localhost/coach-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练映射唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练映射|int


