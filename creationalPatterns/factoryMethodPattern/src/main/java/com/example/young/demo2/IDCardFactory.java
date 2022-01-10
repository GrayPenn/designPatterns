package com.example.young.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pgy
 * @date 2022/1/10 7:40 下午
 **/
public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard product1 = (IDCard) product;
        owners.add(product1.getOwner());
    }

    public List getOwners(){
        return owners;
    }

}
