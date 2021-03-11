package com.example.young.demo1;

/**
 * @author pgy
 * @date 2021/3/11 10:32 上午
 **/
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }

}
