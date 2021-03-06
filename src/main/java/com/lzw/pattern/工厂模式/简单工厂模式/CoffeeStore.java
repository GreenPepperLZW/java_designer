package com.lzw.pattern.工厂模式.简单工厂模式;

/**
 * 咖啡店类，点咖啡
 * @author : lzw
 * @date : 2021/12/24
 * @since : 1.0
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        // 简单工厂
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        // 调用生产咖啡的方法，静态工厂
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugr();
        return coffee;
    }
}
