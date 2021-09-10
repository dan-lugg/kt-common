@file:Suppress("PackageDirectoryMismatch")

package com.luggsoft.common

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap

/**
 * Represents a memoized function of signature [(T1) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @see [Tuple1]
 *
 * @property block The function to memoize.
 * @property cache The function return value cache, with keys of type [Tuple1] and values of type [R].
 */
data class Memoized1<T1, out R>(
    private val block: (T1) -> R,
    private val cache: ConcurrentMap<Tuple1<T1>, R> = ConcurrentHashMap(),
) : (T1) -> R, Map<Tuple1<T1>, R> by cache
{
    override fun invoke(p1: T1): R
    {
        val key = Tuple1(p1)
        val provider = this.block.partial(p1)
        return this.cache.getOrPut(key, provider)
    }
}

/**
 * Memoizes a function of signature [(T1) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @param function The function to memoize.
 * @return A memoized instance of [function]
 */
fun <T1, R> memoize(function: (T1) -> R): Memoized1<T1, R> = Memoized1(function)

/**
 * Represents a memoized function of signature [(T1, T2) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @see [Tuple2]
 *
 * @property block The function to memoize.
 * @property cache The function return value cache, with keys of type [Tuple2] and values of type [R].
 */
data class Memoized2<T1, T2, out R>(
    private val block: (T1, T2) -> R,
    private val cache: ConcurrentMap<Tuple2<T1, T2>, R> = ConcurrentHashMap(),
) : (T1, T2) -> R, Map<Tuple2<T1, T2>, R> by cache
{
    override fun invoke(p1: T1, p2: T2): R
    {
        val key = Tuple2(p1, p2)
        val provider = this.block.partial(p1, p2)
        return this.cache.getOrPut(key, provider)
    }
}

/**
 * Memoizes a function of signature [(T1, T2) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @param function The function to memoize.
 * @return A memoized instance of [function]
 */
fun <T1, T2, R> memoize(function: (T1, T2) -> R): Memoized2<T1, T2, R> = Memoized2(function)

/**
 * Represents a memoized function of signature [(T1, T2, T3) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @see [Tuple3]
 *
 * @property block The function to memoize.
 * @property cache The function return value cache, with keys of type [Tuple3] and values of type [R].
 */
data class Memoized3<T1, T2, T3, out R>(
    private val block: (T1, T2, T3) -> R,
    private val cache: ConcurrentMap<Tuple3<T1, T2, T3>, R> = ConcurrentHashMap(),
) : (T1, T2, T3) -> R, Map<Tuple3<T1, T2, T3>, R> by cache
{
    override fun invoke(p1: T1, p2: T2, p3: T3): R
    {
        val key = Tuple3(p1, p2, p3)
        val provider = this.block.partial(p1, p2, p3)
        return this.cache.getOrPut(key, provider)
    }
}

/**
 * Memoizes a function of signature [(T1, T2, T3) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @param function The function to memoize.
 * @return A memoized instance of [function]
 */
fun <T1, T2, T3, R> memoize(function: (T1, T2, T3) -> R): Memoized3<T1, T2, T3, R> = Memoized3(function)

/**
 * Represents a memoized function of signature [(T1, T2, T3, T4) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @see [Tuple4]
 *
 * @property block The function to memoize.
 * @property cache The function return value cache, with keys of type [Tuple4] and values of type [R].
 */
data class Memoized4<T1, T2, T3, T4, out R>(
    private val block: (T1, T2, T3, T4) -> R,
    private val cache: ConcurrentMap<Tuple4<T1, T2, T3, T4>, R> = ConcurrentHashMap(),
) : (T1, T2, T3, T4) -> R, Map<Tuple4<T1, T2, T3, T4>, R> by cache
{
    override fun invoke(p1: T1, p2: T2, p3: T3, p4: T4): R
    {
        val key = Tuple4(p1, p2, p3, p4)
        val provider = this.block.partial(p1, p2, p3, p4)
        return this.cache.getOrPut(key, provider)
    }
}

/**
 * Memoizes a function of signature [(T1, T2, T3, T4) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @param function The function to memoize.
 * @return A memoized instance of [function]
 */
