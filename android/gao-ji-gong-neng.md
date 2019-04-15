# Android SDK 高级配置

---

## 更多的配置选项和行为控制
在初始化Rifle的时候，可以通过`UserStrategy`类来设置更多选项

```
Rifle.init(context, "后台申请的APPID", false, strategy);
```

### APP版本名称，版本号，渠道等
以下选项为可选项，根据自己应用需要设置

```
UserStrategy userStrategy = new UserStrategy.Builder()
                .versionName()    // 版本名称
                .versionCode()    // 版本号
                .channel()        // 渠道号
                .enableJavaCollector(true)   // 打开/关闭Java Crash收集
                .enableNativeCollector(true) // 打开/关闭Native Crash收集（前提是集成NDK）
                .libraryLoader()   // 设置SO库加载实现对象（比如ReLinker对低端机的支持）
                .consumeCrash(false) // 是否消费Crash，消费之后，其他Crash收集平台将无法采集到Crash，默认为false
                .build();
```

### 设置用户标识
通过该方法设置用户标识，应该为账号系统中的用户名等。

```
Rifle.setUserId(userId);
```

### 事件回调
Rifle在Crash发生的时候会回调给业务层，可以通过如下方式监听：

```
UserStrategy userStrategy = new UserStrategy.Builder()
        .crashCallback(new CrashCallback() {
            
            @Override
            public void onCrashStart(CrashType crashType, String errorStack) {
                super.onCrashStart(crashType, errorStack);
                // Rifle捕获到Crash时（开始处理Crash），请不要在此方法中执行耗时操作
            }

        })
        .build();
```

### 设置自定义参数
```
Rifle.putUserKeyValue("key", "value");
```
这部分数据在Crash发生后会提交到后台，在Crash详情页能看到这部分数据
> 存储规则，最多只能有50个，超过则丢弃，每个key大小限制100个字符长度，value大小限制为500个字符长度；

### 输出日志
为了方便问题排查，可以输出日志（流程，页面跳转信息等），在Crash提交的时候一并带到服务器，在Crash详情页能够看到这部分数据

```
RifleLog.d(tag, msg);
RifleLog.i(tag, msg);
RifleLog.w(tag, msg);
RifleLog.e(tag, msg);
```

### 主动上报异常
主动上报异常功能，是为了方便业务排查问题而设计的

对Android开发来说，可以通过try catch捕获异常，如果认为此异常为不正常现象，可以在catch代码块中上报此异常信息：

```
Rifle.reportException(throwable);
```

当然如果你知道异常发生的线程信息，可以用以下方法上报：

```
Rifle.reportException(throwable, happenThread);
```

如果异常信息不是一个`Throwable`对象时，业务可以自定义一个异常信息，来上报：

```
Rifle.reportException(rifleException);
```
`RifleException`类，可以定义以下几个属性

| 属性名称 | 说明 | 类型 |
| ------ | ------ | ------ |
| category | 异常分类 | RifleExceptionType |
| name| 异常名称 |string |
| reason| 异常原因 |string |
| callStack| 调用栈 | string[] |

业务层自行定义异常信息，`RifleExceptionType`包含如下几种类型：

```
public enum RifleExceptionType {
    JAVA(1),
    C_SHARP(2),
    JS(3),
    LUA(4),
    OTHER(5);
}
```

### 设置日志输出实现
Rifle默认通过Android的`Log`类来讲日志输出到控制台，业务可以自行对日志的输出做实现：

```
Rifle.setLogger(new ICrashLog() {
    @Override
    public void v(String tag, String msg) {
        
    }

    @Override
    public void d(String tag, String msg) {

    }

    @Override
    public void i(String tag, String msg) {

    }

    @Override
    public void w(String tag, String msg) {

    }

    @Override
    public void e(String tag, String msg) {

    }

    @Override
    public void f(String tag, String msg) {

    }

    @Override
    public void printError(String tag, Throwable throwable) {

    }
});
```



