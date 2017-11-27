# 精通Spring 4.x 企业开发实战源码
## 目录
## 第1篇 基础篇 
### 第1章 Spring概述 2 
#### 1.1 认识Spring 2 
#### 1.2 关于SpringSource 4 
#### 1.3 Spring带给我们什么 5 
#### 1.4 Spring体系结构 6 
#### 1.5 Spring对Java版本的要求 8 
#### 1.6 Spring 4.0新特性 8 
    1.6.1 全面支持Java 8.0 9 
    1.6.2 核心容器的增强 11 
    1.6.3 支持用Groovy定义Bean 12 
    1.6.4 Web的增强 12 
    1.6.5 支持WebSocket 12 
    1.6.6 测试的增强 13 
    1.6.7 其他 13 
#### 1.7 Spring子项目 13 
#### 1.8 如何获取Spring 15 
#### 1.9 小结 16 
### 第2章 快速入门 17 
#### 2.1 实例概述 17 
    2.1.1 比Hello World更适用的实例 18 
    2.1.2 实例功能简介 18 
#### 2.2 环境准备 20 
    2.2.1 构建工具Maven 20 
    2.2.2 创建库表 22 
    2.2.3 建立工程 23 
    2.2.4 类包及Spring配置文件规划 28 
#### 2.3 持久层 29 
    2.3.1 建立领域对象 29 
    2.3.2 UserDao 30 
    2.3.3 LoginLogDao 33 
    2.3.4 在Spring中装配DAO 34 
#### 2.4 业务层 35 
    2.4.1 UserService 35 
    2.4.2 在Spring中装配Service 37 
    2.4.3 单元测试 38 
#### 2.5 展现层 40 
    2.5.1 配置Spring MVC框架 40 
    2.5.2 处理登录请求 42 
    2.5.3 JSP视图页面 44 
#### 2.6 运行Web应用 46 
#### 2.7 小结 48 
### 第3章 Spring Boot 49 
#### 3.1 Spring Boot概览 49 
    3.1.1 Spring Boot发展背景 50 
    3.1.2 Spring Boot特点 50 
    3.1.3 Spring Boot启动器 50 
#### 3.2 快速入门 52 
#### 3.3 安装配置 54 
    3.3.1 基于Maven环境配置 54 
    3.3.2 基于Gradle环境配置 56 
    3.3.3 基于Spring Boot CLI环境配置 57 
    3.3.4 代码包结构规划 58 
#### 3.4 持久层 59 
    3.4.1 初始化配置 59 
    3.4.2 UserDao 61 
#### 3.5 业务层 62 
#### 3.6 展现层 64 
    3.6.1 配置pom.xml依赖 64 
    3.6.2 配置Spring MVC框架 65 
    3.6.3 处理登录请求 65 
#### 3.7 运维支持 67 
#### 3.8 小结 70 
## 第2篇 核心篇 
### 第4章 IoC容器 72 
#### 4.1 IoC概述 72 
    4.1.1 通过实例理解IoC的概念 73 
    4.1.2 IoC的类型 75 
    4.1.3 通过容器完成依赖关系的注入 77 
#### 4.2 相关Java基础知识 78 
    4.2.1 简单实例 78 
    4.2.2 类装载器ClassLoader 80 
    4.2.3 Java反射机制 83 
#### 4.3 资源访问利器 85 
    4.3.1 资源抽象接口 85 
    4.3.2 资源加载 88 
#### 4.4 BeanFactory和ApplicationContext 91 
    4.4.1 BeanFactory介绍 92 
    4.4.2 ApplicationContext介绍 94 
    4.4.3 父子容器 103 
#### 4.5 Bean的生命周期 103 
    4.5.1 BeanFactory中Bean的生命周期 103 
    4.5.2 ApplicationContext中Bean的生命周期 112 
#### 4.6 小结 114 
### 第5章 在IoC容器中装配Bean 115 
#### 5.1 Spring配置概述 116 
    5.1.1 Spring容器高层视图 116 
    5.1.2 基于XML的配置 117 
