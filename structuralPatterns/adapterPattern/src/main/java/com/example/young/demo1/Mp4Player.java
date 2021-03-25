package com.example.young.demo1;

/**
 * @author pgy
 * @date 2021/3/25 5:54 下午
 **/
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}