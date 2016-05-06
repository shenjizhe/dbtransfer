### 联赛红黄牌榜 ###
<A NAME="DataLeagueRankCard">DataLeagueRankCard</A>

名称|类型|描述
-|-|-
id                  |Long      |
leagueId            |Long      |联赛ID
clubId              |Long      |俱乐部ID
clubHistoryId       |Long      |俱乐部历史ID
redCards            |Integer   |红牌数
yellowCards         |Integer   |黄牌数
doubleYCards        |Integer   |双黄牌数
ranking             |Integer   |名次，默认为0
year                |Integer   |开始年份
endYear             |Integer   |结束年份
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有联赛红黄牌榜：（GET） ###
[https://localhost/data-league-rank-card](https://localhost/data-league-rank-card)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛红黄牌榜列表|DataLeagueRankCard[]

### 2.获取联赛红黄牌榜：（GET） ###
[https://localhost/data-league-rank-card/{id}](https://localhost/data-league-rank-card/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛红黄牌榜唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛红黄牌榜|DataLeagueRankCard

### 3.添加联赛红黄牌榜：（POST） ###
[https://localhost/data-league-rank-card](https://localhost/data-league-rank-card)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueRankCard| 联赛红黄牌榜 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛红黄牌榜|int

### 4.修改联赛红黄牌榜：（PUT） ###
[https://localhost/data-league-rank-card](https://localhost/data-league-rank-card)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueRankCard| 联赛红黄牌榜 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛红黄牌榜|int

### 5.删除联赛红黄牌榜：（DELETE） ###
[https://localhost/data-league-rank-card/{id}](https://localhost/data-league-rank-card/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛红黄牌榜唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛红黄牌榜|int


