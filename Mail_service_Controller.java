package com.tns.mail;
import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mail_service_Controller
{
	@Autowired(required=true)
	private Mail_Service service;
	
	@GetMapping("/mailservice")
	public java.util.List<Mail> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/mailservice/{m_id}")
	public ResponseEntity<Mail> get(@PathVariable Integer M_id)
	{
		try
		{
			Mail ml=service.get(M_id);
			return new ResponseEntity<Mail>(ml,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Mail>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/mailservice")
	public void add(@RequestBody Mail ml)
	{
		service.save(ml);
	}
	
	@PutMapping("/mailservice/{s_id}")
	public ResponseEntity<?> update(@RequestBody Mail ml, @PathVariable Integer M_id)
	{
		Mail existml=service.get(M_id);
		service.save(existml);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/mailservice/{s_id}")
	public void delete(@PathVariable Integer m_id)
	{
		service.delete(m_id);
	}
}
