# AucFrame 之简介及学习

## 简介
首先，什么是 AUC 呢？在 QQ 群里的小伙伴们应该知道这个词，或者知道我的工具类的也应该能猜到是什么，没错，AUC 全称就是 [AndroidUtilCode](https://github.com/Blankj/AndroidUtilCode)，这个项目的生命周期已长达 3 年之久，star 数目前是 24k+，应该算是比较成功的一个开源项目了，基于它，我打造了一套自认为还不错的组件化架构 ———— **[AucFrame](https://github.com/Blankj/AucFrameTemplate)**，其优点如下所示：

* 统一管理项目中的 Gradle
* 自由选择调试模块
* 自由选择需要的包
* 自由切换源码和远程仓库
* 业务模块互不依赖，完全解偶
* 模块间通讯一学就会
* 比 EventBus 更高效的模块内通讯

接下来就让我们来一一揭开他的神秘面纱。

## 预览
架构么，肯定要开门见山，直接上图，不然说的再天花乱坠也无济于事，也就是所谓的 `no picture you say a j8`，AucFrame 的架构如下所示：
![AucFrame](http://ww1.sinaimg.cn/large/b75b8776ly1g5byaor9aej20s10kl0uo.jpg)

其项目中具体的工程结构如下所示：
```
└── AndroidUtilCode
    ├── feature
    │   ├── launcher
    │   │   └── app
    │   ├── main
    │   │   ├── app
    │   │   └── pkg
    │   ├── mock
    │   ├── subutil
    │   │   ├── app
    │   │   ├── export
    │   │   └── pkg
    │   └── utilcode
    │       ├── app
    │       ├── export
    │       └── pkg
    └── lib
        ├── base
        ├── common
        ├── subutil
        └── utilcode
```

基于此，我们可以设计出如下通用架构：

![AucFrameGeneral](http://ww1.sinaimg.cn/large/b75b8776ly1g5byaxfsbuj20s10kptam.jpg)

其工程结构如下所示：
```
└── ProjectName
    ├── feature
    │   ├── launcher
    │   │   └── app
    │   ├── feature0
    │   │   ├── app
    │   │   ├── export
    │   │   └── pkg
    │   ├── feature1
    │   │   ├── app
    │   │   ├── export
    │   │   └── pkg
    │   └── mock
    └── lib
        ├── base
        ├── common
        ├── rxjava
        └── utilcode
```

对着架构图也许你也能撸出来一个，但其优雅程度肯定不及我撸的，具体如何优雅？最直接的就是 feature 下的所有模块的 `build.gradle` 都是空空如也，没有一行代码，甚至删了也无所谓，也就不需要你写哪个模块具体需要依赖什么，但确切的依赖关系，就是架构中所示，开发者可自由配置想要运行哪个 `app`，自由配置你所需要的 `pkg`，做到各业务可完全独立运行，下面就让我带领你如何优雅地撸出它来。


## 学习
该教程适合期望能优化自己工程架构的中高级开发人员，新手的话建议把 Gradle 摸清楚了再来学习即可，为了你更好更全面地了解及掌握 AucFrame，在这里我会一步步地搭建一个模板工程：[AucFrameTemplate](https://github.com/Blankj/AucFrameTemplate)，并教你如何搭建出该架构及背后的原理，方便你可以运用到你的项目中，或者在下个项目中快速使用，相关课程列表如下所示：

0. AucFrame 之简介及学习（就是本节）
1. AucFrame 之让你的 Gradle 更智能
2. AucFrame 之统一管理 Gradle
3. AucFrame 之解放 Gradle
4. AucFrame 之模块间通信
5. AucFrame 之模块内通信


欢迎加入我的知识星球「**[基你太美](https://t.zsxq.com/FmeqfYF)**」，我会在星球中分享 [AucFrame](https://blankj.com/2019/07/22/auc-frame/) 框架、大厂面经、[AndroidUtilCode](https://github.com/Blankj/AndroidUtilCode) 更详尽的说明...一切我所了解的知识，你可以通过支付进入我的星球「**[基你太美](https://t.zsxq.com/FmeqfYF)**」进行体验，加入后优先观看星球中精华的部分，如果觉得星球的内容对自身没有收益，你可以自行申请退款退出星球，也没必要加我好友；**如果你已确定要留在我的星球，可以通过扫描如下二维码（备注：基你太美+你的星球昵称）加我个人微信，方便我后续拉你进群(PS：进得越早价格越便宜)。**

![我的二维码](https://raw.githubusercontent.com/Blankj/AndroidUtilCode/master/art/wechat.png)