# JDBC

> JDBC：Java DataBase Connectivity
> Java数据库连接：通过Java语言操作数据库的一门技术

在Java开发中，我们不是通过cmd来操作数据库的，更多的是通过Java程序来操作数据库，需要用到 **JDBC** 这门技术。

### 如何访问JDBC数据库

| 提出需求                                                     |
| ------------------------------------------------------------ |
| 创建一个 jt_db 数据库，在库中创建一个account表，并插入三条记录，然后利用Java程序查询出account表中所有的记录，并打印在控制台上。 |

| 开发步骤                                                     |
| ------------------------------------------------------------ |
| 准备数据, 创建jt_db库, 创建account表并插入若干条记录         |
| 创建JAVA工程，并导入mysql驱动包(mysql厂商提供的一个jar包)<br />注册数据库驱动<br />获取数据库连接<br />获取传输器<br />发送SQL到服务器执行,返回执行结果<br />处理结果<br />释放资源 |
| 创建类并实现JDBC程序(六个步骤)                               |
| 测试程序                                                     |

### **注册数据库驱动**

```java
Class.forName("com.mysql.jdbc.Driver");
```

`forName()`方法是反射中用于加载类的一个方法，将指定的路径下的类加载到内存中，变为字节码对象。
加载一个类,会让类中的静态代码块立即执行,在`Driver`类中有一个静态代码块，静态代码块有一行注册驱动的代码：

```java
DriverManager.registerDriver(new Driver());
```

注册驱动就是mysql驱动程序加入JDBC程序中,方便我们使用mysql

### **获取数据库连接** 

```java
Connection conn = DriverManager.getConnection(
    // 路径地址 
    "jdbc:mysql://localhost:3306/jt_db?characterEncoding=utf-8",
    // 账号密码
    "root","123");
```

`Connection` 连接对象是JDBC程序汇总至关重要的一个对象，是Java程序和mysql服务器之间的一个通道,可以基于这个连接,发送SQL语句到服务器执行,并返回执行结果。在调用`getConnection()`方法时，需要传递数据库的URL地址以及数据库的用户和密码。

| 协议名 // 主机地址 : 端口 / 数据库名 ? 连接参数           |
| --------------------------------------------------------- |
| jdbc:mysql://localhost:3306/jt_db?characterEncoding=utf-8 |
| URL地址的简写形式,如果连接的端口是3306,可以省略不写       |
| jdbc:mysql://localhost:/jt_db?characterEncoding=utf-8     |
| 如果连接的是本地的数据服务器,localhost也可以省略不写      |
| jdbc:mysql://characterEncoding=utf-8                      |

此外,Connection对象提供了获取传输器的方法

```java
Statement stat = conn.createStatement();
preparedStatement ps = conn.prepareStatement(); // 常用这个
```

### **获取Statement传输器对象**

传输器对象可以将SQL语句发送到服务器执行,执行后还可以返回执行结果,其中提供了发送SQL语句的方法 : 

```java
// 用于执行查询类型的SQL语句,返回值是包含结果的ResultSet对象
ResultSet rs = stat.executeQuery(sql);
// 用于执行增加\删除\修改类型的sql语句,返回值是影响的记录行数
int rows = executeUpdate(String sql);
```

### 获取ResultSet结果集对象

ResultSet 适用于获取查询类型的语句执行后的结果
其中提供了遍历数据行的方法和获取数据的方法:

```java
rs.next();// 将指向数据行的索引向下挪动一行,返回true表示挪动后指向了一行记录,也就是有数据,如果返回false,则说明没有数据
rs.getInt(columeName);
rs.getString(columeName);
rs.getDouble(columeName);
...
rs.getObject(columeName);// 获取所有类型的结果
```

### 释放资源

```java
rs.close();
stat.close();
conn.close();
// 释放资源时,遵循越晚获取的越先关闭
```

为了避免因为前面的代码抛异常没导致释放资源的代码没有执行,资源没有释放,可以将释放资源的代码改为如下过程 : 

```java
try{...}catch{...}finally{
    if(rs != null){
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            rs = null;
        }
    }
    if(stat != null){
        try {
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            stat = null;
        }
    }
    if(conn != null){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            conn = null;
        }
    }
}
```

### 代码实现

```java
package com.tedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/*
 * Jdbc的快速入门
 * 查询account表中的所有记录,输出到控制台
 * com.tedu.jdbcDemo1
 */
public class jdbcDemo1 {
    public static void main(String[] args) throws Exception {
        // 1.注册数据库驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.获取数据库连接
        Connection conn = DriverManager.getConnection(
            // 路径地址,jdbc:mysql://固定写法,localhost:3306 本机
            "jdbc:mysql://localhost:3306/jt_db?characterEncoding=utf-8",
            "root", "123");// 用户名的和密码
        // 3.获取传输器
        Statement stat = conn.createStatement();
        // 4.发送SQL到服务器执行,返回执行结果
        String sql = "select * from account";
        // .executeQuery -> 查询
        ResultSet rs = stat.executeQuery(sql);
        // 5.处理结果
        while (rs.next()) {
            System.out.println(rs.getInt("id")+":"+
                               rs.getString("name")+":"+
                               rs.getDouble("money"));
        }
        // 6.释放资源
        rs.close();
        stat.close();
        conn.close();
        System.out.println("jdbcDemo1.main()");// syst + alt + /
    }
}
```



