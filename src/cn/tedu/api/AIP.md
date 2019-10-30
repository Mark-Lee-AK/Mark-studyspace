# API

> Application Programming Interface 应用编程接口。**一切可以调用的东西都是API**

```java
java.lang //包，这个包会自动导入
java.lang.Object
java.lang.String
java.lang.StringBuilder
java.lang.StringBuffer
// 正则表达式
// 包装类等
```



## Object

> 所有类的父类，在java.lang包中，这个包不需要我们手动导包

### 常用方法

`toStrong()`默认返回 `类名@地址` 格式，用来展示对象的地址值，如： a00000.Student@a0834e7。 如果想看属性值，就需要重写这个方法，重写后返回的就是把属性值拼接成字符串，如：`Student[name = 苏大强, age = 20, id = 10001]`

`equals(Object obj)`当前对象和参数对象比较大小，默认是比较内存地址，如果要比较对象属性，可以重写该方法。

`hashCode()`返回该对象的哈希码值



## String

> 就是一个封装cha[]数组的对象

### 创建String对象

如果是第一次使用字符串，java会在字符串常量池创建一个对象。
再次使用相同内容时，会直接访问常量池中存在的对象。

```java
//方式1:
String str = "abc"; //在堆内存中的常量池开辟空间并存储,效率高
//方式2:在堆内存
String str2 = new String(); 
String str2 = new String(char[] value)
```

### 常见方法

```java
char charAt(int index);//返回指定索引出的char值
boolean endsWith(String suffix);//测试此字符串是否以指定的后缀结束
boolean equals(Object anObject);//将此字符串与指定的对象比较
byte[] getBytes();//使用平台的默认字符集将次String编码为byte序列,并将结果存储到一个新的byte[]数组内
int indexOf(String str);//返回指定字符串在此字符串中第一次出现的索引
int lastIndexOf(String str);//返回指定字符串在此字符串中最右边出现的索引
int length();//返回字符串的长度
String[] split(String regex);//根据给定正则表达式的匹配拆分此字符串
boolean startsWith(String prefix);//测试此字符串是否以指定前缀开始
String substring(int beginIndex);//返回从指定索引位置到末尾截取的新字符串
String substring(int beginIndex, int endIndex);//返回从指定索引位置间截取的新字符串
static String valueOf(Object o);//把不同类型的数据转换成字符串表示形式
```



## StringBuilder/StringBuffer

> - 封装了char[]数组
> - 是可变的字符序列
> - 提供一组可以对字符内容修改的方法
> - 常用append()来代替字符串做字符串拼接
> - 内部字符数组默认初始容量是16 : `super(str.length + 16);`
> - 如果大于16会尝试扩容,新数组大小是原来的2倍+2
> - 如果还不够大,直接扩充到需要的容量大小: `int newCapacity = vlaue.length*2+2;`

### 常见方法

```java
append();
```



## 包装类

> 把基本类型进行包装,提供更完善的功能

### 与基本类型的对应关系

| 基本类型 | 包装类型  |
| :------- | --------- |
| byte     | Byte      |
| short    | Short     |
| int      | Integer   |
| long     | Long      |
| float    | Float     |
| double   | Double    |
| char     | Character |
| boolean  | Boolean   |

### Numer

> 所有数字包装类的抽象父类
> 提供各种获取值的方式

### 子类

**Byte,Double,Flaot,Integer,Long,Short,**AtomicInteger,AtomicLong,BigDecimal,BigInteger

常用方法

### 常用方法

| 返回类型 | 方法名        | 用法                       |
| -------- | ------------- | -------------------------- |
| byte     | byteValue()   | 以byte形式返回指定的数值   |
| double   | doubleValue() | 以double形式返回指定的数值 |
| float    | floatValue()  | 以float形式返回指定的数值  |
| int      | intValue()    | 以int形式返回指定的数值    |
| long     | longValue()   | 以long形式返回指定的数值   |
| short    | shortValue()  | 以short形式返回指定的数值  |

### Integer

> 包装了int类型

**创建对象**

```java
new Integer(5);
Integer.valueOf(5);//在Integer类中,包含256个Integer缓存对象,范围是-128到127。使用valueOf()时,如果是指定范围内的值,访问缓存对象而不新建,如果是指定范围外的值,直接新建对象。
```

**常见方法**

```java
static int parseInt(String s);// 将字符串参数作为有符号的十进制整数进行解析
static Integer valueOf(String s);// 返回保存指定的String的值的Integer对象
```

### Double

> 包装了Double对象

**创建对象**

```java
new Double(3.14);
Double.valueOf(3.14);//和new没啥区别
```

**常见方法**

```java
static double parseDoule(String s);//返回一个新的double值,该值被初始化为指定String表示的值,这与Double类的valueOf()方法一致
static Double valueOf(double d);//返回指定的double值的Double实例
```



## 日期类Date

> java.util.Date 包中
> 用来封装一个毫秒值表示一个精确的时间点
> 从1970-1-1 0点开始的毫秒值

### 创建对象

```java
new Date();//封装的是系统当前时间的毫秒值
new Date(9000000000000000L);//封装指定的时间点
```

### 常用方法

```java
int getDay();
int getHours();
int getMonth();
int getMinutes();
long getTime();
int getYear();
String toLocaleString();
compareTo(Date);//当前对象与参数对象比较,但前对象大于返回正数,小于返回负数,相同为0;
```



## 日期工具SimpleDateFormat

> 日期格式化工具,可以把Date对象格式化成字符串,也可以把日期字符串解析成Date对象

### 创建对象

```java
new SimpleDateFormat(String str);
// str - > 格式表达式
// yyyy-MM-dd HH:mm:ss -> 2019-10-30 20:30:30
// MM/dd/yyy  ->  10/30/2019 
```

### 常见方法

```java
String d = format(Date);//把Date对象格式化成字符串
Date d = parse(String);//把字符串解析成Date对象
```

