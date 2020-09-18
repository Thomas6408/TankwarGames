package com.games.tankwar;

/**
 * @author thomas
 * @date 2020/9/18 - 18:20
 */
public class TankMain  {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();

        while(true) {
            Thread.sleep(50);
            tf.repaint(); //调用paint方法-->重画
        }

    }
}
