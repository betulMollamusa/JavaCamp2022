package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1,"Laptorp","Asus Laptop",5000,3,"siyah");
//		product.setName("Laptop");
//		product.setId(1);
//		product.setPrice(5000);
//		product.setDescription("Asus Laptop");
//		product.setStockAmount(3);
		
		ProductManager productManager= new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
	}

}
//31. , 32. , 33. , 34. Video