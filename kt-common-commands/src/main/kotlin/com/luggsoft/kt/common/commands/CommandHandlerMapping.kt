package com.luggsoft.kt.common.commands

import kotlin.reflect.KClass

class CommandHandlerMapping<TCommand : com.luggsoft.kt.common.commands.Command<TResult>, TCommandContext : com.luggsoft.kt.common.commands.CommandContext, TResult : Any?>(
    val commandClass: KClass<out TCommand>,
    val commandHandlerFactory: com.luggsoft.kt.common.commands.CommandHandlerFactory<TCommand, TCommandContext, TResult>
)
