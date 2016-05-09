### 教练履历 ###
<A NAME="Coachresume">Coachresume</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
seasonType          |Integer   |跨年/不跨年
startYear           |Integer   |开始年度
endYear             |Integer   |结束年度
coachId             |Integer   |教练ID
coachName           |String    |教练姓名
leagueName          |String    |联赛名称
teamName            |String    |球队名称
honors              |String    |荣誉
createTime          |Date      |
updateTime          |Date      |

### 1.获取所有教练履历：（GET） ###
[https://localhost/coachresume](https://localhost/coachresume)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练履历列表|Coachresume[]

### 2.获取教练履历：（GET） ###
[https://localhost/coachresume/{id}](https://localhost/coachresume/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 教练履历唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |教练履历|Coachresume


