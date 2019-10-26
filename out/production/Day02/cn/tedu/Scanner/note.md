##基本数据类型
####整数数字的面值是int类型
```
 int a = 999999999999999;
 //数据太大，超出了int范围会报错。
```
####byte,short,char是那种比int小的整数可以用范围内的值直接赋值
```
byte b = 127;
byte b2 = 128;//报错，超出byte 的取值范围
```
####浮点数的字面值是double类型
```
float f = 3.0;
//报错，左边是float型，右边是double型
//double型比float型大
//大转小会报错，要强转
float f1 = 3.0f
```
####字面值的后缀LFD
```
long a = 999999999999L;//右侧的整数默认类型是int，已经超出int范围只能扩大范围保存需要加后缀L
float b = 3.0F;//右侧3.0默认是double类型，加后缀L就强制转成了float类型
double d = 3D;//把右侧的3从默认值int类型，转成了double类型
```
####小转大/隐式转换
