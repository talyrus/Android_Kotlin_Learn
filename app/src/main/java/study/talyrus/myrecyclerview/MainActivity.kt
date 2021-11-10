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

        val bannerList: List<Banner> = listOf(
            Banner(R.drawable.banner_image, "Hello"),
            Banner(R.drawable.banner_image, "Bye"),
            Banner(R.drawable.banner_image, "Hello1"),
            Banner(R.drawable.banner_image, "Bye1"),
            Banner(R.drawable.banner_image, "Hello2"),
            Banner(R.drawable.banner_image, "Bye2"),
            Banner(R.drawable.banner_image, "Hello3"),
            Banner(R.drawable.banner_image, "Bye3")

        )

        val peopleList: List<People.Human> = listOf(
            People.Man("Ivan", 22, "+79618517820"),
            People.Woman("Anna", 21, "anna@mail.ru"),
            People.Man("Egor", 52, "+79184411248"),
            People.Woman("Nata", 41, "nata@mail.ru")

        )

        val userRecyclerView: RecyclerView = findViewById(R.id.users_recycler_view)
        userRecyclerView.layoutManager =
        LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //Для баннера декоратор не нужен
        userRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )

        )



                //для баннера поставим горизонтально
              //LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // userRecyclerView.adapter = UserAdapter(userNameList)
        //userRecyclerView.adapter = CarAdapter(carList)

        // Домашнее задание СРС-8 - реализовать список городов
        //userRecyclerView.adapter = CityAdapter(cityList)

        // лекция от 07.11.2021 - использование карточек Material Design
        //userRecyclerView.adapter = CarAdapter(carList)

        //userRecyclerView.adapter = BannerAdapter(bannerList)

        userRecyclerView.adapter = PeopleAdapter(peopleList)
    }
}

// adapter натягивает View на RecyclerView
//ViewHolder натягивает данные на View