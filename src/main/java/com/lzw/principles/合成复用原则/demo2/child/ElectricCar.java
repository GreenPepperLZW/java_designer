package com.lzw.principles.合成复用原则.demo2.child;

import com.lzw.principles.合成复用原则.demo2.Car;

/**
 *
 * @author : lzw
 * @date : 2021/12/23
 * @since : 1.0
 */
public class ElectricCar extends Car {
    @Override
    public void move() {
        System.out.println(super.color.getColor()+"电动车启动");
    }
}
