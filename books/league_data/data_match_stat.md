### 比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3 ###
<A NAME="DataMatchStat">DataMatchStat</A>

名称|类型|描述
-|-|-
id                  |Long      |
matchId             |Long      |赛事ID
clubId              |Long      |球队ID FK -> data_club.id
clubType            |String    |球队类型(1:主队,2:客队)
toShoot             |String    |射门次数
inTarget            |String    |射正球门
missGoals           |String    |射门偏出
hitWoodwork         |String    |击中门框
spotKick            |String    |点球次数
passTimes           |String    |传球次数
throughPass         |String    |直塞球
offside             |String    |越位
steal               |String    |抢断
freeKick            |String    |任意球
corner              |String    |角球
outOfBounds         |String    |界外球
passCompl           |String    |传球成功率
passMiddle          |String    |传中成功率
stealRate           |String    |抢断成功率
possession          |String    |控球率
fouls               |String    |犯规
redCards            |String    |红牌
yellowCards         |String    |黄牌
injury              |String    |受伤
year                |String    |年份
createdAt           |Timestamp |
updatedAt           |Timestamp |
pauses              |String    |停顿次数
realMatchAt         |String    |净比赛时间
runningDis          |String    |跑动距离
doubleYCards        |String    |双黄牌数

### 1.获取所有比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3：（GET） ###
[https://localhost/data-match-stat](https://localhost/data-match-stat)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3列表|DataMatchStat[]

### 2.获取比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3：（GET） ###
[https://localhost/data-match-stat/{id}](https://localhost/data-match-stat/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3|DataMatchStat

### 3.添加比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3：（POST） ###
[https://localhost/data-match-stat](https://localhost/data-match-stat)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataMatchStat| 比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3|int

### 4.修改比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3：（PUT） ###
[https://localhost/data-match-stat](https://localhost/data-match-stat)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataMatchStat| 比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3|int

### 5.删除比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3：（DELETE） ###
[https://localhost/data-match-stat/{id}](https://localhost/data-match-stat/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3|int


