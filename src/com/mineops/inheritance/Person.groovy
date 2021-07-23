package com.mineops.inheritance
// 先写一个abstract 类, 抽象类不能实例化对象，必须被继承之后才能被使用
abstract class Person implements Serializable {
    def lastName;
    def firstName;

    // 实现构造方法
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // public 方法
    public String UserName() {
        return getUserName(this.firstName, this.lastName);
    }
    // private 方法
    private String getUserName(String firstName, String lastName) {
        return firstName.toLowerCase() + lastName.toLowerCase();
    }
}

