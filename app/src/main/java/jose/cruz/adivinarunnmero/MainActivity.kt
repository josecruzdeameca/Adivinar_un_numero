package jose.cruz.adivinarunnmero

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlin.random.Random

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val random_number = List(1){ Random.nextInt(1, 5) }
        val num_generado = random_number.get(0)
        //val num_generado = 1
        mensajito(num_generado.toString())


        b_probar.setOnClickListener(){

            val numero = et_numero.text.toString()

            if (numero.equals("")){
                mensajito("Ingresa un número")
            } else {
                if (num_generado.equals(numero.toInt())){
                    val intento = Intent(this, Adivinaste::class.java)
                    startActivity(intento)
                } else {
                    val int_no_adivinaste = Intent(this, No_adivinaste::class.java)
                    startActivity(int_no_adivinaste)

                }

            }

        }




        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }


    fun mensajito(mensaje: String, duracion: Int= Toast.LENGTH_SHORT) {



        val mi_mensajito = Toast.makeText(this, mensaje, duracion)
        mi_mensajito.setGravity(Gravity.TOP,0,0)
        mi_mensajito.show()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
