package com.luggsoft.kt.common.commands

class DefaultCommandContext(
    private val map: Map<String, Any> = emptyMap()
) : com.luggsoft.kt.common.commands.CommandContext, Map<String, Any> by map
