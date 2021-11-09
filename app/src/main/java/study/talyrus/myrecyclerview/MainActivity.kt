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

        val cityList: List<City> = listOf(
            City("Москва", "Численность", 12000000),
            City("Краснодар", "Численность", 1500000),
            City("Санкт Петербург", "Численность", 9000000),
            City("Кронштадт", "Численность", 25000),
            City("Табмов", "Численность", 850000),
            City("Красноярск", "Численность", 4800000),
            City("Сочи", "Численность", 605000),
            City("Калининград", "Численность", 987000)
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
        //userRecyclerView.adapter = CarAdapter(carList)
        userRecyclerView.adapter = CityAdapter(cityList)
    }
}