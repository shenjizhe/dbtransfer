### 助攻 ###
<A NAME="Assist">Assist</A>

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
jerseyNum           |Integer   |
times               |Integer   |
preRank             |Integer   |
rank                |Integer   |
years               |Integer   |
createTime          |Date      |
updateTime          |Date      |

### 1.获取所有助攻：（GET） ###
[https://localhost/assist](https://localhost/assist)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |助攻列表|Assist[]

### 2.获取助攻：（GET） ###
[https://localhost/assist/{id}](https://localhost/assist/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 助攻唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |助攻|Assist


