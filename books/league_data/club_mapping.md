### 俱乐部项目和中超项目的俱乐部映射关系 ###
<A NAME="ClubMapping">ClubMapping</A>

名称|类型|描述
-|-|-
teamId              |Integer   |国安俱乐部ID
clubId              |Long      |中超俱乐部ID

### 1.获取所有俱乐部项目和中超项目的俱乐部映射关系：（GET） ###
[https://localhost/club-mapping](https://localhost/club-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部项目和中超项目的俱乐部映射关系列表|ClubMapping[]

### 2.获取俱乐部项目和中超项目的俱乐部映射关系：（GET） ###
[https://localhost/club-mapping/{id}](https://localhost/club-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部项目和中超项目的俱乐部映射关系唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部项目和中超项目的俱乐部映射关系|ClubMapping

### 3.添加俱乐部项目和中超项目的俱乐部映射关系：（POST） ###
[https://localhost/club-mapping](https://localhost/club-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
clubMapping| 俱乐部项目和中超项目的俱乐部映射关系 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部项目和中超项目的俱乐部映射关系|int

### 4.修改俱乐部项目和中超项目的俱乐部映射关系：（PUT） ###
[https://localhost/club-mapping](https://localhost/club-mapping)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
clubMapping| 俱乐部项目和中超项目的俱乐部映射关系 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部项目和中超项目的俱乐部映射关系|int

### 5.删除俱乐部项目和中超项目的俱乐部映射关系：（DELETE） ###
[https://localhost/club-mapping/{id}](https://localhost/club-mapping/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 俱乐部项目和中超项目的俱乐部映射关系唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |俱乐部项目和中超项目的俱乐部映射关系|int


