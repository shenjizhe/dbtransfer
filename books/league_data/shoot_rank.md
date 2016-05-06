### VIEW ###
<A NAME="ShootRank">ShootRank</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一标识
playerId            |Long      |球员ID
playerName          |String    |中文姓名
playerEnglishName   |String    |英文姓名
country             |String    |国籍
nativePlace         |String    |籍贯
birth               |Date      |出生年月
goals               |Integer   |进球数
preRanking          |Integer   |上一轮排名
ranking             |Integer   |名次，默认为0
year                |Integer   |开始年份
endYear             |Integer   |结束年份
clubId              |Long      |俱乐部ID   FK-> data_club.id
clubName            |String    |队名
clubEnglishName     |String    |英文名
clubFullName        |String    |中文全名
clubEnglishFullName |String    |英文全名
clubLogo            |String    |图片

### 1.获取所有VIEW：（GET） ###
[https://localhost/shoot-rank](https://localhost/shoot-rank)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW列表|ShootRank[]

### 2.获取VIEW：（GET） ###
[https://localhost/shoot-rank/{id}](https://localhost/shoot-rank/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| VIEW唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW|ShootRank

### 3.添加VIEW：（POST） ###
[https://localhost/shoot-rank](https://localhost/shoot-rank)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
shootRank| VIEW |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW|int

### 4.修改VIEW：（PUT） ###
[https://localhost/shoot-rank](https://localhost/shoot-rank)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
shootRank| VIEW |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW|int

### 5.删除VIEW：（DELETE） ###
[https://localhost/shoot-rank/{id}](https://localhost/shoot-rank/{id})

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


