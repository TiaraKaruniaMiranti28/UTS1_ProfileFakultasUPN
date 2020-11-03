package com.example.uts_profilefakultasupn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_fakultas.*

class DetailFakultas : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_fakultas)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {

            var gbrF = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var namaF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var namaJ = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)

            detail_gambar.setImageResource(gbrF)
            detail_nama.text = namaF
            detail_deskripsi.text = deskF
            detail_namajurusan.text = namaJ
        }
    }
}