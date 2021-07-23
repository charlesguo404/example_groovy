package com.mineops.inheritance

@groovy.transform.InheritConstructors
// 扩展 abstract 类，继承抽象类Person
class Artist extends Person{
    public String Songs;

    // 重写构造方法
    Artist(String firstName, String lastName, String songName) {
        super(firstName, lastName)
        this.Songs = songName
    }
}