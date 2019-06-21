### SDK更新日志

**1.8.2 `2019-06-21`**

- 业务层日志输出保留500条（原先1000条）

[1.8.2下载地址](https://cosmos.momocdn.com/cosmospackage/FE/77/FE77267A-B9F0-A762-0B20-6FBB63DA904A20190621.aar)

**1.8.1 `2019-06-10`**

- 修复Native崩溃在获取java线程堆栈的时候失败，导致部分native崩溃无法采集到的bug

[1.8.1下载地址](https://cosmos.momocdn.com/cosmospackage/A8/7C/A87CD096-7DA6-4CED-33DE-21D2E176DC6420190610.zip)

**1.7.7 `2019-05-21`**

- 修复StackOverFlow崩溃，堆栈太长导致后台无法打开的bug

[1.7.7下载地址](https://cosmos.momocdn.com/cosmospackage/A5/2D/A52D5DD0-ED8D-B794-4CB8-C49076E46F9E20190521.zip)

**1.7.5 `2019-05-15`**

- 修复崩溃采集未自动打开的bug

[1.7.5下载地址](https://cosmos.momocdn.com/cosmospackage/6D/A8/6DA87BFB-C4BD-5DE6-32E3-32C17C2A3EDF20190517.zip)

**1.7.4 `2019-05-15`**

- 修复主动上报异常，name和reason一样的bug

[1.7.4下载地址](https://cosmos.momocdn.com/cosmospackage/C2/9E/C29E652C-91C0-39BB-0DAB-B0E91AE1404720190515.zip)

**1.7.3 `2019-05-10`**

- 修复主动上报异常，后台数据不对的bug

[1.7.3下载地址](https://cosmos.momocdn.com/cosmospackage/79/2B/792BC9C4-B97D-A5D6-95F0-5F85D289D81B20190510.zip)

**1.7.2 `2019-04-24`**

- 支持打开/关闭Native崩溃其他线程堆栈信息采集（默认打开）

[1.7.2下载地址](https://cosmos.momocdn.com/cosmospackage/AB/F8/ABF89451-5EF2-1D0B-69B3-E0F6086C4D4B20190424.aar)

**1.7.1 `2019-04-18`**

- 添加防劫持功能

[1.7.1下载地址](https://cosmos.momocdn.com/cosmospackage/B4/71/B471DB0B-FB58-3A59-D6AF-7117F44D5CC620190422.aar)

**1.6.5 `2019-04-17`**

- 添加主动上报异常功能

[1.6.5下载地址](https://cosmos.momocdn.com/cosmospackage/29/76/29765FD0-E8B5-4FEC-E214-E9DC2C78E51220190422.aar)

**1.6.4 `2019-04-10`**

- 发布首个正式版本

[1.6.4下载地址](https://cosmos.momocdn.com/cosmospackage/E5/64/E5645E91-C5A3-64F6-51B6-FC26556AFF0520190422.aar)

### NDK更新日志

**1.1.1 `2019-04-24`**

- 优化Native崩溃堆栈文件大小，减少流量消耗
- 支持关闭Native其他线程堆栈信息采集，减少流量消耗（默认打开）

[1.1.1下载地址](https://cosmos.momocdn.com/cosmospackage/A9/5C/A95C2181-8E81-48B8-AD6B-F824CC47D95920190424.aar)

**1.1.0 `2019-04-3`**

- 首次发布Rifle NDK，支持采集Native崩溃

[1.1.0下载地址](https://cosmos.momocdn.com/cosmospackage/B0/B1/B0B1A094-C1A2-D7C4-EE7D-F8E7C730105020190422.aar)

### Gradle插件更新日志

**1.4.0 `2019-05-30`**

- 修复插件放置在android配置之前，无法正常提交mapping的bug

[1.4.0下载地址](https://cosmos.momocdn.com/cosmospackage/FA/12/FA12BFC2-32D7-D4AF-026D-D17CD1779D1D20190530.zip)

**1.3.9 `2019-05-23`**

- 兼容Gradle 3.4.0版本 assets 路径
- 兼容productFlavors多渠道打包

[1.3.9下载地址](https://cosmos.momocdn.com/cosmospackage/BA/08/BA08522E-FE76-A76C-FABF-7644C89DB24F20190523.zip)

**1.3.8 `2019-05-08`**

- 兼容Gradle 3.4.0版本
- 去除打包时，未找到mapping直接终止打包的逻辑

[1.3.8下载地址](https://cosmos.momocdn.com/cosmospackage/59/20/5920956B-F6E1-BF9D-1E3F-A1EE9A11B05E20190508.zip)

**1.3.6 `2019-04-19`**

- 限制插件必须传入`versionName`, `appId`,`appKey`三个参数

[1.3.6下载地址](https://cosmos.momocdn.com/cosmospackage/AE/30/AE30186E-726D-9D4A-75AC-02053C21D14520190422.jar)

**1.3.5 `2019-04-3`**

- 首次提交Gradle插件，支持提交mapping和带符号表so文件

[1.3.5下载地址](https://cosmos.momocdn.com/cosmospackage/01/92/0192BFF5-AB29-FA44-8F65-1371D77D7B1120190422.jar)


### 上传带符号表SO脚本更新日志

[提交带符号表脚本使用指南](../jie-ru-zhi-nan.md#%E4%BD%BF%E7%94%A8%E4%B8%8A%E4%BC%A0%E7%AC%A6%E5%8F%B7so%E8%84%9A%E6%9C%AC)

**`2019-05-8`**
- 内容：修复提交失败问题

[2019-05-8版本下载链接](https://cosmos.momocdn.com/cosmospackage/CE/D5/CED529C9-A6A4-A069-EDE1-0DD24AA3989A20190508.zip)

**`2019-04-10`**
- 内容：修复提交失败问题

[2019-04-10版本下载链接](https://cosmos.momocdn.com/cosmosdocs/00/22/0022A709-EC52-E808-5BA7-169FE4ACA33520190410.zip)


