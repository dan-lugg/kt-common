@file:Suppress("PackageDirectoryMismatch")

package com.luggsoft.common

/**
 * Represents a tuple of 1 value(s).
 *
 * [https://en.wikipedia.org/wiki/Tuple]
 */
data class Tuple1<T1>(
    val p1: T1,
)
{
    /**
     * Returns a new [Tuple1] with [value] as the last value.
     *
     * @param value The value to include in the new [Tuple1]
     */
    operator fun <T> plus(value: T) = Tuple2(this.p1, value)

    /**
     * Returns the tuple value(s) as a list.
     *
     * @see [List]
     */
    fun toList() = listOf(this.p1)
}

/**
 * Invokes [this] with positional arguments from [Tuple1].
 */
fun <T1, R> ((T1) -> R).invokeWithTuple(tuple1: Tuple1<T1>) = this.invoke(tuple1.p1)

/**
 * Represents a tuple of 2 value(s).
 *
 * [https://en.wikipedia.org/wiki/Tuple]
 */
data class Tuple2<T1, T2>(
    val p1: T1,
    val p2: T2,
)
{
    /**
     * Returns a new [Tuple2] with [value] as the last value.
     *
     * @param value The value to include in the new [Tuple2]
     */
    operator fun <T> plus(value: T) = Tuple3(this.p1, this.p2, value)

    /**
     * Returns the tuple value(s) as a list.
     *
     * @see [List]
     */
    fun toList() = listOf(this.p1, this.p2)
}

/**
 * Invokes [this] with positional arguments from [Tuple2].
 */
fun <T1, T2, R> ((T1, T2) -> R).invokeWithTuple(tuple2: Tuple2<T1, T2>) = this.invoke(tuple2.p1, tuple2.p2)

/**
 * Represents a tuple of 3 value(s).
 *
 * [https://en.wikipedia.org/wiki/Tuple]
 */
data class Tuple3<T1, T2, T3>(
    val p1: T1,
    val p2: T2,
    val p3: T3,
)
{
    /**
     * Returns a new [Tuple3] with [value] as the last value.
     *
     * @param value The value to include in the new [Tuple3]
     */
    operator fun <T> plus(value: T) = Tuple4(this.p1, this.p2, this.p3, value)

    /**
     * Returns the tuple value(s) as a list.
     *
     * @see [List]
     */
    fun toList() = listOf(this.p1, this.p2, this.p3)
}

/**
 * Invokes [this] with positional arguments from [Tuple3].
 */
fun <T1, T2, T3, R> ((T1, T2, T3) -> R).invokeWithTuple(tuple3: Tuple3<T1, T2, T3>) = this.invoke(tuple3.p1, tuple3.p2, tuple3.p3)

/**
 * Represents a tuple of 4 value(s).
 *
 * [https://en.wikipedia.org/wiki/Tuple]
 */
data class Tuple4<T1, T2, T3, T4>(
    val p1: T1,
    val p2: T2,
    val p3: T3,
    val p4: T4,
)
{
    /**
     * Returns a new [Tuple4] with [value] as the last value.
     *
     * @param value The value to include in the new [Tuple4]
     */
    operator fun <T> plus(value: T) = Tuple5(this.p1, this.p2, this.p3, this.p4, value)

    /**
     * Returns the tuple value(s) as a list.
     *
     * @see [List]
     */
    fun toList() = listOf(this.p1, this.p2, this.p3, this.p4)
}

/**
 * Invokes [this] with positional arguments from [Tuple4].
 */
fun <T1, T2, T3, T4, R> ((T1, T2, T3, T4) -> R).invokeWithTuple(tuple4: Tuple4<T1, T2, T3, T4>) = this.invoke(tuple4.p1, tuple4.p2, tuple4.p3, tuple4.p4)

/**
 * Represents a tuple of 5 value(s).
 *
 * [https://en.wikipedia.org/wiki/Tuple]
 */
data class Tuple5<T1, T2, T3, T4, T5>(
    val p1: T1,
    val p2: T2,
    val p3: T3,
    val p4: T4,
    val p5: T5,
)
{
    /**
     * Returns a new [Tuple5] with [value] as the last value.
     *
     * @param value The value to include in the new [Tuple5]
     */
    operator fun <T> plus(value: T) = Tuple6(this.p1, this.p2, this.p3, this.p4, this.p5, value)

    /**
     * Returns the tuple value(s) as a list.
     *
     * @see [List]
     */
    fun toList() = listOf(this.p1, this.p2, this.p3, this.p4, this.p5)
}

