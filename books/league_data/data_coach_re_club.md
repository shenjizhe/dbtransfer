### 教练与俱乐部关联关系 ###
<A NAME="DataCoachReClub">DataCoachReClub</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
coachId             |Long      |教练ID FK -> data_coach.id
clubId              |Long      |俱乐部ID FK-> data_club.id
type                |Integer   |教练类型（参考coachtype表）
typeName            |String    |教练类型名称
clubHistoryId       |Long      |球队历史ID
avatar              |String    |教练头像URL(方框半身像)
isLastServed        |String    |是否是最后效力的俱乐部("0"表示否,"1"表示是)
year                |Integer   |教练效力俱乐部的开始年份(数据类型为int)
endYear             |Integer   |结束年份(新增)
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有教练与俱乐部关联关系：（GET） ###
[https://localhost/data-coach-re-club](https://localhost/data-coach-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练与俱乐部关联关系列表|DataCoachReClub[]

### 2.获取教练与俱乐部关联关系：（GET） ###
[https://localhost/data-coach-re-club/{id}](https://localhost/data-coach-re-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练与俱乐部关联关系唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练与俱乐部关联关系|DataCoachReClub

### 3.添加教练与俱乐部关联关系：（POST） ###
[https://localhost/data-coach-re-club](https://localhost/data-coach-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataCoachReClub| 教练与俱乐部关联关系 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练与俱乐部关联关系|int

### 4.修改教练与俱乐部关联关系：（PUT） ###
[https://localhost/data-coach-re-club](https://localhost/data-coach-re-club)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataCoachReClub| 教练与俱乐部关联关系 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练与俱乐部关联关系|int

### 5.删除教练与俱乐部关联关系：（DELETE） ###
[https://localhost/data-coach-re-club/{id}](https://localhost/data-coach-re-club/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练与俱乐部关联关系唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练与俱乐部关联关系|int


