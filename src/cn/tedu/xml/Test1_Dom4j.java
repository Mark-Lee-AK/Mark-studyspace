package cn.tedu.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test1_Dom4j {
    //单元测试方法
    @Test
    public void show() throws DocumentException {
        // 1.指定xml文件位置
        InputStream in = Test1_Dom4j.class.getResourceAsStream("spring.xml");
        // 2.解析xml文件
        // Dom4j提供了SAXReader用来读取xml文件
        SAXReader reader = new SAXReader();
        // 解析整个xml文件,形成Document文档
        Document doc = reader.read(in);

        // 3.获取根元素beans
        Element rootElement = doc.getRootElement();
        // 4.继续获取多个bean
        // List是一种集合,用来存放多个元素,存放的是对象
        // <> 叫泛型,用来规定对象的类型
        List<Element> list = rootElement.elements();
        // list.size() 返回list集合的长度(即元素个数)
        /*for (int i = 0; i < list.size() ; i++) {}*/
        // 用foreach更高效
        for (Element s: list) {
            // 根据属性名获取属性值
            Attribute attrid = s.attribute("id");
            System.out.println(attrid.getValue());

            Attribute attrclass = s.attribute("class");
            System.out.println(attrclass.getValue());
        }
    }
}
