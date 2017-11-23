基于EventBus 原项目 v3.0.0 扩展

扩展功能有：
  给@Subscribe注解添加id属性，可以通过发送id来更方便区分接收者

## Usage
**Step 1**. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
**Step 2**. Add the dependency
```
dependencies {
    implementation 'com.github.lizhengxian1991.eventbusplus:eventbus:1.0.0'
    annotationProcessor 'com.github.lizhengxian1991.eventbusplus:eventbus-annotation-processor:1.0.0'
}
```
**Step 2**. Set the IndexPackage and enable includeCompileClasspath
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