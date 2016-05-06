###  ###
<A NAME="DataLeagueUpdown">DataLeagueUpdown</A>

名称|类型|描述
-|-|-
id                  |Long      |
leagueId            |Long      |联赛ID
clubId              |Long      |俱乐部ID
updownType          |String    |升降级类型(1:升级 2:降级)
year                |String    |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有：（GET） ###
[https://localhost/data-league-updown](https://localhost/data-league-updown)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |列表|DataLeagueUpdown[]

### 2.获取：（GET） ###
[https://localhost/data-league-updown/{id}](https://localhost/data-league-updown/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||DataLeagueUpdown

### 3.添加：（POST） ###
[https://localhost/data-league-updown](https://localhost/data-league-updown)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueUpdown|  |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int

### 4.修改：（PUT） ###
[https://localhost/data-league-updown](https://localhost/data-league-updown)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataLeagueUpdown|  |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int

### 5.删除：（DELETE） ###
[https://localhost/data-league-updown/{id}](https://localhost/data-league-updown/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int


