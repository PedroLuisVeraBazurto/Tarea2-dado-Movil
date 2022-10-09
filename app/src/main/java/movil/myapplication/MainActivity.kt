package movil.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var btn_jugar: Button? = null
    var Imprime: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Imprime= findViewById<EditText>(R.id.textView)
        btn_jugar = findViewById<Button>(R.id.Jugar)
    }
    //Funcion Onclick del boton
    fun Jugar(view: View) {
        val myFirstGenerar = Generar(6)

        Imprime?.setText(myFirstGenerar.roll().toString())
        val textViewValue = Imprime?.text

        //convert to String and set it as text inside the textview
    }

}


//Clase para Generar el numero aleatorio
class Generar (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
