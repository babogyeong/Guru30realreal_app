package com.example.guru30realreal_app.contentsList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.guru30realreal_app.R

class ContentsRVAdapter(val items : ArrayList<ContentsModel>) :
    RecyclerView.Adapter<ContentsRVAdapter.Viewholder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContentsRVAdapter.Viewholder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.content_rv_item, parent, false)
        return Viewholder(v)
    }

    override fun onBindViewHolder(holder: ContentsRVAdapter.Viewholder, position: Int) {
        holder.bindItems(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class Viewholder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(item : ContentsModel) {

            val contentTitle = itemView.findViewById<TextView>(R.id.textArea)
            contentTitle.text = item.title

        }
    }

}