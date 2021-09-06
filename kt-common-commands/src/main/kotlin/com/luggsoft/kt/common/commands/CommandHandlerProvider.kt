package com.luggsoft.kt.common.commands

import kotlin.reflect.KClass

interface CommandHandlerProvider<TCommandContext : com.luggsoft.kt.common.commands.CommandContext>
{
    fun getCommandHandler(commandClass: KClass<out com.luggsoft.kt.common.commands.Command<*>>): com.luggsoft.kt.common.commands.CommandHandler<com.luggsoft.kt.common.commands.Command<*>, TCommandContext, *>
}
