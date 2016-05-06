### 球员历史 ###
<A NAME="DataPlayerReClub">DataPlayerReClub</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
clubId              |Long      |俱乐部ID FK->data_club.id
clubHistoryId       |Long      |俱乐部历史ID(新增)
playerId            |Long      |球员ID FK->data_player.id
leagueType          |Integer   |1:踢正赛(比如中超)，2:踢正赛,非正赛(比如中超预备队) 3:踢非正赛
playerNumber        |Integer   |球衣号码
playerNumberIcon    |String    |球衣号码图片URL
position            |String    |队内位置，文字描述(门将/后卫/中场/前锋)
positionNumber      |Integer   |（中超要修改）位置权重，排序用,数字大在前面 1:门将 2:后卫 3 中场  4:前锋;默认为0
avatar              |String    | 球员头像URL(半身像方框)
weight              |Integer   |球员体重(如: 65 kg)
height              |Integer   |球员身高(如: 185 cm)
year                |Integer   |开始年份(改为了int)
endYear             |Integer   |结束年份(新增)
isLastServed        |Boolean   |是否是最后效力的俱乐部(用于查询俱乐部当前所有球员的列表 ,"0"表示否,"1"表示是)
onfield             |Integer   |球员在本赛季代表俱乐部的出场次数
onfieldLast         |Integer   |球员在本赛季代表俱乐部的出场时间
goals               |Integer   |本赛季的进球数(默认为0)
shootTimes          |Integer   |射门次数
assistTimes         |Integer   |助攻次数
yellowTimes         |Integer   |黄牌次数
redTimes            |Integer   |红牌次数
serialNumber        |String    |参赛编号
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有球员历史：（GET） ###
[https://localhost/data-player-re-club](https://localhost/data-player-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员历史列表|DataPlayerReClub[]

### 2.获取球员历史：（GET） ###
[https://localhost/data-player-re-club/{id}](https://localhost/data-player-re-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员历史唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员历史|DataPlayerReClub

### 3.添加球员历史：（POST） ###
[https://localhost/data-player-re-club](https://localhost/data-player-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataPlayerReClub| 球员历史 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员历史|int

### 4.修改球员历史：（PUT） ###
[https://localhost/data-player-re-club](https://localhost/data-player-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataPlayerReClub| 球员历史 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员历史|int

### 5.删除球员历史：（DELETE） ###
[https://localhost/data-player-re-club/{id}](https://localhost/data-player-re-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员历史唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员历史|int


