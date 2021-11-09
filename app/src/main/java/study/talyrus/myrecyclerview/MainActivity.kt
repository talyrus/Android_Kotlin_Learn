package study.talyrus.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userNameList: List<String> =
            listOf("Maxim", "Ivan", "Olga", "Serg", "Venya", "Elena", "Andrey")

        val carList: List<Car> = listOf(
            Car("Audi", "Blue", 300),
            Car("Mercedes", "Black", 350),
            Car("Ferrari", "Red", 400),
            Car("Ford Mustang", "Yellow", 450),
        )

        val userRecyclerView: RecyclerView = findViewById(R.id.users_recycler_view)
        userRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )

        userRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        // userRecyclerView.adapter = UserAdapter(userNameList)
        userRecyclerView.adapter = CarAdapter(carList)
    }
}