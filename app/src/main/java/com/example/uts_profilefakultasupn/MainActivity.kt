package com.example.uts_profilefakultasupn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFak()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = AdapterFakultas (data, { onItem: DataFakultas -> onItemClicked(onItem) })
    }

    private fun onItemClicked(onItem: DataFakultas) {
        val showDetailActivityIntent = Intent(this, DetailFakultas::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.gbrFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.namaFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.deskFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.namaJur)
        startActivity(showDetailActivityIntent)
    }

    private fun createFak(): List<DataFakultas> {
        val rvList = ArrayList<DataFakultas> ()
        rvList.add(
            DataFakultas(
                R.drawable.logo_upn,
                "FAKULTAS ILMU KOMPUTER",
                "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi :",
                "1. Prodi S1 Teknik Informatika\n" +
                         "2. Prodi S1 Sistem Informasi"
            )
        )

        rvList.add(
            DataFakultas(
                R.drawable.logo_upn,
                "FAKULTAS TEKNIK",
                "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi :",
                "1. Prodi S1 Teknik Kimia\n" +
                         "2. Prodi S1 Teknik Industri\n" +
                         "3. Prodi S1 Teknik Sipil\n" +
                         "4. Prodi S1 Teknik Lingkungan\n" +
                         "5. Prodi S1 Teknologi Pangan"
            )
        )

        rvList.add(
            DataFakultas(
                R.drawable.logo_upn,
                "FAKULTAS EKONOMI DAN BISNIS",
                "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi :",
                "1. Prodi S1 Ekonomi Pembangunan\n" +
                         "2. Prodi S1 Akuntansi\n" +
                         "3. Prodi S1 Manajemen"
            )
        )

        rvList.add(
            DataFakultas(
                R.drawable.logo_upn,
                "FAKULTAS PERTANIAN",
                "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN Veteran Jawa Timur yang terdiri dari program studi :",
                "1. Prodi S1 Agroteknologi\n" +
                         "2. Prodi S1 Agribisnis"
            )
        )

        rvList.add(
            DataFakultas(
                R.drawable.tiara,
                "MY PROFILE",
                "Name    : Tiara Karunia Miranti\n" +
                        "Birth      : Lamongan, 28 June 2000\n" +
                        "Address : Karangbinangun, Lamongan\n" +
                        "Phone    : +62 85785362045\n" +
                        "Email     : tiarakm28@gmail.com\n" +
                        "Github   : github.com/TiaraKaruniaM28\n \n" +
                        "History of Education : \n" +
                        "\t 1. TK Mekarsari 1 Sambopinggir \n" +
                        "\t 1. SDN 1 Sambopinggir \n" +
                        "\t 1. SMPN 1 Karangbinangun \n" +
                        "\t 1. MAN 1 Gresik \n",
                "Appreciation : \n" +
                        "\t 1. Juara 3 Tata Tenda Madrasah Creative Camp se-Wilker Surabaya \n \n" +
                        "\t 2. Harapan 2 Lomba Karya Cipta Alat Peraga Bidang IPS se-Kab.Gresik \n \n" +
                        "\t 3. Juara 3 Kesiapsiagaan Bencana BALARAM XXVII tingkat Malang Terbuka \n \n" +
                        "\t 4. Juara 3 Balaram Movie Contest BALARAM XXVII tingkat Malang Terbuka \n \n" +
                        "\t 5. Harapan 2 Sanitasi dan Kesehatan BALARAM XXVII tingkat Malang Terbuka \n \n" +
                        "\t 6. Juara 3 Pameran Mini (Wira) Laga Praja Airlangga X tingkat Nasional \n \n" +
                        "\t 7. Juara 3 Kompetisi Sains Madrasah Bidang Biologi Madrasah Aliyah se- Kab. Gresik \n \n" +
                        "\t 8. Juara 2 Lomba PBB Peringatan Hari Bela Negara \n \n" +
                        "\t 9. Juara 2 Futsal Putri Fasilkom Fest \n \n" +
                        "\t 10. Best Participants Sekolah Public Speaking \n \n" +
                        "\t 11. Juara 1 Lomba PBB Peringatan Hari Bela Negara \n \n" +
                        "\t 12. 50 Besar Duta Gemarikan 2020 \n \n" +
                        "\t 13. Pemenang Utama Ilmupedia Kampus Challenge"
            )
        )
        return rvList
    }
}