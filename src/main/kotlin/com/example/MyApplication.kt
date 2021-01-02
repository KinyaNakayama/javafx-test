package com.example


import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage


class MyApplication : Application() {
    override fun start(primaryStage: Stage) {

        val topPane = Top.getInstance()
        val test = listOf("aaaa", "bbbbb", "cccc").map {
            Detail.getInstance();
        }

        test.forEach {
            topPane.second.appendDetail(it.first)
        }

        primaryStage.apply {
            title = "Hello"
            scene = Scene(topPane.first)
            minHeight = 1024.0
            minWidth = 1280.0
        }.show()
    }
}