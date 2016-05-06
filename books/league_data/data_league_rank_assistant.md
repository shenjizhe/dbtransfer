### 联赛助攻榜 ###
<A NAME="DataLeagueRankAssistant">DataLeagueRankAssistant</A>

名称|类型|描述
-|-|-
id                  |Long      |
leagueId            |Long      |联赛ID
playerId            |Long      |球员ID
clubId              |Long      |所属俱乐部ID
clubHistoryId       |Long      |俱乐部历史ID
assistants          |Integer   |助攻数
homeAssistants      |Integer   |主场助攻数
guestAssistants     |Integer   |客场助攻数
preRanking          |Integer   |上轮排名
ranking             |Integer   |排名
year                |Integer   |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
endYear             |Integer   |结束年份
createdAt           |Date      |
updatedAt           |Date      |名次，默认为0

### 1.获取所有联赛助攻榜：（GET） ###
[https://localhost/data-league-rank-assistant](https://localhost/data-league-rank-assistant)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛助攻榜列表|DataLeagueRankAssistant[]

### 2.获取联赛助攻榜：（GET） ###
[https://localhost/data-league-rank-assistant/{id}](https://localhost/data-league-rank-assistant/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛助攻榜唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛助攻榜|DataLeagueRankAssistant

### 3.添加联赛助攻榜：（POST） ###
[https://localhost/data-league-rank-assistant](https://localhost/data-league-rank-assistant)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueRankAssistant| 联赛助攻榜 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛助攻榜|int

### 4.修改联赛助攻榜：（PUT） ###
[https://localhost/data-league-rank-assistant](https://localhost/data-league-rank-assistant)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueRankAssistant| 联赛助攻榜 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛助攻榜|int

### 5.删除联赛助攻榜：（DELETE） ###
[https://localhost/data-league-rank-assistant/{id}](https://localhost/data-league-rank-assistant/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛助攻榜唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛助攻榜|int


