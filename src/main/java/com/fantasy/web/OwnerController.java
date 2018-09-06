package com.fantasy.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fantasy.business.owner.Owner;
import com.fantasy.business.owner.OwnerRepository;
import com.fantasy.util.FantasyMaintenanceReturn;

@CrossOrigin
@Controller
@RequestMapping(path="/Owners")
public class OwnerController extends BaseController {
	@Autowired
	private OwnerRepository ownerRepository;
	
	@GetMapping(path="/List")
	public @ResponseBody Iterable<Owner> getAllOwners() {
		return ownerRepository.findAll();
	}
	
	@GetMapping(path="/Get")
	public @ResponseBody List<Owner> getOwner(@RequestParam int id) {
		Optional<Owner> o = ownerRepository.findById(id);
		return getReturnArray(o);
	}
	
	@PostMapping(path="/Add")
	public @ResponseBody FantasyMaintenanceReturn addNewOwner(@RequestBody Owner owner) {
		try {
			ownerRepository.save(owner);
			return FantasyMaintenanceReturn.getMaintReturn(owner);
		}
		catch (DataIntegrityViolationException dive) {
			return FantasyMaintenanceReturn.getMaintReturnError(owner, dive.getRootCause().toString());
		}
		catch (Exception e) {
			e.printStackTrace();
			return FantasyMaintenanceReturn.getMaintReturnError(owner, e.getMessage());
		}
	}
	
	@GetMapping(path="/Remove")
	public @ResponseBody FantasyMaintenanceReturn deleteOwner(@RequestParam int id) {
		Optional<Owner> owner = ownerRepository.findById(id);
		try {
			ownerRepository.delete(owner.get());
			return FantasyMaintenanceReturn.getMaintReturn(owner.get());
		}
		catch (DataIntegrityViolationException dive) {
			return FantasyMaintenanceReturn.getMaintReturnError(owner, dive.getRootCause().toString());
		}
		catch (Exception e) {
			return FantasyMaintenanceReturn.getMaintReturnError(owner, e.toString());
		}
	
	}
	
	@PostMapping(path="/Change")
	public @ResponseBody FantasyMaintenanceReturn updateOwner(@RequestBody Owner owner) {
		try {
			ownerRepository.save(owner);
			return FantasyMaintenanceReturn.getMaintReturn(owner);
		}
		catch (DataIntegrityViolationException dive) {
			return FantasyMaintenanceReturn.getMaintReturnError(owner, dive.getRootCause().toString());
		}
		catch (Exception e) {
			return FantasyMaintenanceReturn.getMaintReturnError(owner, e.toString());
		}
	}
	

}
