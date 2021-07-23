class User  {
    def lastName
    def firstName

    // 这一趴叫构造方法，即在创建实例时把内部字段初始为合适的值
    User(final String lastName, final String firstName) {
        this.lastName = lastName
        this.firstName = firstName
    }

    // 默认def的方法是public的，如果想要你的方法只能在类中调用，你可以加上private
    def private static getUserName(String firstName, String lastName) {
        return firstName.toLowerCase() + lastName.toLowerCase()
    }
    // 默认是public，这里的public可以忽略
    def public UserName() {
        return getUserName(this.firstName, this.lastName)
    }

}

def ulist = [
        new User('san', 'zhang'),
        new User('si', 'li'),
        new User('wu', 'wang'),
        new User('zi','ma')
]

ulist.each {println("Username is ${it.UserName()}")}