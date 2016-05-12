### 球赛映射 ###
<A NAME="MatchMapping">MatchMapping</A>

名称|类型|描述
-|-|-
clubMatchId         |Integer   |俱乐部球赛ID
dataMatchId         |Long      |中超球赛ID

### 1.获取所有球赛映射：（GET） ###
[https://localhost/match-mapping](https://localhost/match-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球赛映射列表|MatchMapping[]

### 2.获取球赛映射：（GET） ###
[https://localhost/match-mapping/{id}](https://localhost/match-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球赛映射唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球赛映射|MatchMapping

### 3.添加球赛映射：（POST） ###
[https://localhost/match-mapping](https://localhost/match-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
matchMapping| 球赛映射 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球赛映射|int

### 4.修改球赛映射：（PUT） ###
[https://localhost/match-mapping](https://localhost/match-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
matchMapping| 球赛映射 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球赛映射|int

### 5.删除球赛映射：（DELETE） ###
[https://localhost/match-mapping/{id}](https://localhost/match-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球赛映射唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球赛映射|int


