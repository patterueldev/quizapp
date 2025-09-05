package io.patterueldev.quizapp.core

abstract class DashboardRoute {
    open fun routeToDashboard() {
        println("DefaultDashboardRoute route to dashboard")
    }
}

object DefaultDashboardRoute : DashboardRoute()