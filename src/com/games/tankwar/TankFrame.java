package com.games.tankwar;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author thomas
 * @date 2020/9/18 - 18:20
 */
public class TankFrame extends Frame {

    int x = 200, y = 200;

    public TankFrame() {
        setSize(800,600); //窗口宽高
        setResizable(false); //设置窗口是否能改变大小
        setTitle("tank war"); //设置标题栏
        setVisible(true); //显示窗口--设置可见 true
        this.addKeyListener(new MyKeyListener());

        /**
         * 点击x关闭窗口
         * 添加一个windows监听器
         */
        addWindowListener(new WindowAdapter() {
            //windowClosing-->点击x就会出发这个事件
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //系统退出
            }
        });
    }

    /**
     * 窗口重新绘制的时候会自动调用这个方法
     * Graphics-->画笔
     */
    @Override
    public void paint(Graphics g) {
        g.fillRect( x, y,50,50); //坐标,坐标,宽,高

    }


    /**
     * 键盘监听处理类-->内部类
     */
    class MyKeyListener extends KeyAdapter {

        boolean BL = false;
        boolean BU = false;
        boolean BR = false;
        boolean BD = false;

        //键被摁下去调用此方法
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode(); //哪个键被摁下了，取出来
            switch(key) {
                case KeyEvent.VK_LEFT: //向左
                    BL = true;
                    break;
                case KeyEvent.VK_UP: //向上
                    BU = true;
                    break;
                case KeyEvent.VK_RIGHT: //向右
                    BR = true;
                    break;
                case KeyEvent.VK_DOWN: //向下
                    BD = true;
                    break;

                default:
                    break;
            }
//            repaint(); //调用paint方法-->重画
        }

        //键被抬起来调用此方法
        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch(key) {
                case KeyEvent.VK_LEFT: //向左
                    BL = false;
                    break;
                case KeyEvent.VK_UP: //向上
                    BU = false;
                    break;
                case KeyEvent.VK_RIGHT: //向右
                    BR = false;
                    break;
                case KeyEvent.VK_DOWN: //向下
                    BD = false;
                    break;

                default:
                    break;
            }
        }

    }
}