#### 5.2 Bean基本配置 120 
    5.2.1 装配一个Bean 120 
    5.2.2 Bean的命名 120 
#### 5.3 依赖注入 121 
    5.3.1 属性注入 121 
    5.3.2 构造函数注入 124 
    5.3.3 工厂方法注入 128 
    5.3.4 选择注入方式的考量 130 
#### 5.4 注入参数详解 130 
    5.4.1 字面值 130 
    5.4.2 引用其他Bean 131 
    5.4.3 内部Bean 133 
    5.4.4 null值 133 
    5.4.5 级联属性 134 
    5.4.6 集合类型属性 134 
    5.4.7 简化配置方式 138 
    5.4.8 自动装配 141 
#### 5.5 方法注入 142 
    5.5.1 lookup方法注入 142 
    5.5.2 方法替换 143 
#### 5.6 <bean>之间的关系 144 
    5.6.1 继承 144 
    5.6.2 依赖 145 
    5.6.3 引用 146 
#### 5.7 整合多个配置文件 147 
#### 5.8 Bean作用域 148 
    5.8.1 singleton作用域 148 
    5.8.2 prototype作用域 149 
    5.8.3 与Web应用环境相关的Bean作用域 150 
    5.8.4 作用域依赖问题 152 
#### 5.9 FactoryBean 153 
#### 5.10 基于注解的配置 155 
    5.10.1 使用注解定义Bean 155 
    5.10.2 扫描注解定义的Bean 156 
    5.10.3 自动装配Bean 157 
    5.10.4 Bean作用范围及生命过程方法 162 
#### 5.11 基于Java类的配置 164 
    5.11.1 使用Java类提供Bean定义信息 164 
    5.11.2 使用基于Java类的配置信息启动Spring容器 167 
#### 5.12 基于Groovy DSL的配置 169 
    5.12.1 使用Groovy DSL提供Bean定义信息 169 
    5.12.2 使用GenericGroovyApplicationContext启动Spring容器 171 
#### 5.13 通过编码方式动态添加Bean 172 
    5.13.1 通过DefaultListableBeanFactory 172 
    5.13.2 扩展自定义标签 173 
#### 5.14 不同配置方式比较 175 
#### 5.15 小结 177 
### 第6章 Spring容器高级主题 178 
#### 6.1 Spring容器技术内幕 178 
    6.1.1 内部工作机制 179 
    6.1.2 BeanDefinition 182 
    6.1.3 InstantiationStrategy 183 
    6.1.4 BeanWrapper 183 
#### 6.2 属性编辑器 184 
    6.2.1 JavaBean的编辑器 185 
    6.2.2 Spring默认属性编辑器 188 
    6.2.3 自定义属性编辑器 189 
#### 6.3 使用外部属性文件 192 
    6.3.1 PropertyPlaceholderConfigurer属性文件 192 
    6.3.2 使用加密的属性文件 195 
    6.3.3 属性文件自身的引用 198 
#### 6.4 引用Bean的属性值 199 
#### 6.5 国际化信息 201 
    6.5.1 基础知识 201 
    6.5.2 MessageSource 206 
    6.5.3 容器级的国际化信息资源 209 
#### 6.6 容器事件 210 
    6.6.1 Spring事件类结构 211 
    6.6.2 解构Spring事件体系的具体实现 213 
    6.6.3 一个实例 214 
#### 6.7 小结 215 
### 第7章 Spring AOP基础 216 
#### 7.1 AOP概述 216 
    7.1.1 AOP到底是什么 217 
    7.1.2 AOP术语 219 
    7.1.3 AOP的实现者 221 
#### 7.2 基础知识 222 
    7.2.1 带有横切逻辑的实例 222 
    7.2.2 JDK动态代理 224 
    7.2.3 CGLib动态代理 228 
    7.2.4 AOP联盟 229 
    7.2.5 代理知识小结 230 
