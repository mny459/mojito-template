package com.github.mny459.mojitotemplate.services

import com.intellij.openapi.project.Project
import com.github.mny459.mojitotemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
