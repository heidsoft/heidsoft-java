package com.heidsoft.rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello{

    public HelloImpl() throws RemoteException {
    }

    @Override
    public String sayHello() {
        return "Hello world";
    }

    public static void main(String[] args) {
        System.setProperty("java.rmi.server.hostname","192.168.5.7");
        try {
            Registry registry = LocateRegistry.createRegistry(1888);
            HelloImpl obj = new HelloImpl();
            registry.bind("HelloServer",obj);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

    }

}