#### 7.3 创建增强类 230 
    7.3.1 增强类型 230 
    7.3.2 前置增强 231 
    7.3.3 后置增强 235 
    7.3.4 环绕增强 236 
    7.3.5 异常抛出增强 237 
    7.3.6 引介增强 239 
#### 7.4 创建切面 243 
    7.4.1 切点类型 243 
    7.4.2 切面类型 244 
    7.4.3 静态普通方法名匹配切面 246 
    7.4.4 静态正则表达式方法匹配切面 248 
    7.4.5 动态切面 251 
    7.4.6 流程切面 254 
    7.4.7 复合切点切面 256 
    7.4.8 引介切面 258 
#### 7.5 自动创建代理 259 
    7.5.1 实现类介绍 259 
    7.5.2 BeanNameAutoProxyCreator 260 
    7.5.3 DefaultAdvisorAutoProxyCreator 261 
    7.5.4 AOP无法增强疑难问题剖析 262 
#### 7.6 小结 267 
### 第8章 基于@AspectJ和Schema的AOP 269 
#### 8.1 Spring对AOP的支持 269 
#### 8.2 Java 5.0注解知识快速进阶 270 
    8.2.1 了解注解 270 
    8.2.2 一个简单的注解类 271 
    8.2.3 使用注解 272 
    8.2.4 访问注解 273 
#### 8.3 着手使用@AspectJ 274 
    8.3.1 使用前的准备 275 
    8.3.2 一个简单的例子 275 
    8.3.3 如何通过配置使用@AspectJ切面 277 
#### 8.4 @AspectJ语法基础 278 
    8.4.1 切点表达式函数 278 
    8.4.2 在函数入参中使用通配符 279 
    8.4.3 逻辑运算符 280 
    8.4.4 不同增强类型 281 
    8.4.5 引介增强用法 282 
#### 8.5 切点函数详解 283 
    8.5.1 @annotation() 284 
    8.5.2 execution() 285 
    8.5.3 args()和@args() 287 
    8.5.4 within() 288 
    8.5.5 @within()和@target() 289 
    8.5.6 target()和this() 290 
#### 8.6 @AspectJ进阶 291 
    8.6.1 切点复合运算 292 
    8.6.2 命名切点 292 
    8.6.3 增强织入的顺序 294 
    8.6.4 访问连接点信息 294 
    8.6.5 绑定连接点方法入参 295 
    8.6.6 绑定代理对象 297 
    8.6.7 绑定类注解对象 298 
    8.6.8 绑定返回值 299 
    8.6.9 绑定抛出的异常 299 
#### 8.7 基于Schema配置切面 300 
    8.7.1 一个简单切面的配置 300 
    8.7.2 配置命名切点 302 
    8.7.3 各种增强类型的配置 303 
    8.7.4 绑定连接点信息 305 
    8.7.5 Advisor配置 306 
#### 8.8 混合切面类型 307 
    8.8.1 混合使用各种切面类型 308 
    8.8.2 各种切面类型总结 308 
#### 8.9 其他 309 
    8.9.1 JVM Class文件字节码转换基础知识 309 
    8.9.2 使用LTW织入切面 311 
#### 8.10 小结 314 
### 第9章  Spring SpEL 316 
#### 9.1 JVM动态语言 316 
#### 9.2 SpEL表达式概述 318 
#### 9.3 SpEL核心接口 319 
    9.3.1 EvaluationContext接口 320 
    9.3.2 SpEL编译器 321 
#### 9.4 SpEL基础表达式 323 
    9.4.1 文本字符解析 323 
    9.4.2 对象属性解析 323 
    9.4.3 数组、集合类型解析 324 
    9.4.4 方法解析 326 
    9.4.5 操作符解析 327 
    9.4.6 安全导航操作符 329 
    9.4.7 三元操作符 330 
    9.4.8 Elvis操作符 331 
    9.4.9 赋值、类型、构造器、变量 332 
    9.4.10 集合过滤 335 
    9.4.11 集合转换 335 
