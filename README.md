基于EventBus 原项目 v3.0.0 扩展

扩展功能有：
  给@Subscribe注解添加id属性，可以通过发送id来更方便区分接收者

## 使用
**1**. 添加JitPack仓库链接到根项目的build.gradle:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
**2**. 在module的build.gradle中添加依赖
```
dependencies {
    implementation 'com.github.lizhengxian1991.eventbusplus:eventbus:1.0.0'
    annotationProcessor 'com.github.lizhengxian1991.eventbusplus:eventbus-annotation-processor:1.0.0'
}
```
**3**. 在module的build.gradle中增加Processor参数，指定生成的Eventbus的索引类名
```
android {
    ...
    defaultConfig {
        ...
        javaCompileOptions {
            annotationProcessorOptions {
                arguments = [ eventBusIndex : '<Your index class name>' ]
            }
        }
    }
}
```
**4**. 在Application的onCreate方法中初始化索引（将<Your index class name>替换为3中定义的类）
```
EventBus.builder().addIndex(new <Your index class name>()).installDefaultEventBus();
```
