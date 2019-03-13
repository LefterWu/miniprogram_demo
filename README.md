# miniprogram_demo

Spring Boot + MyBatis快速搭建微信小程序后端部分，实现列表项目的增删改查基本功能

## 环境

- JDK: 1.8
- Srping Boot: 2.1.3
- Maven: 3.6.0
- Druid: 1.1.4
- IDEA: 2017.3.6

## 数据库设计

```
\src\main\resources\sql\schema.sql
```

## restful接口设计

```
//获取区域列表
GET /admin/list/area
GET /admin/list/area/{id}
GET /admin/list/area/{name}

//新增区域
POST /admin/area

//更新区域
POUT /admin/area

//删除区域
DELETE /admin/area
```

## 主要技术

- Spring Boot + MyBatis快速搭建web应用
- restful接口
- 全局的 Controller 层异常处理（注解@ControllerAdvice+@ExceptionHandler）
- 声明式事务（@Transactional）
- Druid数据库连接池（参见我的博客https://www.wuleshen.com/2019/03/13/druid-quick-start/）
    - 密码加密
    - 监控
- lombok快速配置实体类
- 高复用响应类

---

### tips:

如果Controller返回json对象，一定要在响应类加上getter/setter