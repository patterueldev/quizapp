package io.patterueldev.quizapp.core

import dev.whyoleg.sweetspi.ServiceLoader

class Routes {
    private val dashboardRoute: DashboardRoute = ServiceLoader.load<DashboardRoute>().last()

    fun dashboardRoute() {
        dashboardRoute.routeToDashboard()
    }

    companion object {
        val shared by lazy { Routes() }
    }
}