# BigDecimal/BigInteger

> BigDecimal : 常用来解决精确的浮点数运算
> BigInteger : 常用来解决超大的整数运算

### 创建对象

```Java
BigDecimal.valueOf(2);
```

### 常用方法

```java
add(BigDecimal bd);//加法
substract(BigDecimal bd);//减法
multiply(BigDecimal bd);//乘法
divide(BigDecimal bd);//除法
divide(BigDecimal bd,保留位数,摄入方式);//除不尽时使用
setScale(保留位数,取舍方式);//同上
pow(int n);//求数据的几次米
```

