### 球队 ###
<A NAME="Team">Team</A>

名称|类型|描述
-|-|-
id                  |Integer   |逻辑主键
name                |String    |球队现在名称/最后存在名称
createTime          |Date      |
updateTime          |Date      |

### 1.获取所有球队：（GET） ###
[https://localhost/team](https://localhost/team)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队列表|Team[]

### 2.获取球队：（GET） ###
[https://localhost/team/{id}](https://localhost/team/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球队唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队|Team


