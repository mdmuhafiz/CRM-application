package com.crmapp.services;

import java.util.List;

import com.crmapp.entity.Contact;

public interface ContactServices {
	public void saveContact(Contact contact);

	public List<Contact> listAllContact();

	public Contact findContactById(long id);
	

}
