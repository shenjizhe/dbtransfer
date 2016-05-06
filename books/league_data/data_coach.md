### 教练 ###
<A NAME="DataCoach">DataCoach</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
name                |String    |中文姓名
englishName         |String    |英文姓名
country             |String    |国籍
nativePlace         |String    |籍贯（出生地）
birth               |Date      |出生年月日
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有教练：（GET） ###
[https://localhost/data-coach](https://localhost/data-coach)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练列表|DataCoach[]

### 2.获取教练：（GET） ###
[https://localhost/data-coach/{id}](https://localhost/data-coach/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练|DataCoach

### 3.添加教练：（POST） ###
[https://localhost/data-coach](https://localhost/data-coach)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataCoach| 教练 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练|int

### 4.修改教练：（PUT） ###
[https://localhost/data-coach](https://localhost/data-coach)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataCoach| 教练 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练|int

### 5.删除教练：（DELETE） ###
[https://localhost/data-coach/{id}](https://localhost/data-coach/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练|int


