package com.org.service;

import java.util.List;

import com.org.entity.Contact;

public interface ContactService {

	public boolean saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact deleteContactById(Integer contactId);

	public Contact getContactById(Integer contactId);

}
