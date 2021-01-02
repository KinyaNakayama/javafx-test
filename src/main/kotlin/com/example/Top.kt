package com.example

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox

class Top {

    companion object {
        fun getInstance(): Pair<AnchorPane, Top> {
            val loader = FXMLLoader(javaClass.getResource("/top.fxml"))
            return Pair(loader.load(), loader.getController())
        }
    }

    @FXML
    private lateinit var mainArea: VBox

    fun appendDetail(detail: Pane) {
        this.mainArea.children.add(detail);
    }

    /*
    fun handleDebugButtonClick(event: Event) {
        this.debugText.text = "do!\n"

        OkHttpClient().newCall(
            Request.Builder()
                .url("https://www.nri.com/jp")
                .get().build()
        ).execute().let {
            this.debugText.text += it.body?.string() ?: "no data"
        }

        val jpkiCryptAuth = JPKICryptAuthJNI()
        val hProv = jpkiCryptAuth.cryptAcquireContext(0);
        val hKey = jpkiCryptAuth.cryptGetUserKey(hProv)
        val bCert = jpkiCryptAuth.cryptGetCertificateValue(hKey);
        jpkiCryptAuth.cryptDestroyKey(hKey)
        jpkiCryptAuth.cryptReleaseContext(hProv);

        this.debugText.text = bCert.toString()
    }
     */
}