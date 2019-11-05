# XML+JSON+NIO



## 属性文件

>  xxx.properties文件一般用来作为程序的配置文件
>
> 例如:连接数据库时,需要知道数据库服务器的地址,用户名,密码等
> 这些连接信息可以存在properties配置文件中,便于修改维护

java提供准们的工具来读写这种格式的数据: `java.util.Properties` 类

### 格式

```properties
#数据库链接配置
#\u6570\u636E\u5E93\u94FE\u63A5\u914D\u7F6E
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://127.0.0.1:3306/yhmisdb?useUnicode=true&characterEncoding=utf8&autoReconnect=true&allowMultiQueries=true
jdbc.username=root
jdbc.password=root
```

- 属性文件是纯文本类型，本质就是txt文件
- #后面代表单行注释，尽量不要在属性文件中出现中文
- 每行都是a=1结构，a不能重复

### 读取属性文件

##### 指定属性文件位置,必须在src下

用 `.class.getResourceAsStream("/文件名")` 方法 - 查找具有给定名称的资源

**注意 :**  path 不以’/'开头时默认是从此类所在的包下取资源，以’/'开头则是从ClassPath根下获取。 
要通过该对象的类加载器执行,如果该对象由引导类加载器加载,则该方法委托为`ClassLoader.getResourceAsStream("/文件名")`

```java
InputStream in = Test1_Prop.class.getResourceAsStream("/jdbc.properties");
```

##### 加载属性文件Properties

创建Properties工具类实例prop,用`prop.load(InputStream对象)`加载

```java
Properties prop = new Properties();
prop.load(in);
```

##### 分析数据

用`Properties.get(String key)`方法获取数据内容
需要强转为String类型

```java
String key = (String) prop.get("jdbc.driver"); //向下转型
```



## XML文件

>可扩展标记语言，标准通用标记语言的子集，简称XML。是一种用于标记电子文件，使其具有结构性的标记语言

### 格式

1. 开始标签和结束标签，如：`<select>???</select>`
2. 标签可以嵌套使用，如：`<select><sql>???</sql></select>`
3. 每个标签都可以设置属性，属性名和属性值用 “=” 连接
4. 想获取xml中存在的数据，通常使用Dom4j技术实现，由于是第三方的开源技术，使用时需要单独导入jar包

### Dom4j

> 全称 : DOM API for Java
> 是一个Java的XML API，是jdom的升级版，用来读写XML文件。

利用AXReader对象把xml数据读取在内存中，组成一个树状结构，再用不同对象来表示其他节点

```
Document
--Element
    --getRootElement()
    --element()
--Attribute
```

### 步骤

指定xml文件路径

```java
InputStream in = new Test1_Dom4j.class.getResourceAsStream("/spring.xml")
```

解析xml文件，形成Document文档

```java
SAXReader reader = new SAXReader();
Document doc = reader.read(in);
```

获取元素

```java
// 获取根元素
Element rootElement = doc.getRootElement();
// 获取每一个元素
List<Element> list = rootElement.elements();
```

遍历每个元素，根据属性名获取属性值

```java
for(Element a : list){
    Attribute attrid = a.attribute("id");
    Attribute attrclass = a.attribute("class");
}
```



## JSON文件

