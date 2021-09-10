package com.luggsoft.codegen

import com.luggsoft.codegen.generators.MemoizedGenerator
import com.luggsoft.codegen.generators.PartialGenerator
import com.luggsoft.codegen.generators.TupleGenerator
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
                TupleGenerator(
                    path = Paths.get(basePath, "Tuple.kt")
                        .toAbsolutePath()
                        .toString(),
                    permutations = permutations,
                ),
                PartialGenerator(
                    path = Paths.get(basePath, "Partial.kt")
                        .toAbsolutePath()
                        .toString(),
                    permutations = permutations,
                ),
                MemoizedGenerator(
                    path = Paths.get(basePath, "Memoized.kt")
                        .toAbsolutePath()
                        .toString(),
                    permutations = permutations,
                ),
            )

            generators.forEach { generator ->
                logger.info("Generating code with $generator")
                generator.generate()
            }
        }
        catch (exception: Exception)
        {
            logger.error("Failed to generate code", exception)
            throw exception
        }
    }
}
