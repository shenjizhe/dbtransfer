### 联赛转播 ###
<A NAME="DataLeagueMatchBroadcast">DataLeagueMatchBroadcast</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
matchId             |Long      |该转播计划关联的比赛ID FK-> data_league_match.id
castName            |String    |转播方
castUrl             |String    |转播链接
castLogo            |String    |视频标识
playTimes           |Integer   |播放次数
displayOrder        |Integer   |排序权重，默认为1，高的在前
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有联赛转播：（GET） ###
[https://localhost/data-league-match-broadcast](https://localhost/data-league-match-broadcast)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛转播列表|DataLeagueMatchBroadcast[]

### 2.获取联赛转播：（GET） ###
[https://localhost/data-league-match-broadcast/{id}](https://localhost/data-league-match-broadcast/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛转播唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛转播|DataLeagueMatchBroadcast

### 3.添加联赛转播：（POST） ###
[https://localhost/data-league-match-broadcast](https://localhost/data-league-match-broadcast)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueMatchBroadcast| 联赛转播 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛转播|int

### 4.修改联赛转播：（PUT） ###
[https://localhost/data-league-match-broadcast](https://localhost/data-league-match-broadcast)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueMatchBroadcast| 联赛转播 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛转播|int

### 5.删除联赛转播：（DELETE） ###
[https://localhost/data-league-match-broadcast/{id}](https://localhost/data-league-match-broadcast/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛转播唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛转播|int


