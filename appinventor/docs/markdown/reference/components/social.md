---
layout: documentation
title: 社交应用组件
description: 社交应用组件参考文档：包括联系人选择框、邮箱地址选择框、电话拨号器、电话号选择框、信息分享器、短信收发器。
---

* TOC
{:toc}

[&laquo; 返回首页](index.html)
# <i class="mdi mdi-share-variant-outline"></i>  社交应用组件

目录：

1. ![icon](images/contactpicker.png)  [联系人选择框](#ContactPicker)
1. ![icon](images/emailpicker.png)  [邮箱地址选择框](#EmailPicker)
1. ![icon](images/phonecall.png)  [电话拨号器](#PhoneCall)
1. ![icon](images/phonenumberpicker.png)  [电话号选择框](#PhoneNumberPicker)
1. ![icon](images/sharing.png)  [信息分享器](#Sharing)
1. ![icon](images/texting.png)  [短信收发器](#Texting)


## ![icon](images/contactpicker.png)  联系人选择框  {#ContactPicker}

单击该按钮后，会显示可供选择的联系人列表。用户做出选择后，以下属性将设置为有关所选联系人的信息：

   - [`联系人姓名`](#ContactPicker.ContactName)：联系人姓名
   - [`邮箱地址`](#ContactPicker.EmailAddress)：联系人的主要电子邮件地址
   - [`邮箱地址列表`](#ContactPicker.EmailAddressList)：联系人电子邮件地址列表
   - [`联系人URI`](#ContactPicker.ContactUri)：设备上联系人的 URI
   - [`电话号码`](#ContactPicker.PhoneNumber)：联系人的主要电话号码（在更高版本的 Android 版本上）
   - [`电话号码列表`](#ContactPicker.PhoneNumberList)：联系人电话号码列表（在更高版本的 Android 版本上）
   - [`图片`](#ContactPicker.Picture)：包含联系人图片的文件的名称，可用作 [图像](userinterface.html#Image).[图片](userinterface.html#Image.Picture)属性值 或 [图像精灵](animation.html#ImageSprite).[图片](animation.html#ImageSprite.Picture) 属性值。

  其他属性影响按钮外观（[`文本对齐`](#ContactPicker.TextAlignment)、[`背景颜色`](#ContactPicker.BackgroundColor)等）以及是否可以单击（[`启用`](#ContactPicker.Enabled)）。

  `联系人选择框`组件可能不适用于所有手机。例如，在3.0之前的Android系统上，它无法选择电话号码，并且电子邮件地址列表将仅包含一封电子邮件。

### 属性  {#ContactPicker-Properties}

{:.properties}

{:id="ContactPicker.BackgroundColor" .color} *背景颜色*
: 设置`联系人选择框`的背景颜色，使用RGBA数值表示，如果设置了[`图像`](#ContactPicker.Image)属性，则不能显示背景颜色直到删除[`图像`](#ContactPicker.Image)属性为止。

{:id="ContactPicker.ContactName" .text .ro .bo} *联系人姓名*
: 返回所选联系人的全名，如果名称不可用，则返回空字符串。

{:id="ContactPicker.ContactUri" .text .ro .bo} *联系人URI*
: 返回指定联系人在设备上的位置的 URI。

{:id="ContactPicker.EmailAddress" .text .ro .bo} *邮箱地址*
: 返回所选联系人的主电子邮件地址，如果电子邮件地址不可用，则返回空字符串。

{:id="ContactPicker.EmailAddressList" .list .ro .bo} *邮箱地址列表*
: 返回与所选联系人关联的电子邮件地址列表。

{:id="ContactPicker.Enabled" .boolean} *启用*
: 设置`联系人选择框`是否可以被激活和点击。

{:id="ContactPicker.FontBold" .boolean} *粗体*
: 设置`联系人选择框`的显示字体是否是粗体。（注：有些字体不支持粗体）。

{:id="ContactPicker.FontItalic" .boolean} *斜体*
: 设置`联系人选择框`的显示字体是否是斜体。（注：有些字体不支持斜体）。

{:id="ContactPicker.FontSize" .number} *字体大小*
: 设置`联系人选择框`的字体大小，以像素px为单位。

{:id="ContactPicker.FontTypeface" .number .do} *字体*
: 设置`联系人选择框`的字体，目前支持的字体有：default,  serif,  sans serif,  和 monospace。

  要使用自定义字体，请将 **.ttf** 字体文件上传并选中它。

{:id="ContactPicker.Height" .number .bo} *高度*
: 设置`联系人选择框`的垂直高度，以像素px为单位。

{:id="ContactPicker.HeightPercent" .number .wo .bo} *高度百分比*
: 设置`联系人选择框`的垂直高度相对于整个[`屏幕高度`](userinterface.html#Screen.Height)的百分比。

{:id="ContactPicker.Image" .text} *图像*
: 设置`联系人选择框`图像的路径，如果同时设置了`图像`和[`背景颜色`](#ContactPicker.BackgroundColor)，则仅`图像`可见。

{:id="ContactPicker.PhoneNumber" .text .ro .bo} *电话号码*
: 返回与所选联系人关联的主要电话号码，如果没有与该联系人关联的电话号码，则返回空字符串。

{:id="ContactPicker.PhoneNumberList" .list .ro .bo} *电话号码列表*
: 返回与所选联系人关联的电话号码列表。

{:id="ContactPicker.Picture" .text .ro .bo} *图片*
: 返回所选联系人的图片 URI，可用于检索联系人的照片和其他字段。

{:id="ContactPicker.Shape" .number .do} *形状*
: 设置`联系人选择框`的形状，此属性的有效值为：

  `0`（默认）

  `1` （圆形）

  `2`（矩形）

  `3`（椭圆形）。
  
  如果设置了[`图像`](#ContactPicker.Image)，则`形状`将不可见。

{:id="ContactPicker.ShowFeedback" .boolean} *显示反馈*
: 设置`联系人选择框`指定 [`图像`](#ContactPicker.Image)后被按压是否显示视觉反馈。

{:id="ContactPicker.Text" .text} *文本*
: 设置`联系人选择框`的显示文本。

{:id="ContactPicker.TextAlignment" .number .do} *文本对齐*
: 设置`联系人选择框`文本的对齐方式，有效值有： 

  `0`（正常；例如，如果文本从左到右书写，则左对齐）

  `1`（居中）

  `2`（相反；例如，如果文本从左到右书写，则右对齐）。

{:id="ContactPicker.TextColor" .color} *文本颜色*
: 设置`联系人选择框`的文本颜色，使用RGBA数值表示。

{:id="ContactPicker.Visible" .boolean} *可见性*
: 设置`联系人选择框`是否显示在屏幕上，值是`真`{:.logic.block}则`联系人选择框`显示，`假`{:.logic.block}则隐藏。

{:id="ContactPicker.Width" .number .bo} *宽度*
: 设置`联系人选择框`的水平宽度，以像素px为单位。

{:id="ContactPicker.WidthPercent" .number .wo .bo} *宽度百分比*
: 设置`联系人选择框`的水平宽度相对于[`屏幕宽度`](userinterface.html#Screen.Width)的百分比。

### 事件  {#ContactPicker-Events}

{:.events}

{:id="ContactPicker.AfterPicking"} 选择完成()
: 在`联系人选择框`活动返回其结果且属性已填写后触发该事件。

{:id="ContactPicker.BeforePicking"} 准备选择()
: 单击`联系人选择框`或使用 [打开选框](#ContactPicker.Open) 方法显示选择器时触发该事件。

  此事件发生在选择器显示之前，可用于在显示选择器之前准备好选择器。

{:id="ContactPicker.GotFocus"} 获得焦点()
: 表示光标移到`联系人选择框`上方，因此现在可以单击它。

{:id="ContactPicker.LostFocus"} 失去焦点()
: 表示光标已从`联系人选择框`移开，因此现在无法再单击它。

{:id="ContactPicker.TouchDown"} 被按压()
: 表示`联系人选择框`已被按下。

{:id="ContactPicker.TouchUp"} 被松开()
: 表示`联系人选择框`按压已释放。

### 方法  {#ContactPicker-Methods}

{:.methods}

{:id="ContactPicker.Open" class="method"} <i/> 打开选框()
: 打开`联系人选择框`选框，就像用户单击它一样。

{:id="ContactPicker.ViewContact" class="method"} <i/> 查看联系人(*URI*{:.text})
: 在设备的默认联系人App中打开所选联系人的条目。

## ![icon](images/emailpicker.png)  邮箱地址选择框  {#EmailPicker}

`邮箱地址选择框`是一种文本框。如果用户开始输入联系人的姓名或电子邮件地址，手机将显示完成输入的选项下拉菜单。如果有很多联系人，则下拉列表可能需要几秒钟的时间才能显示，并且可以在计算匹配时显示中间结果。

  文本框的初始内容和用户输入后的内容位于 [`文本`](#EmailPicker.Text) 属性中。如果 [`文本`](#EmailPicker.Text) 属性最初为空，则 [`提示`](#EmailPicker.Hint) 属性的内容将隐约显示在文本框中，作为对用户的提示。

  其他属性影响文本框的外观（[`文本对齐`](#EmailPicker.TextAlignment)、[`背景颜色`](#EmailPicker.BackgroundColor)等）以及是否可以使用（[`启用`](#EmailPicker.Enabled)）。

  像这样的文本框通常与 [`按钮`](userinterface.html#Button) 组件一起使用，用户在文本输入完成后单击按钮。

### 属性  {#EmailPicker-Properties}

{:.properties}

{:id="EmailPicker.BackgroundColor" .color} *背景颜色*
: `邮箱地址选择框` 的背景色，可以在“界面设计”视图或“程序设计”视图中通过颜色名字选择一个颜色，`默认`背景颜色为：default（阴影 3-D 外观）。

{:id="EmailPicker.Enabled" .boolean} *启用*
: 如果设置为`真`{:.logic.block}则用户可以在 `邮箱地址选择框` 中输入文本。

{:id="EmailPicker.FontBold" .boolean .do} *粗体*
: 设置`邮箱地址选择框`的显示字体是否是粗体。（注：有些字体不支持粗体）。

{:id="EmailPicker.FontItalic" .boolean .do} *斜体*
: 设置`邮箱地址选择框`的显示字体是否是粗体。（注：有些字体不支持粗体）。

{:id="EmailPicker.FontSize" .number} *字体大小*
: 设置`邮箱地址选择框`的字体大小，以像素px为单位。

{:id="EmailPicker.FontTypeface" .number .do} *字体*
: 设置`邮箱地址选择框`的字体，目前支持的字体有：`0` (default), `1` (serif), `2` (sansserif), 和 `3` (monospace)。

  要使用自定义字体，请将 **.ttf** 字体文件上传并选中它。

{:id="EmailPicker.Height" .number .bo} *高度*
: 设置`邮箱地址选择框`的垂直高度，以像素px为单位。

{:id="EmailPicker.HeightPercent" .number .wo .bo} *高度百分比*
: 设置`邮箱地址选择框`的垂直高度相对于整个[`屏幕高度`](userinterface.html#Screen.Height)的百分比。

{:id="EmailPicker.Hint" .text} *提示*
: 设置`邮箱地址选择框`的提示信息，如果 [`文本`](#EmailPicker.Text) 为空，则该提示信息在框中显示为浅淡色文本。

{:id="EmailPicker.Text" .text} *文本*
: `邮箱地址选择框`中的文本，可以在“界面设计”视图或“程序设计”视图中设置，或由用户输入（除非 [`启用`](#EmailPicker.Enabled) 属性为 `假`{:.logic.block}）。

{:id="EmailPicker.TextAlignment" .number .do} *文本对齐*
: 设置`邮箱地址选择框`文本的对齐方式，有效值有： 

  `0`（正常；例如，如果文本从左到右书写，则左对齐）

  `1`（居中）

  `2`（相反；例如，如果文本从左到右书写，则右对齐）。

{:id="EmailPicker.TextColor" .color} *文本颜色*
: 设置`邮箱地址选择框`的文本颜色，使用RGBA数值表示。

{:id="EmailPicker.Visible" .boolean} *可见性*
: 设置`邮箱地址选择框`是否显示在屏幕上，值是`真`{:.logic.block}则`邮箱地址选择框`显示，`假`{:.logic.block}则隐藏。

{:id="EmailPicker.Width" .number .bo} *宽度*
: 设置`邮箱地址选择框`的水平宽度，以像素px为单位。

{:id="EmailPicker.WidthPercent" .number .wo .bo} *宽度百分比*
: 设置`邮箱地址选择框`的水平宽度相对于[`屏幕宽度`](userinterface.html#Screen.Width)的百分比。

### 事件  {#EmailPicker-Events}

{:.events}

{:id="EmailPicker.GotFocus"} 获得焦点()
: 选择`邮箱地址选择框`进行输入（例如用户触摸它）时触发该事件。

{:id="EmailPicker.LostFocus"} 失去焦点()
: 当不再选择`邮箱地址选择框`进行输入时触发该事件，例如用户触摸不同的文本框。

### 方法  {#EmailPicker-Methods}

{:.methods}

{:id="EmailPicker.RequestFocus" class="method"} <i/> 焦点请求()
: 请求焦点到当前的`邮箱地址选择框`。


## ![icon](images/phonecall.png)  电话拨号器  {#PhoneCall}

一个不可见的组件，用于拨打 [`电话号码`](#PhoneCall.PhoneNumber) 属性中指定的号码，该属性可以在界面设计或程序设计视图中设置。

  该组件有一个 [`拨打电话`](#PhoneCall.MakePhoneCall) 方法，使程序能够发起电话呼叫。

  您还可以使用 [`直接拨打电话`](#PhoneCall.MakePhoneCallDirect) 直接发起电话呼叫，无需用户交互。**但是，使用此块的应用程序如果提交到应用商店，可能需要进一步审核，因此建议改用 [`拨打电话`](#PhoneCall.MakePhoneCall)**。

  通常，此组件与 [`联系人选择框`](#ContactPicker) 组件一起使用，该组件允许用户从手机上存储的联系人中选择联系人，并将 [`电话号码`](#PhoneCall.PhoneNumber) 属性设置为 [`联系人选择框`.`电话号码`](#ContactPicker.PhoneNumber) 属性。

  要直接指定电话号码（例如 021-12345678），请将 [`电话号码`](#PhoneCall.PhoneNumber) 属性设置为具有指定数字的文本（例如“02112345678”）。

### 属性  {#PhoneCall-Properties}

{:.properties}

{:id="PhoneCall.PhoneNumber" .text} *电话号码*
: 指定要拨打的电话号码。

### 事件  {#PhoneCall-Events}

{:.events}

{:id="PhoneCall.IncomingCallAnswered"} 来电已接听时(*电话号码*{:.text})
: 指示来电已接听的事件。 `电话号码`{:.variable.block} 是来电电话号码。

{:id="PhoneCall.PhoneCallEnded"} 通话结束时(*状态*{:.number},*电话号码*{:.text})
: 指示电话通话已结束的事件。 `状态`{:.variable.block} 可以是以下任意一种：

    - `1`：来电未接或被拒绝
    - `2`：来电已接听并挂断
    - `3`：拨出电话已挂断。

{:id="PhoneCall.PhoneCallStarted"} 开始通话时(*状态*{:.number},*电话号码*{:.text})
: 指示电话呼叫已开始的事件。 `状态`{:.variable.block} 可以是以下任意一个：

    - `1`：来电正在响铃
    - `2`: 拨出电话

### 方法  {#PhoneCall-Methods}

{:.methods}

{:id="PhoneCall.MakePhoneCall" class="method"} <i/> 拨打电话()
: 启动默认拨号器应用程序，设置为使用 [`电话号码`](#PhoneCall.PhoneNumber) 属性中的号码发起电话呼叫。

{:id="PhoneCall.MakePhoneCallDirect" class="method"} <i/> 直接拨打电话()
: 使用 [`电话号码`](#PhoneCall.PhoneNumber) 属性中的号码直接发起电话呼叫，绕过用户交互来启动呼叫。

  **大多数应用程序应使用 [`拨打电话`](#PhoneCall.MakePhoneCall)，这不需要任何权限。**

## ![icon](images/phonenumberpicker.png)  电话号选择框  {#PhoneNumberPicker}

单击该按钮后，会显示联系人电话号码列表以供选择。
  
  用户做出选择后，以下属性将设置为有关所选联系人的信息：

   - [`联系人姓名`](#PhoneNumberPicker.ContactName)：联系人姓名
   - [`电话号码`](#PhoneNumberPicker.PhoneNumber): 联系人的电话号码
   - [`邮箱地址`](#PhoneNumberPicker.EmailAddress)：联系人的电子邮件地址
   - [`图片`](#PhoneNumberPicker.Picture)：包含联系人图像的文件的名称，可用作 [图像](userinterface.html#Image).[图片](userinterface.html#Image.Picture)属性值 或 [图像精灵](animation.html#ImageSprite).[图片](animation.html#ImageSprite.Picture) 属性值。

  其他属性会影响按钮的外观（[`文本对齐`](#PhoneNumberPicker.TextAlignment)、[`背景颜色`](#PhoneNumberPicker.BackgroundColor)等)以及是否可以点击([`启用`](#PhoneNumberPicker.Enabled))。

  `电话号选择框` 组件可能不适用于所有 Android 设备。例如，在3.0之前的Android系统上，返回的电话号码和电子邮件地址列表将为空。

### 属性  {#PhoneNumberPicker-Properties}

{:.properties}

{:id="PhoneNumberPicker.BackgroundColor" .color} *背景颜色*
: 设置`电话号选择框`的背景颜色，使用RGBA数值表示，如果设置了[`图像`](#PhoneNumberPicker.Image)属性，则不能显示背景颜色直到删除[`图像`](#PhoneNumberPicker.Image)属性为止。

{:id="PhoneNumberPicker.ContactName" .text .ro .bo} *联系人姓名*
: 返回所选联系人的全名，如果名称不可用，则返回空字符串。

{:id="PhoneNumberPicker.ContactUri" .text .ro .bo} *联系人URI*
: 返回指定联系人在设备上的位置的 URI。

{:id="PhoneNumberPicker.EmailAddress" .text .ro .bo} *邮箱地址*
: 返回所选联系人的主电子邮件地址，如果电子邮件地址不可用，则返回空字符串。

{:id="PhoneNumberPicker.EmailAddressList" .list .ro .bo} *邮箱地址列表*
: 返回与所选联系人关联的电子邮件地址列表。

{:id="PhoneNumberPicker.Enabled" .boolean} *启用*
: 设置`电话号选择框`是否可以被激活和点击。

{:id="PhoneNumberPicker.FontBold" .boolean} *粗体*
: 设置`电话号选择框`的显示字体是否是粗体。（注：有些字体不支持粗体）。

{:id="PhoneNumberPicker.FontItalic" .boolean} *斜体*
: 设置`电话号选择框`的显示字体是否是斜体。（注：有些字体不支持斜体）。

{:id="PhoneNumberPicker.FontSize" .number} *字体大小*
: 设置`电话号选择框`的字体大小，以像素px为单位。

{:id="PhoneNumberPicker.FontTypeface" .number .do} *字体*
: 设置`电话号选择框`的字体，目前支持的字体有：default,  serif,  sans serif,  和 monospace。

  要使用自定义字体，请将 **.ttf** 字体文件上传并选中它。

{:id="PhoneNumberPicker.Height" .number .bo} *高度*
: 设置`电话号选择框`的垂直高度，以像素px为单位。

{:id="PhoneNumberPicker.HeightPercent" .number .wo .bo} *高度百分比*
: 设置`电话号选择框`的垂直高度相对于整个[`屏幕高度`](userinterface.html#Screen.Height)的百分比。

{:id="PhoneNumberPicker.Image" .text} *图像*
: 设置`电话号选择框`图像的路径，如果同时设置了`图像`和[`背景颜色`](#PhoneNumberPicker.BackgroundColor)，则仅`图像`可见。

{:id="PhoneNumberPicker.PhoneNumber" .text .ro .bo} *电话号码*
: 返回与所选联系人关联的主要电话号码，如果没有与该联系人关联的电话号码，则返回空字符串。

{:id="PhoneNumberPicker.PhoneNumberList" .list .ro .bo} *电话号码列表*
: 返回与所选联系人关联的电话号码列表。

{:id="PhoneNumberPicker.Picture" .text .ro .bo} *图片*
: 返回所选联系人的图片URI，可用于检索联系人的照片和其他字段。

{:id="PhoneNumberPicker.Shape" .number .do} *形状*
: 设置`电话号选择框`的形状，此属性的有效值为：

  `0`（默认）

  `1` （圆形）

  `2`（矩形）

  `3`（椭圆形）。
  
  如果设置了[`图像`](#PhoneNumberPicker.Image)，则`形状`将不可见。

{:id="PhoneNumberPicker.ShowFeedback" .boolean} *显示反馈*
: 设置`电话号选择框`指定 [`图像`](#PhoneNumberPicker.Image)后被按压是否显示视觉反馈。

{:id="PhoneNumberPicker.Text" .text} *文本*
: 设置`电话号选择框`的显示文本。

{:id="PhoneNumberPicker.TextAlignment" .number .do} *文本对齐*
: 设置`电话号选择框`文本的对齐方式，有效值有： 

  `0`（正常；例如，如果文本从左到右书写，则左对齐）

  `1`（居中）

  `2`（相反；例如，如果文本从左到右书写，则右对齐）。

{:id="PhoneNumberPicker.TextColor" .color} *文本颜色*
: 设置`电话号选择框`的文本颜色，使用RGBA数值表示。

{:id="PhoneNumberPicker.Visible" .boolean} *可见性*
: 设置`电话号选择框`是否显示在屏幕上，值是`真`{:.logic.block}则`电话号选择框`显示，`假`{:.logic.block}则隐藏。

{:id="PhoneNumberPicker.Width" .number .bo} *宽度*
: 设置`电话号选择框`的水平宽度，以像素px为单位。

{:id="PhoneNumberPicker.WidthPercent" .number .wo .bo} *宽度百分比*
: 设置`电话号选择框`的水平宽度相对于[`屏幕宽度`](userinterface.html#Screen.Width)的百分比。

### 事件  {#PhoneNumberPicker-Events}

{:.events}

{:id="PhoneNumberPicker.AfterPicking"} 选择完成()
: 在`电话号选择框`活动返回其结果且属性已填写后触发该事件。

{:id="PhoneNumberPicker.BeforePicking"} 准备选择()
: 单击`电话号选择框`或使用 [打开选框](#PhoneNumberPicker.Open) 方法显示选择器时触发该事件。

  此事件发生在选择器显示之前，可用于在显示选择器之前准备好选择器。

{:id="PhoneNumberPicker.GotFocus"} 获得焦点()
: 表示光标移到`电话号选择框`上方，因此现在可以单击它。

{:id="PhoneNumberPicker.LostFocus"} 失去焦点()
: 表示光标已从`电话号选择框`移开，因此现在无法再单击它。

{:id="PhoneNumberPicker.TouchDown"} 被按压()
: 表示`电话号选择框`已被按下。

{:id="PhoneNumberPicker.TouchUp"} 被松开()
: 表示`电话号选择框`按压已释放。

### 方法  {#PhoneNumberPicker-Methods}

{:.methods}

{:id="PhoneNumberPicker.Open" class="method"} <i/> 打开选框()
: 打开`电话号选择框`选框，就像用户单击它一样。

{:id="PhoneNumberPicker.ViewContact" class="method"} <i/> 查看联系人(*URI*{:.text})
: 在设备的默认联系人App中打开所选联系人的条目。

## ![icon](images/sharing.png)  信息分享器  {#Sharing}

`信息分享器`是一个不可见的组件，可以让App和设备上其他App之间共享数据或文件。
该组件将显示已安装的可处理所提供信息的App列表，并允许用户选择一个App来共享内容，例如邮件App、社交网络App、短信App等。

  文件路径可以来自其他组件，例如[`照相机`](media.html#Camera) 或 [`图像选择框`](media.html#ImagePicker)，但也可以指定直接从存储中读取。
  请注意：不同的设备处理的存储路径可能不同，例如有一个名为 `arrow.gif` 的文件在文件夹 `Appinventor/assets` 中，它的表示方式可能是：

 - `"file:///sdcard/Appinventor/assets/arrow.gif"`; 或
 - `"/storage/Appinventor/assets/arrow.gif"`

  * `分享消息` 弹出其他App的界面：弹出的是文档（保存文本到文档）、地图（文本作为搜索地址）、蓝牙（传输文本数据）之类的App，**没有打印机相关的，打印机App在`分享文件`的方式才弹出**。

  <img src="images/sharing/分享消息弹出界面.jpg" alt="分享消息弹出界面" style="width:30%; border:1px solid #eee;"/>

  * `分享文件`、`分享文件及消息` 弹出其他App的界面：`分享文件`的方式弹出的App几乎非常全面了，包括打印机App（打印分享的文件）。`分享文件及消息`弹出的和`分享文件`是一致的。

  <img src="images/sharing/分享文件弹出界面.jpg" alt="分享文件（分享文件及消息）弹出界面" style="width:30%; border:1px solid #eee;"/>

### 属性  {#Sharing-Properties}

{:.properties}
无


### 事件  {#Sharing-Events}

{:.events}
无


### 方法  {#Sharing-Methods}

{:.methods}

{:id="Sharing.ShareFile" class="method"} <i/> 分享文件(*文件*{:.text})
: 通过显示可用的应用程序列表并允许用户从列表中选择一个，通过手机上安装的任何功能强大的应用程序共享文件。选定的应用程序将打开，向其中传入文件。

<img src="images/sharing/分享文件.jpg" alt="分享文件效果预览" style="width:30%; border:1px solid #eee;"/>

{:id="Sharing.ShareFileWithMessage" class="method"} <i/> 分享文件及消息(*文件*{:.text},*消息*{:.text})
: 通过显示可用的应用程序列表并允许用户从列表中选择一个，通过手机上安装的任何功能强大的应用程序共享文件及消息。选定的应用程序将打开，向其中传入文件及消息。

<img src="images/sharing/分享文件及消息.jpg" alt="分享文件及消息效果预览" style="width:30%; border:1px solid #eee;"/>

{:id="Sharing.ShareMessage" class="method"} <i/> 分享消息(*消息*{:.text})
: 通过显示可用的应用程序列表并允许用户从列表中选择一个，通过手机上安装的任何功能强大的应用程序共享消息。所选应用程序将打开，并向其中传入消息。

<img src="images/sharing/分享消息.jpg" alt="分享消息效果预览" style="width:30%; border:1px solid #eee;"/>


## ![icon](images/texting.png)  短信收发器  {#Texting}

当调用组件 [`发送消息`](#Texting.SendMessage) 方法时，将启动设备的首选短信应用程序将属性中指定的短信内容发送到 [`电话号码`](#Texting.PhoneNumber) 属性中指定的电话中。
  
  也可以通过调用 [`直接发送消息`](#Texting.SendMessageDirect) 直接发送短信，而无需进行交互，但前提是应用程序已请求危险权限。

  * 如果 [`启用消息接收`](#Texting.ReceivingEnabled) 属性设为 1，将不会收到消息。 
  * 如果 [`启用消息接收`](#Texting.ReceivingEnabled) 属性设为 2，消息将仅在应用程序正在运行的时候才被接收。
  * 如果 [`启用消息接收`](#Texting.ReceivingEnabled) 属性设置 3，则消息将在应用程序正在运行时被接收；当应用程序未运行时，消息将排队给用户显示通知消息。

  当消息到达时，将触发 [`收到消息`](#Texting.MessageReceived) 事件，并提供发送号码和消息。

  包含此组件的应用程序即使在后台也会收到消息（即当它在屏幕上不可见时），而且**只要应用程序安装在手机上了，即使没有运行也能收到消息**。

  如果应用程序不在手机前台运行，收到短信时手机将在通知栏中显示一条通知。选中通知栏的通知将调出该应用程序，作为应用程序开发人员，你可能希望为用户提供控制 `启用消息接收` 的能力，这样他们就可以让手机忽略短信。

<br/>
  如果 [`启用谷歌语音`](#Texting.GoogleVoiceEnabled) 属性为`真`{:.logic.block}，则可以通过 Wifi 使用谷歌语音发送消息。

  此选项要求用户拥有谷歌语音帐户并且手机手机上安装了语音应用程序，谷歌语音选项仅适用于支持 Android 2.0 (Eclair) 或更高版本。
  
  **不幸的是，由于以下原因，谷歌语音App中引入的变更，导致谷歌语音不再被接收。**

  要指定电话号码（例如 650-555-1212），请将 `电话号码` 属性设置为文本字符串与指定的数字（例如，6505551212），可能包含破折号、点和括号（例如，(650)-555-1212）会被忽略，但是不能有空格。

  应用程序指定电话号码的另一种方法是包含 [`电话号选择框`](#PhoneNumberPicker) 组件，它允许用户从手机中存储的电话号码中选择一个联系人。


### 属性  {#Texting-Properties}

{:.properties}

{:id="Texting.GoogleVoiceEnabled" .boolean} *启用GoogleVoice*
: 如果此属性为 `真`，则 [发送消息](#Texting.SendMessage) 将尝试使用 Google语音通过 WiFi 发送消息。

{:id="Texting.Message" .text} *消息*
: 调用 [`发送消息`](#Texting.SendMessage) 方法时将发送的消息。
  
  标准 SMS 消息的最大长度通常为 170。对于使用变音符号的语言，该长度可能会更短。

{:id="Texting.PhoneNumber" .text} *电话号码*
: 调用 [`发送消息`](#Texting.SendMessage) 方法时消息将发送到的号码。

{:id="Texting.ReceivingEnabled" .number} *启用消息接收*
: 如果设置为 1（关闭），则不会收到任何消息。

  如果设置为 2（前台）或 3（始终），组件将在运行时响应消息。在 2（前台）的情况下，应用程序未运行时收到的消息将被丢弃。在 3（始终）的情况下，应用程序未运行时收到的消息将显示通知。
  
  选择通知将打开应用程序并触发 [`收到消息`](#Texting.MessageReceived) 事件。应用程序休眠时收到的消息将排队，因此应用程序唤醒时可能会触发多次 [`收到消息`](#Texting.MessageReceived) 事件。作为应用程序开发人员，最好让你的用户控制此属性，这样用户就可以在安装您的应用程序时让手机忽略短信。

### 事件  {#Texting-Events}

{:.events}

{:id="Texting.MessageReceived"} 收到消息(*数值*{:.text},*消息内容*{:.text})
: 手机收到短信时触发该事件。

  **使用此块将添加[危险权限](//developer.android.com/guide/topics/permissions/overview#dangerous_permissions)，如果你的应用提交到应用商店，则需要额外批准。**

  需要请求的权限名称如下：

  {:.vip}
  权限名：`android.permission.READ_SMS`。

### 方法  {#Texting-Methods}

{:.methods}

{:id="Texting.SendMessage" class="method"} <i/> 发送消息()
: 启动手机的默认短信应用程序，并预先填充消息和电话号码。

{:id="Texting.SendMessageDirect" class="method"} <i/> 直接发送消息()
: 发送一个文本消息。

  **使用此块将添加[危险权限](https://developer.android.com/guide/topics/permissions/overview#dangerous_permissions)，如果您的应用提交到应用商店，则需要额外批准。**

  需要请求的权限名称如下：

  {:.vip}
  权限名：`android.permission.SEND_SMS`。
