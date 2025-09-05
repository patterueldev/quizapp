package io.patterueldev.quizapp.core

import dev.whyoleg.sweetspi.Service
import dev.whyoleg.sweetspi.ServiceProvider

@Service
abstract class DashboardRoute {
    open fun routeToDashboard() {
        println("DefaultDashboardRoute route to dashboard")
    }
}

@ServiceProvider
object DefaultDashboardRoute : DashboardRoute()

