### 联赛射手榜 ###
<A NAME="DataLeagueRankGoal">DataLeagueRankGoal</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一标识
leagueId            |Long      |联赛ID
clubId              |Long      |所属俱乐部ID
clubHistoryId       |Long      |俱乐部历史ID
playerId            |Long      |球员ID
goals               |Integer   |进球数
preRanking          |Integer   |上一轮排名
ranking             |Integer   |名次，默认为0
year                |Integer   |开始年份
endYear             |Integer   |结束年份
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有联赛射手榜：（GET） ###
[https://localhost/data-league-rank-goal](https://localhost/data-league-rank-goal)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛射手榜列表|DataLeagueRankGoal[]

### 2.获取联赛射手榜：（GET） ###
[https://localhost/data-league-rank-goal/{id}](https://localhost/data-league-rank-goal/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛射手榜唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛射手榜|DataLeagueRankGoal

### 3.添加联赛射手榜：（POST） ###
[https://localhost/data-league-rank-goal](https://localhost/data-league-rank-goal)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueRankGoal| 联赛射手榜 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛射手榜|int

### 4.修改联赛射手榜：（PUT） ###
[https://localhost/data-league-rank-goal](https://localhost/data-league-rank-goal)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueRankGoal| 联赛射手榜 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛射手榜|int

### 5.删除联赛射手榜：（DELETE） ###
[https://localhost/data-league-rank-goal/{id}](https://localhost/data-league-rank-goal/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛射手榜唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛射手榜|int


