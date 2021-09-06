package com.luggsoft.kt.common.commands

class DefaultCommandInvoker(
    commandHandlerProvider: CommandHandlerProvider<DefaultCommandContext>
) : CommandInvokerBase<DefaultCommandContext>(
    commandHandlerProvider = commandHandlerProvider
)
