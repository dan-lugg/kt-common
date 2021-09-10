package com.luggsoft.codegen

internal fun IntRange.toTypes() = this.joinToString { i -> "T$i" }
