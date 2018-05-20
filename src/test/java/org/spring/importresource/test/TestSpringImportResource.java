package org.spring.importresource.test;

import org.junit.Test;
import org.spring.importresource.DriverManage;

public class TestSpringImportResource extends TestBase{
	
	public TestSpringImportResource() {
        super("classpath:spring-importresource.xml");
    }
     
    @Test
    public void testDriverManager() {
         
        DriverManage dm = (DriverManage) super.getBean("myDriver");
        System.out.println(dm.getClass().getName());
         
    }
}
