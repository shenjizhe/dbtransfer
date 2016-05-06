### 比赛球员 ###
<A NAME="DataMatchPlayer">DataMatchPlayer</A>

名称|类型|描述
-|-|-
id                  |Long      |
matchId             |Long      |赛事阵容  FK -> data_match.id
clubId              |Long      |俱乐部ID  FK -> data_club.id
playerId            |Long      |球员ID  FK -> data_player.id
clubType            |Integer   |球队类型(1:主队,2:客队)
playerName          |String    |球员姓名
playerNumber        |Integer   |球衣号码
position            |String    |队内位置，文字描述(门将/后卫/中场/前锋)
positionNumber      |Integer   |位置权重，1:门将 2:后卫 3:中场 4:前锋;默认为0
playerType          |Integer   |球员类型(1:首发球员,2:替补球员;3伤停默认为1)
year                |Integer   |比赛开始年份
coordinates         |String    |用于确定球员在阵容图的位置
createdAt           |Timestamp |
updatedAt           |Timestamp |

### 1.获取所有比赛球员：（GET） ###
[https://localhost/data-match-player](https://localhost/data-match-player)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛球员列表|DataMatchPlayer[]

### 2.获取比赛球员：（GET） ###
[https://localhost/data-match-player/{id}](https://localhost/data-match-player/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 比赛球员唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛球员|DataMatchPlayer

### 3.添加比赛球员：（POST） ###
[https://localhost/data-match-player](https://localhost/data-match-player)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataMatchPlayer| 比赛球员 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛球员|int

### 4.修改比赛球员：（PUT） ###
[https://localhost/data-match-player](https://localhost/data-match-player)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataMatchPlayer| 比赛球员 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛球员|int

### 5.删除比赛球员：（DELETE） ###
[https://localhost/data-match-player/{id}](https://localhost/data-match-player/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 比赛球员唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛球员|int


