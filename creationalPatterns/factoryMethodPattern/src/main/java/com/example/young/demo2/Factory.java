package com.example.young.demo2;/**
 * @author pgy
 * @date 2022/1/10 7:34 下午
 **/

public abstract class Factory {

    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);

}
