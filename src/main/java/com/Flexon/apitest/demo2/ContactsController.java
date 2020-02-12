package com.Flexon.apitest.demo2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {
	
	@Autowired
	private MobilePhone service;
	
	
	@GetMapping("displayContacts")
	public ArrayList<Contacts> displayContacts() {
		return service.getContactList();
	}
	
	@GetMapping("displayContacts/{contactname}")
	public ResponseEntity<?> displayContacts(@PathVariable String contactname) {
	Contacts contact1 = service.displayContacts(contactname);
	if (contactname ==null)
		{
			return new ResponseEntity<>("The contact you try to search for deos not exist ",HttpStatus.FOUND);
		}
			return new ResponseEntity<>(contact1,HttpStatus.FOUND);
		}
		
	@DeleteMapping ("deleteContact/{contactname}")
		public void deleteContact(@PathVariable String contactname) {
			service.removeContacts(contactname);
		}
	// @PostMapping("addNewStudent")
	// public ResponseEntity<?> addStudent(@RequestBody Student student) {
	// 	service.addStudent(student);
	// 	return new ResponseEntity<>( student,HttpStatus.OK);
	// }
	
	
}