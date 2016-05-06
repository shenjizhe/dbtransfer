### VIEW ###
<A NAME="AssistRank">AssistRank</A>

名称|类型|描述
-|-|-
id                  |Long      |
assistants          |Integer   |助攻数
playerId            |Long      |球员ID
preRanking          |Integer   |上轮排名
ranking             |Integer   |排名
year                |Integer   |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
endYear             |Integer   |结束年份
clubId              |Long      |所属俱乐部ID
clubLogo            |String    |图片
clubName            |String    |队名
clubEnglishName     |String    |英文名
clubFullName        |String    |中文全名
clubEnglishFullName |String    |英文全名
playerName          |String    |中文姓名
playerEnglishName   |String    |英文姓名
country             |String    |国籍
nativePlace         |String    |籍贯
birth               |Date      |出生年月

### 1.获取所有VIEW：（GET） ###
[https://localhost/assist-rank](https://localhost/assist-rank)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW列表|AssistRank[]

### 2.获取VIEW：（GET） ###
[https://localhost/assist-rank/{id}](https://localhost/assist-rank/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| VIEW唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW|AssistRank

### 3.添加VIEW：（POST） ###
[https://localhost/assist-rank](https://localhost/assist-rank)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
assistRank| VIEW |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW|int

### 4.修改VIEW：（PUT） ###
[https://localhost/assist-rank](https://localhost/assist-rank)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
assistRank| VIEW |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW|int

### 5.删除VIEW：（DELETE） ###
[https://localhost/assist-rank/{id}](https://localhost/assist-rank/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| VIEW唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW|int


