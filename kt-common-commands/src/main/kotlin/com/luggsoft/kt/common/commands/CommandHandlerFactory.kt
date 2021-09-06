package com.luggsoft.kt.common.commands

class CommandHandlerFactory<TCommand : com.luggsoft.kt.common.commands.Command<TResult>, TCommandContext : com.luggsoft.kt.common.commands.CommandContext, TResult : Any?>(
    private val block: () -> com.luggsoft.kt.common.commands.CommandHandler<TCommand, TCommandContext, TResult>
)
{
    fun createCommandHandler(): com.luggsoft.kt.common.commands.CommandHandler<TCommand, TCommandContext, TResult>
    {
        return this.block.invoke()
    }
}
