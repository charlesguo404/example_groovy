// explicit declare type
String name = 'ZhangSan'
boolean isProgrammer = true
float salary = 99999.999
byte  b = 1
char  c = 2
short s = 3
long  l = 5
int courseCount = 14
BigDecimal bd = 12345123.91234
String[] singers = ["bob","george","jeff","royal"]
List<String> newlist = ["1","2","3"]


for (ls in newlist) {
    println(ls)
}

newlist.each {println(it)}
// def
def age = 10