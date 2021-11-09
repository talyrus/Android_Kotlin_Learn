package study.talyrus.myrecyclerview

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) { // наследование от ViewHolder RecyclerView
    fun bind(userName: String) {
        val userNameTextView: TextView = itemView.findViewById(R.id.users_name_text_view)
        userNameTextView.text = userName

        itemView.setOnClickListener{
            Toast.makeText(itemView.context, userName, Toast.LENGTH_LONG).show()
        }
    }
}