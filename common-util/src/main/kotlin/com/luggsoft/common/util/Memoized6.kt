package com.luggsoft.common.util

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap

/**
 * TODO
 *
 * @param missingValue
 * @param TResult
 * @property block
 * @property cache
 */
data class Memoized6<TParam1, TParam2, TParam3, TParam4, TParam5, TParam6, out TResult>(
    private val block: (TParam1, TParam2, TParam3, TParam4, TParam5, TParam6) -> TResult,
    private val cache: ConcurrentMap<Tuple6<TParam1, TParam2, TParam3, TParam4, TParam5, TParam6>, TResult> = ConcurrentHashMap()
) : (TParam1, TParam2, TParam3, TParam4, TParam5, TParam6) -> TResult, Map<Tuple6<TParam1, TParam2, TParam3, TParam4, TParam5, TParam6>, TResult> by cache
{
    /**
     * TODO
     *
     * @param missingValue
     * @return
     */
    override fun invoke(param1: TParam1, param2: TParam2, param3: TParam3, param4: TParam4, param5: TParam5, param6: TParam6): TResult
    {
        val key = Tuple6(param1, param2, param3, param4, param5, param6)
        val provider = this.block.partial(param1, param2, param3, param4, param5, param6)
        return this.cache.getOrPut(key, provider)
    }
}
