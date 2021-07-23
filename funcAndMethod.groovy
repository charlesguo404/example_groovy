
assert getUserName("Chris", "Behrens") == "cbehrens" : "getUserName isn't working"

// 用java的方式
String getUserName(String firstName, String lastName) {
    return firstName.substring(0,1).toLowerCase() + lastName.toLowerCase()
}

// 直接用def
def getAge(String name, int age) {
    return name.toLowerCase() + "is " + age
}

// void 就是空，在方法声明时候表示该方法没有返回值
void printName(name) {
    println("Username is ${name}")
}
// 或者直接用def
def printCredential(cred) {
    println("${cred}");
}

printName(getUserName("Chris ", "Behrens"))
printCredential(getAge("Chris ", 10))