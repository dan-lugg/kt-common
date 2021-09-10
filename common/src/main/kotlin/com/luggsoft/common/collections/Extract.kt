package com.luggsoft.common

fun <TElement> MutableCollection<TElement>.extract(predicate: (TElement) -> Boolean): Collection<TElement> = this
    .filter(predicate)
    .also(this::removeAll)
