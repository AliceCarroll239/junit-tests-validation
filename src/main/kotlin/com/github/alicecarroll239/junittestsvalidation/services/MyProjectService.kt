package com.github.alicecarroll239.junittestsvalidation.services

import com.github.alicecarroll239.junittestsvalidation.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
