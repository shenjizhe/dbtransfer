### 联赛裁判 ###
<A NAME="DataJudge">DataJudge</A>

名称|类型|描述
-|-|-
id                  |Long      |
name                |String    |裁判姓名
nameInitials        |String    |姓名首字母缩写(用于可能需要的姓名自然排序)
nationality         |String    |国籍
nativePlace         |String    |籍贯（出生地）
region              |String    |地区(直辖市/省级的粒度)(暂时不删除，但是建议用行政区划)
regionCode          |Integer   |行政区划6位编码(备用）
birth               |Date      |生日(用于自动计算年龄)
level               |Integer   |级别(1:国家级 2:国际级)
createdAt           |Date      |
updatedAt           |Date      |

### 1.获取所有联赛裁判：（GET） ###
[https://localhost/data-judge](https://localhost/data-judge)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛裁判列表|DataJudge[]

### 2.获取联赛裁判：（GET） ###
[https://localhost/data-judge/{id}](https://localhost/data-judge/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛裁判唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛裁判|DataJudge

### 3.添加联赛裁判：（POST） ###
[https://localhost/data-judge](https://localhost/data-judge)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataJudge| 联赛裁判 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛裁判|int

### 4.修改联赛裁判：（PUT） ###
[https://localhost/data-judge](https://localhost/data-judge)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
dataJudge| 联赛裁判 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛裁判|int

### 5.删除联赛裁判：（DELETE） ###
[https://localhost/data-judge/{id}](https://localhost/data-judge/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| 联赛裁判唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |联赛裁判|int


