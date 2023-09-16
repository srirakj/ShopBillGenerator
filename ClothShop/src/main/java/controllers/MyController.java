package controllers;
 

@RestController
@RestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
//	@GetMapping("/hello")
//	public String helloWorld() {
//		return "Hello";
//	}

}

@RestController
@RestMapping("/salesbill")
public class SalesBillController {
	@Autowired
	private SalesBillService salesBillService;
}

@RestController
@RestMapping("/salesman")
public class SalesManController {
	@Autowired
	private SalesManService salesManService;
}


