package customers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService customerService = context.getBean(CustomerService.class.getSimpleName(), CustomerService.class);
		ServiceProduct productService = context.getBean(ServiceProduct.class.getSimpleName(), ServiceProduct.class);
		productService.addProduct(new Product(" Spring Book", 10.0));
		customerService.addCustomer("Frank Brown", "fbrown@acme.com", "mainstreet 5", "Chicago", "60613");

	}
}