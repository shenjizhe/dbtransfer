### 赛事事件 ###
<A NAME="DataMatchEvent">DataMatchEvent</A>

名称|类型|描述
-|-|-
id                  |Long      |
matchId             |Long      |赛事ID
clubType            |Integer   |产生此事件的球队(1:主场球队,2:客场球队)
clubId              |Long      |球队ID FK -> data_club.id
eventType           |Integer   | 事件类型(0:比赛开始,1:进球,2:助攻,3:红牌,4:黄牌,5:换人,6:比赛结束)
eventData           |String    |赛事事件文本
eventPoint          |Integer   |事件发生时间点(如: 比赛中的第 45min )
eventAt             |Timestamp |事件发生时间
playerId            |Long      |球员ID
playerSecondaryId   |Long      |次要球员ID
playerName          |String    |球员名称
playerSecondaryName |String    |次要球员名称
createdAt           |Date      |数据记录创建时间
updatedAt           |Date      |数据记录更新时间

### 1.获取所有赛事事件：（GET） ###
[https://localhost/data-match-event](https://localhost/data-match-event)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事事件列表|DataMatchEvent[]

### 2.获取赛事事件：（GET） ###
[https://localhost/data-match-event/{id}](https://localhost/data-match-event/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 赛事事件唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事事件|DataMatchEvent

### 3.添加赛事事件：（POST） ###
[https://localhost/data-match-event](https://localhost/data-match-event)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataMatchEvent| 赛事事件 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事事件|int

### 4.修改赛事事件：（PUT） ###
[https://localhost/data-match-event](https://localhost/data-match-event)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataMatchEvent| 赛事事件 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事事件|int

### 5.删除赛事事件：（DELETE） ###
[https://localhost/data-match-event/{id}](https://localhost/data-match-event/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 赛事事件唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |赛事事件|int


