package cn.tedu.seri;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.*;

public class Test_Seri {
    //序列化
    @Test
    public void seri() throws IOException {
        // 创建对象
        Person p = new Person("钱学森", 99);

        // 把对象转换成json: jackson -- ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        // p是指要转换的对象
        // 要求对象实现序列化接口
        String json = mapper.writeValueAsString(p);

        System.out.println(json);

        // 写出json文件
        Writer out = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("person.json")));
        out.write(json);
        out.close();
    }

    // 反序列化:把json转成对象
    @Test
    public void deseri() throws IOException {
        // 创建json
        String json = "{\"name\":\"蔡徐坤\",\"age\":20}";

        // 把json转成对象
        ObjectMapper mapper = new ObjectMapper();

        // 要求对象实现序列化接口
        // readValue第一个参数,是要转换哪个json文件
        // 第二个参数就是要把json数据转成哪个对象
        Person p = mapper.readValue(json, Person.class);
        System.out.println(p.getAge()+p.getName());
    }
}
