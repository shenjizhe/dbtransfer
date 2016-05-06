###  ###
<A NAME="DataLeagueRankPeace">DataLeagueRankPeace</A>

名称|类型|描述
-|-|-
id                  |Long      |
leagueId            |Long      |联赛ID
clubId              |Long      |俱乐部ID
clubHistoryId       |Long      |俱乐部历史ID
points              |Integer   |积分
dockOfCards         |Integer   |红黄牌扣分
dockOfFouls         |Integer   |纪律处罚扣分
dockOfSum           |Integer   |扣分合计
redCards            |Integer   |红牌数
year                |Integer   |联赛年份
endYear             |Integer   |结束年份
fouls               |Integer   |停赛次数
yellowCards         |Integer   |黄牌数
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有：（GET） ###
[https://localhost/data-league-rank-peace](https://localhost/data-league-rank-peace)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |列表|DataLeagueRankPeace[]

### 2.获取：（GET） ###
[https://localhost/data-league-rank-peace/{id}](https://localhost/data-league-rank-peace/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||DataLeagueRankPeace

### 3.添加：（POST） ###
[https://localhost/data-league-rank-peace](https://localhost/data-league-rank-peace)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueRankPeace|  |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int

### 4.修改：（PUT） ###
[https://localhost/data-league-rank-peace](https://localhost/data-league-rank-peace)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueRankPeace|  |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int

### 5.删除：（DELETE） ###
[https://localhost/data-league-rank-peace/{id}](https://localhost/data-league-rank-peace/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int


