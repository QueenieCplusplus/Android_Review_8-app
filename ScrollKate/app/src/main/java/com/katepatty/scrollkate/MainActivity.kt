package com.katepatty.scrollkate

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Color.blue
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // 不用宣告變數型別，直接建立和呼叫即可。
    var bd = Bundle()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_g.setOnClickListener{ green() }
        btn_b.setOnClickListener{ blue() }
        btn_v.setOnClickListener{ vanish() }

        // 傳遞參數
        btn_r.setOnClickListener{ leave() }

    }

    private fun green(): View.OnClickListener? {

        tv!!.visibility = View.VISIBLE
        tv!!.setBackgroundColor(Color.GREEN)
        tv!!.setTextColor(Color.BLACK)
        return null
    }

    private fun blue(): View.OnClickListener? {

        tv!!.visibility = View.VISIBLE
        tv!!.setBackgroundColor(Color.BLUE)
        tv!!.setTextColor(Color.WHITE)
        return null
    }

    private fun vanish(): View.OnClickListener? {

        tv.visibility = View.GONE
        leave()
        return null
    }

    private fun leave(){

        bd.putString("key"," Mr. Android leaves you a message, " +
                "he likes to date with you on Sat evening! Dear Kate & Patty, " +
                "shall we have a cup of coffee at Starbucks?\n" +
                "---------------------------------\n" +
                "When some people talk about money\n" +
                "They speak as if it were a mysterious lover\n" +
                "Who went out to buy milk and never\n" +
                "Came back, and it makes me nostalgic\n" +
                "For the years I lived on coffee and bread,\n" +
                "Hungry all the time, walking to work on payday\n" +
                "Like a woman journeying for water\n" +
                "From a village without a well, then living\n" +
                "One or two nights like everyone else\n" +
                "On roast chicken and red wine.\n" +
                "-Tracy K. Smith\n" +
                "---------------------------------\n" +
                "April. And the air dry\n" +
                "As the shoulders of a water buffalo.\n" +
                "\n" +
                "Grasshoppers scratch at the dirt,\n" +
                "rub their wings with thin legs\n" +
                "flaring out in front of the soldiers\n" +
                "in low arcing flights, wings a blur.\n" +
                "\n" +
                "The soldiers don’t notice anymore,\n" +
                "seeing only the wreckage of the streets,\n" +
                "bodies draped with sheets, and the sun,\n" +
                "how bright it is, how hard and flat and white.\n" +
                "\n" +
                "It will take many nails from the coffinmakers\n" +
                "to shut out this light, which reflects off everything:\n" +
                "the calloused feet of the dead, their bony hands, \n" +
                "their pale foreheads so cold, brilliant in the sun.\n" +
                "—Brian Turner")
        val intent = Intent(applicationContext,MainActivity2::class.java).apply {
            putExtra("infokey", bd)
        }
        startActivity(intent)
    }


}