/**
 * Invokes [this] with positional arguments from [Tuple5].
 */
fun <T1, T2, T3, T4, T5, R> ((T1, T2, T3, T4, T5) -> R).invokeWithTuple(tuple5: Tuple5<T1, T2, T3, T4, T5>) = this.invoke(tuple5.p1, tuple5.p2, tuple5.p3, tuple5.p4, tuple5.p5)

/**
 * Represents a tuple of 6 value(s).
 *
 * [https://en.wikipedia.org/wiki/Tuple]
 */
data class Tuple6<T1, T2, T3, T4, T5, T6>(
    val p1: T1,
    val p2: T2,
    val p3: T3,
    val p4: T4,
    val p5: T5,
    val p6: T6,
)
{
    /**
     * Returns a new [Tuple6] with [value] as the last value.
     *
     * @param value The value to include in the new [Tuple6]
     */
    operator fun <T> plus(value: T) = Tuple7(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, value)

    /**
     * Returns the tuple value(s) as a list.
     *
     * @see [List]
     */
    fun toList() = listOf(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6)
}

/**
 * Invokes [this] with positional arguments from [Tuple6].
 */
fun <T1, T2, T3, T4, T5, T6, R> ((T1, T2, T3, T4, T5, T6) -> R).invokeWithTuple(tuple6: Tuple6<T1, T2, T3, T4, T5, T6>) = this.invoke(tuple6.p1, tuple6.p2, tuple6.p3, tuple6.p4, tuple6.p5, tuple6.p6)

/**
 * Represents a tuple of 7 value(s).
 *
 * [https://en.wikipedia.org/wiki/Tuple]
 */
data class Tuple7<T1, T2, T3, T4, T5, T6, T7>(
    val p1: T1,
    val p2: T2,
    val p3: T3,
    val p4: T4,
    val p5: T5,
    val p6: T6,
    val p7: T7,
)
{
    /**
     * Returns a new [Tuple7] with [value] as the last value.
     *
     * @param value The value to include in the new [Tuple7]
     */
    operator fun <T> plus(value: T) = Tuple8(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, this.p7, value)

    /**
     * Returns the tuple value(s) as a list.
     *
     * @see [List]
     */
    fun toList() = listOf(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, this.p7)
}

/**
 * Invokes [this] with positional arguments from [Tuple7].
 */
fun <T1, T2, T3, T4, T5, T6, T7, R> ((T1, T2, T3, T4, T5, T6, T7) -> R).invokeWithTuple(tuple7: Tuple7<T1, T2, T3, T4, T5, T6, T7>) = this.invoke(tuple7.p1, tuple7.p2, tuple7.p3, tuple7.p4, tuple7.p5, tuple7.p6, tuple7.p7)

/**
 * Represents a tuple of 8 value(s).
 *
 * [https://en.wikipedia.org/wiki/Tuple]
 */
data class Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>(
    val p1: T1,
    val p2: T2,
    val p3: T3,
    val p4: T4,
    val p5: T5,
    val p6: T6,
    val p7: T7,
    val p8: T8,
)
{
    /**
     * Returns a new [Tuple8] with [value] as the last value.
     *
     * @param value The value to include in the new [Tuple8]
     */
    operator fun <T> plus(value: T) = Tuple9(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, this.p7, this.p8, value)

    /**
     * Returns the tuple value(s) as a list.
     *
     * @see [List]
     */
    fun toList() = listOf(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, this.p7, this.p8)
}

/**
 * Invokes [this] with positional arguments from [Tuple8].
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, R> ((T1, T2, T3, T4, T5, T6, T7, T8) -> R).invokeWithTuple(tuple8: Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>) = this.invoke(tuple8.p1, tuple8.p2, tuple8.p3, tuple8.p4, tuple8.p5, tuple8.p6, tuple8.p7, tuple8.p8)

/**
 * Represents a tuple of 9 value(s).
 *
 * [https://en.wikipedia.org/wiki/Tuple]
 */
