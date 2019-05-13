package com.heidsoft.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

/**
 * 对家乡楼市的实现
 *
 * @author jake.liu
 */
public class MyHouseImpl extends UnicastRemoteObject implements MyHouse{
    private Map<String,Double> prices;

    /**
     * 家乡房价，各区价格
     * @throws RemoteException
     */
    protected MyHouseImpl() throws RemoteException {
        this.prices = new HashMap<>(10);
        this.prices.put("天元区",8000.00);
        this.prices.put("荷塘区",7000.00);
        this.prices.put("石峰区",6000.00);
        this.prices.put("芦淞区",5500.00);
    }

    @Override
    public double getPrice(String description) throws RemoteException {
        Double price = prices.get(description);
        return price == null ? 0: price;
    }
}
