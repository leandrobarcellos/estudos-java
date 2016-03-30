package estudos.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

import estudos.business.HelloWorldBO;
import estudos.view.base.AutowiredManagedBean;

@ManagedBean
@ViewScoped
public class HelloWorld extends AutowiredManagedBean<HelloWorld> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6624555601231301806L;

	@Autowired
	private HelloWorldBO helloWorldBO;

	public HelloWorld() {
		System.out.println("HelloWorld started!");
	}

	public String getMessage() {
		return "Hello World!";

	}

	public String helloWorld() {
		System.out.println("Ação olá Mundo!");
		System.out.println(helloWorldBO.getAutowiredMessage());
		return "destino1/page1";
	}

	@Override
	protected HelloWorld getThis() {
		return this;
	}
}
