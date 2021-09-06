package com.luggsoft.kt.common.commands

class CommandHandlerProviderException : Exception
{
    constructor() : super()
    constructor(message: String) : super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)
}
