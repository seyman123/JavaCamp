package interfaces;

public class CustomerManager {
	
	private Logger logger;
	
	
	
	public CustomerManager(Logger logger) {
		super();
		this.logger = logger;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi " + customer.getFirstName());
		
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi " + customer.getFirstName());
	}
}