#### 9.5 在Spring中使用SpEL 336 
    9.5.1 基于XML的配置 336 
    9.5.2 基于注解的配置 337 
#### 9.6 小结 338 
## 第3篇 数据篇 
### 第10章  Spring对DAO的支持 340 
#### 10.1 Spring的DAO理念 340 
#### 10.2 统一的异常体系 341 
    10.2.1 Spring的DAO异常体系 341 
    10.2.2 JDBC的异常转换器 343 
    10.2.3 其他持久化技术的异常转换器 344 
#### 10.3 统一数据访问模板 344 
    10.3.1 使用模板和回调机制 345 
    10.3.2 Spring为不同持久化技术所提供的模板类 347 
#### 10.4 数据源 348 
    10.4.1 配置一个数据源 348 
    10.4.2 获取JNDI数据源 352 
    10.4.3 Spring的数据源实现类 353 
#### 10.5 小结 353 
### 第11章 Spring的事务管理 355 
#### 11.1 数据库事务基础知识 355 
    11.1.1 何为数据库事务 356 
    11.1.2 数据并发的问题 357 
    11.1.3 数据库锁机制 359 
    11.1.4 事务隔离级别 360 
    11.1.5 JDBC对事务的支持 361 
#### 11.2 ThreadLocal基础知识 362 
    11.2.1 ThreadLocal是什么 363 
    11.2.2 ThreadLocal的接口方法 363 
    11.2.3 一个TheadLocal实例 364 
    11.2.4 与Thread同步机制的比较 366 
    11.2.5 Spring使用ThreadLocal解决线程安全问题 366 
#### 11.3 Spring对事务管理的支持 368 
    11.3.1 事务管理关键抽象 369 
    11.3.2 Spring的事务管理器实现类 371 
    11.3.3 事务同步管理器 374 
    11.3.4 事务传播行为 375 
#### 11.4 编程式的事务管理 376 
#### 11.5 使用XML配置声明式事务 377 
    11.5.1 一个将被实施事务增强的服务接口 379 
    11.5.2 使用原始的TransactionProxyFactoryBean 379 
    11.5.3 基于aop/tx命名空间的配置 382 
#### 11.6 使用注解配置声明式事务 385 
    11.6.1 使用@Transactional注解 385 
    11.6.2 通过AspectJ LTW引入事务切面 389 
#### 11.7 集成特定的应用服务器 390 
    11.7.1 BEA WebLogic 390 
    11.7.2 WebSphere 390 
#### 11.8 小结 390 
### 第12章 Spring的事务管理难点剖析 392 
#### 12.1 DAO和事务管理的牵绊 393 
    12.1.1 JDBC访问数据库 393 
    12.1.2 Hibernate访问数据库 395 
#### 12.2 应用分层的迷惑 398 
#### 12.3 事务方法嵌套调用的迷茫 401 
    12.3.1 Spring事务传播机制回顾 401 
    12.3.2 相互嵌套的服务方法 402 
#### 12.4 多线程的困惑 405 
    12.4.1 Spring通过单实例化Bean简化多线程问题 405 
    12.4.2 启动独立线程调用事务方法 405 
#### 12.5 联合军种作战的混乱 408 
    12.5.1 Spring事务管理器的应对 408 
    12.5.2 Hibernate+Spring JDBC混合框架的事务管理 408 
#### 12.6 特殊方法成漏网之鱼 412 
    12.6.1 哪些方法不能实施SpringAOP事务 412 
    12.6.2 事务增强遗漏实例 413 
#### 12.7 数据连接泄露 416 
    12.7.1 底层连接资源的访问问题 416 
    12.7.2 Spring JDBC数据连接泄露 417 
    12.7.3 事务环境下通过DataSourceUtils获取数据连接 420 
    12.7.4 无事务环境下通过DataSourceUtils获取数据连接 422 
    12.7.5 JdbcTemplate如何做到对连接泄露的免疫 424 
    12.7.6 使用TransactionAwareDataSourceProxy 425 
    12.7.7 其他数据访问技术的等价类 426 
