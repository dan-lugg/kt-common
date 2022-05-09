package com.luggsoft.codegen

import com.luggsoft.codegen.generators.MemoizedCodeGenerator
import com.luggsoft.codegen.generators.PartialCodeGenerator
import com.luggsoft.codegen.generators.TupleCodeGenerator
import org.gradle.api.logging.Logger
import java.nio.file.Paths

internal object Codegen
{
    @JvmStatic
    fun generate(
        logger: Logger,
        basePath: String,
        permutations: Int,
    )
    {
        try
        {
            val generators = listOf(
                TupleCodeGenerator(
                    path = Paths.get(basePath, "Tuple.kt")
                        .toAbsolutePath()
                        .toString(),
                    permutations = permutations,
                ),
                PartialCodeGenerator(
                    path = Paths.get(basePath, "Partial.kt")
                        .toAbsolutePath()
                        .toString(),
                    permutations = permutations,
                ),
                MemoizedCodeGenerator(
                    path = Paths.get(basePath, "Memoized.kt")
                        .toAbsolutePath()
                        .toString(),
                    permutations = permutations,
                ),
            )

            generators.forEach { generator ->
                logger.info("Generating code with $generator")
                generator.generateCode()
            }
        }
        catch (exception: Exception)
        {
            logger.error("Failed to generate code", exception)
            throw exception
        }
    }
}