## PreparedStatement对象

> 实际开发中,我们用preparedStatement比Statement多,preparedStatement是Statemenet的子接口,比Statement更加安全,并且能够提高程序执行的效率

### 模拟用户登录案例

##### 准备数据

```mysql
use jt_db; 
create table user( 
	id int primary key auto_increment,
	username varchar(50), 
	password varchar(50)
); 
insert into user values(null,'张三','123'); 
insert into user values(null,'李四','234');
```

##### 创建LoginUser类,提供main方法和和login方法

```java
public class LoginUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.提示用户在控制台输入用户名和密码,接收用户输入的用户名和密码
        // 2.根据用户名密码到数据可user表中查询用户信息
        // 3.如果能够查询到,则说明用户名密码正确,允许登录
        // 4.如果查询不到,则说明用户名密码错误
		System.out.println(">>>>>>登录<<<<<<");
		System.out.println("请输入用户名 : ");
		String user = sc.nextLine();
		System.out.println("请输入密码 : ");
		String pwd = sc.nextLine();
		login(user, pwd);// 调用login方法进行登录操作
	}
	// 根据用户名和密码查询用户信息
	private static void login(String user, String pwd) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			//注册驱动并获取连接
			conn = JdbcUtil.getConn();
			//获取传输器并发送sql到服务器执行
			stat = conn.createStatement();
			String sql = "select * from user where " +
                "username='"+ user +"' and password='"+ pwd +"' ";
			// System.out.println(sql);
			rs = stat.executeQuery(sql);
			//处理结果
			if(rs.next()) {
				System.out.println("登陆成功!");
			}else {
				System.err.println("登录失败,用户名或密码错误");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//释放资源
			JdbcUtil.close(conn, stat, rs);
		}
	}
}
```

##### 输出结果

正常输入

```
>>>>>>登录<<<<<<
请输入用户名 : 
张飞
请输入密码 : 
123
登陆成功!

>>>>>>登录<<<<<<
请输入用户名 : 
李四
请输入密码 : 
123567
登录失败,用户名或密码错误
```

异常输入

```
>>>>>>登录<<<<<<
请输入用户名 : 
张飞' or '2=2
请输入密码 : 

登陆成功!

>>>>>>登录<<<<<<
请输入用户名 : 
张飞' -- 
请输入密码 : 

登陆成功!

>>>>>>登录<<<<<<
请输入用户名 : 
张飞'#'
请输入密码 : 

登陆成功!
```

### SQL注入攻击

> SQL注入攻击是常见的网络攻击
> 通过上面的案例,我们发现,不输入密码，只输入用户名也可以登录成功，这就是SQL注入攻击
> SQL 注入的原因：后台执行的SQL语句是拼接而来的，如果参数是用户提交过来的，并且掺杂了一些特殊符号或者SQL关键字，就可能会改变SQL语句的骨架、语义，从而导致意外的情况发生。例如没有密码或者在不知道密码的情况下也可以登录一个网站。

##### 防止注入攻击

解决SQL注入攻击的方式：

1. 通过正则表达式对提交过来的参数进行校验。检查参数中是否包含特殊符号或者关键字，如果过包含就直接结束程序执行，返回一个异常，提示用户输入的内容不合法。
2. 可以通过`PreparedStatement`对象防止SQL注入攻击。

```java
// PerparedStatement先将SQL语句的骨架发送给服务器，服务器编译并确定下来，当服务器对SQL骨架编译之后，这个SQL语句的骨架就不能被篡改了。
String sql = "select * from user where username=? and password=?";
ps = conn.prepareStatement(sql);
// 再将参数传过来,替换占位符
ps.setString(1, user);//如果传进来的是字符串或日期,会自动加上单引号(转移处理)
ps.setString(2, pwd);
```

##### 代码实现

