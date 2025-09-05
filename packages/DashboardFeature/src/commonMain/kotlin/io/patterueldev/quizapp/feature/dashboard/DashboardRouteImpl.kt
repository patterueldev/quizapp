package io.patterueldev.quizapp.feature.dashboard

import dev.whyoleg.sweetspi.ServiceProvider
import io.patterueldev.quizapp.core.DashboardRoute

@ServiceProvider
object DashboardRouteImpl : DashboardRoute() {
    override fun routeToDashboard() {
        println("DashboardRouteImpl route to dashboard")
    }
}