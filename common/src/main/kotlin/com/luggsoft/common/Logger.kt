package com.luggsoft.common

import org.slf4j.Logger
import org.slf4j.LoggerFactory

private val getLogger = memoize { clazz: Class<*> -> LoggerFactory.getLogger(clazz) }

val Any.logger: Logger
    get() = getLogger(this::class.java)
