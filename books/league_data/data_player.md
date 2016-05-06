### 球员 ###
<A NAME="DataPlayer">DataPlayer</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一标识
name                |String    |中文姓名
englishName         |String    |英文姓名
country             |String    |国籍
nativePlace         |String    |籍贯
birth               |Date      |出生年月
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有球员：（GET） ###
[https://localhost/data-player](https://localhost/data-player)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员列表|DataPlayer[]

### 2.获取球员：（GET） ###
[https://localhost/data-player/{id}](https://localhost/data-player/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员|DataPlayer

### 3.添加球员：（POST） ###
[https://localhost/data-player](https://localhost/data-player)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataPlayer| 球员 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员|int

### 4.修改球员：（PUT） ###
[https://localhost/data-player](https://localhost/data-player)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataPlayer| 球员 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员|int

### 5.删除球员：（DELETE） ###
[https://localhost/data-player/{id}](https://localhost/data-player/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员|int


