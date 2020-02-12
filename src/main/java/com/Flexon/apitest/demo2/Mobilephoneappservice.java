package com.Flexon.apitest.demo2;
import java.util.Scanner;


public class Mobilephoneappservice{
    Scanner scanner = new Scanner(System.in);
    public Integer repeat(){
        System.out.println("");
        System.out.println("Please enter one of the following numbers for the corresponding tasks ");
        System.out.println("1 for Print contacts");
        System.out.println("2 for Add contact");
        System.out.println("3 for Remove contact");
        System.out.println("4 for Print contacts");
        System.out.println("5 for exit");

        Integer command=scanner.nextInt();
        return command;
    }


    public boolean get_info(String which_type, String var, Integer min, Integer max){

            if (var.length()>=min && var.length()<=max && !var.equals(null)){
                return true;
            }
            else{
                if (which_type.equals("Phone_number")){
                    System.out.println("Your Phone number should be between "+String.valueOf(min)+" and "+String.valueOf(max)+" numbers");
                }
                else if (which_type.equals("SSN")){
                    System.out.println("Your Phone number should be between "+String.valueOf(min)+" and "+String.valueOf(max)+" numbers");
                }
                else{
                    System.out.println("Your "+which_type+"should be between "+String.valueOf(min)+" and "+String.valueOf(max)+" characters");
                }
                System.out.println("Please enter the contact's "+which_type);
                return false;
            }
        

    }
    public void whichcommand(MobilePhone phone1 ){
        Integer command=scanner.nextInt();
        while (!command.equals(5)){
            if (command.equals(1))
            {
                System.out.println("Here are the contacts on the phone");
                phone1.printContractList();  
                command=repeat();              

                
            }
            else if (command.equals(2))
            {
                System.out.println("Please enter the contact's first name");
                String First_name=scanner.next();
                while (!get_info("First_name",First_name,2,50)){
                    First_name=scanner.next();
                }
                System.out.println("Please enter the contact's Last name");
                String Last_name=scanner.next();
                while (!get_info("Last_name",Last_name,1,50)){
                    Last_name=scanner.next();
                }
                System.out.println("Please enter the contact's phone number");
                String Phone_number=String.valueOf(scanner.nextInt());
                while (!get_info("Phone_number",Phone_number,10,12)){
                    if (!scanner.hasNextInt()){
                        scanner.next();
                        System.out.println("Make sure that you inputed the correct variable type");
                    }
                    Last_name=String.valueOf(scanner.nextInt());
                }
                Integer Actual_phone_number=Integer.valueOf(Phone_number);
                System.out.println("Please enter the contact's email address");
                String Email_address=scanner.next();
                while (!get_info("Email_address",Email_address,6,50)||!Email_address.contains("@")||!Email_address.contains(".")){
                    System.out.println("Please make sure that you have entered a valid email address");
                    Email_address=scanner.next();
                }
                System.out.println("Please enter the contact's middle name");
                String Middle_name=scanner.next();
                while (!get_info("Middle_name",Middle_name,0,50)){
                    Middle_name=scanner.next();
                }
                Contacts new_contact= new Contacts(First_name,Last_name,Actual_phone_number,Email_address,Middle_name);
                phone1.addContactList(new_contact);
                System.out.println("You have successfully created the user");
                command=repeat(); 
                
            }
            
            else if (command.equals(3))
            {   
                String name= scanner.next();
                while (phone1.contact_exist(name)==false){
                    System.out.println("The user you try to delete does not exist");
                    System.out.println("Please add the contact you want to delete");
                    name= scanner.next();
                }

                for (Integer i=0;i<phone1.getContactList().size();i++){
                    if (phone1.getContactList().get(i).getName().equals(name)){
                        phone1.getContactList().remove(phone1.getContactList().get(i));
                    }
                } 
                System.out.println("You have successfully removed this contact");
                command=repeat();    

            }
            else{
                System.out.println("Please enter a valid commmand");
                command=repeat();    

            }
        }
        System.out.println("You have exited the program ");
        


    }
}