package com.github.muthuishere.dockercomposeplugin.services

import com.github.muthuishere.dockercomposeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
