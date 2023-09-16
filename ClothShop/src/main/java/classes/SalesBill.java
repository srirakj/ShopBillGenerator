package org;

@Entity
public class SalesBill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String salesmanId, customerId,productId;
	//private List<Product> products = new ArrayList<>();

}