#### 12.8 小结 426 
### 第13章 使用Spring JDBC访问数据库 428 
#### 13.1 使用Spring JDBC 428 
    13.1.1 JdbcTemplate小试牛刀 429 
    13.1.2 在DAO中使用JdbcTemplate 429 
#### 13.2 基本的数据操作 431 
    13.2.1 更改数据 431 
    13.2.2 返回数据库的表自增主键值 434 
    13.2.3 批量更改数据 436 
    13.2.4 查询数据 437 
    13.2.5 查询单值数据 440 
    13.2.6 调用存储过程 442 
#### 13.3 BLOB/CLOB类型数据的操作 444 
    13.3.1 如何获取本地数据连接 445 
    13.3.2 相关的操作接口 446 
    13.3.3 插入LOB类型的数据 448 
    13.3.4 以块数据方式读取LOB数据 450 
    13.3.5 以流数据方式读取LOB数据 451 
#### 13.4 自增键和行集 452 
    13.4.1 自增键的使用 452 
    13.4.2 如何规划主键方案 454 
    13.4.3 以行集返回数据 456 
#### 13.5 NamedParameterJdbcTemplate模板类 456 
#### 13.6 小结 459 
### 第14章 整合其他ORM框架 460 
#### 14.1 Spring整合ORM技术 460 
#### 14.2 在Spring中使用Hibernate 462 
    14.2.1 配置SessionFactory 462 
    14.2.2 使用HibernateTemplate 465 
    14.2.3 处理LOB类型的数据 469 
    14.2.4 添加Hibernate事件监听器 470 
    14.2.5 使用原生的Hibernate API 471 
    14.2.6 使用注解配置 472 
    14.2.7 事务处理 474 
    14.2.8 延迟加载问题 475 
#### 14.3 在Spring中使用MyBatis 476 
    14.3.1 配置SqlMapClient 476 
    14.3.2 在Spring中配置MyBatis 478 
    14.3.3 编写MyBatis的DAO 479 
#### 14.4 DAO层设计 482 
    14.4.1 DAO基类设计 482 
    14.4.2 查询接口方法设计 484 
    14.4.3 分页查询接口设计 486 
#### 14.5 小结 487 
## 第4篇 应用篇 
### 第15章 Spring Cache 490 
#### 15.1 缓存概述 490 
    15.1.1 缓存的概念 490 
    15.1.2 使用Spring Cache 493 
#### 15.2 掌握Spring Cache抽象 498 
    15.2.1 缓存注解 498 
    15.2.2 缓存管理器 504 
    15.2.3 使用SpEL表达式 506 
    15.2.4 基于XML的Cache声明 506 
    15.2.5 以编程方式初始化缓存 507 
    15.2.6 自定义缓存注解 509 
#### 15.3 配置Cache存储 509 
    15.3.1 EhCache 510 
    15.3.2 Guava 510 
    15.3.3 HazelCast 511 
    15.3.4 GemFire 511 
    15.3.5 JSR-107 Cache 511 
#### 15.4 实战经验 513 
#### 15.5 小结 514 
### 第16章 任务调度和异步执行器 516 
#### 16.1 任务调度概述 516 
#### 16.2 Quartz快速进阶 517 
    16.2.1 Quartz基础结构 518 
    16.2.2 使用SimpleTrigger 520 
    16.2.3 使用CronTrigger 522 
    16.2.4 使用Calendar 526 
    16.2.5 任务调度信息存储 527 
#### 16.3 在Spring中使用Quartz 530 
    16.3.1 创建JobDetail 530 
    16.3.2 创建Trigger 533 
    16.3.3 创建Scheduler 534 
