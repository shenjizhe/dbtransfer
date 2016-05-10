### VIEW ###
<A NAME="CoachHistoryData">CoachHistoryData</A>

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

### 1.获取所有VIEW：（GET） ###
[https://localhost/coach-history-data](https://localhost/coach-history-data)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW列表|CoachHistoryData[]

### 2.获取VIEW：（GET） ###
[https://localhost/coach-history-data/{id}](https://localhost/coach-history-data/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| VIEW唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW|CoachHistoryData


