package com.example.kotlin2lesson1.common.extentions

import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavDirections


fun NavController.navigateSafely(@IdRes actionId: Int) =
    currentDestination?.getAction(actionId)?.let { navigate(actionId) }

fun NavController.navigateSafelyUsingDirections(directions: NavDirections) =
    currentDestination?.getAction(directions.actionId)?.let { navigate(directions) }