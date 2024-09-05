package com.example.dailyplant.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Plant(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int,
)