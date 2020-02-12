package com.Flexon.apitest.demo2;
import java.util.Iterator;
import java.util.ArrayList;


import org.springframework.stereotype.Component;

@Component
public class MobilePhone{
    private ArrayList<Contacts> ContactList =new ArrayList<Contacts>();

    public MobilePhone(){
        ContactList.add(new Contacts("Ken", "fsfu", 1131312323, "gg@gmail.com",""));
        ContactList.add(new Contacts("John","fsfs",1233131212,"fsf@gmail.com",""));
    }

    public ArrayList<Contacts> getContactList() {

        return ContactList;
    }
    public void  printContractList() {
        for (Integer i=0;i<ContactList.size();i++){
            System.out.println(ContactList.get(i).getName());
        }
    }
    public Contacts displayContacts(String Contactname) {
		
        Iterator<Contacts> itr = ContactList.iterator();

        while (itr.hasNext()) {
            Contacts contact1 = itr.next();
            if (contact1.getName().equals( Contactname)) {
            	return contact1;
            }
        }
		
		return null;
    }
    public void removeContacts(String Contactname) {
		
        Iterator<Contacts> itr = ContactList.iterator();

        while (itr.hasNext()) {
            Contacts contact1 = itr.next();
            if (contact1.getName().equals( Contactname)) {
            	itr.remove();
            }
        }

	}
    public boolean contact_exist(String name){
        for (Integer i=0;i<ContactList.size();i++){
            if (ContactList.get(i).getName().equals(name)){
                return true;
            }
        } 
        return false;
    }
    public void addContactList(Contacts contact1) {
        ContactList.add(contact1);
    }
    public void removeContactList(Contacts contact1) {
        ContactList.remove(contact1);
    }
    
   


}

