final def numbers = [1, 2, 3]
final def singers = ["zhangsan", "lisi", "wangwu"]
final def isProgrammer = true
final def courseCount = 10


// if else
if (isProgrammer) {
    println("He's a programmer, alright")
} else {
    println("Not a programmer, tho")
}

// for loop
for (int i=0; i < courseCount; i++) {
    println("Charis made course " + (i+1) + "!!!")
}

for (final String singer: singers) {
    println(singer)
}

singers.each { final x -> println(x)}
singers.each {println(it)}
numbers.each {println(it)}
