### 俱乐部历史ID映射表 ###
<A NAME="ClubHistoryMapping">ClubHistoryMapping</A>

名称|类型|描述
-|-|-
teamHistoryId       |Integer   |俱乐部历史ID
clubHistoryId       |Long      |中超俱乐部历史ID

### 1.获取所有俱乐部历史ID映射表：（GET） ###
[https://localhost/club-history-mapping](https://localhost/club-history-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部历史ID映射表列表|ClubHistoryMapping[]

### 2.获取俱乐部历史ID映射表：（GET） ###
[https://localhost/club-history-mapping/{id}](https://localhost/club-history-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部历史ID映射表唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部历史ID映射表|ClubHistoryMapping

### 3.添加俱乐部历史ID映射表：（POST） ###
[https://localhost/club-history-mapping](https://localhost/club-history-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
clubHistoryMapping| 俱乐部历史ID映射表 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部历史ID映射表|int

### 4.修改俱乐部历史ID映射表：（PUT） ###
[https://localhost/club-history-mapping](https://localhost/club-history-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
clubHistoryMapping| 俱乐部历史ID映射表 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部历史ID映射表|int

### 5.删除俱乐部历史ID映射表：（DELETE） ###
[https://localhost/club-history-mapping/{id}](https://localhost/club-history-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部历史ID映射表唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部历史ID映射表|int


