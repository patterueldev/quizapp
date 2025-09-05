package io.patterueldev.quizapp.feature.dashboard

import io.patterueldev.quizapp.core.DashboardRoute

object DashboardRouteImpl : DashboardRoute() {
    override fun routeToDashboard() {
        println("DashboardRouteImpl route to dashboard")
    }
}