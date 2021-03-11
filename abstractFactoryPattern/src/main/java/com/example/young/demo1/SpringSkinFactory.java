package com.example.young.demo1;

/**
 * @author pgy
 * @date 2021/3/11 10:32 上午
 **/
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
