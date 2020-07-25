# 数据库转换器
用配置的方式来定义数据库转化逻辑，用于代替手工数据库转换操作
## swagger地址
http://localhost:8082/swagger-ui.htm

## 0. 资源
 - config 目录中是两个配置文件的例子
 - sql 目录中是对应的两个表

## 1. 技术
1. spring boot
2. hikari 动态配置多数据源

## 2. 工作记录
1. v1.0 (2020/7/25)
- 转换子表聚合数据到父表( sum count)

2. v1.1(未开始)
- 自动增加子类修改触发器


## 3. 配置
- 格式说明
````
sources: 数据源
    "tableName": 数据源表
    "idColumn": 分组列名
    "ops": 操作 Sum 或者 Count
    "opsColumn": 聚合操作的列名
destinations: 数据目的
    "tableName": 数据目的表
    "idColumn": 目的表的ID列名
    "updateColumn": 要写入聚合列的列名
````
- json格式示例
````
[
    {
        "destinations": [
            {
                "idColumn": "id",
                "tableName": "groupbatch_copy",
                "updateColumn": "totalBalance"
            }
        ],
        "sources": [
            {
                "idColumn": "batch_id",
                "ops": "Sum",
                "opsColumn": "balance",
                "tableName": "groupbatch_account"
            }
        ],
        "type": "Sum"
    }
]
````

联系方式：shenjizhe@bfec.cn
