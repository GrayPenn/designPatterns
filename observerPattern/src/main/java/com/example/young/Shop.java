package com.example.young;

import lombok.Data;

/**
 * @author pgy
 * @date 2021/2/26 4:44 下午
 **/
@Data
public class Shop {
    private String product;//商品

    //初始商店无货
    public Shop() {
        this.product = "无商品";
    }

    //商店出货
    public String getProduct() {
        return product;
    }

    //商店进货
    public void setProduct(String product) {
        this.product = product;
    }
}
