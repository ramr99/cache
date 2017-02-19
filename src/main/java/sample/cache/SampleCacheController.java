package sample.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SampleCacheController {

	@Autowired
	private CountryRepository countryRepository;
	
	@RequestMapping(path="code/{code}", method = RequestMethod.GET)
	@ResponseBody
	public String getCountryCode(@PathVariable("code") String code)
	{
		
		Country country = countryRepository.findByCode(code);
		
		return country.getCode();
		
	}
	
	@RequestMapping(path="number/{num}", method = RequestMethod.GET)
	@ResponseBody
	public String getCountryNumber(@PathVariable("num") String num)
	{
		
		Country country = countryRepository.findByNumber(num);
		
		return country.getNumber();
		
	}
	
}
