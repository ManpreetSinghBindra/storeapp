package com.mphasis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mphasis.domain.Product;
import com.mphasis.repository.ProductRepository;

@SpringBootApplication
public class StoreappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StoreappApplication.class, args);
	}
	
	

	@Autowired
	@Qualifier("productRepository")
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
		productRepository.save(new Product("LG", 45534.0));
		productRepository.save(new Product("Samung", 34534.0));
		productRepository.save(new Product("Sony", 44534.0));
		productRepository.save(new Product("Dell", 33534.0));
		productRepository.save(new Product("HP", 63534.0));

		System.out.println(productRepository.findAll());
	}

}
