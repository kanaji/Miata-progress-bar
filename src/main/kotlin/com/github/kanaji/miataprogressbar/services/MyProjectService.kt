package com.github.kanaji.miataprogressbar.services

import com.intellij.openapi.project.Project
import com.github.kanaji.miataprogressbar.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
