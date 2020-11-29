package com.example

import javafx.application.Application
import javafx.event.EventHandler
import javafx.geometry.Orientation
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.TilePane
import javafx.scene.text.Text
import javafx.stage.Stage


class MyApplication : Application() {
    override fun start(primaryStage: Stage) {

        val firstScene = Scene(
            TilePane().apply {
                orientation = Orientation.VERTICAL
                style = "-fx-background-color: #b2dfdb;"
                alignment = Pos.CENTER
                children.add(
                    Text().apply {
                        text = "Hello, world!"
                    }
                )
                children.add(
                    Button().apply {
                        text = "button"
                        onAction = EventHandler {
                            this.text = "test"
                        }
                    }
                )
            }
        )

        primaryStage.run {
            title = "Hello"
            width = 300.0
            height = 200.0
            scene = firstScene
        }

        primaryStage.show();
    }
}