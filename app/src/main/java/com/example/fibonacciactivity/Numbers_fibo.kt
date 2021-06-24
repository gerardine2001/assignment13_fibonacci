package com.example.fibonacciactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class Numbers_fibo(var numbersList:List<BigInteger>):RecyclerView.Adapter<NumberRecyclerView>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):NumberRecyclerView {
        var num=LayoutInflater.from(parent.context)
            .inflate(R.layout.number_list_items,parent,false)
        return NumberRecyclerView(num)

    }

    override fun onBindViewHolder(holder:NumberRecyclerView, position: Int) {
        holder.tvNumber.text=numbersList.get(position).toString()

    }

    override fun getItemCount(): Int {
        return numbersList.size

    }
}
class NumberRecyclerView(num:View):RecyclerView.ViewHolder(num){
    var tvNumber=num.findViewById<TextView>(R.id.tvNumber)

}


