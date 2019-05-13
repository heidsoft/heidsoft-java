package com.heidsoft.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 抽象一个在远方的家乡
 */
public interface MyHouse extends Remote {

    /**
     * 获取家乡的房价
     * @param description
     * @return
     * @throws RemoteException
     */
    double getPrice(String description) throws RemoteException;
}
