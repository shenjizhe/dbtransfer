### 俱乐部联赛关系 ###
<A NAME="DataLeagueReClub">DataLeagueReClub</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
clubId              |Long      |俱乐部ID   FK-> data_club.id
leagueId            |Long      |联赛ID     FK-> data_league.id
leagueName          |String    |联赛名称（冗余）
year                |String    |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
honors              |String    |荣誉(球队第几名)
displayOrder        |Integer   |球队排序
createdAt           |Date      |创建时间
updatedAt           |Date      |最后修改时间

### 1.获取所有俱乐部联赛关系：（GET） ###
[https://localhost/data-league-re-club](https://localhost/data-league-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部联赛关系列表|DataLeagueReClub[]

### 2.获取俱乐部联赛关系：（GET） ###
[https://localhost/data-league-re-club/{id}](https://localhost/data-league-re-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部联赛关系唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部联赛关系|DataLeagueReClub

### 3.添加俱乐部联赛关系：（POST） ###
[https://localhost/data-league-re-club](https://localhost/data-league-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueReClub| 俱乐部联赛关系 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部联赛关系|int

### 4.修改俱乐部联赛关系：（PUT） ###
[https://localhost/data-league-re-club](https://localhost/data-league-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueReClub| 俱乐部联赛关系 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部联赛关系|int

### 5.删除俱乐部联赛关系：（DELETE） ###
[https://localhost/data-league-re-club/{id}](https://localhost/data-league-re-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部联赛关系唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部联赛关系|int


