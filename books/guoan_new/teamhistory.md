### 球队历史 ###
<A NAME="Teamhistory">Teamhistory</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
teamId              |Integer   |team表 Id
logo                |String    |
name                |String    |
englishName         |String    |俱乐部英文名称
homeCourt           |String    |主场
colorValue          |String    |色值
years               |Integer   |
createTime          |Date      |
updateTime          |Date      |

### 1.获取所有球队历史：（GET） ###
[https://localhost/teamhistory](https://localhost/teamhistory)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队历史列表|Teamhistory[]

### 2.获取球队历史：（GET） ###
[https://localhost/teamhistory/{id}](https://localhost/teamhistory/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球队历史唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队历史|Teamhistory


