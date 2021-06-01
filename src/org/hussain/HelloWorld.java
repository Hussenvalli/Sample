package org.hussain;

import org.hussain.service.MessageService;

public class HelloWorld {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       
        MessageService ms= new MessageService();
       
        System.out.println("Hello World!"+ ms.getMessage());

    }

}
