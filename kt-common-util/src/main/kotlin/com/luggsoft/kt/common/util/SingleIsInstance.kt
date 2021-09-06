package com.luggsoft.kt.common.util

inline fun <reified T> Iterable<*>.singleIsInstance(): T
{
    return this.single { element -> element is T } as T
}
