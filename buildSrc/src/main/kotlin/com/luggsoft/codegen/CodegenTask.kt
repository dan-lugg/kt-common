package com.luggsoft.codegen

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

open class CodegenTask : DefaultTask()
{
    @Input
    var basePath: String = ""

    @Input
    var permutations: Int = 0

    @TaskAction
    fun run()
    {
        Codegen.generate(
            logger = this.logger,
            basePath = this.basePath,
            permutations = this.permutations,
        )
    }
}
