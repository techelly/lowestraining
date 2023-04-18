package com.techelly.restapiusingh2db.association.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techelly.restapiusingh2db.entities.AddressBi;
import com.techelly.restapiusingh2db.service.AddressBiService;

@RestController
public class AddressBiController {

	@Autowired
	private AddressBiService addressBiService;

	// Create or save or add
	// http://localhost:8080/addaddressbi
	@PostMapping("/addaddressbi")
	public AddressBi createAddressBi(@RequestBody AddressBi address) {
		return addressBiService.createAddress(address);
	}

	// Retrieve or get address on the basis of Primary Key
	// http://localhost:8080/getaddressbibyid/1
	@GetMapping("/getaddressbibyid/{id}")
	public AddressBi retrieveAddressBi(@PathVariable("id") Integer addressId) {
		return addressBiService.retrieveAddress(addressId);
	}
	
	//Delete Address by id 
	// http://localhost:8080/deleteaddressbibyid/1
	@DeleteMapping("/deleteaddressbibyid/{id}")
	public String deleteAddressBi(@PathVariable("id") Integer addressId) {
		return addressBiService.deleteAddress(addressId);
	}
}
