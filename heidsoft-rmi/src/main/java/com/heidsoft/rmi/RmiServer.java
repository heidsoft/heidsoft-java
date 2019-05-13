package com.heidsoft.rmi;



import java.rmi.RemoteException;
import javax.naming.*;

/**
 * 一个rmi服务端模拟
 */
public class RmiServer {
    public static void main(String[] args) throws RemoteException, NamingException {
        MyHouseImpl myHouse = new MyHouseImpl();

        Context namingContent = new InitialContext();
        namingContent.bind("rmi://127.0.0.1/my_house",myHouse);

//        NamingEnumeration<NameClassPair> namingEnumeration = namingContent.list("rmi://my_house");
//        if( namingEnumeration != null ){
//            while (namingEnumeration.hasMoreElements()){
//                System.out.println(namingEnumeration.nextElement().getName());
//            }
//        }

    }
}
