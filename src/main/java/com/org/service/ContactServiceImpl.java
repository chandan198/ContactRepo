package com.org.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.org.entity.Contact;
import com.org.repository.ContactRepository;

@Service
public class ContactServiceImpl  implements ContactService{
	//@Autowired
	ContactRepository contactrepository;

	@Override
	public boolean saveContact(Contact contact) {

		contactrepository.save(contact);
		return true;
	}

	@Override
	public List<Contact> getAllContacts() {
		
		List<Contact> findAll = contactrepository.findAll();
		
		return findAll;
		
		
	}
	@Override
	public Contact deleteContactById(Integer contactId) {
		contactrepository.deleteById(contactId);
		return null;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Contact contactById = contactrepository.findById(contactId).orElse(null);
		return contactById;
	}
	
	

	

}
