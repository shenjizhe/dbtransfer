### 比赛统计注：数据保存格式: 主场球队/客场球队 如 2/3 ###
<A NAME="DataMatchStat">DataMatchStat</A>

名称|类型|描述
-|-|-
id                  |Long      |
matchId             |Long      |赛事ID
clubId              |Long      |球队ID FK -> data_club.id
clubType            |Integer   |球队类型(1:主队,2:客队)
toShoot             |Integer   |射门次数
inTarget            |Integer   |射正球门
missGoals           |Integer   |射门偏出
hitWoodwork         |Integer   |击中门框
spotKick            |Integer   |点球次数
passTimes           |Integer   |传球次数
throughPass         |Integer   |直塞球
offside             |Integer   |越位
steal               |Integer   |抢断
freeKick            |Integer   |任意球
corner              |Integer   |角球
outOfBounds         |Integer   |界外球
passCompl           |Float     |传球成功率
passMiddle          |Float     |传中成功率
stealRate           |Float     |抢断成功率
possession          |Float     |控球率
fouls               |Integer   |犯规
redCards            |Integer   |红牌
yellowCards         |Integer   |黄牌
injury              |Integer   |受伤
year                |Integer   |年份
createdAt           |Date      |
updatedAt           |Date      |
pauses              |Integer   |停顿次数
realMatchAt         |String    |净比赛时间
runningDis          |Integer   |跑动距离
doubleYCards        |Integer   |双黄牌数

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


