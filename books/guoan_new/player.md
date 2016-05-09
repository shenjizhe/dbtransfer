### 球员 ###
<A NAME="Player">Player</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
name                |String    |
birthday            |Date      |
nationality         |String    |国籍
birthplace          |String    |出生地
createTime          |Date      |
updateTime          |Date      |

### 1.获取所有球员：（GET） ###
[https://localhost/player](https://localhost/player)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员列表|Player[]

### 2.获取球员：（GET） ###
[https://localhost/player/{id}](https://localhost/player/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员|Player


