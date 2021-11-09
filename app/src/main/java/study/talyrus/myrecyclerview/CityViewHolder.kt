package study.talyrus.myrecyclerview

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) { // наследование от ViewHolder RecyclerView
    fun bind(city: City) {
        val nameTextview: TextView = itemView.findViewById(R.id.name_text_view)
        val populationTextview: TextView = itemView.findViewById(R.id.population_text_view)
        val kolTextview: TextView = itemView.findViewById(R.id.kol_text_view)
        nameTextview.text = city.name
        populationTextview.text = city.population
        val kolFormatted = "${city.kol} человек"
        kolTextview.text = kolFormatted

        itemView.setOnClickListener{
            Toast.makeText(itemView.context, city.name + ". " + city.population +": " + "${city.kol} человек", Toast.LENGTH_LONG).show()
        }
    }
}