#### 16.4 在Spring中使用JDK Timer 536 
    16.4.1 Timer和TimerTask 536 
    16.4.2 Spring对Java Timer的支持 539 
#### 16.5 Spring对Java 5.0 Executor的支持 540 
    16.5.1 了解Java 5.0的Executor 541 
    16.5.2 Spring对Executor所提供的抽象 543 
#### 16.6 实际应用中的任务调度 544 
    16.6.1 如何产生任务 545 
    16.6.2 任务调度对应用程序集群的影响 547 
    16.6.3 任务调度云 547 
    16.6.4 Web应用程序中调度器的启动和关闭问题 549 
#### 16.7 小结 552 
### 第17章 Spring MVC 553 
#### 17.1 Spring MVC体系概述 554 
    17.1.1 体系结构 554 
    17.1.2 配置DispatcherServlet 555 
    17.1.3 一个简单的实例 560 
#### 17.2 注解驱动的控制器 565 
    17.2.1 使用@RequestMapping映射请求 565 
    17.2.2 请求处理方法签名 569 
    17.2.3 使用矩阵变量绑定参数 570 
    17.2.4 请求处理方法签名详细说明 571 
    17.2.5 使用HttpMessageConverter<T> 575 
    17.2.6 使用@RestController和AsyncRestTemplate 584 
    17.2.7 处理模型数据 586 
#### 17.3 处理方法的数据绑定 591 
    17.3.1 数据绑定流程剖析 592 
    17.3.2 数据转换 592 
    17.3.3 数据格式化 598 
    17.3.4 数据校验 602 
#### 17.4 视图和视图解析器 611 
    17.4.1 认识视图 611 
    17.4.2 认识视图解析器 612 
    17.4.3 JSP和JSTL 613 
    17.4.4 模板视图 618 
    17.4.5 Excel 621 
    17.4.6 PDF 623 
    17.4.7 输出XML 625 
    17.4.8 输出JSON 626 
    17.4.9 使用XmlViewResolver 626 
    17.4.10 使用ResourceBundleViewResolver 627 
    17.4.11 混合使用多种视图技术 628 
#### 17.5 本地化解析 630 
    17.5.1 本地化的概念 630 
    17.5.2 使用CookieLocaleResolver 631 
    17.5.3 使用SessionLocaleResolver 632 
    17.5.4 使用LocaleChangeInterceptor 632 
#### 17.6 文件上传 633 
    17.6.1 配置MultipartResolver 633 
    17.6.2 编写控制器和文件上传表单页面 633 
#### 17.7 WebSocket支持 634 
    17.7.1 使用WebSocket 634 
    17.7.2 WebSocket的限制 638 
#### 17.8 杂项 639 
    17.8.1 静态资源处理 639 
    17.8.2 装配拦截器 643 
    17.8.3 异常处理 644 
    17.8.4 RequestContextHolder的使用 646 
#### 17.9 小结 646 
### 第18章 实战案例开发 648 
#### 18.1 论坛案例概述 648 
    18.1.1 论坛整体功能结构 648 
    18.1.2 论坛用例描述 649 
    18.1.3 主要功能流程描述 651 
#### 18.2 系统设计 655 
    18.2.1 技术框架选择 655 
    18.2.2 采用Maven构建项目 656 
    18.2.3 单元测试类包结构规划 657 
    18.2.4 系统架构图 658 
    18.2.5 PO类设计 658 
    18.2.6 持久层设计 659 
    18.2.7 服务层设计 660 
    18.2.8 Web层设计 661 
    18.2.9 数据库设计 662 
#### 18.3 开发前的准备 663 
#### 18.4 持久层开发 664 
    18.4.1 PO类 664 
    18.4.2 DAO基类 666 
    18.4.3 通过扩展基类定义DAO类 670 
    18.4.4 DAO Bean的装配 672 
    18.4.5 使用Hibernate二级缓存 673 
