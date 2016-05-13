### 射手 ###
<A NAME="Shooter">Shooter</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
leagueTypeId        |Integer   |
leagueTypeName      |String    |
teamId              |Integer   |
teamHistoryId       |Integer   |
teamLogo            |String    |
teamName            |String    |
playerId            |Integer   |
playerHistoryId     |Integer   |
playerHalfLogo      |String    |
playerLogo          |String    |
playerInfoLogo      |String    |
playerName          |String    |
jerseyNum           |Integer   |球衣号码
times               |Integer   |
preRank             |Integer   |上一轮排名
rank                |Integer   |本轮排名
years               |Integer   |
createTime          |Date      |
updateTime          |Date      |

### 1.获取所有射手：（GET） ###
[https://localhost/shooter](https://localhost/shooter)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |射手列表|Shooter[]

### 2.获取射手：（GET） ###
[https://localhost/shooter/{id}](https://localhost/shooter/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 射手唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |射手|Shooter