```java
package com.tedu.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.tedu.util.JdbcUtil;

/*
 * 	模拟用户登录
 *	通过PreparedStatement对象防止注入攻击问题
 */
public class LoginUser2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.提示用户在控制台输入用户名和密码,接收用户输入的用户名和密码
		// 2.根据用户名密码到数据可user表中查询用户信息
		// 3.如果能够查询到,则说明用户名密码正确,允许登录
		// 4.如果查询不到,则说明用户名密码错误,
		System.out.println(">>>>>>登录<<<<<<");
		System.out.println("请输入用户名 : ");
		String user = sc.nextLine();
		System.out.println("请输入密码 : ");
		String pwd = sc.nextLine();
		login(user, pwd);// 调用login方法进行登录操作
	}
	// 根据用户名和密码查询用户信息
	private static void login(String user, String pwd) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// 注册驱动并获取连接
			conn = JdbcUtil.getConn();
			// 获取传输器并发送sql到服务器执行
			String sql = "select * from user " +
                "where username=? and password=?";
			// 将sql骨架发送给服务器，让服务器编译并确定下载（防止被篡改）
			ps = conn.prepareStatement(sql);
			// 将参数值传过去,替换占位符
			ps.setString(1, user);
			ps.setString(2, pwd);
			// 执行sql语句,返回执行结果
			rs = ps.executeQuery();
			// 处理结果
			if (rs.next()) {
				System.out.println("登陆成功!");
			} else {
				System.err.println("登录失败,用户名或密码错误");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			JdbcUtil.close(conn, ps, rs);
		}
	}
}
```



## 数据库连接池

>池：常量池、线程池、**连接池**，其实就是一个容器，例如数组或者集合
>连接池：将连接对象 `Connection` 放在一个容器中，共整个程序共享，可以减少连接创建和关闭的次数，实现连接的复用，提高程序执行的效率

### 为什么要使用连接池？

##### 不使用连接池

当通过Java程序连接数据库是，每次都创建连接，并基于连接访问数据库，用完连接后再将连接关闭（销毁），而创建连接和关闭连接需要消耗大量的时间和大量的资源（相对使用连接而言），而且连接得不到复用，导致程序的执行效率低下。

![](D:\study\pic\1.png)

##### 使用连接池

在程序启动时，就往一个池子中放一批连接，供整个程序共享。当用户需要连接时，不用再创建连接，而是直接从池子中获取一个连接再使用，基于连接访问数据库。

当用完连接后，不要关闭连接，而是将连接换回连接池中，这样就可以重复使用池子中的这一批连接，实现了连接的复用，而且也减少了连接创建和关闭的次数，提高程序执行效率。

![](D:\study\pic\2.jpg)

### 如何使用C3P0连接池

**1.导入开发包：**`c3p-0.9.1.2.jar`

**2.设置数据库连接的基本信息**

```java
ComboPooledDataSource pool = new ComboPooledDataSource();
```

**3.创建数据库连接池**

方式一：

```java
pool.setDriverClass("com.mysql.jdbc.Driver");
pool.setJdbcUrl("jdbc:mysql:///jt_db?characterEncoding=utf-8");
pool.setUser("root");
pool.setPassword("root");
```

上述方式是将连接参数写死在程序中，如果后期需要修改参数,就得改程序源码,改完后还得重新编译程序，发布项目，非常麻烦。

因此最好将这些经常发生变化的参数，提取到配置文件中。因为配置文件不是java文件，改完后不需要编译，也不需要重复发布，比如只需要重启服务器，下读取的就是新的配置信息。

方式二：推荐

在src（源码）目录下，提供一个`c3p0-config.xml`文件，文件如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<c3p0-config>
	<default-config>
		<property name="driverClass">com.mysql.jdbc.Driver</property>
		<property name="jdbcUrl">jdbc:mysql:///jt_db?characterEncoding=utf-8</property>
		<property name="user">root</property>
		<property name="password">123</property>
	</default-config>
</c3p0-config>
```

上述方式要求`c3p0-config.xml`文件的位置必须是源码目录，编译后会输出到bin(类目录)，将来程序执行时会到bin的根目录下找指定名称的`c3p0-config.xml`文件，所以不仅**位置是固定的，文件名也是固定的**。如果位置不对或者文件名不对，即使内容配置正确，c3p0也找不到文件。

方式三：推荐

在src(源码)目录下创建一个 `c3p0.properties` 文件，文件内容如下：

```properties
c3p0.driverClass=com.mysql.jdbc.Driver
c3p0.jdbcUrl=jdbc:mysql:///jt_db?characterEncoding=utf-8
c3p0.user=root
c3p0.password=123
```

上述方式要求 `c3p0.properties` 文件的位置必须是源码目录，编译后会输出到bin(类目录)，将来程序执行时会到bin的根目录下找指定名称的 `c3p0.properties` 文件，所以不仅**位置是固定的，文件名也是固定的**。如果位置不对或者文件名不对，即使内容配置正确，c3p0也找不到文件。

**4.将连接还回连接池**

```java
finally {
			/*
			 * 如果是自己创建的连接对象,
			 * 连接对象没有被修改过,
			 * 调用conn.close()方法,
			 * 就是将连接关闭;
			 * 如果是从连接池中获取的对象,
			 * 连接对象其实已经被改造了,
			 * 其中的close方法内部功能被改成了还连接到连接池中,
			 * 所以调用conn.close是还链接.
			 */
			JdbcUtil.close(conn, ps, rs);
}
```

