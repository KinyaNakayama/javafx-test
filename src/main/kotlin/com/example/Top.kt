package com.example

import javafx.event.Event
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TextArea
import jp.go.jpki.appli.JPKICryptAuthJNI
import okhttp3.OkHttpClient
import okhttp3.Request

class Top {
    @FXML
    private lateinit var debugText: TextArea

    @FXML
    private lateinit var debugButton: Button

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
}