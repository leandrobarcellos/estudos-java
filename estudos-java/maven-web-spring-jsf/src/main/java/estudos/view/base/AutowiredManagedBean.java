package estudos.view.base;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public abstract class AutowiredManagedBean<T extends AutowiredManagedBean<?>> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -342788072748200058L;

	@PostConstruct
	private void makeMeAutowired() {
		WebApplicationContext apctx = WebApplicationContextUtils.getWebApplicationContext(
				(ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext());
		apctx.getAutowireCapableBeanFactory().autowireBean(getThis());
	}

	protected abstract T getThis();
}
