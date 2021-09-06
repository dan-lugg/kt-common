package com.luggsoft.kt.common.util

val <TValue> Collection<TValue>.tail get() = this.drop(1)
