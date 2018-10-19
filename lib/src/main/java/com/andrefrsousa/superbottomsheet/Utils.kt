/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 André Sousa
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.andrefrsousa.superbottomsheet

import android.graphics.Color
import android.os.Build
import android.support.annotation.ColorInt

internal fun hasMinimumSdk(minimumSdk: Int): Boolean {
    return Build.VERSION.SDK_INT >= minimumSdk
}

@ColorInt
internal fun blendColors(@ColorInt from: Int, @ColorInt to: Int, ratio: Float): Int {
    val inverseRatio = 1f - ratio

    val r = Color.red(to) * ratio + Color.red(from) * inverseRatio
    val g = Color.green(to) * ratio + Color.green(from) * inverseRatio
    val b = Color.blue(to) * ratio + Color.blue(from) * inverseRatio

    return Color.rgb(r.toInt(), g.toInt(), b.toInt())
}
