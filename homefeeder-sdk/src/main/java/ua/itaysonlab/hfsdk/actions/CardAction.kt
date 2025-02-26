package ua.itaysonlab.hfsdk.actions

import android.os.Bundle
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class CardAction (
    val title: String,
    val type: ActionType,
    val meta: Bundle
): Parcelable