package estudos.business;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldBO {

	public String getAutowiredMessage(){
		return "This is an autowired message!";
	}
}
