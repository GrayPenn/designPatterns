package com.example.young.demo2;

/**
 * @author pgy
 * @date 2022/1/10 7:38 下午
 **/
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的 ID 卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的 ID 卡");
    }

    public String getOwner(){
        return owner;
    }


}
