###  ###
<A NAME="DataJudgeReMatch">DataJudgeReMatch</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
judgeId             |Long      |裁判ID
matchId             |Long      |比赛ID
judgeTypeId         |Integer   |裁判类型
avatar              |String    |裁判头像URL(方框半身像)
cirAvatar           |String    |半身像圆角图
infoAvatar          |String    |带文字描述的头像
fullAvatar          |String    |全身像
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有：（GET） ###
[https://localhost/data-judge-re-match](https://localhost/data-judge-re-match)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |列表|DataJudgeReMatch[]

### 2.获取：（GET） ###
[https://localhost/data-judge-re-match/{id}](https://localhost/data-judge-re-match/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||DataJudgeReMatch

### 3.添加：（POST） ###
[https://localhost/data-judge-re-match](https://localhost/data-judge-re-match)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataJudgeReMatch|  |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int

### 4.修改：（PUT） ###
[https://localhost/data-judge-re-match](https://localhost/data-judge-re-match)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataJudgeReMatch|  |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int

### 5.删除：（DELETE） ###
[https://localhost/data-judge-re-match/{id}](https://localhost/data-judge-re-match/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         ||int