#### 18.5 对持久层进行测试 675 
    18.5.1 配置Unitils测试环境 675 
    18.5.2 准备测试数据库及测试数据 676 
    18.5.3 编写DAO测试基类 677 
    18.5.4 编写BoardDao测试用例 678 
#### 18.6 服务层开发 680 
    18.6.1 UserService的开发 680 
    18.6.2 ForumService的开发 681 
    18.6.3 服务类Bean的装配 683 
#### 18.7 对服务层进行测试 684 
    18.7.1 编写Service测试基类 685 
    18.7.2 编写ForumService测试用例 685 
#### 18.8 Web层开发 687 
    18.8.1 BaseController的基类 687 
    18.8.2 用户登录和注销 689 
    18.8.3 用户注册 691 
    18.8.4 论坛管理 692 
    18.8.5 论坛普通功能 694 
    18.8.6 分页显示论坛版块的主题帖子 696 
    18.8.7 web.xml配置 700 
    18.8.8 Spring MVC配置 702 
#### 18.9 对Web层进行测试 703 
    18.9.1 编写Web测试基类 703 
    18.9.2 编写ForumManageController测试用例 704 
#### 18.10 开发环境部署 705 
#### 18.11 项目配置实战经验 708 
    18.11.1 “传统的”Web项目属性文件 708 
    18.11.2 如何规划便于部署的Web项目属性文件 709 
    18.11.3 数据源的配置 710 
#### 18.12 小结 712 
## 第5篇 提高篇 
### 第19章 Spring OXM 714 
#### 19.1 认识XML解析技术 714 
    19.1.1 什么是XML 714 
    19.1.2 XML的处理技术 715 
#### 19.2 XML处理利器：XStream 717 
    19.2.1 XStream概述 717 
    19.2.2 快速入门 718 
    19.2.3 使用XStream别名 720 
    19.2.4 XStream转换器 721 
    19.2.5 XStream注解 723 
    19.2.6 流化对象 725 
    19.2.7 持久化API 726 
    19.2.8 额外功能：处理JSON 727 
#### 19.3 其他常见的O/X Mapping开源项目 729 
    19.3.1 JAXB 729 
    19.3.2 Castor 733 
    19.3.3 JiBX 738 
    19.3.4 总结比较 741 
#### 19.4 与Spring OXM整合 742 
    19.4.1 Spring OXM概述 742 
    19.4.2 整合OXM实现者 744 
    19.4.3 如何在Spring中进行配置 744 
    19.4.4 Spring OXM简单实例 747 
#### 19.5 小结 749 
### 第20章 实战型单元测试 750 
#### 20.1 单元测试概述 751 
    20.1.1 为什么需要单元测试 751 
    20.1.2 单元测试之误解 752 
    20.1.3 单元测试之困境 754 
    20.1.4 单元测试基本概念 755 
#### 20.2 TestNG快速进阶 757 
    20.2.1 TestNG概述 757 
    20.2.2 TestNG生命周期 758 
    20.2.3 使用TestNG 758 
#### 20.3 模拟利器Mockito 763 
    20.3.1 模拟测试概述 763 
    20.3.2 创建Mock对象 763 
    20.3.3 设定Mock对象的期望行为及返回值 764 
    20.3.4 验证交互行为 766 
#### 20.4 测试整合之王Unitils 767 
    20.4.1 Unitils概述 767 
    20.4.2 集成Spring 770 
    20.4.3 集成Hibernate 773 
    20.4.4 集成DbUnit 774 
    20.4.5 自定义扩展模块 775 
#### 20.5 使用Unitils测试DAO层 776 
    20.5.1 数据库测试的难点 776 
    20.5.2 扩展DbUnit用Excel准备数据 776 
    20.5.3 测试实战 779 
#### 20.6 使用Unitils测试Service层 789 
#### 20.7 测试Web层 794 
    20.7.1 对LoginController进行单元测试 794 
    20.7.2 使用Spring Servlet API模拟对象 795 
    20.7.3 使用Spring RestTemplate测试 797 
#### 20.8 小结 798