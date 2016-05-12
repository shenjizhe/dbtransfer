### 赛事事件 ###
<A NAME="Leagueevent">Leagueevent</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
leagueCalendarId    |Integer   |赛事ID
leagueTeamTypeId    |Integer   |赛事球队类型（主客）
teamId              |Integer   |球队ID
leagueEventTypeId   |Integer   |时间类型ID
leagueEventTypeName |String    |事件类型名称
leagueEventTime     |Integer   |事件发生时间（分钟）
playerName          |String    |球员1姓名
playerName2         |String    |球员2姓名
years               |Integer   |年份
createTime          |Date      |
updateTime          |Date      |
sort                |Integer   |赛事事件排序字段（非必填字段，只有事件相同的情况下才以本字段排序，1.事件时间2.顺序3.事件ID）

### 1.获取所有赛事事件：（GET） ###
[https://localhost/leagueevent](https://localhost/leagueevent)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事事件列表|Leagueevent[]

### 2.获取赛事事件：（GET） ###
[https://localhost/leagueevent/{id}](https://localhost/leagueevent/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 赛事事件唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事事件|Leagueevent


