### 赛程 ###
<A NAME="DataLeagueMatch">DataLeagueMatch</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
kickAt              |Date      |比赛时间(年月日时分)
homeScore           |Integer   |主队比分(未开赛则为0)
guestScore          |Integer   |客队比分(未开赛则为0)
homeClubId          |Long      |主队ID   FK -> data_club.id
homeClubHistoryId   |Long      |主队历史ID
guestClubId         |Long      |客队ID   FK -> data_club.id
guestClubHistoryId  |Long      |客队历史ID
round               |Integer   |比赛轮次 (用于记录联赛的情况)
knockout            |String    |比赛分组(用于记录杯赛的情况,分 pre[预选],a-z[小组]
weekday             |String    |比赛星期(一~日)
stadium             |String    |比赛球馆
leagueId            |Long      |所属联赛  FK-> data_league.id
leagueSubId         |Long      |联赛子类型
audiences           |Integer   |观众人数(用于计算上座率)
relativeTag         |String    |(是否需要)相关关联标签(如转播计划,精彩视频等),参见新闻的关联标签设计
videoUrl            |String    |精彩视频转播URL
year                |String    |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
matchStatus         |Integer   |比赛是否结束 1:表示结束，2：表示进行中，3：表示未开始，4:比赛延期 默认皆为 3
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有赛程：（GET） ###
[https://localhost/data-league-match](https://localhost/data-league-match)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛程列表|DataLeagueMatch[]

### 2.获取赛程：（GET） ###
[https://localhost/data-league-match/{id}](https://localhost/data-league-match/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 赛程唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛程|DataLeagueMatch

### 3.添加赛程：（POST） ###
[https://localhost/data-league-match](https://localhost/data-league-match)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueMatch| 赛程 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛程|int

### 4.修改赛程：（PUT） ###
[https://localhost/data-league-match](https://localhost/data-league-match)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueMatch| 赛程 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛程|int

### 5.删除赛程：（DELETE） ###
[https://localhost/data-league-match/{id}](https://localhost/data-league-match/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 赛程唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛程|int


