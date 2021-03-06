package pl.javastart.component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(scopeName = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShoppingCart {
	private List<String> products;

	
	
	public ShoppingCart() {
		super();
		this.products = new LinkedList();
	}
	
	public void addProduct(String product){
		this.products.add(product);
	}


	public List<String> getProducts() {
		return products;
	}


	@PostConstruct
	public void create() {
		System.out.println(this + " created");
	}

	@PreDestroy
	    public void destroy() {
	        System.out.println(this + " destroyed");
	}	
}
