# RuoYi-Boot-Plus（RuoYi-Vue-Plus 重构版）
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
# 🍕支持作者
如果你在使用中或使用过后，觉得框架不错，希望你能帮我点个 ⭐ Star，这将是对我极大的鼓励与支持。
## RuoYi-Boot-Plus：重构典范，打造精炼技术基座的深度解析
> RuoYi-Vue-Plus原项目地址: [传送门](https://gitee.com/dromara/RuoYi-Vue-Plus)
> RuoYi-Vue-Plus原项目文档地址: [plus-doc](https://plus-doc.dromara.org)
>
## 📝平台简介：项目结构重构目标
RuoYi-Vue-Plus 项目的重构目标是提升其可维护性、可扩展性和专业度，使其更加贴合现代软件工程的优秀实践。通过深度重构，项目被重塑为一个纯粹的技术基座，与业务代码完全分离，确保技术栈的独立升级和管理，同时不影响业务逻辑的正常运行。

## ✨特性
* 🧱 模块化设计：RuoYi-Vue-Plus 的核心功能被重新组织为多个独立模块，每个模块聚焦于特定的业务领域或技术层面，确保模块间的高内聚和低耦合。
* ♿️ 依赖管理精细化：利用 Maven 的依赖管理工具，精确控制模块间的依赖关系，避免引入不必要的依赖，从而提高构建速度和项目整体的稳定性。
* 🍃 明确边界：重构后的 RuoYi-Vue-Plus 明确划分了技术基座与业务代码的边界。技术基座提供统一的基础设施、通用服务和工具类，而业务代码则专注于具体的业务逻辑实现，二者互不干扰。
* 🚀 平滑升级，业务无感知：技术基座同步更新官方代码、迭代与优化，确保业务逻辑的运行如初、漏洞与bug修复，开发者无需担忧技术更新带来的业务中断或数据风险。
* ♻️ 共享RuoYi-Vue-Plus的后端功能：RuoYi-Boot-Plus 继承并拓展了RuoYi-Vue-Plus的所有后端功能，通过高度封装的组件，实现了功能的可插拔性，用户可根据项目需求灵活选择，按需启用。
* 🏗️ 直接使用RuoYi-Vue-Plus的前端访问：与RuoYi-Vue-Plus的前端无缝对接，无需额外配置，即可享受一致的用户体验和功能，确保了前端与后端的完美协调。
* 🎡 独立开发与测试：业务代码可以独立于技术基座进行开发和测试，这意味着技术栈的升级或变更不会直接影响业务逻辑的运行，降低了业务中断的风险。
* 🦺 简化集成流程：当业务逻辑发生变化时，只需在业务代码层进行修改，无需触及技术基座，这简化了集成测试和持续交付流程，提高了开发效率。

## 🙋适用群体：满足多元需求的开发者
* 👽️ 快速开发人群：RuoYi-Boot-Plus 提供了开箱即用的开发环境，通过简单的注解与配置，即可快速搭建起功能完备的应用框架，助力开发者迅速投入业务逻辑的开发。
* 🙈 无需改动RuoYi-Vue-Plus源代码的人群：对于希望利用RuoYi-Vue-Plus强大功能，但不希望或无法直接修改源代码的开发者，RuoYi-Boot-Plus 提供了理想的解决方案，通过配置而非编码，实现功能的定制。
* 🧐 仅需调整RuoYi-Vue-Plus配置项即可满足开发的人群：通过配置项的微调，即可满足大部分开发需求，无需深入底层代码，降低了学习和使用的门槛，让开发者能够专注于业务逻辑的创新。

## 📲功能列表
- [X] 支持类似spring boot使用方式
- [ ] 支持单体/微服务自由切换
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
2.实际中有时候不想以ruoyi-boot-vue作为父类，可以换另外一种方式添加ruoyi-boot-vue依赖，此方式定义了若干个rouyi-boot-vue所有模块坐标版本号（依赖管理，而非依赖），以达到减少依赖冲突的目的
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

## ✏️结语
通过重构，RuoYi-Vue-Plus 不仅在技术架构上变得更加成熟和稳健，还为开发者提供了更高效、便捷的开发体验。技术基座与业务代码的彻底分离，为项目的长期发展奠定了坚实的基础，同时也为追求高质量软件工程实践的团队提供了有力的支持。这标志着 RuoYi-Vue-Plus 正朝着更专业化、更现代化的方向迈进，为开发者和企业带来了更大的价值。

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
