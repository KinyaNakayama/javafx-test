package com.example

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Stage


class MyApplication : Application() {
    override fun start(primaryStage: Stage) {

        val firstScene = Scene(
            FXMLLoader.load<Pane>(
                javaClass.getResource("/top.fxml")
            )
        )

        primaryStage.run {
            title = "Hello"
            scene = firstScene
        }

        primaryStage.show()
    }
}