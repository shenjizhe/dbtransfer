### 球员历史映射 ###
<A NAME="PlayerHistoryMapping">PlayerHistoryMapping</A>

名称|类型|描述
-|-|-
playerHistoryId     |Integer   |球员历史ID
playerReClubId      |Long      |球员俱乐部关系ID

### 1.获取所有球员历史映射：（GET） ###
[https://localhost/player-history-mapping](https://localhost/player-history-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员历史映射列表|PlayerHistoryMapping[]

### 2.获取球员历史映射：（GET） ###
[https://localhost/player-history-mapping/{id}](https://localhost/player-history-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员历史映射唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员历史映射|PlayerHistoryMapping

### 3.添加球员历史映射：（POST） ###
[https://localhost/player-history-mapping](https://localhost/player-history-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
playerHistoryMapping| 球员历史映射 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员历史映射|int

### 4.修改球员历史映射：（PUT） ###
[https://localhost/player-history-mapping](https://localhost/player-history-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
playerHistoryMapping| 球员历史映射 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员历史映射|int

### 5.删除球员历史映射：（DELETE） ###
[https://localhost/player-history-mapping/{id}](https://localhost/player-history-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球员历史映射唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球员历史映射|int


