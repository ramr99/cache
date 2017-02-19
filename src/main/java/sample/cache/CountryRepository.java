/*
 * Copyright 2012-2015 the original author or authors.
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CountryRepository {
	
	@Autowired
	private Country country;

	@Cacheable(value="code", key="#code")
	public Country findByCode(String code) {
		System.out.println("---> Loading country with code '" + code + "'");
		country.setCode(code);
		return country;
	}
	
	@Cacheable(value="number", key="#number")
	public Country findByNumber(String number) {
		System.out.println("---> Loading country with number '" + number + "'");
		country.setNumber(number);
		return country;
	}
	
	

}
