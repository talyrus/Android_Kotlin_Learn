package study.talyrus.myrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(car: Car) {
        val branTextview: TextView = itemView.findViewById(R.id.brand_text_view)
        val colorTextview: TextView = itemView.findViewById(R.id.color_text_view)
        val speedTextview: TextView = itemView.findViewById(R.id.speed_text_view)
        branTextview.text = car.brand
        colorTextview.text = car.color
        val speedFormatted = "${car.maxSpeed} km/h"
        speedTextview.text = speedFormatted
    }
}