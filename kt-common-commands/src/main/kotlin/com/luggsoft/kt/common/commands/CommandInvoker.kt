package com.luggsoft.kt.common.commands

interface CommandInvoker<in TCommandContext : com.luggsoft.kt.common.commands.CommandContext>
{
    fun invokeCommand(command: com.luggsoft.kt.common.commands.Command<*>, commandContext: TCommandContext): Any?
}
