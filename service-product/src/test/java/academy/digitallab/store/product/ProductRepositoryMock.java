package academy.digitallab.store.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import academy.digitallab.store.product.entity.Product;

@DataJpaTest
public class ProductRepositoryMock {
	
	@Autowired
	private Product productRepository;
	
	public void whenFindByCategory_thenReturnListProduct() {
		Product product01 = Product.
	}

}
