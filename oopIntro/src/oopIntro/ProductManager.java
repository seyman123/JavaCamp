package oopIntro;

public class ProductManager {
		public void addToCart(Product[] products) {
			for (Product product : products) {
				System.out.println("Sepete Eklendi : " + product.getName());
				System.out.println(product.getDetail());
				System.out.println("Orijinal fiyat : " + product.getUnitPrice());
				System.out.println("�ndirim sonras� fiyat : " + product.getUnitPriceAfterDiscount());
				System.out.println("--------------");
			}
			
		}           
}
