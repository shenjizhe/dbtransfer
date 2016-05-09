### 球员历史 ###
<A NAME="Playerhistory">Playerhistory</A>

名称|类型|描述
-|-|-
id                  |Integer   |球员历史ID
teamId              |Integer   |队伍ID
teamHistoryId       |Integer   |队伍历史ID
teamLogo            |String    |球队logo
teamName            |String    |球队名称
playerId            |Integer   |球员标识
halfLogo            |String    |球员半身像
logo                |String    |头像
infoLogo            |String    |mini半身像
name                |String    |姓名
englishName         |String    |英文名
age                 |Integer   |年龄
height              |Integer   |身高
weight              |Integer   |体重
jerseyNum           |Integer   |球衣号码
positionId          |Integer   |位置ID
positionName        |String    |位置名称
enterTimes          |Integer   |出场次数
enterTime           |Integer   |出场时间
shootTimes          |Integer   |射门次数
assistTimes         |Integer   |助攻次数
yellowTimes         |Integer   |黄牌次数
redTimes            |Integer   |红牌次数
years               |Integer   |年份
createTime          |Date      |创建时间
updateTime          |Date      |更新时间

### 1.获取所有球员历史：（GET） ###
[https://localhost/playerhistory](https://localhost/playerhistory)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员历史列表|Playerhistory[]

### 2.获取球员历史：（GET） ###
[https://localhost/playerhistory/{id}](https://localhost/playerhistory/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员历史唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员历史|Playerhistory