fun <T1, T2, T3, T4, R> memoize(function: (T1, T2, T3, T4) -> R): Memoized4<T1, T2, T3, T4, R> = Memoized4(function)

/**
 * Represents a memoized function of signature [(T1, T2, T3, T4, T5) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @see [Tuple5]
 *
 * @property block The function to memoize.
 * @property cache The function return value cache, with keys of type [Tuple5] and values of type [R].
 */
data class Memoized5<T1, T2, T3, T4, T5, out R>(
    private val block: (T1, T2, T3, T4, T5) -> R,
    private val cache: ConcurrentMap<Tuple5<T1, T2, T3, T4, T5>, R> = ConcurrentHashMap(),
) : (T1, T2, T3, T4, T5) -> R, Map<Tuple5<T1, T2, T3, T4, T5>, R> by cache
{
    override fun invoke(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5): R
    {
        val key = Tuple5(p1, p2, p3, p4, p5)
        val provider = this.block.partial(p1, p2, p3, p4, p5)
        return this.cache.getOrPut(key, provider)
    }
}

/**
 * Memoizes a function of signature [(T1, T2, T3, T4, T5) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @param function The function to memoize.
 * @return A memoized instance of [function]
 */
fun <T1, T2, T3, T4, T5, R> memoize(function: (T1, T2, T3, T4, T5) -> R): Memoized5<T1, T2, T3, T4, T5, R> = Memoized5(function)

/**
 * Represents a memoized function of signature [(T1, T2, T3, T4, T5, T6) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @see [Tuple6]
 *
 * @property block The function to memoize.
 * @property cache The function return value cache, with keys of type [Tuple6] and values of type [R].
 */
data class Memoized6<T1, T2, T3, T4, T5, T6, out R>(
    private val block: (T1, T2, T3, T4, T5, T6) -> R,
    private val cache: ConcurrentMap<Tuple6<T1, T2, T3, T4, T5, T6>, R> = ConcurrentHashMap(),
) : (T1, T2, T3, T4, T5, T6) -> R, Map<Tuple6<T1, T2, T3, T4, T5, T6>, R> by cache
{
    override fun invoke(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6): R
    {
        val key = Tuple6(p1, p2, p3, p4, p5, p6)
        val provider = this.block.partial(p1, p2, p3, p4, p5, p6)
        return this.cache.getOrPut(key, provider)
    }
}

/**
 * Memoizes a function of signature [(T1, T2, T3, T4, T5, T6) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @param function The function to memoize.
 * @return A memoized instance of [function]
 */
fun <T1, T2, T3, T4, T5, T6, R> memoize(function: (T1, T2, T3, T4, T5, T6) -> R): Memoized6<T1, T2, T3, T4, T5, T6, R> = Memoized6(function)

/**
 * Represents a memoized function of signature [(T1, T2, T3, T4, T5, T6, T7) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @see [Tuple7]
 *
 * @property block The function to memoize.
 * @property cache The function return value cache, with keys of type [Tuple7] and values of type [R].
 */
data class Memoized7<T1, T2, T3, T4, T5, T6, T7, out R>(
    private val block: (T1, T2, T3, T4, T5, T6, T7) -> R,
    private val cache: ConcurrentMap<Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> = ConcurrentHashMap(),
) : (T1, T2, T3, T4, T5, T6, T7) -> R, Map<Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> by cache
{
    override fun invoke(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7): R
    {
        val key = Tuple7(p1, p2, p3, p4, p5, p6, p7)
        val provider = this.block.partial(p1, p2, p3, p4, p5, p6, p7)
        return this.cache.getOrPut(key, provider)
    }
}

/**
 * Memoizes a function of signature [(T1, T2, T3, T4, T5, T6, T7) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @param function The function to memoize.
 * @return A memoized instance of [function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, R> memoize(function: (T1, T2, T3, T4, T5, T6, T7) -> R): Memoized7<T1, T2, T3, T4, T5, T6, T7, R> = Memoized7(function)

/**
 * Represents a memoized function of signature [(T1, T2, T3, T4, T5, T6, T7, T8) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @see [Tuple8]
 *
 * @property block The function to memoize.
 * @property cache The function return value cache, with keys of type [Tuple8] and values of type [R].
 */
