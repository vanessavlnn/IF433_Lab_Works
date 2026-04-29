package oop_00000122231_VanessaValendhitaSantoso.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)