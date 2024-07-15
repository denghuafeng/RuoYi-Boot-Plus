# RuoYi-Boot-Plus
<div style="height: 10px; clear: both;"></div>

- - -
## 平台简介

[![码云Gitee](https://gitee.com/denghuafeng/ruoyi-boot-plus/badge/star.svg?theme=blue)](https://gitee.com/dromara/RuoYi-Vue-Plus)
[![GitHub](https://img.shields.io/github/stars/denghuafeng/RuoYi-Boot-Plus.svg?style=social&label=Stars)](https://github.com/dromara/RuoYi-Vue-Plus)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://gitee.com/dromara/RuoYi-Vue-Plus/blob/master/LICENSE)
[![使用IntelliJ IDEA开发维护](https://img.shields.io/badge/IntelliJ%20IDEA-提供支持-blue.svg)](https://www.jetbrains.com/?from=RuoYi-Vue-Plus)
<br>
[![RuoYi-Vue-Plus](https://img.shields.io/badge/RuoYi_Vue_Plus-5.2.0-success.svg)](https://gitee.com/dromara/RuoYi-Vue-Plus)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-blue.svg)]()
[![JDK-17](https://img.shields.io/badge/JDK-17-green.svg)]()
[![JDK-21](https://img.shields.io/badge/JDK-21-green.svg)]()

## RuoYi-Boot-Plus（RuoYi-Vue-Plus 重构）：重构典范，打造精炼技术基座的深度解析
> RuoYi-Vue-Plus原项目地址: [传送门](https://gitee.com/dromara/RuoYi-Vue-Plus)
> RuoYi-Vue-Plus原项目文档地址: [plus-doc](https://plus-doc.dromara.org)
> 
### 项目结构重构目标
RuoYi-Vue-Plus 项目的重构目标是提升其可维护性、可扩展性和专业度，使其更加贴合现代软件工程的优秀实践。通过深度重构，项目被重塑为一个纯粹的技术基座，与业务代码完全分离，确保技术栈的独立升级和管理，同时不影响业务逻辑的正常运行。

#### 技术基座模块化与依赖管理
* 模块化设计：RuoYi-Vue-Plus 的核心功能被重新组织为多个独立模块，如 ruoyi-core、ruoyi-security、ruoyi-utils 等，每个模块聚焦于特定的业务领域或技术层面，确保模块间的高内聚和低耦合。
* 依赖管理精细化：利用 Maven 或 Gradle 的依赖管理工具，精确控制模块间的依赖关系，避免引入不必要的依赖，从而提高构建速度和项目整体的稳定性。
* 插件化设计：借鉴 Spring Boot 的自动配置机制，设计了一系列可插拔的组件，用户可以根据项目需求灵活选择组件，极大地提高了框架的灵活性和适应性。

#### 技术基座与业务代码分离
* 明确边界：重构后的 RuoYi-Vue-Plus 明确划分了技术基座与业务代码的边界。技术基座提供统一的基础设施、通用服务和工具类，而业务代码则专注于具体的业务逻辑实现，二者互不干扰。
* 独立开发与测试：业务代码可以独立于技术基座进行开发和测试，这意味着技术栈的升级或变更不会直接影响业务逻辑的运行，降低了业务中断的风险。
* 简化集成流程：当业务逻辑发生变化时，只需在业务代码层进行修改，无需触及技术基座，这简化了集成测试和持续交付流程，提高了开发效率。

####  🫧无缝对接与卓越体验：快速开发，业务升级无感知
* 平滑升级，业务无感知：技术基座的迭代与优化，确保业务逻辑的运行如初，开发者无需担忧技术更新带来的业务中断或数据风险。
* 共享RuoYi-Vue-Plus的后端功能：RuoYi-Boot-Plus 继承并拓展了RuoYi-Vue-Plus的所有后端功能，通过高度封装的组件，实现了功能的可插拔性，用户可根据项目需求灵活选择，按需启用。
* 直接使用RuoYi-Vue-Plus的前端访问：与RuoYi-Vue-Plus的前端无缝对接，无需额外配置，即可享受一致的用户体验和功能，确保了前端与后端的完美协调。

#### 适用群体：满足多元需求的开发者
* 快速开发人群：RuoYi-Boot-Plus 提供了开箱即用的开发环境，通过简单的注解与配置，即可快速搭建起功能完备的应用框架，助力开发者迅速投入业务逻辑的开发。
* 无需改动RuoYi-Vue-Plus源代码的人群：对于希望利用RuoYi-Vue-Plus强大功能，但不希望或无法直接修改源代码的开发者，RuoYi-Boot-Plus 提供了理想的解决方案，通过配置而非编码，实现功能的定制。
* 仅需调整RuoYi-Vue-Plus配置项即可满足开发的人群：通过配置项的微调，即可满足大部分开发需求，无需深入底层代码，降低了学习和使用的门槛，让开发者能够专注于业务逻辑的创新。

#### 使用方式与结语
重构后的 RuoYi-Vue-Plus 采用了类似于 Spring Boot 的使用方式，开发者只需在项目中引入相应的依赖，即可快速启动开发工作。这种设计降低了学习和使用的门槛，使得项目能够更好地适应未来业务和技术的变化。

通过重构，RuoYi-Vue-Plus 不仅在技术架构上变得更加成熟和稳健，还为开发者提供了更高效、便捷的开发体验。技术基座与业务代码的彻底分离，为项目的长期发展奠定了坚实的基础，同时也为追求高质量软件工程实践的团队提供了有力的支持。这标志着 RuoYi-Vue-Plus 正朝着更专业化、更现代化的方向迈进，为开发者和企业带来了更大的价值。
