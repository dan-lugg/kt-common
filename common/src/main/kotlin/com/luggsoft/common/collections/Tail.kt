package com.luggsoft.common.collections

val <T> Iterable<T>.tail get() = this.drop(1)
