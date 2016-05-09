### 教练 ###
<A NAME="Coach">Coach</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
name                |String    |姓名
birthday            |Date      |生日
nationality         |String    |国籍
birthplace          |String    |出生地
createTime          |Date      |创建时间
updateTime          |Date      |更新时间

### 1.获取所有教练：（GET） ###
[https://localhost/coach](https://localhost/coach)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练列表|Coach[]

### 2.获取教练：（GET） ###
[https://localhost/coach/{id}](https://localhost/coach/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练|Coach


