### 赛事 ###
<A NAME="Leaguecalendar">Leaguecalendar</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
leagueTypeId        |Integer   |leaguecalendartype表 Id
leagueTypeName      |String    |
leagueTypeId2       |Integer   |
leagueTypeName2     |String    |
roundsId            |Integer   |轮次
roundsName          |String    |
homeTeamId          |Integer   |前端用主队Id
homeTeamHistoryId   |Integer   |
homeTeamLogo        |String    |
homeTeamName        |String    |
guestTeamId         |Integer   |前端用客队Id
guestTeamHistoryId  |Integer   |
guestTeamLogo       |String    |
guestTeamName       |String    |
leagueTime          |Date      |
leagueCourt         |String    |比赛场地
masterScore         |Integer   |
guestScore          |Integer   |
leagueStateId       |Integer   |
leagueStateName     |String    |
lineupLogo          |String    |首发阵容图
existLineup         |Boolean   |是否存在阵容数据
existLeagueData     |Boolean   |是否存在赛事数据
existLeagueEvent    |Boolean   |是否存在赛事事件
existLeagueVideo    |Boolean   |是否存在赛事视频
years               |Integer   |
createTime          |Date      |
updateTime          |Date      |

### 1.获取所有赛事：（GET） ###
[https://localhost/leaguecalendar](https://localhost/leaguecalendar)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事列表|Leaguecalendar[]

### 2.获取赛事：（GET） ###
[https://localhost/leaguecalendar/{id}](https://localhost/leaguecalendar/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 赛事唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事|Leaguecalendar


