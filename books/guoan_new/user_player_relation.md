### 用户球员关系 ###
<A NAME="UserPlayerRelation">UserPlayerRelation</A>

名称|类型|描述
-|-|-
userId              |String    |用户ID
playID              |Integer   |球员ID
type                |Integer   |关系类型（1.关注）
time                |Date      |关系建立时间

### 1.获取所有用户球员关系：（GET） ###
[https://localhost/user-player-relation](https://localhost/user-player-relation)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |用户球员关系列表|UserPlayerRelation[]

### 2.修改用户球员关系：（PUT） ###
[https://localhost/user-player-relation](https://localhost/user-player-relation)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
userPlayerRelation| 用户球员关系 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |用户球员关系|int


