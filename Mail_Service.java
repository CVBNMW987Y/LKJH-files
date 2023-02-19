package com.tns.mail;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Mail_Service 
{
	@Autowired
	private Mail_Service_Repository repo;
	
	public List<Mail> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Mail ml)
	{
		repo.save(ml);
	}
	
	public Mail get(Integer m_id)
	{
		return repo.findById(m_id).get();
	}
	public void delete(Integer s_id)
	{
		repo.deleteById(s_id);
	}
	
}
