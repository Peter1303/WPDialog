# WPDialog
仿Windows Phone的对话框

==========
<img src='https://github.com/Peter1303/WPDialog/blob/master/images/Screenshot_2016-08-07-20-14-26-802_com.WPDialog.app.png' height='400'/> 
<img src='https://github.com/Peter1303/WPDialog/blob/master/images/Screenshot_2016-08-07-20-14-34-759_com.WPDialog.app.png' height='400'/>
<img src='https://github.com/Peter1303/WPDialog/blob/master/images/Screenshot_2016-08-07-20-14-38-395_com.WPDialog.app.png' height='400'/>
<img src='https://github.com/Peter1303/WPDialog/blob/master/images/Screenshot_2016-08-07-20-14-40-995_com.WPDialog.app.png' height='400'/>
<img src='https://github.com/Peter1303/WPDialog/blob/master/images/Screenshot_2016-08-07-20-14-43-507_com.WPDialog.app.png' height='400'/>
<img src='https://github.com/Peter1303/WPDialog/blob/master/images/Screenshot_2016-08-07-20-14-46-569_com.WPDialog.app.png' height='400'/>
<img src='https://github.com/Peter1303/WPDialog/blob/master/images/Screenshot_2016-08-07-20-14-58-478_com.WPDialog.app.png' height='400'/>
<img src='https://github.com/Peter1303/WPDialog/blob/master/images/Screenshot_2016-08-07-20-24-58-727_com.WPDialog.app.png' height='400'/>
<img src='https://github.com/Peter1303/WPDialog/blob/master/images/Screenshot_2016-08-07-20-25-06-450_com.WPDialog.app.png' height='400'/>

#[Demo下载](https://github.com/Peter1303/WPDialog/blob/master/bin/WPDialog.apk?raw=true)

##### 这个WPDialog有以下特点：
- 极简而且体积小
- 仿Windows Phone 10风格
- 默认雅黑主题，当然，还有简洁白主题
- 可以自定义View
- 可在顶部显示

### Gradle
```groovy
compile 'com.widget.WPDialog'
```

使用方法：
普通例子：
```java
final WPDialog wp=new WPDialog(this);
		wp.setTitle(titlte)
		.setMessage(message)
			.setPositiveButton(ok, new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					wp.dismiss();
				}
			})
			.setNeutralButton(neutral, new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					wp.dismiss();
				}
			})
			.setNegativeButton(cancel, new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					wp.dismiss();
				}
			})
		.show();
```
如果只需要单个按钮，你可以不创建该按钮的监听事件或者：
```java
wp.setPositiveButton(“”, new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					wp.dismiss();
				}
			})；
```
添加View只需要：
```java
wp.setView(view)；
```
在顶部显示只需要：
```java
wp.setTopDialog(true)；
```
设置简洁白主题:
```java
wp.setLightTheme();
```
设置标题：
```java
wp.setTitle(titlte);
```
设置内容：
```java
wp.setMessage(message);
```
设置“确定”按钮：
```java
wp.setPositiveButton(ok, new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					wp.dismiss();
				}
			});
```
设置“中间”按钮：
```java
wp.setNeutralButton(neutral, new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					wp.dismiss();
				}
			});
```
设置“取消”按钮：
```java
wp.setNegativeButton(cancel, new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					wp.dismiss();
				}
			});
```
Dismiss方法：
```java
wp.dismiss();
```
设置Dismiss监听方法：
```java
wp.setOnDismissListener(new DialogInterface.OnDismissListener(){});
```
设置不可取消：
```java
wp.setCancelable(false)
```

#### License
<pre>
Copyright 2016 Peter&DevelopTeam

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
</pre>
