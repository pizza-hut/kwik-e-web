package org.kwik.e.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KwikEController {
	
	@PostMapping("/submitForm")	
	public ResponseEntity<String> submitForm(@RequestParam String user_id) {
		
		System.out.println("Posted: " + user_id);
		return new ResponseEntity<String>(user_id, HttpStatus.OK);
		
		//System.out.println("Posted: " + kwikForm.getUserid());
		//return new ResponseEntity<String>(kwikForm.getUserid(), HttpStatus.OK);
		
	}

}
