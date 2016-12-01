package com.git.wuqf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wuqf on 16-11-13.
 */
public class DemoProvider {
    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:annotation-provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
}
