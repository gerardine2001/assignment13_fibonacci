package com.example.fibonacciactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvNumbers=findViewById<RecyclerView>(R.id.rvNumbers)
        rvNumbers.layoutManager=LinearLayoutManager(baseContext)
        var numberAdapter=Numbers_fibo((fibonacci(100)))
        rvNumbers.adapter=numberAdapter
    }
}

fun fibonacci(numbers:Int):List<BigInteger>{
    var nums= MutableList<BigInteger>(numbers,{BigInteger.ZERO })
    var number1=BigInteger.ZERO
    var number2=BigInteger.ONE
    nums[0]=number1
    nums[1]=number2
    for(a in 1..numbers){
        var sum=number1+number2
        number1=number2
        number2=sum
        nums[a-1]=number1
    }
    return nums
}


