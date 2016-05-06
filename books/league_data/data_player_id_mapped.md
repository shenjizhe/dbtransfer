### 比赛球员Id  与 amisco 数据中的比赛球员id 对应表 ###
<A NAME="DataPlayerIdMapped">DataPlayerIdMapped</A>

名称|类型|描述
-|-|-
id                  |Long      |
playerId            |Long      |
amiscoPlayerId      |Long      |
clubId              |Long      |俱乐部Id
year                |String    |

### 1.获取所有比赛球员Id  与 amisco 数据中的比赛球员id 对应表：（GET） ###
[https://localhost/data-player-id-mapped](https://localhost/data-player-id-mapped)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛球员Id  与 amisco 数据中的比赛球员id 对应表列表|DataPlayerIdMapped[]

### 2.获取比赛球员Id  与 amisco 数据中的比赛球员id 对应表：（GET） ###
[https://localhost/data-player-id-mapped/{id}](https://localhost/data-player-id-mapped/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 比赛球员Id  与 amisco 数据中的比赛球员id 对应表唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛球员Id  与 amisco 数据中的比赛球员id 对应表|DataPlayerIdMapped

### 3.添加比赛球员Id  与 amisco 数据中的比赛球员id 对应表：（POST） ###
[https://localhost/data-player-id-mapped](https://localhost/data-player-id-mapped)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataPlayerIdMapped| 比赛球员Id  与 amisco 数据中的比赛球员id 对应表 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛球员Id  与 amisco 数据中的比赛球员id 对应表|int

### 4.修改比赛球员Id  与 amisco 数据中的比赛球员id 对应表：（PUT） ###
[https://localhost/data-player-id-mapped](https://localhost/data-player-id-mapped)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataPlayerIdMapped| 比赛球员Id  与 amisco 数据中的比赛球员id 对应表 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛球员Id  与 amisco 数据中的比赛球员id 对应表|int

### 5.删除比赛球员Id  与 amisco 数据中的比赛球员id 对应表：（DELETE） ###
[https://localhost/data-player-id-mapped/{id}](https://localhost/data-player-id-mapped/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 比赛球员Id  与 amisco 数据中的比赛球员id 对应表唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛球员Id  与 amisco 数据中的比赛球员id 对应表|int


