package com.example.nobar_taufan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mendeklarasikan btn_link dari widget
        val wa = findViewById<Button>(R.id.btn_link)
        //memberikan perintah ketika button btn_wa di klikk
        //dan berisikan function download
        wa.setOnClickListener {
            download()

            //mengiiskan data superhero sesuai yang kita inginkan
            //menggunakan perintah listof
            val superherolist = listOf<Superhero>(
                Superhero(
                    R.drawable.antman,
                    "Ant-Man",
                    "Dengan setelan kostum berkemampuan luar biasa untuk mengecilkan diri dalam skala ekstrim",
                    "@string/link_don"
                ),
                Superhero(
                    R.drawable.ironman,
                    "Iron-Man",
                    "Selama dikurung, Stark menciptakan sebuah generator listrik serta membuat baju besi",
                    "link"
                ),
                Superhero(
                    R.drawable.dokter,
                    "Doctor Strange",
                    "Dr. Stephen Strange mengunjungi seorang penyihir misterius bernama Ancient One di Tibet.",
                    "link"
                ),
                Superhero(
                    R.drawable.captain,
                    "Captain America",
                    "Steve Rogers memiliki kekuatan super berkat serum Super Soldier, dan juga memiliki tameng Vibranium",
                    "link"
                ),
                Superhero(
                    R.drawable.clint,
                    "Clint Barton",
                    "Clint bergabung dengan sirkus bernama Carson Carnival of Traveling Wonders. Di sinilah, mereka dilatih menjadi penembak jitu yang ahli",
                    ""
                ),
                Superhero(
                    R.drawable.hulk,
                    "Hulk",
                    "Doktor Bruce Banner tak sengaja terpapar radiasi gamma dan menjadi sesosok monster hijau rakasa yang siap mengamuk saat emosinya memuncak",
                    ""
                ),
                Superhero(
                    R.drawable.panter,
                    "Black Panther",
                    "Ketika Wakanda berada dalam ancaman musuh berbahaya Black Panther berusaha membuktikan diri sebagai raja sejati Wakanda.",
                    "link"
                ),
                Superhero(
                    R.drawable.spiderman,
                    "Spiderman",
                    "Peter Parker tak sengaja digigit laba-laba modifikasi genetika beracun mematikan. Namun, kekuatan luar biasa justru muncul dalam dirinya.",
                    "link"
                ),
                Superhero(
                    R.drawable.thor,
                    "Thor",
                    "Ketika Thor yang arogan mengacaukan gencatan senjata antara Asgardians dan Giants Frost, Odin sang raja Asgard membuangnya ke bumi. Kini, Thor harus membuktikan bahwa dirinya layak atas takdirnya.",
                    "link"
                ),
                Superhero(
                    R.drawable.widow,
                    "Black Widow",
                    "Natasha Romanoff alias Black Widow harus menghadapi sisi gelap hidupnya saat sebuah konspirasi berbahaya dikaitkan dengan masa lalunya.",
                    "link"
                ),
            )

            val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.setHasFixedSize(true)
            recyclerView.adapter = SuperheroAdapter(this, superherolist) {

            }


        }
        val actionbar = supportActionBar
                actionbar!!.title="Nobar"

    }

    fun download() {
        val intent = Intent(Intent.ACTION_VIEW)
        val url = "https://193.178.172.113/"

        intent.type = "text/plain"
        intent.setData(Uri.parse(url))

        startActivity(intent)
    }
}