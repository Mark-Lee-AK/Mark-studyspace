# IO

> in/out相对程序而言的输入(读取)和输出(写出)的过程,在Java中,根据处理的数据单位不同,分为字节流和字符流

### 继承结构

```java
java.io:
File
//字节流:针对二进制文件
InputStream
	- FileInputStream
	- BufferedInputStream
	- ObjectInputStream
OutputStream
	- FileOutputStream
	- BufferedOutputStream
	- ObjectOutputStream
//字符流:针对文本文件,读写容易发生乱码现象,在读写时最好指定编码集为utf-8
Writer
	- BufferedWriter
	- OutputStreamWriter
Reader
	- BufferedReader
	- InpuStreamReader
	- PrintWriter/PrintStream
```

### 流的概念

数据的读写抽象成数据,在管道中流动

- 流只能单方向流动
- 输入流用来读取in
- 输出流用来写出out
- 数据只能从头到位顺序的读写一次

![](C:\Users\JAVA\Desktop\image002.jpg)

------



# File文件流

> 封装一个磁盘路径字符串,对这个路径可以执行一次操作
> 可以用来封装文件路径/文件夹路径/不存在的路径

### 创建对象

```java
File(String pathname);
// 通过将给定路径名字符串 转换为抽象路径名来创建一个新File实例.
```

### 常用方法

##### 文件/文件夹属性

```java
length();//文件的字节量
exists();//是否存在,存在返回true
isFile();//是否为文件,是文件返回true
isDirectory;//是否为文件夹,是文件夹返回true
getName();//获取文件/文件夹名
getParent();//获取父文件夹
getAbsolutePath();//获取完成路径
```

##### 创建/删除

```java
careteNewFile();//新建文件,文件不会存在异常,文件已经存在返回false
mkdirs();//是否需要新建多层文件夹
mkdir();//是否需要新建单层文件夹
delete()://删除文件,删除空文件夹
```

##### 文件夹列表

```java
list();//返回String[],包含文件名
listFile();//返回File(),包含文件对象
```

------



# 字节流

>字节流是有字节组成的,java中两个字节组成一个字符,字节流是最基本的,**主要处理二进制数据**
>流传输主要指**将整个音频和视频及三维媒体等多媒体文件**经过特定的方式解析成一个压缩包,由视频服务器向用户计算机顺序或实时传送



## InputStream抽象类

> 此抽象类是表示字节输入流的所有类的超类/抽象类

### 常用方法

```java
abstract int read();//从输入流中读取数据的下一个字节
int read(byte[] b);//从输入流找那个读取一定数量的字节,并将其存储在缓冲区数组b中
int read(byte[] b,int off,int len);//将输入流中最多len个数据字节读入byte数组中
void close();//关闭次输入并释放与该流关联的所有系统资源
```

### FileInputStream子类

> FileInputStream extends InputStream;
> 直接插在文件上,直接读取文件数据

##### 创建对象

```java
//通过打开一个到实际文件的连接来创建一个FileInputStream,该文件通过文件系统中的File对象file指定
FileInputStream(File file);
//通过打开一个到实际文件的连接来创建一个FileInputStream,该文件通过文件系统中的路径名name指定
FileInputStream(String pathname)
```

### BufferedInputStream子类

> FilterInputStream extends InputStream;
> BufferedInputStream extends FilterInputStream;
>
> BufferedInputStream为另一个输入流添加一些功能:缓冲输入以及支持mark和reset方法
> 在创建的同事也会创建一个内部缓冲区(默认8M大小),在读取或跳过流汇总的字节时,根据需要从包含的输入流再次填充该内部缓冲区,一次填充多个字节

##### 创建对象

```java
//创建一个BufferedInputStream并保存其参数,即输入流in,以便将来使用
BufferedInputStream(InputStream in);
```



## OutputStream抽象类

> 表示输出字节流所有类的超类

```java
void close();// 关闭此输出流并释放与此流有关的系统资源
void flush();// 刷新此输出流并强制写出所有缓冲的输出字节
void wirte(byte[] b);// 将b.length个字节从指定的byte数组写入此输出流
void write(byte[] b, int off, int len);//将指定byte数组从偏移量off开始的len个字节写入此输出流
abstract void write(int b);//将指定的字节写入此输出流
```

### FileOutputSteam子类

> FileOutputSteam extends OutputStream
>
> 直接插在文件上,直接写出文件数据

##### 创建对象

```java
FileOutputStream(String name);//创建一个向具有指定名称的文件中写入数据的输出文件流
FileOutputStream(File file);//创建一个指定file对象表示的文件汇中写入数据的输出流
```

### BufferedOutputStream子类/高级流

> FilterOutputStream extends OutputStream
> BufferedOutputStream extends FilterOutputStream 
>
> 实现缓冲的输出流，通过设置这种输出流，应用程序就可以将各个字节写入底层输出流中，而不必真毒每次字节写入调用底层系统

##### 创建对象

```java
BufferedOutputStream(OutputStream out);//创建一个新的缓冲输出流,以将数据写入指定的底层输出流
```



# 字节流

> 常用语处理纯文本



## Reader抽象类

> 用于读取字符流的抽象类

### 常用方法

```java
int read();//读取单个字符
int read(char[] cbuf);//将字符读入数组
abstract int read(char[] cbuf,int off,int let);//将字符读入数组的某一部分
int read(CharBuffer target);//试图将字符读入指定的字符缓冲区
abstract void close();//关闭该流并释放与之相关的所有资源
```

### InputStreamReader子类

> 字节流通向字符流的桥梁,使用指定的charset读取字节并将其解码为字符
> 使用的字符集可以由 名称/显式给定/平台默认的字符集 指定

##### 创建对象

```java
InputStreamReader(InputStream in,String charsetName);//创建使用指定字符集的InputStreamReader
InputStreamReader(InputStream);//创建一个使用默认字符集的InputStreamReader
```

### BufferedReader子类

> 从字符输入流中读取文本,缓冲各个字符,从而实现字符,数组和行的高效读取
> 可以指定缓冲区的大小,或者使用默认的大小,大多数情况下,默认值就足够大了

##### 创建对象

```java
BufferedReader(Reader in);//创建一个使用默认大小输入缓冲区的缓冲字符输入流
```



## Writer抽象类

> 写入字符流的抽象类

### 常用方法

```java
void write(char[] cbuf);//写入字符数组
abstract void write(char[] cbuf,int off,int len);//写入字符数组的某一部分
void write(int c);//写入单个字符
void write(String str);//写入字符串
void write(String str,int off,int len);//写入字符串的一部分
abstract void close();//关闭此流,但要先刷新它
```

### OutputStreamWriter子类

> 字符流通向字节流的桥梁
> 可使用指定charset将要写入流中的字符编码成字节
> 可以由 名称/显式给定/平台默认 指定的字符集

##### 创建对象

```java
OutputStreamWriter(OutputStream out,String charsetName);
// 创建指定字符集的OutputStreamWriter
OutputStreamWriter(OutputStream out);
// 创建默认字符集的OutputStreamWriter
```

### BufferedWriter子类/高级流

> 将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 可以指定缓冲区的大小，或者接受默认的大小。在大多数情况下，默认值就足够大了。 

##### **创建对象**

```java
BufferedWriter(Writer out);
//创建一个使用默认大小输出缓冲区的缓冲字符输出流。
```

