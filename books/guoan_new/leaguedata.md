### 赛事数据 ###
<A NAME="Leaguedata">Leaguedata</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
leagueCalendarId    |Integer   |leaguecalendar表 Id （赛事Id）
leagueTeamTypeId    |Integer   |leagueteamtype表 Id （主客）
teamId              |Integer   |team表 Id
colorValue          |String    |色值
shootTimes          |Integer   |射门次数
shootInTimes        |Integer   |射正次数
shootOutTimes       |Integer   |射偏次数
hitTimes            |Integer   |击中门框次数
penaltyTimes        |Integer   |点球次数
passTimes           |Integer   |传球次数
straightTimes       |Integer   |直塞球次数
offsideTimes        |Integer   |越位次数
stealTimes          |Integer   |抢断次数
freeKickTimes       |Integer   |任意球次数
cornerTimes         |Integer   |角球次数
throwInTimes        |Integer   |界外球次数
passRate            |Float     |传球成功率
passCenterRate      |Float     |传中成功率
stealRate           |Float     |抢断成功率
controllRate        |Float     |控球率
foulTimes           |Integer   |犯规次数
yellowTimes         |Integer   |黄牌次数
redTimes            |Integer   |红牌次数
hurtTimes           |Integer   |受伤次数
years               |Integer   |年份
createTime          |Date      |
updateTime          |Date      |

### 1.获取所有赛事数据：（GET） ###
[https://localhost/leaguedata](https://localhost/leaguedata)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事数据列表|Leaguedata[]

### 2.获取赛事数据：（GET） ###
[https://localhost/leaguedata/{id}](https://localhost/leaguedata/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 赛事数据唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事数据|Leaguedata


