
public class oop1 {
	public static void main(String[] args) {

		String mesaj = "Vade oraný";

		Product product1 = new Product();
		
		product1.setName("Delonghi Kahve Makinasý");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		// Set value

		// get

		// System.out.println(product1.name);
		
		

		Product product2 = new Product();
		// Set value
		product2.setName("Delonghi Kahve Makinasý");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
//Set value
		product3.setName("Kitchen Aid Coffee Machine");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[]  products= {product1,product2,product3};

		System.out.println("<u1>");
		
		for(Product product :products) {
			
			System.out.println("<li>"+product.getName()+"</li>");
			
			}
		System.out.println("</u1>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		
		individualCustomer.setPhone("05202102122");
		individualCustomer.setCustomerNumber("12345");
		
		individualCustomer.setFirstName("Murat");
		individualCustomer.setLastName("OZ");
		
		
		CorporateCustomer corporateCustomer =new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05317015418");
		corporateCustomer.setTaxNumber("122321312");
		corporateCustomer.setCustomerNumber("5314233");

		
		

	}

}