data class Memoized8<T1, T2, T3, T4, T5, T6, T7, T8, out R>(
    private val block: (T1, T2, T3, T4, T5, T6, T7, T8) -> R,
    private val cache: ConcurrentMap<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> = ConcurrentHashMap(),
) : (T1, T2, T3, T4, T5, T6, T7, T8) -> R, Map<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> by cache
{
    override fun invoke(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8): R
    {
        val key = Tuple8(p1, p2, p3, p4, p5, p6, p7, p8)
        val provider = this.block.partial(p1, p2, p3, p4, p5, p6, p7, p8)
        return this.cache.getOrPut(key, provider)
    }
}

/**
 * Memoizes a function of signature [(T1, T2, T3, T4, T5, T6, T7, T8) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @param function The function to memoize.
 * @return A memoized instance of [function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, R> memoize(function: (T1, T2, T3, T4, T5, T6, T7, T8) -> R): Memoized8<T1, T2, T3, T4, T5, T6, T7, T8, R> = Memoized8(function)

/**
 * Represents a memoized function of signature [(T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @see [Tuple9]
 *
 * @property block The function to memoize.
 * @property cache The function return value cache, with keys of type [Tuple9] and values of type [R].
 */
data class Memoized9<T1, T2, T3, T4, T5, T6, T7, T8, T9, out R>(
    private val block: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R,
    private val cache: ConcurrentMap<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>, R> = ConcurrentHashMap(),
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R, Map<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>, R> by cache
{
    override fun invoke(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9): R
    {
        val key = Tuple9(p1, p2, p3, p4, p5, p6, p7, p8, p9)
        val provider = this.block.partial(p1, p2, p3, p4, p5, p6, p7, p8, p9)
        return this.cache.getOrPut(key, provider)
    }
}

/**
 * Memoizes a function of signature [(T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @param function The function to memoize.
 * @return A memoized instance of [function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> memoize(function: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R): Memoized9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> = Memoized9(function)

/**
 * Represents a memoized function of signature [(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @see [Tuple10]
 *
 * @property block The function to memoize.
 * @property cache The function return value cache, with keys of type [Tuple10] and values of type [R].
 */
data class Memoized10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, out R>(
    private val block: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R,
    private val cache: ConcurrentMap<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, R> = ConcurrentHashMap(),
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R, Map<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, R> by cache
{
    override fun invoke(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10): R
    {
        val key = Tuple10(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
        val provider = this.block.partial(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
        return this.cache.getOrPut(key, provider)
    }
}

/**
 * Memoizes a function of signature [(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @param function The function to memoize.
 * @return A memoized instance of [function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> memoize(function: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R): Memoized10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> = Memoized10(function)

/**
 * Represents a memoized function of signature [(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @see [Tuple11]
 *
 * @property block The function to memoize.
 * @property cache The function return value cache, with keys of type [Tuple11] and values of type [R].
 */
data class Memoized11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, out R>(
    private val block: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R,
    private val cache: ConcurrentMap<Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>, R> = ConcurrentHashMap(),
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R, Map<Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>, R> by cache
{
    override fun invoke(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11): R
    {
        val key = Tuple11(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
        val provider = this.block.partial(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
        return this.cache.getOrPut(key, provider)
    }
}

/**
 * Memoizes a function of signature [(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @param function The function to memoize.
 * @return A memoized instance of [function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> memoize(function: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R): Memoized11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> = Memoized11(function)

/**
 * Represents a memoized function of signature [(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @see [Tuple12]
 *
 * @property block The function to memoize.
 * @property cache The function return value cache, with keys of type [Tuple12] and values of type [R].
 */
data class Memoized12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, out R>(
    private val block: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R,
    private val cache: ConcurrentMap<Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, R> = ConcurrentHashMap(),
) : (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R, Map<Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, R> by cache
{
    override fun invoke(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11, p12: T12): R
    {
        val key = Tuple12(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
        val provider = this.block.partial(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
        return this.cache.getOrPut(key, provider)
    }
}

/**
 * Memoizes a function of signature [(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R].
 *
 * [https://en.wikipedia.org/wiki/Memoization]
 *
 * @param function The function to memoize.
 * @return A memoized instance of [function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> memoize(function: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R): Memoized12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> = Memoized12(function)

