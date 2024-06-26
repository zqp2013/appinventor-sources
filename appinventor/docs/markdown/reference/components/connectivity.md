---
layout: documentation
title: 通信连接组件
description: 通信连接组件参考文档：包括Activity启动器、蓝牙客户端、蓝牙服务器、串口通信器、Web客户端、SimpleBase64拓展、MQTT拓展、ClientSocket拓展。
---

* TOC
{:toc}

[&laquo; 返回首页](index.html)
# <i class="mdi mdi-access-point"></i>  通信连接组件

目录：

1. ![icon](images/activitystarter.png)  [Activity启动器](#ActivityStarter)
1. ![icon](images/bluetoothclient.png)  [蓝牙客户端](#BluetoothClient)
1. ![icon](images/bluetoothserver.png)  [蓝牙服务器](#BluetoothServer)
1. ![icon](images/serial.png)  [串口通信器](#Serial)
1. ![icon](images/web.png)  [Web客户端](#Web)
  * [SimpleBase64 *拓展：图像Base64编解码传输*](#SimpleBase64)
  * [KIO4_Base64 *拓展：更强大的图像Base64编解码工具，解码后的图像可写入到文件*](../extensions/KIO4_Base64.html)
1. <img src="../extensions/images/mqtt_icon.png" style="width:16px;margin:-4px 5px 0 0">[MQTT *拓展：轻量级物联网传输协议*](#Mqtt)
1. [Socket *拓展：TCP/IP传输协议*](#Socket)

## ![icon](images/activitystarter.png)  Activity启动器  {#ActivityStarter}

使用`启动Activity`方法启动一个Activity（活动）的组件。

  可启动的Activity包括：
  * 为 Android 应用启动另一个 App Inventor。 首先通过下载源代码并使用文件资源管理器或解压缩utility，找到一个名为“youngandroidproject/project.properties”的文件，找出另一个程序的的类。 
  
    文件的第一行将开始使用“main=”并后跟类名。
    例如：`main=com.gmail.Bitdiddle.Ben.HelloPurr.Screen1`（第一个组件表明它是由 Ben.Bitdiddle@gmail.com 创建）要让您的 `Activity启动器` 启动此应用程序，设置以下属性：
    * `ActivityPackage` 到类名，删除最后一个组件（例如： `com.gmail.Bitdiddle.Ben.HelloPurr`)
    * `ActivityClass` 到整个类名（例如：`com.gmail.Bitdiddle.Ben.HelloPurr.Screen1`)
  * 通过设置以下属性启动相机应用程序：
    * `Action`: `android.intent.action.MAIN`
    * `ActivityPackage`: `com.android.camera`
    * `ActivityClass`: `com.android.camera.Camera`
  * 执行网络搜索。 假设您要搜索的词是“vampire”（您可以随意替换自己的选择），将属性设置为：
    * `Action`: `android.intent.action.WEB_SEARCH`
    * `ExtraKey`: `query`
    * `ExtraValue`: `vampire`
    * `ActivityPackage`: `com.google.android.providers.enhancedgooglesearch`
    * `ActivityClass`: `com.google.android.providers.enhancedgooglesearch.Launcher`
  * 打开浏览器到指定的网页。 假设您要访问的页面是“www.fun123.cn”（您可以随意替换自己的选择），将属性设置为：
    * `Action`: `android.intent.action.VIEW`
    * `DataUri`: `http://www.fun123.cn`
    * 调用第三方地图也可以使用这个启动器：
    * 调用高德地图的uri参考地址：[https://lbs.amap.com/api/uri-api/guide/mobile-web/point/#point-on-lnglat](https://lbs.amap.com/api/uri-api/guide/mobile-web/point/#point-on-lnglat)
    * 调用百度地图的uri参考地址：[https://lbsyun.baidu.com/index.php?title=uri/api/web](https://lbsyun.baidu.com/index.php?title=uri/api/web)
  * 打开系统照相机（比[照相机](media.html#Camera)组件打开的界面会丰富一些）
    * `Action`: `android.media.action.STILL_IMAGE_CAMERA`
  * 可选取多个文件（图片、音频、视频等）：
    * `Action`: `android.intent.action.GET_CONTENT`

  更多有关Activity启动器使用技巧请查看[《Activity启动器如何查看并启动其他App》](guide/ActivityStarter.html)。

### 属性  {#ActivityStarter-Properties}

{:.properties}

{:id="ActivityStarter.Action" .text} *Action*
: 指定将用于启动Activity活动的操作。

{:id="ActivityStarter.ActivityClass" .text} *Activity类名*
: 指定将启动的特定组件的Class类部分。

{:id="ActivityStarter.ActivityPackage" .text} *Activity包名*
: 指定将启动的特定组件的包部分。

{:id="ActivityStarter.DataType" .text} *数据类型*
: 指定要传递给Activity活动的 MIME 类型。

{:id="ActivityStarter.DataUri" .text} *数据URI*
: 指定将用于启动Activity活动的数据URI。

{:id="ActivityStarter.ExtraKey" .text} *ExtraKey*
: 指定将传递给Activity活动的额外键。（已过时，应使用 Extras）

{:id="ActivityStarter.ExtraValue" .text} *ExtraValue*
: 指定将传递给Activity活动的额外值。（已过时，应使用 Extras）

{:id="ActivityStarter.Extras" .list .bo} *Extras*
: 返回将作为额外数据传递给Activity活动的键值对列表。

{:id="ActivityStarter.Result" .text .ro .bo} *结果*
: 返回Activity活动的结果。

{:id="ActivityStarter.ResultName" .text} *结果名称*
: 指定一个名称，用于从Activity活动中获取结果。

{:id="ActivityStarter.ResultType" .text .ro .bo} *结果类型*
: 从Activity活动中返回的结果 MIME 类型。

{:id="ActivityStarter.ResultUri" .text .ro .bo} *结果URI地址*
: 从Activity活动中返回的结果URI。

### 事件  {#ActivityStarter-Events}

{:.events}

{:id="ActivityStarter.ActivityCanceled"} 取消活动调用()
: 如果此 `Activity启动器` 因为Activity活动被取消而返回，则引发该事件。

{:id="ActivityStarter.AfterActivity"} 活动调用结束(*result*{:.text})
: 此 `Activity启动器` 返回后触发的事件。

### 方法  {#ActivityStarter-Methods}

{:.methods}

{:id="ActivityStarter.ResolveActivity" class="method returns text"} <i/> 处理活动信息()
: 返回与此 `Activity启动器` 对应的Activity活动名称，如果找不到相应的Activity活动，则为空字符串。

{:id="ActivityStarter.StartActivity" class="method"} <i/> 启动活动对象()
: 启动这个 `Activity启动器` 对应的Activity活动。

## ![icon](images/bluetoothclient.png)  蓝牙客户端  {#BluetoothClient}

使用 `蓝牙客户端` 通过蓝牙将您的设备连接到其他设备。这个组件使用串行端口配置文件 (SPP) 进行通信。 

如果您有兴趣使用低能耗蓝牙，请查看《[App Inventor 2 低功耗蓝牙(BLE) 硬件接入、数据通信及IO控制](../iot/ble.html)》。

如果您希望了解经典蓝牙与BLE之间的区别，请查看《[低功耗蓝牙(BLE) 和 经典蓝牙(SPP) 的区别](../iot/ble_spp.html)》。

### 属性  {#BluetoothClient-Properties}

{:.properties}

{:id="BluetoothClient.AddressesAndNames" .list .ro .bo} *地址及名称*
: 返回配对的蓝牙设备列表，返回的列表每个元素都是一个字符串，由设备地址、一个空格和设备的名称组成。

  **蓝牙设备列表为空？**

  {:.vip}
  你可能没有开启AI伴侣或编译后App的发现蓝牙权限，这里以AI伴侣为例，勾上即可：<br/>
  ![开启发现蓝牙设备的权限](images/开启发现蓝牙设备的权限.png)

  **需要过滤蓝牙设备列表？**

  {:.vip}
  请参考[《App Inventor 2 过滤蓝牙设备列表》](../creative/filter_devicelist.html)。

{:id="BluetoothClient.Available" .boolean .ro .bo} *可用状态*
: 如果设备上有蓝牙功能，则返回`真`{:.logic.block}，否则返回`假`{:.logic.block}。

{:id="BluetoothClient.CharacterEncoding" .text} *字符编码*
: 返回发送和接收文本时使用的字符集编码（如GBK，UTF-8）。

{:id="BluetoothClient.DelimiterByte" .number} *分隔符字节码*
: 调用 ReceiveText、ReceiveSignedBytes 或 ReceiveUnsignedBytes 返回传递负数时使用的分隔符字节码。

{:id="BluetoothClient.DisconnectOnError" .boolean} *错误时断开连接*
: 指定 蓝牙客户端/蓝牙服务器 是否在发生错误时自动断开连接。

{:id="BluetoothClient.Enabled" .boolean .ro .bo} *启用*
: 如果启用了蓝牙，返回`真`{:.logic.block}，否则返回`假`{:.logic.block}。

{:id="BluetoothClient.HighByteFirst" .boolean} *高位优先*
: 指定发送和接收数字时是否使用最高有效位字节优先。

{:id="BluetoothClient.IsConnected" .boolean .ro .bo} *是否已连接*
: 如果已建立与蓝牙设备的连接，则返回 `真`{:.logic.block}。

{:id="BluetoothClient.PollingRate" .number} *轮询率*
: 返回蓝牙客户端配置的轮询速率值。

{:id="BluetoothClient.Secure" .boolean} *启用安全连接*
: 指定是否启用安全连接。

### 事件  {#BluetoothClient-Events}

{:.events}
无

**中文网注：**

蓝牙客户端没有“当收到数据时”的事件（即收到服务端数据后触发的事件），只能通过定时器定期轮询接收数据，可以考虑使用BluetoothLE低功耗蓝牙[拓展](../extensions/index.html)，它拥有这个事件。

### 方法  {#BluetoothClient-Methods}

{:.methods}

{:id="BluetoothClient.BytesAvailableToReceive" class="method returns number"} <i/> 获取接收字节数()
: 返回输入流中可用的字节数。

{:id="BluetoothClient.Connect" class="method returns boolean"} <i/> 连接(*地址*{:.text})
: 连接到指定地址的蓝牙设备。

  **连接报错？ Runtime Error: Need android.permission.BLUETOOTH_CONNECT ...**

  ![BLUETOOTH_CONNECT_permission](images/BLUETOOTH_CONNECT_permission.png)

  {:.vip}
  这时需要请求蓝牙连接权限，参考代码如下：<br/>
  ![请求蓝牙连接权限](images/请求蓝牙连接权限.png)

{:id="BluetoothClient.ConnectWithUUID" class="method returns boolean"} <i/> 连接指定设备(*地址*{:.text},*唯一编号*{:.text})
: 连接到指定地址和UUID的蓝牙设备。

{:id="BluetoothClient.Disconnect" class="method"} <i/> 断开连接()
: 断开已连接的蓝牙设备。

{:id="BluetoothClient.IsDevicePaired" class="method returns boolean"} <i/> 检查设备是否配对(*地址*{:.text})
: 检查指定地址的蓝牙设备是否已配对。

{:id="BluetoothClient.ReceiveSigned1ByteNumber" class="method returns number"} <i/> 接收单字节带符号数字()
: 读取带符号的 1 字节数字。

{:id="BluetoothClient.ReceiveSigned2ByteNumber" class="method returns number"} <i/> 接收双字节带符号数字()
: 读取带符号的 2 字节数字。

{:id="BluetoothClient.ReceiveSigned4ByteNumber" class="method returns number"} <i/> 接收四字节带符号数字()
: 读取带符号的 4 字节数字。

{:id="BluetoothClient.ReceiveSignedBytes" class="method returns list"} <i/> 接收带符号字节数组(*字节数*{:.number})
: 从输入流中读取指定数量(`字节数`)的带符号的字节，并将它们作为列表返回。

    如果 `字节数` 为负数，则读取到分隔符字节码（*分隔符字节码*属性指定的）为止，分隔符字节码包含在返回的列表中。

{:id="BluetoothClient.ReceiveText" class="method returns text"} <i/> 接收文本(*字节数*{:.number})
: 从输入流中读取指定数量(`字节数`)的带符号的字节，并将它们转换为文本。

    如果 `字节数` 为负数，则读取到分隔符字节码（*分隔符字节码*属性指定的）为止。

{:id="BluetoothClient.ReceiveUnsigned1ByteNumber" class="method returns number"} <i/> 接收单字节无符号数字()
: 读取一个无符号的 1 字节数字。

{:id="BluetoothClient.ReceiveUnsigned2ByteNumber" class="method returns number"} <i/> 接收双字节无符号数字()
: 读取一个无符号的 2 字节数字。

{:id="BluetoothClient.ReceiveUnsigned4ByteNumber" class="method returns number"} <i/> 接收四字节无符号数字()
: 读取一个无符号的 4 字节数字。

{:id="BluetoothClient.ReceiveUnsignedBytes" class="method returns list"} <i/> 接收无符号字节数组(*字节数*{:.number})
: 从输入流中读取指定数量(`字节数`)的无符号的字节，并将它们作为列表返回。

    如果 `字节数` 为负数，则读取到分隔符字节码（*分隔符字节码*属性指定的）为止，分隔符字节码包含在返回的列表中。

{:id="BluetoothClient.Send1ByteNumber" class="method"} <i/> 发送单字节数字(*数值*{:.text})
: 将指定的`数值`字符串转换成整数，并将其作为 1 个字节写入到输出流。

    如果`数值`无法转换为整数，或转换的整数 1 个字节不够表达，将触发[屏幕](userinterface.html#Screen)的 [出现错误时](userinterface.html#Screen.ErrorOccurred) 事件，然后方法直接返回，不会向输出流中写入任何字节。

{:id="BluetoothClient.Send2ByteNumber" class="method"} <i/> 发送双字节数字(*数值*{:.text})
: 将指定的`数值`字符串转换成整数，并将其作为 2 个字节写入到输出流。

    如果`数值`无法转换为整数，或转换的整数 2 个字节不够表达，将触发[屏幕](userinterface.html#Screen)的 [出现错误时](userinterface.html#Screen.ErrorOccurred) 事件，然后方法直接返回，不会向输出流中写入任何字节。

{:id="BluetoothClient.Send4ByteNumber" class="method"} <i/> 发送四字节数字(*数值*{:.text})
: 将指定的`数值`字符串转换成整数，并将其作为 4 个字节写入到输出流。

    如果`数值`无法转换为整数，或转换的整数 4 个字节不够表达，将触发[屏幕](userinterface.html#Screen)的 [出现错误时](userinterface.html#Screen.ErrorOccurred) 事件，然后方法直接返回，不会向输出流中写入任何字节。

{:id="BluetoothClient.SendBytes" class="method"} <i/> 发送字节数组(*列表*{:.list})
: 从指定列表中取出每个元素，将其转换为字符串，字符串转换成整数，并将其作为 1 个字节写入到输出流。

    如果一个元素无法转换为整数，或转换的整数 1 个字节不够表达，将触发[屏幕](userinterface.html#Screen)的 [出现错误时](userinterface.html#Screen.ErrorOccurred) 事件，然后方法直接返回，不会向输出流中写入任何字节。

{:id="BluetoothClient.SendText" class="method"} <i/> 发送文本(*文本*{:.text})
: 将指定文本转换为字节并将它们写入到输出流。

## ![icon](images/bluetoothserver.png)  蓝牙服务器  {#BluetoothServer}

使用 `蓝牙服务器` 组件将您的设备变成接收来自其他使用 `蓝牙客户端` 组件的应用程序连接的服务器。

### 属性  {#BluetoothServer-Properties}

{:.properties}

{:id="BluetoothServer.Available" .boolean .ro .bo} *可用状态*
: 如果设备上有蓝牙功能，则返回`真`{:.logic.block}，否则返回`假`{:.logic.block}。

{:id="BluetoothServer.CharacterEncoding" .text} *字符编码*
: 返回发送和接收文本时使用的字符编码。

{:id="BluetoothServer.DelimiterByte" .number} *分隔符字节码*
: 调用 ReceiveText、ReceiveSignedBytes 或 ReceiveUnsignedBytes 返回传递负数时使用的分隔符字节码。

{:id="BluetoothServer.Enabled" .boolean .ro .bo} *启用*
: 如果启用了蓝牙，返回`真`{:.logic.block}，否则返回`假`{:.logic.block}。

{:id="BluetoothServer.HighByteFirst" .boolean} *高位优先*
: 指定发送和接收数字时是否使用最高有效位字节优先。

{:id="BluetoothServer.IsAccepting" .boolean .ro .bo} *接收状态*
: 如果此 `蓝牙服务器` 组件正在接受一个传入连接，则返回`真`{:.logic.block}。

{:id="BluetoothServer.IsConnected" .boolean .ro .bo} *连接状态*
: 如果与蓝牙设备已建立连接，则返回 `真`{:.logic.block}。

{:id="BluetoothServer.Secure" .boolean} *启用安全连接*
: 指定是否启用安全连接。

### 事件  {#BluetoothServer-Events}

{:.events}

{:id="BluetoothServer.ConnectionAccepted"} 接受连接()
: 表示已接受蓝牙连接。

**中文网注：**

蓝牙服务端没有“当收到数据时”的事件（即收到客户端数据后触发的事件），只能通过定时器定期轮询接收数据，可以考虑使用BluetoothLE低功耗蓝牙[拓展](../extensions/index.html)，它拥有这个事件。

### 方法  {#BluetoothServer-Methods}

{:.methods}

{:id="BluetoothServer.AcceptConnection" class="method"} <i/> 接受连接(*服务名*{:.text})
: 接受使用串行端口配置文件 (SPP) 进行通信的传入连接。

{:id="BluetoothServer.AcceptConnectionWithUUID" class="method"} <i/> 接受与指定设备连接(*服务名*{:.text},*唯一编号*{:.text})
: 接受指定 UUID 的传入连接。

{:id="BluetoothServer.BytesAvailableToReceive" class="method returns number"} <i/> 获取接收字节数()
: 返回输入流中可用的字节数。

{:id="BluetoothServer.Disconnect" class="method"} <i/> 断开连接()
: 断开当前已连接的蓝牙设备。

{:id="BluetoothServer.ReceiveSigned1ByteNumber" class="method returns number"} <i/> 接收单字节带符号数字()
: 读取带符号的 1 字节数字。

{:id="BluetoothServer.ReceiveSigned2ByteNumber" class="method returns number"} <i/> 接收双字节带符号数字()
: 读取带符号的 2 字节数字。

{:id="BluetoothServer.ReceiveSigned4ByteNumber" class="method returns number"} <i/> 接收四字节带符号数字()
: 读取带符号的 4 字节数字。

{:id="BluetoothServer.ReceiveSignedBytes" class="method returns list"} <i/> 接收带符号字节数组(*字节数*{:.number})
: 从输入流中读取指定数量(`字节数`)的带符号的字节，并将它们作为列表返回。

    如果 `字节数` 为负数，则读取到分隔符字节码（*分隔符字节码*属性指定的）为止，分隔符字节码包含在返回的列表中。

{:id="BluetoothServer.ReceiveText" class="method returns text"} <i/> 接收文本(*字节数*{:.number})
: 从输入流中读取指定数量(`字节数`)的带符号的字节，并将它们转换为文本。

    如果 `字节数` 为负数，则读取到分隔符字节码（*分隔符字节码*属性指定的）为止。

{:id="BluetoothServer.ReceiveUnsigned1ByteNumber" class="method returns number"} <i/> 接收单字节无符号数字()
: 读取一个无符号的 1 字节数字。

{:id="BluetoothServer.ReceiveUnsigned2ByteNumber" class="method returns number"} <i/> 接收双字节无符号数字()
: 读取一个无符号的 2 字节数字。

{:id="BluetoothServer.ReceiveUnsigned4ByteNumber" class="method returns number"} <i/> 接收四字节无符号数字()
: 读取一个无符号的 4 字节数字。

{:id="BluetoothServer.ReceiveUnsignedBytes" class="method returns list"} <i/> 接收无符号字节数组(*字节数*{:.number})
: 从输入流中读取指定数量(`字节数`)的无符号的字节，并将它们作为列表返回。

    如果 `字节数` 为负数，则读取到分隔符字节码（*分隔符字节码*属性指定的）为止，分隔符字节码包含在返回的列表中。

{:id="BluetoothServer.Send1ByteNumber" class="method"} <i/> 发送单字节数字(*数值*{:.text})
: 将指定的`数值`字符串转换成整数，并将其作为 1 个字节写入到输出流。

    如果`数值`无法转换为整数，或转换的整数 1 个字节不够表达，将触发[屏幕](userinterface.html#Screen)的 [出现错误时](userinterface.html#Screen.ErrorOccurred) 事件，然后方法直接返回，不会向输出流中写入任何字节。

{:id="BluetoothServer.Send2ByteNumber" class="method"} <i/> 发送双字节数字(*数值*{:.text})
: 将指定的`数值`字符串转换成整数，并将其作为 2 个字节写入到输出流。

    如果`数值`无法转换为整数，或转换的整数 2 个字节不够表达，将触发[屏幕](userinterface.html#Screen)的 [出现错误时](userinterface.html#Screen.ErrorOccurred) 事件，然后方法直接返回，不会向输出流中写入任何字节。

{:id="BluetoothServer.Send4ByteNumber" class="method"} <i/> 发送四字节数字(*数值*{:.text})
: 将指定的`数值`字符串转换成整数，并将其作为 4 个字节写入到输出流。

    如果`数值`无法转换为整数，或转换的整数 4 个字节不够表达，将触发[屏幕](userinterface.html#Screen)的 [出现错误时](userinterface.html#Screen.ErrorOccurred) 事件，然后方法直接返回，不会向输出流中写入任何字节。

{:id="BluetoothServer.SendBytes" class="method"} <i/> 发送字节数组(*列表*{:.list})
: 从指定列表中取出每个元素，将其转换为字符串，字符串转换成整数，并将其作为 1 个字节写入到输出流。

    如果一个元素无法转换为整数，或转换的整数 1 个字节不够表达，将触发[屏幕](userinterface.html#Screen)的 [出现错误时](userinterface.html#Screen.ErrorOccurred) 事件，然后方法直接返回，不会向输出流中写入任何字节。

{:id="BluetoothServer.SendText" class="method"} <i/> 发送文本(*文本*{:.text})
: 将指定文本转换为字节并将它们写入到输出流。

{:id="BluetoothServer.StopAccepting" class="method"} <i/> 停止接受连接()
: 停止接受传入连接。

## ![icon](images/serial.png)  串口通信器  {#Serial}

串口通信组件。手机串口通信案例请参考[《App Inventor 2 串口组件：App使用OTG数据线进行串口通信》](guide/serial.html)。

### 属性  {#Serial-Properties}

{:.properties}

{:id="Serial.BaudRate" .number} *波特率*
: 返回当前波特率。

{:id="Serial.BufferSize" .number} *缓冲区大小*
: 返回缓冲区大小（以字节为单位）

{:id="Serial.IsInitialized" .boolean .ro .bo} *是否已初始化*
: 当串口已初始化时返回 `真`。

{:id="Serial.IsOpen" .boolean .ro .bo} *是否打开*
: 当串口连接打开时返回 `真`。

### 事件  {#Serial-Events}

{:.events}
无


### 方法  {#Serial-Methods}

{:.methods}

{:id="Serial.CloseSerial" class="method returns boolean"} <i/> 关闭串口()
: 关闭串口连接。关闭成功时返回 `真`。

{:id="Serial.InitializeSerial" class="method"} <i/> 初始化串口()
: 初始化串口连接。

{:id="Serial.OpenSerial" class="method returns boolean"} <i/> 打开串口()
: 打开串口连接。 打开成功时返回 `真`。

{:id="Serial.PrintSerial" class="method"} <i/> 打印串口(*data*{:.text})
: 将给定数据写入串口，并在末尾添加一个新行。

{:id="Serial.ReadSerial" class="method returns text"} <i/> 读取串口()
: 从串口读取数据。

{:id="Serial.WriteSerial" class="method"} <i/> 写入串口(*data*{:.text})
: 将给定数据写入串口。

## ![icon](images/web.png)  Web客户端&nbsp;&nbsp;[<i class="mdi mdi-cursor-default-click-outline"></i>示例](guide/Web.html)    {#Web}

为 HTTP GET、POST、PUT 和 DELETE 请求提供功能的非可视组件。

### 属性  {#Web-Properties}

{:.properties}

{:id="Web.AllowCookies" .boolean} *允许使用Cookies*
: 指定是否允许使用Cookies。（Cookies是一种浏览器本地缓存技术，用于缓存一些用户个性数据、身份验证信息等。常见的如“30天免登陆”功能就是将用户登录验证信息保存到Cookies，有效期30天。还有诸如你的搜索偏好，浏览偏好等设置也是通过Cookies进行保存的）

{:id="Web.RequestHeaders" .list .bo} *请求标头*
: 设置请求标头。以下是一个请求标头示例截图：

  <img src="images/请求标头.png" alt="请求标头" style="border:1px solid #eee;margin-bottom:10px;"/>

  请求标头信息，格式为`包含双项子列表的列表`数据。其中，各子列表中第一项表示请求头的字段名，而第二项则表示对应的字段值，既可以是单个数值，也可以是包含多个数值的列表。

  设置案例如下：

  ![请求标头设置](images/请求标头设置.png){:.vip}

  有3种设置方式：

  1、二维列表，非普通单列表：
  
  ![请求标头设置](images/请求标头_二维列表.png){:.vip}
  
  2、键值对列表，非单个键值对：

  ![请求标头设置](images/请求标头_键值对列表.png){:.vip}
  
  3、完整字典，非单个键值对：

  ![请求标头设置](images/请求标头_字典.png){:.vip}

{:id="Web.ResponseFileName" .text} *响应文件名称*
: 指定保存响应数据的文件的名称，如果 [保存响应信息](#Web.SaveResponse) 为`真` 且 [响应文件名称](#Web.ResponseFileName) 为空，则自动创建一个新文件名。

{:id="Web.SaveResponse" .boolean} *保存响应信息*
: 指定是否将响应数据保存到文件中。

{:id="Web.Timeout" .number} *超时时间(ms)*
: 返回每个请求在超时前等待响应的毫秒数，如果设置为`0`，则请求将无限期等待响应。

{:id="Web.Url" .text} *URL网址*
: 指定待请求的URL网址.

### 事件  {#Web-Events}

{:.events}

{:id="Web.GotFile"} 获得文件(*URL网址*{:.text},*响应代码*{:.number},*响应类型*{:.text},*文件名*{:.text})
: 当请求完成时触发该事件，以文件形式返回内容。

{:id="Web.GotText"} 获得文本(*URL网址*{:.text},*响应代码*{:.number},*响应类型*{:.text},*响应内容*{:.text})
: 当请求完成时触发该事件，以文本形式返回内容。

{:id="Web.TimedOut"} 超时(*URL网址*{:.text})
: 当请求超时触发该事件。

### 方法  {#Web-Methods}

{:.methods}

{:id="Web.BuildRequestData" class="method returns text"} <i/> 创建数据请求(*列表*{:.list})
: 将表示名称和值对的二元素列表转换为 `application/x-www-form-urlencoded` 媒体类型格式的字符串，适合传递给[执行POST文本请求](#Web.PostText)。

{:id="Web.ClearCookies" class="method"} <i/> 清除Cookies()
: 清除此 Web客户端 组件的所有 Cookies。

{:id="Web.Delete" class="method"} <i/> 删除()
: 使用 [URL网址](#Web.Url) 属性执行 HTTP DELETE 请求并获取响应数据。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为真，则响应数据将保存在文件中，并且 [获得文件](#Web.GotFile) 事件被触发。[响应文件名称](#Web.ResponseFileName) 属性可用于指定文件的名称。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为假，[获得文本](#Web.GotText) 事件将触发。

{:id="Web.Get" class="method"} <i/> 执行GET请求()
: 使用 [URL网址](#Web.Url) 属性执行 HTTP GET 请求并获取响应数据。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为真，则响应数据将保存在文件中，并且 [获得文件](#Web.GotFile) 事件被触发。[响应文件名称](#Web.ResponseFileName) 属性可用于指定文件的名称。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为假，[获得文本](#Web.GotText) 事件将触发。

{:id="Web.HtmlTextDecode" class="method returns text"} <i/> 解码HTML文本(*HTML文本*{:.text})
: 解码给定的 HTML 文本值。例如：
  
  | HTML字符 | —> 解码后文本 |
  |--|--|
  |`&amp;`|`&`|
  |`&lt;`|`<`|
  |`&gt;`|`>`|
  |`&apos;`|`'` （单引号）|
  |`&quot;`|`"` （双引号）|
  |`&#xhhhh;`|`&#xhhhh;`|
  |`&#nnnn;`|`&#nnnn;`|

{:id="Web.JsonObjectEncode" class="method returns text"} <i/> 编码JSON对象(*JSON对象*{:.any})
: 以 JavaScript 对象表示形式返回内置类型（即布尔值、数字、文本、列表、字典）的值。 
  
  如果该值不能表示为 JSON，将触发[屏幕](userinterface.html#Screen)的 [出现错误时](userinterface.html#Screen.ErrorOccurred) 事件（如果有），并且 Web 组件将返回空字符串。
  
{:id="Web.JsonTextDecode" class="method returns any"} <i/> 解码JSON文本(*JSON文本*{:.text})
: 解码给定的 JSON 编码值以生成相应的 AppInventor 值。

  JSON 列表 `[x, y, z]` 解码为列表 `(x y z)`，具有键 A 和值 B 的 JSON 对象（表示为 `{A:B}`）解码为列表 `(( A B))`，即包含二元素列表`(A B)`的列表。

  如果你希望返回字典对象而不是结果中列表的列表，请使用方法 [JSON文本解码为字典](#Web.JsonTextDecodeWithDictionaries)。

{:id="Web.JsonTextDecodeWithDictionaries" class="method returns any"} <i/> JSON文本解码为字典(*JSON文本*{:.text})
: 解码给定的 JSON 编码值以生成相应的 App Inventor 值。

  JSON 列表 `[x, y, z]` 解码为列表 `(x y z)`，具有名称 A 和值 B 的 JSON 对象（表示为 \{a: b\}）解码为具有键 a 和值 b 的字典。

{:id="Web.PatchFile" class="method"} <i/> 执行PATCH文件请求(*文件路径*{:.text})
: PATCH方式发送通用文件，用法类似 [执行POST文件请求](#Web.PostFile) 。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为真，则响应数据将保存在文件中，并且 [获得文件](#Web.GotFile) 事件被触发。[响应文件名称](#Web.ResponseFileName) 属性可用于指定文件的名称。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为假，[获得文本](#Web.GotText) 事件将触发。

{:id="Web.PatchText" class="method"} <i/> 执行PATCH文本请求(*文本*{:.text})
: 使用 [URL网址](#Web.Url) 属性和指定文本执行 HTTP PATCH 请求。文本的字符集使用 UTF-8 进行编码。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为真，则响应数据将保存在文件中，并且 [获得文件](#Web.GotFile) 事件被触发。[响应文件名称](#Web.ResponseFileName) 属性可用于指定文件的名称。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为假，[获得文本](#Web.GotText) 事件将触发。

{:id="Web.PatchTextWithEncoding" class="method"} <i/> 执行PATCH编码文本请求(*文本*{:.text},*编码*{:.text})
: 使用 [URL网址](#Web.Url) 属性和指定文本执行 HTTP PATCH 请求。文本的字符集使用指定的编码方式进行编码。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为真，则响应数据将保存在文件中，并且 [获得文件](#Web.GotFile) 事件被触发。[响应文件名称](#Web.ResponseFileName) 属性可用于指定文件的名称。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为假，[获得文本](#Web.GotText) 事件将触发。

{:id="Web.PostFile" class="method"} <i/> 执行POST文件请求(*文件路径*{:.text})
: POST方式发送通用文件，同 curl -F 参数，可用于**二进制文件上传**，参考代码如下：

  ![上传文件到服务器](images/上传文件到服务器.png){:.vip}

  文件上传服务器结果如下：
  
  ![文件上传服务器结果](images/文件上传服务器结果.png)

  服务器代码请参考[《App Inventor 2 实现上传文件到服务器全方案总结》](../pro/file_upload.html)。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为真，则响应数据将保存在文件中，并且 [获得文件](#Web.GotFile) 事件被触发。[响应文件名称](#Web.ResponseFileName) 属性可用于指定文件的名称。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为假，[获得文本](#Web.GotText) 事件将触发。

{:id="Web.PostText" class="method"} <i/> 执行POST文本请求(*文本*{:.text})
: 使用 [URL网址](#Web.Url) 属性和指定文本执行 HTTP POST 请求。文本的字符集使用 UTF-8 进行编码。

   * 如果 [保存响应数据](#Web.SaveResponse) 属性为真，则响应数据将保存在文件中，并且 [获得文件](#Web.GotFile) 事件被触发。[响应文件名称](#Web.ResponseFileName) 属性可用于指定文件的名称。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为假，[获得文本](#Web.GotText) 事件将触发。

{:id="Web.PostTextWithEncoding" class="method"} <i/> 执行POST编码文本请求(*文本*{:.text},*编码*{:.text})
: 使用 [URL网址](#Web.Url) 属性和指定文本执行 HTTP POST 请求。文本的字符集使用指定的编码方式进行编码。

   * 如果 [保存响应数据](#Web.SaveResponse) 属性为真，则响应数据将保存在文件中，并且 [获得文件](#Web.GotFile) 事件被触发。[响应文件名称](#Web.ResponseFileName) 属性可用于指定文件的名称。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为假，[获得文本](#Web.GotText) 事件将触发。

{:id="Web.PutFile" class="method"} <i/> 执行PUT文件请求(*文件路径*{:.text})
: PUT方式发送通用文件，用法类似 [执行POST文件请求](#Web.PostFile) 。

   * 如果 [保存响应数据](#Web.SaveResponse) 属性为真，则响应数据将保存在文件中，并且 [获得文件](#Web.GotFile) 事件被触发。[响应文件名称](#Web.ResponseFileName) 属性可用于指定文件的名称。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为假，[获得文本](#Web.GotText) 事件将触发。

{:id="Web.PutText" class="method"} <i/> 执行PUT文本请求(*文本*{:.text})
: 使用 [URL网址](#Web.Url) 属性和指定文本执行 HTTP PUT 请求。文本的字符集使用 UTF-8 进行编码。

   * 如果 [保存响应数据](#Web.SaveResponse) 属性为真，则响应数据将保存在文件中，并且 [获得文件](#Web.GotFile) 事件被触发。[响应文件名称](#Web.ResponseFileName) 属性可用于指定文件的名称。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为假，[获得文本](#Web.GotText) 事件将触发。

{:id="Web.PutTextWithEncoding" class="method"} <i/> 执行PUT编码文本请求(*文本*{:.text},*编码*{:.text})
: 使用 [URL网址](#Web.Url) 属性和指定文本执行 HTTP PUT 请求。文本的字符集使用指定的编码方式进行编码。

   * 如果 [保存响应数据](#Web.SaveResponse) 属性为真，则响应数据将保存在文件中，并且 [获得文件](#Web.GotFile) 事件被触发。[响应文件名称](#Web.ResponseFileName) 属性可用于指定文件的名称。

  * 如果 [保存响应数据](#Web.SaveResponse) 属性为假，[获得文本](#Web.GotText) 事件将触发。

{:id="Web.UriDecode" class="method returns text"} <i/> URI解码(*文本*{:.text})
: 对已编码的文本值进行URI解码操作，解码后的内容是原始的文本。如：`%E6%B8%B8%20%E6%88%8F` --解码--> `游 戏`。

{:id="Web.UriEncode" class="method returns text"} <i/> URI编码(*文本*{:.text})
: 对给定的文本进行URI编码操作，编码后可用于URL网址。如：`游 戏` --编码--> `%E6%B8%B8%20%E6%88%8F`。

* 空格不能用于URL网址中，需要编码成`%20`，中文也是一样，要编码成UTF-8格式。

{:id="Web.XMLTextDecode" class="method returns any"} <i/> 解码XML文本(*XML文本*{:.text})
: 解码给定的 XML 字符串以生成列表对象。
  
  `<tag>string</tag>` 解码为包含一个标签和字符串键值对的列表。
  
  更一般地，如果 obj1, obj2, ... 是标记分隔的 XML 字符串，则 `<tag>obj1 obj2 ...</tag>` 解码为一个列表，其中包含第一个元素是 tag 且第二个元素的对 是已解码 obj 的列表，按标签按字母顺序排序。

  例如：

  * `<foo>123</foo>` 解码为包含一个键值对 `(foo 123)` 的单项列表
  * `<foo>1 2 3</foo>` 解码为包含一个键值对 `(foo "1 2 3")` 的单项列表
  * `<a> <bar>456</bar> <foo>1 2 3</foo> </a>` 解码为包含对 `(a X)` 的列表，其中 X 是一个包含 2 项的列表，分别是键值对`(bar 456)`和键值对`(foo "1 2 3")`。

  如果 obj 的序列混合了标记分隔和非标记分隔的项目，则非标记分隔的项目将从序列中拉出并用“content”标记包装。

  例如 `<a> <bar>456</bar> many <foo>1 2 3</foo> apples<a> </code>`  解码与上面类似，除了列表 X 是一个 3项 包含额外键值对的项目列表，其第一项是字符串 “content”，第二项是列表 (many, apples)。

  如果结果不是格式良好的 XML，此方法会发出错误信号并返回空列表。

{:id="Web.XMLTextDecodeAsDictionary" class="method returns any"} <i/> XML文本解码为字典(*XML文本*{:.text})
: 解码给定的 XML 字符串以生成字典对象。

  该字典包括特殊键 `$tag`, `$localName`, `$namespace`, `$namespaceUri`, `$attributes`, 和 `$content`，以及指向与此处描述的结构相同的元素列表的每个节点的唯一标签。

  `$tag` 键是完整的标签名称，例如 foo:bar。 `$localName` 是名称的本地部分（`:` 字符之后的所有内容）。如果给出了命名空间（`:` 字符之前的所有内容），则在`$namespace`中提供该命名空间，并在`$namespaceUri`中给出相应的 URI。 属性存储在 `$attributes` 的字典中，子节点以列表形式给出在 `$content` 下。

   **有关特殊Keys的更多信息**

   给出以下 XML 文档：

   ```xml
     <ex:Book xmlns:ex="http://example.com/">
       <ex:title xml:lang="en">On the Origin of Species</ex:title>
       <ex:author>Charles Darwin</ex:author>
     </ex:Book>
   ```

  解析时：
  
  * `$tag` 键将是 `"ex:Book"`
  
  * `$localName` 键将是 `"Book"`
  
  * `$namespace` 键将是 `"ex"`
  
  * `$namespaceUri ` 将是 `"http://example.com/"`
  
  * `$attributes` 键将是一个字典 `{}`（命名空间中删除了 xmlns）
  
  * `$content` 将是一个列表，包含解码后的`<ex:title>`和`<ex:author>`元素的两个项，第一项对应于 `<ex:title>` 元素，将有一个包含字典 `{"xml:lang": "en"}` 的 `$attributes` 键。
  
  对于元素上的每个`name=value`属性，将`name`映射到`value`的键值对将存在于`$attributes`字典中。
  
  除了这些特殊键之外，还有`ex:title`和`ex:author`，以允许比遍历`$content`列表更快的查找速度。

## SimpleBase64 *拓展*  {#SimpleBase64}

SimpleBase64.aix 拓展下载：

{:.vip}
[com.ghostfox.SimpleBase64.aix](extension/com.ghostfox.SimpleBase64.aix)

SimpleBase64 demo程序下载：

{:.vip}
[base64_demo.aia](extension/base64_demo.aia)

提供图像的Base64编码及解码方法，便于图像文件的通信传输。此插件仅提供2个函数，使用非常方便，几乎没有学习成本。

<img src="extension/SimpleBase64效果截图.png" alt="SimpleBase64效果截图" style="width:40%; border:1px solid #eee;"/>

### 属性  {#SimpleBase64-Properties}

{:.properties}
无

### 事件  {#SimpleBase64-Events}

{:.events}
无

### 方法  {#SimpleBase64-Methods}

{:.methods}

* EncodeImage
* DecodeImage

## <img src="../extensions/images/mqtt_icon.png" style="width:16px;margin:-4px 5px 0 0">MqttClient 拓展  {#Mqtt}
<!--(http://ullisroboterseite.de/android-AI2-PahoMQTT-en.html)-->

.aix 拓展及demo程序打包下载：

{:.vip}
[UrsAI2Paho.zip](extension/UrsAI2Paho.zip)

`MQTT`是机器对机器(M2M)/物联网(IoT)连接协议。它被设计为一个极其轻量级的发布/订阅消息传输协议。

对于需要较小代码占用空间和/或网络带宽非常宝贵的远程连接非常有用，是专为受限设备和低带宽、高延迟或不可靠的网络而设计。

这些原则也使该协议成为新兴的“机器到机器”(M2M)或物联网(IoT)世界的连接设备，以及带宽和电池功率非常高的移动应用的理想选择。

例如，它已被用于通过卫星链路与代理通信的传感器、与医疗服务提供者的拨号连接，以及一系列家庭自动化和小型设备场景。它也是移动应用的理想选择，因为它体积小，功耗低，数据包最小，并且可以有效地将信息分配给一个或多个接收器。 　　

**特点：**
  * 开放消息协议，简单易实现
  * 发布订阅模式，一对多消息发布
  * 基于TCP/IP网络连接,提供有序，无损，双向连接。
  * 1字节固定报头，2字节心跳报文，最小化传输开销和协议交换，有效减少网络流量。
  * 消息QoS支持，可靠传输保证

## ClientSocket 拓展  {#Socket}
<!--(https://community.appinventor.mit.edu/t/tcp-ip-extension/7142)-->

.aix 拓展下载：

{:.vip}
[com.gmail.at.moicjarod.aix](extension/com.gmail.at.moicjarod.aix)

demo程序下载：

{:.vip}
[TestSocket.aia](extension/TestSocket.aia)

提供TCP/IP连接及通信功能。

### 属性  {#ClientSocket-Properties}

{:.properties}

* serverAddress (R/W)
* serverPort (R/W)
* timeoutms (R/W)
* hexaStringMode (R/W)
* connectionState (RO)
* debugMessages (RW)

### 事件  {#ClientSocket-Events}

{:.events}

* Connect
* Disconnect
* SendData

### 方法  {#ClientSocket-Methods}

{:.methods}

* DataReceived
* RemoteConnectionClosed

发送文本消息时，`hexaStringMode`设为 false；发送16制消息时，`hexaStringMode`设为 true，例如：0x012 ---> “303132” 字符串发送，接收的数据也是16进制字符串。

连接的超时时间默认是 2000 毫秒，可以设置修改。

##### *已知的bug*：

* 消息不能超过 1024 字节。

* 如果与服务器的连接丢失（不是服务器关闭，而是 wifi 连接问题），则不会有任何事件触发（但崩溃现已修复）。
