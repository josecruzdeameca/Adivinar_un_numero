package jose.cruz.adivinarunnmero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_no_adivinaste.*
import kotlinx.android.synthetic.main.content_adivinaste.*
import kotlinx.android.synthetic.main.content_main.*

class No_adivinaste : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_adivinaste)

        Picasso.get().load(R.drawable.unhappy).into(iv_unhappy_face)



    }
}
