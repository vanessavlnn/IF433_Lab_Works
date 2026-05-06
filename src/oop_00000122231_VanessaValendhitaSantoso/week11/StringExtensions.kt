package oop_00000122231_VanessaValendhitaSantoso.week11

fun String.addGreeting(): String {
    return "Hello, $this"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

fun String?.isNullorEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}