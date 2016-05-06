### 历史数据-中超历年最佳 ###
<A NAME="DataLeagueOutstanding">DataLeagueOutstanding</A>

名称|类型|描述
-|-|-
id                  |Long      |
contentUrl          |String    |// H5页面URL (包含以下信息的页面)
leagueId            |Long      |联赛id
playerId            |Long      |最佳球员  FK -> data_league_player.id
judgeId             |Long      |最佳裁判  FK -> data_league_judge.id 
fishId              |Long      |最佳新人  FK -> data_league_player.id
coachId             |Long      |最佳教练 (FK -> data_league_coach.id)
lineUp              |String    |最佳阵容(一张阵容图的URL)
leagueName          |String    |联赛名称
playerName          |String    |最佳球员姓名
judgeName           |String    |裁判姓名
judgeRegion         |String    |裁判地区(直辖市/省级的粒度)
judgeBirth          |Date      |裁判出生年月
fishName            |String    |新人姓名
coachName           |String    |教练姓名
year                |String    |
playerReClubName    |String    |最佳球员所属俱乐部名称
playerReClubLogo    |String    |最佳球员所属俱乐部logo
playerNumber        |Integer   |最佳球员号码
fishReClubName      |String    |新人所属俱乐部名称
fishReClubLogo      |String    |新人所属俱乐部logo
fishNumber          |Integer   |新人球员号码
coachReClubName     |String    |教练所属俱乐部名称
coachReClubLogo     |String    |教练所属俱乐部logo
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有历史数据-中超历年最佳：（GET） ###
[https://localhost/data-league-outstanding](https://localhost/data-league-outstanding)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |历史数据-中超历年最佳列表|DataLeagueOutstanding[]

### 2.获取历史数据-中超历年最佳：（GET） ###
[https://localhost/data-league-outstanding/{id}](https://localhost/data-league-outstanding/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 历史数据-中超历年最佳唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |历史数据-中超历年最佳|DataLeagueOutstanding

### 3.添加历史数据-中超历年最佳：（POST） ###
[https://localhost/data-league-outstanding](https://localhost/data-league-outstanding)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueOutstanding| 历史数据-中超历年最佳 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |历史数据-中超历年最佳|int

### 4.修改历史数据-中超历年最佳：（PUT） ###
[https://localhost/data-league-outstanding](https://localhost/data-league-outstanding)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueOutstanding| 历史数据-中超历年最佳 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |历史数据-中超历年最佳|int

### 5.删除历史数据-中超历年最佳：（DELETE） ###
[https://localhost/data-league-outstanding/{id}](https://localhost/data-league-outstanding/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 历史数据-中超历年最佳唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |历史数据-中超历年最佳|int


