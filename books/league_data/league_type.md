### 联赛类型 ###
<A NAME="LeagueType">LeagueType</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一标识
pid                 |Long      |父联赛ID
name                |String    |联赛中文简称(中超，亚冠，预备队...),常用,比如:中超联赛
fullName            |String    |联赛的全文名称,作为某些情况下的备份,比如:中国足球超级联赛
enName              |String    |英文简称,常用,比如:CSL
enFullName          |String    |英文全称,备份,比如:Chinese Super League
type                |String    |联赛类型 1:联赛(积分制) 2:杯赛(淘汰制)
region              |String    |举办地区 (中国,亚洲...)
regionType          |String    |联赛范围 1:国家级,2:洲级,3:世界级
startAt             |Date      |开始举办年份
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有联赛类型：（GET） ###
[https://localhost/league-type](https://localhost/league-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛类型列表|LeagueType[]

### 2.获取联赛类型：（GET） ###
[https://localhost/league-type/{id}](https://localhost/league-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛类型唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛类型|LeagueType

### 3.添加联赛类型：（POST） ###
[https://localhost/league-type](https://localhost/league-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
leagueType| 联赛类型 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛类型|int

### 4.修改联赛类型：（PUT） ###
[https://localhost/league-type](https://localhost/league-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
leagueType| 联赛类型 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛类型|int

### 5.删除联赛类型：（DELETE） ###
[https://localhost/league-type/{id}](https://localhost/league-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛类型唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛类型|int


