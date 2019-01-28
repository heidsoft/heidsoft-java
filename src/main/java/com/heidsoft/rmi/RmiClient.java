package com.heidsoft.rmi;

import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import java.rmi.RemoteException;

public class RmiClient {
    public static void main(String[] args) throws NamingException, RemoteException {

        javax.naming.Context context = new InitialContext();
        NamingEnumeration<NameClassPair> namingEnumeration = context.list("rmi://localhost/");
        while (namingEnumeration.hasMoreElements()){
            System.out.println(namingEnumeration.nextElement().getName());
        }

        String url = "rmi://localhost/my_house";
        MyHouse myHouse = (MyHouse) context.lookup(url);

        double price = myHouse.getPrice("天元区");
        System.out.println(price);

    }
}
