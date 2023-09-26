package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count=0
    private var altervalue=0

    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }


    fun buttonaction(view: View) {
        var currentbtn=view as Button


        if(currentbtn.text=="")
        {
            count++
            if (altervalue == 0)
            {
                currentbtn.text = "X"
                altervalue = 1
            }
            else if (altervalue == 1)
            {
                currentbtn.text = "O"
                altervalue = 0
            }
            val bt1=binding.b1.text.toString()
            val bt2=binding.b2.text.toString()
            val bt3=binding.b3.text.toString()
          val bt4=binding.b4.text.toString()
            val bt5=binding.b5.text.toString()
            val bt6=binding.b6.text.toString()
            val bt7=binding.b7.text.toString()
            val bt8=binding.b8.text.toString()
            val bt9=binding.b9.text.toString()


            if(count>=5)
            {
                if(bt1==bt2 && bt2==bt3 && bt1==bt3)
                {
                    binding.resultview.text="$bt1"
                    clear()

                }
                else if(bt4==bt5 && bt5==bt6 && bt4==bt6)
                {
                    binding.resultview.text="$bt4"
                    clear()

                }
                else if(bt7==bt8 && bt8==bt9 && bt7==bt9)
                {
                    binding.resultview.text="$bt7"
                    clear()

                }
                else if(bt1==bt4 && bt4==bt7 && bt1==bt7)
                {
                    binding.resultview.text="$bt1"
                    clear()

                }
                else if(bt2==bt5 && bt5==bt8 && bt2==bt8)
                {
                    binding.resultview.text="$bt2"
                    clear()

                }
                else if(bt3==bt6 && bt6==bt9 && bt3==bt9)
                {
                    binding.resultview.text="$bt3"
                    clear()

                }
                else if(bt1==bt5 && bt5==bt9 && bt1==bt9)
                {
                    binding.resultview.text="$bt1"
                    clear()

                }
                else if(count>=9){
                    binding.resultview.text="Match Draw"
                    clear()

                }


            }





        }

    }
    fun clear()
    {
        binding.b1.text=""
        binding.b2.text=""
        binding.b3.text=""
        binding.b4.text=""
        binding.b5.text=""
        binding.b6.text=""
        binding.b7.text=""
        binding.b8.text=""
        binding.b9.text=""
        altervalue=0
        count=0


    }
}