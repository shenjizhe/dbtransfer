### 教练 ###
<A NAME="Coachhistory">Coachhistory</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
teamId              |Integer   |
teamHistoryId       |Integer   |
teamLogo            |String    |
teamName            |String    |
coachId             |Integer   |
halfLogo            |String    |
infoLogo            |String    |mini半身像
logo                |String    |
coachName           |String    |
englishName         |String    |英文名
age                 |Integer   |年龄
coachTypeId         |Integer   |
coachTypeName       |String    |
years               |Integer   |
createTime          |Date      |
updateTime          |Date      |

### 1.获取所有教练：（GET） ###
[https://localhost/coachhistory](https://localhost/coachhistory)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练列表|Coachhistory[]

### 2.获取教练：（GET） ###
[https://localhost/coachhistory/{id}](https://localhost/coachhistory/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练|Coachhistory


