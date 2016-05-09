### 教练历史映射 ###
<A NAME="CoachHistoryMapping">CoachHistoryMapping</A>

名称|类型|描述
-|-|-
coachHistoryId      |Integer   |教练历史ID
coachReClubId       |Long      |

### 1.获取所有教练历史映射：（GET） ###
[https://localhost/coach-history-mapping](https://localhost/coach-history-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练历史映射列表|CoachHistoryMapping[]

### 2.获取教练历史映射：（GET） ###
[https://localhost/coach-history-mapping/{id}](https://localhost/coach-history-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练历史映射唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练历史映射|CoachHistoryMapping

### 3.添加教练历史映射：（POST） ###
[https://localhost/coach-history-mapping](https://localhost/coach-history-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
coachHistoryMapping| 教练历史映射 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练历史映射|int

### 4.修改教练历史映射：（PUT） ###
[https://localhost/coach-history-mapping](https://localhost/coach-history-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
coachHistoryMapping| 教练历史映射 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练历史映射|int

### 5.删除教练历史映射：（DELETE） ###
[https://localhost/coach-history-mapping/{id}](https://localhost/coach-history-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练历史映射唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练历史映射|int


