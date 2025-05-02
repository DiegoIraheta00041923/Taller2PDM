package com.pdmtaller2.DiegoIraheta_00041923.data

val categories = restaurants
    .flatMap { it.categories }
    .distinct()
