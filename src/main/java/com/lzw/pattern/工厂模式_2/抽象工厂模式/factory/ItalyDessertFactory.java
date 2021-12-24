package com.lzw.pattern.工厂模式_2.抽象工厂模式.factory;

import com.lzw.pattern.工厂模式_2.抽象工厂模式.Coffee;
import com.lzw.pattern.工厂模式_2.抽象工厂模式.Dessert;
import com.lzw.pattern.工厂模式_2.抽象工厂模式.child.LatteCoffee;
import com.lzw.pattern.工厂模式_2.抽象工厂模式.child.Tiramisu;

/**
 * 意大利风味甜点工厂
 *
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class ItalyDessertFactory implements Factory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
