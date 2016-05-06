### VIEW ###
<A NAME="LeagueMatch">LeagueMatch</A>

名称|类型|描述
-|-|-
id                  |Long      |唯一主键
kickAt              |Date      |比赛时间(年月日时分)
homeScore           |Integer   |主队比分(未开赛则为0)
guestScore          |Integer   |客队比分(未开赛则为0)
homeClubId          |Long      |主队ID   FK -> data_club.id
guestClubId         |Long      |客队ID   FK -> data_club.id
round               |Integer   |比赛轮次 (用于记录联赛的情况)
roundName           |String    |轮次名称
knockout            |String    |比赛分组(用于记录杯赛的情况,分 pre[预选],a-z[小组]
weekday             |String    |比赛星期(一~日)
stadium             |String    |比赛球馆
leagueId            |Long      |所属联赛  FK-> data_league.id
leagueSubId         |Long      |联赛子类型
audiences           |Integer   |观众人数(用于计算上座率)
relativeTag         |String    |(是否需要)相关关联标签(如转播计划,精彩视频等),参见新闻的关联标签设计
year                |String    |联赛年份 (支持不带-的当年和带-的跨年两种格式 注:这里考虑到url的/冲突,避免用/做分隔符)
videoUrl            |String    |精彩视频转播URL
matchStatus         |Integer   |比赛是否结束 1:表示结束，2：表示进行中，3：表示未开始，4:比赛延期 默认皆为 3
typeName            |String    |联赛中文简称(中超，亚冠，预备队...),常用,比如:中超联赛
typeFullName        |String    |联赛的全文名称,作为某些情况下的备份,比如:中国足球超级联赛
typeEnglishName     |String    |英文简称,常用,比如:CSL
typeEnglishFullName |String    |英文全称,备份,比如:Chinese Super League
typeRegionName      |String    |举办地区 (中国,亚洲...)
type                |String    |联赛范围 1:国家级,2:洲级,3:世界级
subTypeName         |String    |联赛中文简称(中超，亚冠，预备队...),常用,比如:中超联赛
subTypeFullName     |String    |联赛的全文名称,作为某些情况下的备份,比如:中国足球超级联赛
subTypeEnglishName  |String    |英文简称,常用,比如:CSL
subTypeEnglishFullName|String    |英文全称,备份,比如:Chinese Super League
subTypeRegion       |String    |举办地区 (中国,亚洲...)
subType             |String    |联赛范围 1:国家级,2:洲级,3:世界级
homeClubName        |String    |队名
homeClubLogo        |String    |图片
homeClubEnglishName |String    |英文名
homeClubFullName    |String    |中文全名
homeClubEnglishFullName|String    |英文全名
homeClubColor       |String    |俱乐部主体颜色
guestClubName       |String    |队名
guestClubLogo       |String    |图片
guestClubEnglishName|String    |英文名
guestClubFullName   |String    |中文全名
guestClubEnglishFullName|String    |英文全名
guestClubColor      |String    |俱乐部主体颜色

### 1.获取所有VIEW：（GET） ###
[https://localhost/league-match](https://localhost/league-match)

**input：**

参数名 		|描述	|示例
 --------- | ------|------

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW列表|LeagueMatch[]

### 2.获取VIEW：（GET） ###
[https://localhost/league-match/{id}](https://localhost/league-match/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| VIEW唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW|LeagueMatch

### 3.添加VIEW：（POST） ###
[https://localhost/league-match](https://localhost/league-match)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
leagueMatch| VIEW |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW|int

### 4.修改VIEW：（PUT） ###
[https://localhost/league-match](https://localhost/league-match)

**input：**

参数名 		|描述	|示例
 --------- | ------|------
leagueMatch| VIEW |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW|int

### 5.删除VIEW：（DELETE） ###
[https://localhost/league-match/{id}](https://localhost/league-match/{id})

**input：**

参数名 		|描述	|示例
 --------- | ------|------
Id| VIEW唯一标识 |   

**output：**<A HREF="#Code">Code(返回码)</A>

参数名 		|描述	|示例
 --------- | ------|------
code 		|返回值	|0
msg			|返回消息|成功
tag         |VIEW|int


