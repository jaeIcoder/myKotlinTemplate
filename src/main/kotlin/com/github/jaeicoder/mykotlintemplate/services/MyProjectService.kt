package com.github.jaeicoder.mykotlintemplate.services

import com.intellij.openapi.project.Project
import com.github.jaeicoder.mykotlintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
