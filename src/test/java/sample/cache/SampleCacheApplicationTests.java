/*
 * Copyright 2012-2016 the original author or authors.
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

package sample.cache;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource("classpath:test-application.properties")
public class SampleCacheApplicationTests {
	
	@Value("${ip.val1}")
	public String valueWorks;
	
	/*@Before
	public void loadValue() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileReader(new java.io.File("src\\test\\application.properties")));
	}
	*/
	
	@org.junit.Test
	public void testProperties()
	{
		//ResourceBundle bundle=ResourceBundle.getBundle("classpath:/src/test/java/application.properties");
		System.out.println(valueWorks);
		assertEquals(valueWorks, "127.0.0.1");
		assertTrue(true);
	}


}
