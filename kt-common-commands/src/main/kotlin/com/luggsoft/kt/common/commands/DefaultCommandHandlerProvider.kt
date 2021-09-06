package com.luggsoft.kt.common.commands

class DefaultCommandHandlerProvider(
    mappings: Iterable<com.luggsoft.kt.common.commands.CommandHandlerMapping<com.luggsoft.kt.common.commands.Command<*>, DefaultCommandContext, *>>
) : CommandHandlerProviderBase<DefaultCommandContext>(
    mappings = mappings
)
