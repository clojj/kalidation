/*
 * The MIT License
 *
 * Copyright (c) 2018 Richard Capraro
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.capraro.kalidation.constraints.function.method

import com.capraro.kalidation.constraints.rule.Future
import com.capraro.kalidation.constraints.rule.FutureOrPresent
import com.capraro.kalidation.constraints.rule.Past
import com.capraro.kalidation.constraints.rule.PastOrPresent
import com.capraro.kalidation.spec.MethodConstraint
import java.time.temporal.Temporal

/**
 * [Temporal] Validation Functions.
 * @author Richard Capraro
 * @since 1.3.0
 */
fun MethodConstraint<out Temporal?>.future(message: String? = null) {
    constraintRules.add(Future(message))
}

fun MethodConstraint<out Temporal?>.futureOrPresent(message: String? = null) {
    constraintRules.add(FutureOrPresent(message))
}

fun MethodConstraint<out Temporal?>.past(message: String? = null) {
    constraintRules.add(Past(message))
}

fun MethodConstraint<out Temporal?>.pastOrPresent(message: String? = null) {
    constraintRules.add(PastOrPresent(message))
}