### 比赛阵容 ###
<A NAME="DataMatchLine">DataMatchLine</A>

名称|类型|描述
-|-|-
id                  |Long      |比赛阵容唯一主键
matchId             |Long      |赛事ID   FK -> data_match.id
homeClubId          |Long      |主队ID   FK -> data_club.id
guestClubId         |Long      |客队ID   FK -> data_club.id
lineUrl             |String    |比赛球队阵容图URL
homeLineUrl         |String    |主队阵容图(半场)
guestLineUrl        |String    |客队阵容图(半场)
homeLine            |String    |主队阵型
guestLine           |String    | 客队阵型
year                |Integer   |比赛年份
createdAt           |Timestamp |
updatedAt           |Timestamp |

### 1.获取所有比赛阵容：（GET） ###
[https://localhost/data-match-line](https://localhost/data-match-line)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛阵容列表|DataMatchLine[]

### 2.获取比赛阵容：（GET） ###
[https://localhost/data-match-line/{id}](https://localhost/data-match-line/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 比赛阵容唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛阵容|DataMatchLine

### 3.添加比赛阵容：（POST） ###
[https://localhost/data-match-line](https://localhost/data-match-line)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataMatchLine| 比赛阵容 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛阵容|int

### 4.修改比赛阵容：（PUT） ###
[https://localhost/data-match-line](https://localhost/data-match-line)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataMatchLine| 比赛阵容 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛阵容|int

### 5.删除比赛阵容：（DELETE） ###
[https://localhost/data-match-line/{id}](https://localhost/data-match-line/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 比赛阵容唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |比赛阵容|int


