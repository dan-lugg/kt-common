package com.luggsoft.kt.common.commands

interface CommandHandler<TCommand : com.luggsoft.kt.common.commands.Command<TResult>, TCommandContext : com.luggsoft.kt.common.commands.CommandContext, TResult : Any?>
{
    fun handleCommand(command: TCommand, commandContext: TCommandContext): TResult
}
