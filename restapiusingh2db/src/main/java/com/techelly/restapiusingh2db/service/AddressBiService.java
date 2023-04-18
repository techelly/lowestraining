package com.techelly.restapiusingh2db.service;

import com.techelly.restapiusingh2db.entities.AddressBi;

public interface AddressBiService {
	// Create or save or add
	public AddressBi createAddress(AddressBi addressBi);

	// Retrieve or get Address on the basis of Primary Key
	public AddressBi retrieveAddress(Integer addressId);

	// Update
	public AddressBi updateAddress(AddressBi addressBi);

	// Delete
	public String deleteAddress(Integer addressId);
}
