@file:Suppress("PackageDirectoryMismatch")

package com.luggsoft.common


/**
 * Creates a partial function bound to parameter(s) [p1].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, R> ((T1) -> R).partial(p1: T1) = {  -> this.invoke(p1) }


/**
 * Creates a partial function bound to parameter(s) [p1].
 * The resulting function accepts parameter(s) of type(s) [T2].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, R> ((T1, T2) -> R).partial(p1: T1) = { p2: T2 -> this.invoke(p1, p2) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, R> ((T1, T2) -> R).partial(p1: T1, p2: T2) = {  -> this.invoke(p1, p2) }


/**
 * Creates a partial function bound to parameter(s) [p1].
 * The resulting function accepts parameter(s) of type(s) [T2], [T3].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, R> ((T1, T2, T3) -> R).partial(p1: T1) = { p2: T2, p3: T3 -> this.invoke(p1, p2, p3) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2].
 * The resulting function accepts parameter(s) of type(s) [T3].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, R> ((T1, T2, T3) -> R).partial(p1: T1, p2: T2) = { p3: T3 -> this.invoke(p1, p2, p3) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, R> ((T1, T2, T3) -> R).partial(p1: T1, p2: T2, p3: T3) = {  -> this.invoke(p1, p2, p3) }


/**
 * Creates a partial function bound to parameter(s) [p1].
 * The resulting function accepts parameter(s) of type(s) [T2], [T3], [T4].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, R> ((T1, T2, T3, T4) -> R).partial(p1: T1) = { p2: T2, p3: T3, p4: T4 -> this.invoke(p1, p2, p3, p4) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2].
 * The resulting function accepts parameter(s) of type(s) [T3], [T4].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, R> ((T1, T2, T3, T4) -> R).partial(p1: T1, p2: T2) = { p3: T3, p4: T4 -> this.invoke(p1, p2, p3, p4) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3].
 * The resulting function accepts parameter(s) of type(s) [T4].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, R> ((T1, T2, T3, T4) -> R).partial(p1: T1, p2: T2, p3: T3) = { p4: T4 -> this.invoke(p1, p2, p3, p4) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, R> ((T1, T2, T3, T4) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4) = {  -> this.invoke(p1, p2, p3, p4) }


/**
 * Creates a partial function bound to parameter(s) [p1].
 * The resulting function accepts parameter(s) of type(s) [T2], [T3], [T4], [T5].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, R> ((T1, T2, T3, T4, T5) -> R).partial(p1: T1) = { p2: T2, p3: T3, p4: T4, p5: T5 -> this.invoke(p1, p2, p3, p4, p5) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2].
 * The resulting function accepts parameter(s) of type(s) [T3], [T4], [T5].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, R> ((T1, T2, T3, T4, T5) -> R).partial(p1: T1, p2: T2) = { p3: T3, p4: T4, p5: T5 -> this.invoke(p1, p2, p3, p4, p5) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3].
 * The resulting function accepts parameter(s) of type(s) [T4], [T5].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, R> ((T1, T2, T3, T4, T5) -> R).partial(p1: T1, p2: T2, p3: T3) = { p4: T4, p5: T5 -> this.invoke(p1, p2, p3, p4, p5) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4].
 * The resulting function accepts parameter(s) of type(s) [T5].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, R> ((T1, T2, T3, T4, T5) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4) = { p5: T5 -> this.invoke(p1, p2, p3, p4, p5) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, R> ((T1, T2, T3, T4, T5) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5) = {  -> this.invoke(p1, p2, p3, p4, p5) }


/**
 * Creates a partial function bound to parameter(s) [p1].
 * The resulting function accepts parameter(s) of type(s) [T2], [T3], [T4], [T5], [T6].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, R> ((T1, T2, T3, T4, T5, T6) -> R).partial(p1: T1) = { p2: T2, p3: T3, p4: T4, p5: T5, p6: T6 -> this.invoke(p1, p2, p3, p4, p5, p6) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2].
 * The resulting function accepts parameter(s) of type(s) [T3], [T4], [T5], [T6].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, R> ((T1, T2, T3, T4, T5, T6) -> R).partial(p1: T1, p2: T2) = { p3: T3, p4: T4, p5: T5, p6: T6 -> this.invoke(p1, p2, p3, p4, p5, p6) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3].
 * The resulting function accepts parameter(s) of type(s) [T4], [T5], [T6].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, R> ((T1, T2, T3, T4, T5, T6) -> R).partial(p1: T1, p2: T2, p3: T3) = { p4: T4, p5: T5, p6: T6 -> this.invoke(p1, p2, p3, p4, p5, p6) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4].
 * The resulting function accepts parameter(s) of type(s) [T5], [T6].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, R> ((T1, T2, T3, T4, T5, T6) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4) = { p5: T5, p6: T6 -> this.invoke(p1, p2, p3, p4, p5, p6) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5].
 * The resulting function accepts parameter(s) of type(s) [T6].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, R> ((T1, T2, T3, T4, T5, T6) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5) = { p6: T6 -> this.invoke(p1, p2, p3, p4, p5, p6) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, R> ((T1, T2, T3, T4, T5, T6) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6) = {  -> this.invoke(p1, p2, p3, p4, p5, p6) }


/**
 * Creates a partial function bound to parameter(s) [p1].
 * The resulting function accepts parameter(s) of type(s) [T2], [T3], [T4], [T5], [T6], [T7].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, R> ((T1, T2, T3, T4, T5, T6, T7) -> R).partial(p1: T1) = { p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7 -> this.invoke(p1, p2, p3, p4, p5, p6, p7) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2].
 * The resulting function accepts parameter(s) of type(s) [T3], [T4], [T5], [T6], [T7].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, R> ((T1, T2, T3, T4, T5, T6, T7) -> R).partial(p1: T1, p2: T2) = { p3: T3, p4: T4, p5: T5, p6: T6, p7: T7 -> this.invoke(p1, p2, p3, p4, p5, p6, p7) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3].
 * The resulting function accepts parameter(s) of type(s) [T4], [T5], [T6], [T7].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, R> ((T1, T2, T3, T4, T5, T6, T7) -> R).partial(p1: T1, p2: T2, p3: T3) = { p4: T4, p5: T5, p6: T6, p7: T7 -> this.invoke(p1, p2, p3, p4, p5, p6, p7) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4].
 * The resulting function accepts parameter(s) of type(s) [T5], [T6], [T7].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, R> ((T1, T2, T3, T4, T5, T6, T7) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4) = { p5: T5, p6: T6, p7: T7 -> this.invoke(p1, p2, p3, p4, p5, p6, p7) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5].
 * The resulting function accepts parameter(s) of type(s) [T6], [T7].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, R> ((T1, T2, T3, T4, T5, T6, T7) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5) = { p6: T6, p7: T7 -> this.invoke(p1, p2, p3, p4, p5, p6, p7) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6].
 * The resulting function accepts parameter(s) of type(s) [T7].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, R> ((T1, T2, T3, T4, T5, T6, T7) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6) = { p7: T7 -> this.invoke(p1, p2, p3, p4, p5, p6, p7) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, R> ((T1, T2, T3, T4, T5, T6, T7) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7) = {  -> this.invoke(p1, p2, p3, p4, p5, p6, p7) }


/**
 * Creates a partial function bound to parameter(s) [p1].
 * The resulting function accepts parameter(s) of type(s) [T2], [T3], [T4], [T5], [T6], [T7], [T8].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, R> ((T1, T2, T3, T4, T5, T6, T7, T8) -> R).partial(p1: T1) = { p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2].
 * The resulting function accepts parameter(s) of type(s) [T3], [T4], [T5], [T6], [T7], [T8].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, R> ((T1, T2, T3, T4, T5, T6, T7, T8) -> R).partial(p1: T1, p2: T2) = { p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3].
 * The resulting function accepts parameter(s) of type(s) [T4], [T5], [T6], [T7], [T8].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, R> ((T1, T2, T3, T4, T5, T6, T7, T8) -> R).partial(p1: T1, p2: T2, p3: T3) = { p4: T4, p5: T5, p6: T6, p7: T7, p8: T8 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4].
 * The resulting function accepts parameter(s) of type(s) [T5], [T6], [T7], [T8].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, R> ((T1, T2, T3, T4, T5, T6, T7, T8) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4) = { p5: T5, p6: T6, p7: T7, p8: T8 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5].
 * The resulting function accepts parameter(s) of type(s) [T6], [T7], [T8].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, R> ((T1, T2, T3, T4, T5, T6, T7, T8) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5) = { p6: T6, p7: T7, p8: T8 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6].
 * The resulting function accepts parameter(s) of type(s) [T7], [T8].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, R> ((T1, T2, T3, T4, T5, T6, T7, T8) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6) = { p7: T7, p8: T8 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7].
 * The resulting function accepts parameter(s) of type(s) [T8].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, R> ((T1, T2, T3, T4, T5, T6, T7, T8) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7) = { p8: T8 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, R> ((T1, T2, T3, T4, T5, T6, T7, T8) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8) = {  -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8) }


/**
 * Creates a partial function bound to parameter(s) [p1].
 * The resulting function accepts parameter(s) of type(s) [T2], [T3], [T4], [T5], [T6], [T7], [T8], [T9].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R).partial(p1: T1) = { p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2].
 * The resulting function accepts parameter(s) of type(s) [T3], [T4], [T5], [T6], [T7], [T8], [T9].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R).partial(p1: T1, p2: T2) = { p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3].
 * The resulting function accepts parameter(s) of type(s) [T4], [T5], [T6], [T7], [T8], [T9].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R).partial(p1: T1, p2: T2, p3: T3) = { p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4].
 * The resulting function accepts parameter(s) of type(s) [T5], [T6], [T7], [T8], [T9].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4) = { p5: T5, p6: T6, p7: T7, p8: T8, p9: T9 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5].
 * The resulting function accepts parameter(s) of type(s) [T6], [T7], [T8], [T9].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5) = { p6: T6, p7: T7, p8: T8, p9: T9 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6].
 * The resulting function accepts parameter(s) of type(s) [T7], [T8], [T9].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6) = { p7: T7, p8: T8, p9: T9 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7].
 * The resulting function accepts parameter(s) of type(s) [T8], [T9].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7) = { p8: T8, p9: T9 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8].
 * The resulting function accepts parameter(s) of type(s) [T9].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8) = { p9: T9 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8], [p9].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9) = {  -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9) }


/**
 * Creates a partial function bound to parameter(s) [p1].
 * The resulting function accepts parameter(s) of type(s) [T2], [T3], [T4], [T5], [T6], [T7], [T8], [T9], [T10].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R).partial(p1: T1) = { p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2].
 * The resulting function accepts parameter(s) of type(s) [T3], [T4], [T5], [T6], [T7], [T8], [T9], [T10].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R).partial(p1: T1, p2: T2) = { p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3].
 * The resulting function accepts parameter(s) of type(s) [T4], [T5], [T6], [T7], [T8], [T9], [T10].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R).partial(p1: T1, p2: T2, p3: T3) = { p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4].
 * The resulting function accepts parameter(s) of type(s) [T5], [T6], [T7], [T8], [T9], [T10].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4) = { p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5].
 * The resulting function accepts parameter(s) of type(s) [T6], [T7], [T8], [T9], [T10].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5) = { p6: T6, p7: T7, p8: T8, p9: T9, p10: T10 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6].
 * The resulting function accepts parameter(s) of type(s) [T7], [T8], [T9], [T10].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6) = { p7: T7, p8: T8, p9: T9, p10: T10 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7].
 * The resulting function accepts parameter(s) of type(s) [T8], [T9], [T10].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7) = { p8: T8, p9: T9, p10: T10 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8].
 * The resulting function accepts parameter(s) of type(s) [T9], [T10].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8) = { p9: T9, p10: T10 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8], [p9].
 * The resulting function accepts parameter(s) of type(s) [T10].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9) = { p10: T10 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8], [p9], [p10].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10) = {  -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }


/**
 * Creates a partial function bound to parameter(s) [p1].
 * The resulting function accepts parameter(s) of type(s) [T2], [T3], [T4], [T5], [T6], [T7], [T8], [T9], [T10], [T11].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R).partial(p1: T1) = { p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2].
 * The resulting function accepts parameter(s) of type(s) [T3], [T4], [T5], [T6], [T7], [T8], [T9], [T10], [T11].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R).partial(p1: T1, p2: T2) = { p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3].
 * The resulting function accepts parameter(s) of type(s) [T4], [T5], [T6], [T7], [T8], [T9], [T10], [T11].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R).partial(p1: T1, p2: T2, p3: T3) = { p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4].
 * The resulting function accepts parameter(s) of type(s) [T5], [T6], [T7], [T8], [T9], [T10], [T11].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4) = { p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5].
 * The resulting function accepts parameter(s) of type(s) [T6], [T7], [T8], [T9], [T10], [T11].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5) = { p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6].
 * The resulting function accepts parameter(s) of type(s) [T7], [T8], [T9], [T10], [T11].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6) = { p7: T7, p8: T8, p9: T9, p10: T10, p11: T11 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7].
 * The resulting function accepts parameter(s) of type(s) [T8], [T9], [T10], [T11].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7) = { p8: T8, p9: T9, p10: T10, p11: T11 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8].
 * The resulting function accepts parameter(s) of type(s) [T9], [T10], [T11].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8) = { p9: T9, p10: T10, p11: T11 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8], [p9].
 * The resulting function accepts parameter(s) of type(s) [T10], [T11].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9) = { p10: T10, p11: T11 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8], [p9], [p10].
 * The resulting function accepts parameter(s) of type(s) [T11].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10) = { p11: T11 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8], [p9], [p10], [p11].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11) = {  -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }


/**
 * Creates a partial function bound to parameter(s) [p1].
 * The resulting function accepts parameter(s) of type(s) [T2], [T3], [T4], [T5], [T6], [T7], [T8], [T9], [T10], [T11], [T12].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).partial(p1: T1) = { p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11, p12: T12 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2].
 * The resulting function accepts parameter(s) of type(s) [T3], [T4], [T5], [T6], [T7], [T8], [T9], [T10], [T11], [T12].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).partial(p1: T1, p2: T2) = { p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11, p12: T12 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3].
 * The resulting function accepts parameter(s) of type(s) [T4], [T5], [T6], [T7], [T8], [T9], [T10], [T11], [T12].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).partial(p1: T1, p2: T2, p3: T3) = { p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11, p12: T12 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4].
 * The resulting function accepts parameter(s) of type(s) [T5], [T6], [T7], [T8], [T9], [T10], [T11], [T12].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4) = { p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11, p12: T12 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5].
 * The resulting function accepts parameter(s) of type(s) [T6], [T7], [T8], [T9], [T10], [T11], [T12].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5) = { p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11, p12: T12 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6].
 * The resulting function accepts parameter(s) of type(s) [T7], [T8], [T9], [T10], [T11], [T12].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6) = { p7: T7, p8: T8, p9: T9, p10: T10, p11: T11, p12: T12 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7].
 * The resulting function accepts parameter(s) of type(s) [T8], [T9], [T10], [T11], [T12].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7) = { p8: T8, p9: T9, p10: T10, p11: T11, p12: T12 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8].
 * The resulting function accepts parameter(s) of type(s) [T9], [T10], [T11], [T12].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8) = { p9: T9, p10: T10, p11: T11, p12: T12 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8], [p9].
 * The resulting function accepts parameter(s) of type(s) [T10], [T11], [T12].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9) = { p10: T10, p11: T11, p12: T12 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8], [p9], [p10].
 * The resulting function accepts parameter(s) of type(s) [T11], [T12].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10) = { p11: T11, p12: T12 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8], [p9], [p10], [p11].
 * The resulting function accepts parameter(s) of type(s) [T12].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11) = { p12: T12 -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }


/**
 * Creates a partial function bound to parameter(s) [p1], [p2], [p3], [p4], [p5], [p6], [p7], [p8], [p9], [p10], [p11], [p12].
 * The resulting function returns [R].
 *
 * [https://en.wikipedia.org/wiki/Partial_function]
 */
fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> ((T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> R).partial(p1: T1, p2: T2, p3: T3, p4: T4, p5: T5, p6: T6, p7: T7, p8: T8, p9: T9, p10: T10, p11: T11, p12: T12) = {  -> this.invoke(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

