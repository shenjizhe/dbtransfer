### 联赛积分榜 ###
<A NAME="DataLeagueRankClub">DataLeagueRankClub</A>

名称|类型|描述
-|-|-
id                  |Long      |
leagueId            |Long      |联赛ID
leagueSubId         |Long      |联赛子ID
grouping            |String    |分组（小组赛）
clubId              |Long      |俱乐部ID
clubHistoryId       |Long      |俱乐部历史ID
round               |Integer   |场次
wins                |Integer   |胜场
ties                |Integer   |平场
loses               |Integer   |负场
goals               |Integer   |进球
goalsA              |Integer   |失球
goalsD              |Integer   |净胜球
points              |Integer   |积分
year                |Integer   |联赛年份 
endYear             |Integer   |联赛结束年份 
preRanking          |Integer   |上一轮排序
ranking             |Integer   |名次(显示名次)，默认为0（0的话以order字段显示）
rankingStatus       |Integer   |ranking_status 排名状态(1:下降,2:保持,3:上升;默认为:2)
displayOrder        |Integer   |用于积分榜的手动排序，数值越大越靠前。默认为1
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有联赛积分榜：（GET） ###
[https://localhost/data-league-rank-club](https://localhost/data-league-rank-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛积分榜列表|DataLeagueRankClub[]

### 2.获取联赛积分榜：（GET） ###
[https://localhost/data-league-rank-club/{id}](https://localhost/data-league-rank-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛积分榜唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛积分榜|DataLeagueRankClub

### 3.添加联赛积分榜：（POST） ###
[https://localhost/data-league-rank-club](https://localhost/data-league-rank-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueRankClub| 联赛积分榜 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛积分榜|int

### 4.修改联赛积分榜：（PUT） ###
[https://localhost/data-league-rank-club](https://localhost/data-league-rank-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueRankClub| 联赛积分榜 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛积分榜|int

### 5.删除联赛积分榜：（DELETE） ###
[https://localhost/data-league-rank-club/{id}](https://localhost/data-league-rank-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛积分榜唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛积分榜|int

