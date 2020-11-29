package com.example

import javafx.application.Application
import javafx.stage.Stage


class MyApplication : Application() {
    override fun start(primaryStage: Stage) {
        primaryStage.run {
            title = "Hello"
            width = 300.0
            height = 200.0
            show()
        }
    }
}