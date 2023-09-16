package org;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String productId;
	private String productDescription;
	private double unitPrice;
	private double qty,totalCost,gst;

}
