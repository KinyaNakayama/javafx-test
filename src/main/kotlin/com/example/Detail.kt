package com.example

import javafx.fxml.FXMLLoader
import javafx.scene.layout.AnchorPane

class Detail {
    companion object {
        fun getInstance(): Pair<AnchorPane, Detail> {
            val loader = FXMLLoader(javaClass.getResource("/detail.fxml"))
            return Pair(loader.load(), loader.getController())
        }
    }
}