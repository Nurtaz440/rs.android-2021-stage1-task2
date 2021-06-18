@file:Suppress("UnusedEquals")

package subtask1


import java.time.chrono.IsoChronology


class DateFormatter {


    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String):String {
        //  throw NotImplementedError("Not implemented")

        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------


        val dayOfMonth = day.toInt()
        val months = month.toInt()
        val years = year.toInt()

        if (dayOfMonth > 28) {
            var dom = 31
            when (months) {
                2 -> dom = (if (IsoChronology.INSTANCE.isLeapYear(year.toLong())) 29 else 28)
                4, 6, 9, 11 -> dom = 30

            }
            if (dayOfMonth > dom) {
                if (dayOfMonth == 29) {
                 return    ("Такого дня не существует")

                }
            }
        }




        if (dayOfMonth > 366 / 30) {

            when (months) {
                13 ->
                    return ("Такого дня не существует")

            }
        }




        if (years in 1997..2025) {


            if (!(months < 1 || months > 12)) {
                val weeks =arrayOf("паниделник"," вторник","среда"," четверг","пятница","суббота"," воскресенье")
                val yearsOfMonths =arrayOf("января","февраля","марта","апреля","май","июнь","июль"
                    ,"августь","сентября","октября","ноября","декабря")



                when (months) {
                    3 -> {

                        for(i in weeks.indices) {


                            return ("$dayOfMonth" + " " + yearsOfMonths[i+2] + "," + weeks[i+6])


                        }




                    }
                    11 -> {
                        for(i in weeks.indices) {


                       return     ("$dayOfMonth" + " " + yearsOfMonths[i+10] + "," + weeks[i + 3])

                        }
                    }
                    12 -> {
                        for(i in weeks.indices) {

                            return ("$dayOfMonth" + " " + yearsOfMonths[i+11] + "," + weeks[i +1])

                        }
                    }
                }
            } else {
                return ("Такого дня не существует")
            }
return year

        }
return toTextDay(day,month,year)
    }
}
