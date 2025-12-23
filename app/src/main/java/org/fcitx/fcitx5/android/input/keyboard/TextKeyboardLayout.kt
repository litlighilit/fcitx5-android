/*
 * SPDX-License-Identifier: LGPL-2.1-or-later
 */
package org.fcitx.fcitx5.android.input.keyboard

import org.fcitx.fcitx5.android.R
import org.fcitx.fcitx5.android.data.prefs.ManagedPreferenceEnum

enum class TextKeyboardLayout(override val stringRes: Int) : ManagedPreferenceEnum {
    Default(R.string.default_),
    Alternative(R.string.text_keyboard_layout_alternative)
}
