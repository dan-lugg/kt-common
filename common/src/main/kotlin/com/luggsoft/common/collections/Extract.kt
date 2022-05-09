package com.luggsoft.common.collections

fun <TElement> MutableCollection<TElement>.extract(predicate: (TElement) -> Boolean): Collection<TElement> = this
    .filter(predicate)
    .also(this::removeAll)
