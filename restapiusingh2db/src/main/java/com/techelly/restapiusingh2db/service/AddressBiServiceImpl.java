package com.techelly.restapiusingh2db.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techelly.restapiusingh2db.dao.AddressBiRepository;
import com.techelly.restapiusingh2db.entities.AddressBi;

@Service
public class AddressBiServiceImpl implements AddressBiService {

	@Autowired
	private AddressBiRepository repo;

	@Override
	public AddressBi createAddress(AddressBi addressBi) {

		return repo.save(addressBi);
	}

	@Override
	public AddressBi retrieveAddress(Integer addressId) {
		Optional<AddressBi> addr = repo.findById(addressId);
		if (addr.isPresent()) {
			return addr.get();
		} else {
			return null;
		}
	}

	@Override
	public AddressBi updateAddress(AddressBi addressBi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAddress(Integer addressId) {
		repo.deleteById(addressId);
		return "Deleted Successfully";
	}

}
