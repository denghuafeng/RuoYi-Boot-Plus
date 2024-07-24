# RuoYi-Boot-Plus：重构典范，打造技术基座
<div style="height: 10px; clear: both;"></div>

- - -
[![码云Gitee](https://gitee.com/denghuafeng/ruoyi-boot-plus/badge/star.svg?theme=blue)](https://gitee.com/dromara/RuoYi-Vue-Plus)
[![GitHub](https://img.shields.io/github/stars/denghuafeng/RuoYi-Boot-Plus.svg?style=social&label=Stars)](https://github.com/dromara/RuoYi-Vue-Plus)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://gitee.com/dromara/RuoYi-Vue-Plus/blob/master/LICENSE)
[![使用IntelliJ IDEA开发维护](https://img.shields.io/badge/IntelliJ%20IDEA-提供支持-blue.svg)](https://www.jetbrains.com/?from=RuoYi-Vue-Plus)
<br>
[![RuoYi-Vue-Plus](https://img.shields.io/badge/RuoYi_Vue_Plus-5.2.1-success.svg)](https://gitee.com/dromara/RuoYi-Vue-Plus)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-blue.svg)]()
[![JDK-17](https://img.shields.io/badge/JDK-17-green.svg)]()
[![JDK-21](https://img.shields.io/badge/JDK-21-green.svg)]()

> 原项目[RuoYi-Vue-Plus](https://gitee.com/dromara/RuoYi-Vue-Plus)

## 📝重构愿景
RuoYi-Vue-Plus重构聚焦提升维护性、扩展性与专业度，贴合现代软件工程实践。重塑为技术基座，与业务代码剥离，确保技术独立演进，业务逻辑运行如常。

## ✨特性
* 🧱 模块化精雕：RuoYi-Vue-Plus 核心功能重塑为独立模块，各司其职，确保高内聚低耦合。
* ♿️ 依赖精炼：Maven细控模块间依赖，剔除冗余，加速构建，稳固项目根基。
* 🍃 边界明晰：技术基座与业务代码泾渭分明，前者专注基础设施与服务，后者专攻逻辑实现。
* 🚀 升级无痕：技术基座平滑迭代，业务逻辑运行如常，规避升级之扰。
* ♻️ 功能共享：承袭RuoYi-Vue-Plus后端精华，组件化封装，按需启用，灵活适配。
* 🏗️ 前端无缝：直连RuoYi-Vue-Plus前端，无需额外配置，体验一贯。
* 🎡 独立开发：业务代码独立测试，技术栈变动无虞，保障业务连续性。
* 🦺 集成简化：业务变动仅需局部调整，集成测试与持续交付提速增效。

## 🙋适用开发者群体概览
* 👽 快速启动派：RuoYi-Boot-Plus 打造即拿即用的开发环境，简注解、轻配置，速构应用骨架，直击业务逻辑开发。
* 🙈 非侵入式用户：无需触碰RuoYi-Vue-Plus源码，RuoYi-Boot-Plus配置先行，功能定制无忧，专注业务不改码。
* 🧐 轻配置高手：微调配置项，驾驭大部分开发场景，免底层代码深潜，业务创新焦点不偏移。

## 📲功能列表
- [X] 支持类似spring boot使用方式
- [ ] 支持一套代码单体/微服务自由切换
- [ ] 支持ruoyi定制化Spring Initializer脚手架


## 📋更新说明
点击查看<a href="/" target="_blank">更新记录</a>
#### 用心做开源，我们也很需要你的鼓励！右上角Star🌟，等你点亮！

## 🔐使用方式
重构后的 RuoYi-Vue-Plus 采用了类似于 Spring Boot 的使用方式，开发者只需在项目中引入相应的依赖，即可快速启动开发工作。这种设计降低了学习和使用的门槛，使得项目能够更好地适应未来业务和技术的变化。

模块化开发模式，后续将把所开发的模块都发布到了maven中央库，也可本地把源代码通过Maven install安装到本地，然后通过类似于 Spring Boot 的使用方式来进行项目搭建，搭建方式有两种。

1.继承ruoyi-boot-starter-parent,定义了当前项目使用的所有模块坐标，以达到减少依赖配置的目的。
```XML
<parent>
   <groupId>org.dromara.boot</groupId>
   <artifactId>ruoyi-boot-starter-parent</artifactId>
   <version>5.2.1</version>
</parent>
```
2.实际中有时候不想以ruoyi-boot-vue作为父类，可以换另外一种方式添加ruoyi-boot-vue依赖，此方式定义了若干个rouyi-boot-vue所有模块坐标版本号（依赖管理，而非依赖），以达到减少依赖冲突的目的，其他配置参考ruoyi-boot-parent.pom。
```XML
<dependencyManagement>
    <dependencies>
        <!-- RuoYi-Boot-Vue的依赖配置-->
        <dependency>
            <groupId>org.dromara.boot</groupId>
            <artifactId>ruoyi-boot-dependencies</artifactId>
            <version>${RuoYi-Boot-Vue.version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```
实际开发
使用任意坐标时，仅书写GAV中的G和A，V(version)由RuoYi-Boot-Vue和SpringBoot提供
如发生坐标错误，再指定version（要小心版本冲突）

3.业务模块创建引用基础starter依赖，参考ruoyi-demo和ruoyi-system
```XML
<dependencies>
    <!-- 基础starter依赖-->
    <dependency>
        <groupId>org.dromara.boot</groupId>
        <artifactId>ruoyi-spring-boot-starter</artifactId>
    </dependency>
</dependencies>
```

4.后台管理启动模块依赖,参考ruoyi-admin,然后根据需求，看是否要引用生成代码模块等等。
```XML
<dependency>
    <groupId>org.dromara.boot</groupId>
    <artifactId>ruoyi-boot-launcher-admin</artifactId>
</dependency>
```

5.前台管理启动模块依赖,参考ruoyi-front，类似商城前台项目
```XML
<dependency>
    <groupId>org.dromara.boot</groupId>
    <artifactId>ruoyi-boot-launcher-front</artifactId>
</dependency>
```
## 🎯 重构成效概览
RuoYi-Vue-Plus重构，技术架构更稳健，赋能企业开发，多维覆盖开发者群体，满足不同开发者需求，优化开发体验，技术栈迭代无忧升级静默，技术基座与业务分离，奠定长远发展基石，支撑高质量工程实践。迈向专业化、现代化，创造更大价值。

## 🍕支持作者
如果你在使用中或使用过后，觉得框架不错，希望你能帮我点个 ⭐ Star，这将是对我极大的鼓励与支持。


## 🔀分支说明

- 🚩master 

同步[RuoYi-Vue-Plus](https://gitee.com/dromara/RuoYi-Vue-Plus)5.x分支，正式稳定版本，具体版本升级内容看更新标签

- 🧐dev

同步[RuoYi-Vue-Plus](https://gitee.com/dromara/RuoYi-Vue-Plus)dev分支，开发的分支（代码可能随时会推，不保证运行和使用）

- 📌ruoyi-vue v3.8.8

3.x分支，代码同步更新若依官方分离版本[RuoYi-Vue](https://gitee.com/dromara/RuoYi-Vue-Plus)

- 📦️ruoyi-vue-plus V4.8.2

4.x分支，同步[RuoYi-Vue-Plus](https://gitee.com/dromara/RuoYi-Vue-Plus)4.X分支，目前已停止新增功能，只限于bug的维护，可以平滑过渡至5.x版本

## 🖥源码结构

```
ruoyi-boot-plus [ruoyi-boot-parent]
├─ruoyi-applications -- 应用模块
│  ├─ruoyi-admin  -- 后台管理应用
│  └─ruoyi-front  -- 前台应用
├─ruoyi-boot  -- 核心模块
├─ruoyi-data-services  -- 数据服务模块
├─ruoyi-dependencies -- 父级依赖
│  ├─ruoyi-boot-dependencies  -- starters及集成其他模块依赖
│  │  └─ruoyi-boot-starter-parent  -- 继承ruoyi-boot-dependencies及RuoYi-Vue-Plus环境插件等基础配置
│  ├─ruoyi-build-dependencies  -- 基础构建依赖
│  ├─ruoyi-services-dependencies  -- 服务模块依赖
│  ├─ruoyi-rest-dependencies  -- 接口模块
│  ├─ruoyi-tools-dependencies  -- 工具模块依赖
│  └─ruoyi-extensions-dependencies  -- 扩展模块依赖
├─ruoyi-extensions -- 扩展模块
│  ├─ruoyi-monitor-admin  -- 监控
│  └─ruoyi-snailjob-server  -- snailjob
├─ruoyi-launchers -- 启动器模块
│  ├─ruoyi-boot-launchers  -- 单体启动器
│  │  ├─ruoyi-boot-launcher-admin  --后台管理单体启动器-
│  │  └─ruoyi-boot-launcher-front  --前台单体启动
│  └─ruoyi-cloud-launchers  -- 微服务启动器
├─ruoyi-rest -- 控制层/接口模块
│  ├─ruoyi-admin-rest  -- 后台管理接口
│  │  ├─ruoyi-admin-rest-auth  --授权接口
│  │  ├─ruoyi-admin-rest-demo  --demo接口
│  │  ├─ruoyi-admin-rest-generator  --代码生成器接口
│  │  ├─ruoyi-admin-rest-monitor  --监控接口
│  │  ├─ruoyi-admin-rest-oss  --oss接口模块
│  │  ├─ruoyi-admin-rest-system  --系统接口
│  │  └─ruoyi-admin-rest-workflow  --工作流接口
│  └─ruoyi-public-rest  -- 公共接口模块
│     └─ruoyi-public-rest-captcha  --验证码接口
├─ruoyi-services -- 服务模块
│  ├─ruoyi-demo  -- demo
│  ├─ruoyi-generator  -- 代码生成器
│  ├─ruoyi-job  -- 任务调度器
│  ├─ruoyi-system  -- 系统
│  └─ruoyi-workflow  -- 工作流
├─ruoyi-starters -- 控制层/接口模块
│  ├─ruoyi-boot-starters  -- boot-starters                  
│  │  ├─ruoyi-boot-starter  --核心模块依赖及自动化配置
│  │  ├─ruoyi-boot-starter-doc  --demo接口
│  │  ├─ruoyi-boot-starter-encrypt  --encrypt
│  │  ├─ruoyi-boot-starter-excel  --excel
│  │  ├─ruoyi-boot-starter-idempotent  --idempotent
│  │  ├─ruoyi-boot-starter-job  --job
│  │  ├─ruoyi-boot-starter-json  --json
│  │  ├─ruoyi-boot-starter-log  --log
│  │  ├─ruoyi-boot-starter-mail  --mail
│  │  ├─ruoyi-boot-starter-mybatis  --mybatis
│  │  ├─ruoyi-boot-starter-oss  --oss
│  │  ├─ruoyi-boot-starter-ratelimiter  --ratelimiter
│  │  ├─ruoyi-boot-starter-redis  --redis
│  │  ├─ruoyi-boot-starter-satoken  --satoken
│  │  ├─ruoyi-boot-starter-security  --security
│  │  ├─ruoyi-boot-starter-sensitive  --sensitive
│  │  ├─ruoyi-boot-starter-sms  --sms
│  │  ├─ruoyi-boot-starter-social  --social
│  │  ├─ruoyi-boot-starter-tenant  --tenant
│  │  ├─ruoyi-boot-starter-translation  --translation
│  │  ├─ruoyi-boot-starter-web  --web
│  │  ├─ruoyi-boot-starter-websocket  --websocket
│  │  └─ruoyi-spring-boot-starter  -基础starter依赖引用
│  └─ruoyi-cloud-starters  -- 微服务starter模块
└─ruoyi-tools -- 工具模块

```
