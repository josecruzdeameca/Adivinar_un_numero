package jose.cruz.adivinarunnmero

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.activity_adivinaste.*
import kotlinx.android.synthetic.main.content_adivinaste.*

class Adivinaste : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adivinaste)
        setSupportActionBar(toolbar)

        Picasso.get().load(R.drawable.happy).into(iv_happy_face)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }





    }

}
