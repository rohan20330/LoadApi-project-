package com.demo.LoadApi.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.LoadApi.entities.Load;
import com.demo.LoadApi.services.LoadServices;
@RestController
public class MyController {
	@Autowired
private LoadServices loadService;
	
	@GetMapping("/loadd")
	public String show()
	{
		return "ram";	
	}

	@PostMapping("/load")
	public String addLoad(@RequestBody Load load)
	{
		this.loadService.addLoad(load);
		return "loads details added successfully";
	}

	@GetMapping("/load/{loadId}")
	public Optional<Load> getLoad(@PathVariable String loadId)
	{
	return this.loadService.getLoad(Integer.parseInt(loadId));
	}

	@PutMapping("/load/{loadId}")
	public Load updateLoad(@PathVariable String loadId,@RequestBody Load load)
	{
		return this.loadService.updateLoad(Integer.parseInt(loadId),load);
	}
	@DeleteMapping("/load/{loadId}")
	public void deleteLoad(@PathVariable String loadId)
	{
		this.loadService.deleteLoad(Integer.parseInt(loadId));
	}
	@GetMapping("/load")
	public List<Load>getAll()
	{
		return this.loadService.getAll();
	}

}
