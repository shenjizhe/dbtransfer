### 教练履历 ###
<A NAME="CoachHistory">CoachHistory</A>

名称|类型|描述
-|-|-
id                  |Long      |履历主键
year                |Integer   |联赛开始年份
endYear             |Integer   |结束年份
coachId             |Long      |教练主键
coachName           |String    |教练姓名
leagueName          |String    |联赛名称
clubName            |String    |俱乐部名称
honors              |Integer   |荣誉
createAt            |Date      |
updateAt            |Date      |

### 1.获取所有教练履历：（GET） ###
[https://localhost/coach-history](https://localhost/coach-history)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练履历列表|CoachHistory[]

### 2.获取教练履历：（GET） ###
[https://localhost/coach-history/{id}](https://localhost/coach-history/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练履历唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练履历|CoachHistory

### 3.添加教练履历：（POST） ###
[https://localhost/coach-history](https://localhost/coach-history)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
coachHistory| 教练履历 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练履历|int

### 4.修改教练履历：（PUT） ###
[https://localhost/coach-history](https://localhost/coach-history)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
coachHistory| 教练履历 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练履历|int

### 5.删除教练履历：（DELETE） ###
[https://localhost/coach-history/{id}](https://localhost/coach-history/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练履历唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练履历|int


