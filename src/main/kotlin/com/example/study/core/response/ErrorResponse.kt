package com.example.study.core.response

class ErrorResponse(
    val message: String,
    val errorType: String = "invalid Argument"
)