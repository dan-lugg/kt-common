package com.luggsoft.kt.common.commands.examples

import com.luggsoft.kt.common.commands.CommandContext
import com.luggsoft.kt.common.commands.CommandHandlerProvider
import com.luggsoft.kt.common.commands.CommandInvokerBase

class ExampleCommandContext : com.luggsoft.kt.common.commands.CommandContext

class ExampleCommandInvoker(
    commandHandlerProvider: CommandHandlerProvider<ExampleCommandContext>
) : CommandInvokerBase<ExampleCommandContext>(
    commandHandlerProvider = commandHandlerProvider
)

