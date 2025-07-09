package com.app.arman.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.arman.bean.Book;

@RestController
@RequestMapping("/book")
public class BookRestController {
	
	@PostMapping("/save")
	 public ResponseEntity<String> createBook(
			 @RequestBody Book book){
		 System.out.println(book);
		 return new ResponseEntity<String>("Data Received ",HttpStatus.OK);
	 }
	
/*	POST  http://localhost:8080/book/save   [SEND]
	Body
	(*) raw		[JSON]
{
"bookId" : 101,
"bookName" : "TEST",
"bookCost" : 400.0
}   
*/


//===========================================================================	
	
	@PostMapping("/all")
	 public ResponseEntity<String> createMultipleBook(
			 @RequestBody List<Book> books){
		 return new ResponseEntity<String>("Data Received#2",HttpStatus.OK);
		 
		 /*	
		  POST  http://localhost:8080/book/all   [SEND]
 	Body
		(*) raw		[JSON]
   [
    {
	 "bookId" : 101,
	"bookName" : "TEST",
	"bookCost" : 400.0
    },
    {
	"bookId" : 102,
	"bookName" : "AA",
	"bookCost" : 300.0
    }
    ]
*/
	

	}

}