data class Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(
    val p1: T1,
    val p2: T2,
    val p3: T3,
    val p4: T4,
    val p5: T5,
    val p6: T6,
    val p7: T7,
    val p8: T8,
    val p9: T9,
)
{
    /**
     * Returns a new [Tuple9] with [value] as the last value.
     *
     * @param value The value to include in the new [Tuple9]
     */
    operator fun <T> plus(value: T) = Tuple10(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, this.p7, this.p8, this.p9, value)

    /**
     * Returns the tuple value(s) as a list.
     *
     * @see [List]
     */
    fun toList() = listOf(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, this.p7, this.p8, this.p9)
}

/**
 * Invokes [this] with positional arguments from [Tuple9].
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R).invokeWithTuple(tuple9: Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>) = this.invoke(tuple9.p1, tuple9.p2, tuple9.p3, tuple9.p4, tuple9.p5, tuple9.p6, tuple9.p7, tuple9.p8, tuple9.p9)

/**
 * Represents a tuple of 10 value(s).
 *
 * [https://en.wikipedia.org/wiki/Tuple]
 */
data class Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(
    val p1: T1,
    val p2: T2,
    val p3: T3,
    val p4: T4,
    val p5: T5,
    val p6: T6,
    val p7: T7,
    val p8: T8,
    val p9: T9,
    val p10: T10,
)
{
    /**
     * Returns a new [Tuple10] with [value] as the last value.
     *
     * @param value The value to include in the new [Tuple10]
     */
    operator fun <T> plus(value: T) = Tuple11(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, this.p7, this.p8, this.p9, this.p10, value)

    /**
     * Returns the tuple value(s) as a list.
     *
     * @see [List]
     */
    fun toList() = listOf(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, this.p7, this.p8, this.p9, this.p10)
}

/**
 * Invokes [this] with positional arguments from [Tuple10].
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R).invokeWithTuple(tuple10: Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>) = this.invoke(tuple10.p1, tuple10.p2, tuple10.p3, tuple10.p4, tuple10.p5, tuple10.p6, tuple10.p7, tuple10.p8, tuple10.p9, tuple10.p10)

/**
 * Represents a tuple of 11 value(s).
 *
 * [https://en.wikipedia.org/wiki/Tuple]
 */
data class Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(
    val p1: T1,
    val p2: T2,
    val p3: T3,
    val p4: T4,
    val p5: T5,
    val p6: T6,
    val p7: T7,
    val p8: T8,
    val p9: T9,
    val p10: T10,
    val p11: T11,
)
{
    /**
     * Returns a new [Tuple11] with [value] as the last value.
     *
     * @param value The value to include in the new [Tuple11]
     */
    operator fun <T> plus(value: T) = Tuple12(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, this.p7, this.p8, this.p9, this.p10, this.p11, value)

    /**
     * Returns the tuple value(s) as a list.
     *
     * @see [List]
     */
    fun toList() = listOf(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, this.p7, this.p8, this.p9, this.p10, this.p11)
}

/**
 * Invokes [this] with positional arguments from [Tuple11].
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R).invokeWithTuple(tuple11: Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>) = this.invoke(tuple11.p1, tuple11.p2, tuple11.p3, tuple11.p4, tuple11.p5, tuple11.p6, tuple11.p7, tuple11.p8, tuple11.p9, tuple11.p10, tuple11.p11)

/**
 * Represents a tuple of 12 value(s).
 *
 * [https://en.wikipedia.org/wiki/Tuple]
 */
data class Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(
    val p1: T1,
    val p2: T2,
    val p3: T3,
    val p4: T4,
    val p5: T5,
    val p6: T6,
    val p7: T7,
    val p8: T8,
    val p9: T9,
    val p10: T10,
    val p11: T11,
    val p12: T12,
)
{
    /**
     * Returns the tuple value(s) as a list.
     *
     * @see [List]
     */
    fun toList() = listOf(this.p1, this.p2, this.p3, this.p4, this.p5, this.p6, this.p7, this.p8, this.p9, this.p10, this.p11, this.p12)
}

/**
 * Invokes [this] with positional arguments from [Tuple12].
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).invokeWithTuple(tuple12: Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>) = this.invoke(tuple12.p1, tuple12.p2, tuple12.p3, tuple12.p4, tuple12.p5, tuple12.p6, tuple12.p7, tuple12.p8, tuple12.p9, tuple12.p10, tuple12.p11, tuple12.p12)

