package cl.desafiolatam.ciclobike2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.SetupCiclovias
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val setupCiclovias = SetupCiclovias().init()
       // val myAdapter = CycloAdapter(setupCiclovias)
       // cyclo_recicler.adapter = CycloAdapter(SetupCiclovias().init())
      //  cyclo_recicler.adapter = myAdapter

        val listOf = listOf( "Las Condes",
            "La Reina",
            "Ñuñoa",
            "Macul",
            "Providencia")




    }





    fun SinFiltro (view : View){

        cyclo_recicler.adapter = CycloAdapter(SetupCiclovias().init())
    }

}