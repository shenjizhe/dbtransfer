### 球队升降级 ###
<A NAME="UpdownType">UpdownType</A>

名称|类型|描述
-|-|-
id                  |Integer   |唯一主键
name                |String    |升降级

### 1.获取所有球队升降级：（GET） ###
[https://localhost/updown-type](https://localhost/updown-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队升降级列表|UpdownType[]

### 2.获取球队升降级：（GET） ###
[https://localhost/updown-type/{id}](https://localhost/updown-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球队升降级唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队升降级|UpdownType

### 3.添加球队升降级：（POST） ###
[https://localhost/updown-type](https://localhost/updown-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
updownType| 球队升降级 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队升降级|int

### 4.修改球队升降级：（PUT） ###
[https://localhost/updown-type](https://localhost/updown-type)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
updownType| 球队升降级 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队升降级|int

### 5.删除球队升降级：（DELETE） ###
[https://localhost/updown-type/{id}](https://localhost/updown-type/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 球队升降级唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |球队升降级|int


