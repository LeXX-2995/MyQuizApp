package uz.flux.myquizapp

import java.util.*

object Constants {
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Azerbaijan",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Armenia",
            "Azerbaijan",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Brazil",
            "Bermuda",
            "Kazakhstan",
            2
        )
        questionList.add(que3)


        val que4 = Question(
            4,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Germany",
            "Sweden",
            "Poland",
            1
        )
        questionList.add(que4)


        val que5 = Question(
            5,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Bermuda",
            "Venezuela",
            "Fiji",
            "Bahrein",
            3
        )
        questionList.add(que5)


        val que6 = Question(
            6,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Netherlands",
            "Austria",
            "Germany",
            "Russia",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Argentina",
            "Iran",
            "Iraq",
            "India",
            4
        )
        questionList.add(que7)


        val que8 = Question(
            8,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Iran",
            "Kuwait",
            "Iraq",
            "Azerbaijan",
            2
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Netherlands",
            "Germany",
            "Belgium",
            "Poland",
            3
        )
        questionList.add(que9)
        return questionList
    }
}