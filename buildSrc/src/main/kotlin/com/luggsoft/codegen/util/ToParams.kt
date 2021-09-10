package com.luggsoft.codegen

internal fun IntRange.toParams() = this.joinToString { i -> "p$i: T$i" }
