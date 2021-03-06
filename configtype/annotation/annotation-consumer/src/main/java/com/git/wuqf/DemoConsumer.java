/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.git.wuqf;

import com.git.wuqf.dubbo.demo.api.DemoService;
import com.git.wuqf.dubbo.demo.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoConsumer {
	
		public static void main (String[]args){
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:annotation*.xml");
			context.start();
			DemoService demoService = (DemoService) context.getBean("demoService");

			String hello = demoService.sayHello("wuqf");
			System.out.println(hello);
			User user=new User(1,"wuqf",11);
			user= demoService.updateUserInfo(user);
			System.out.println(user.toString());
	}

}