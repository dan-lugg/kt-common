package com.luggsoft.kt.common.commands

import kotlin.reflect.KClass

inline fun <reified TCommand : com.luggsoft.kt.common.commands.Command<TResult>, TCommandContext : com.luggsoft.kt.common.commands.CommandContext, TResult : Any?> commandHandlerMappingOf(
    commandClass: KClass<TCommand>,
    commandHandlerFactory: com.luggsoft.kt.common.commands.CommandHandlerFactory<TCommand, TCommandContext, TResult>
): com.luggsoft.kt.common.commands.CommandHandlerMapping<com.luggsoft.kt.common.commands.Command<*>, TCommandContext, *>
{
    val commandHandlerMapping = com.luggsoft.kt.common.commands.CommandHandlerMapping(
        commandClass = commandClass,
        commandHandlerFactory = commandHandlerFactory
    )
    return commandHandlerMapping as com.luggsoft.kt.common.commands.CommandHandlerMapping<com.luggsoft.kt.common.commands.Command<*>, TCommandContext, *>
}

inline fun <reified TCommand : com.luggsoft.kt.common.commands.Command<TResult>, TCommandContext : com.luggsoft.kt.common.commands.CommandContext, TResult : Any?> commandHandlerMappingOf(
    commandHandlerFactory: com.luggsoft.kt.common.commands.CommandHandlerFactory<TCommand, TCommandContext, TResult>
): com.luggsoft.kt.common.commands.CommandHandlerMapping<com.luggsoft.kt.common.commands.Command<*>, TCommandContext, *>
{
    return commandHandlerMappingOf(
        commandClass = TCommand::class,
        commandHandlerFactory = commandHandlerFactory
    )
}

inline fun <reified TCommand : com.luggsoft.kt.common.commands.Command<TResult>, TCommandContext : com.luggsoft.kt.common.commands.CommandContext, TResult : Any?> commandHandlerMappingOf(
    noinline block: () -> com.luggsoft.kt.common.commands.CommandHandler<TCommand, TCommandContext, TResult>
): com.luggsoft.kt.common.commands.CommandHandlerMapping<com.luggsoft.kt.common.commands.Command<*>, TCommandContext, *>
{
    return commandHandlerMappingOf(
        commandHandlerFactory = com.luggsoft.kt.common.commands.CommandHandlerFactory(block)
    )
}
