package com.example.demo;

import com.example.demo.builders.variety;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefactoringApplication {

	public static void main(String[] args) {

		SpringApplication.run(RefactoringApplication.class, args);
		variety varietyObject = variety.createvariety("Red Delicious","test" ,"test" );
		varietyObject.saying();
	}

}
