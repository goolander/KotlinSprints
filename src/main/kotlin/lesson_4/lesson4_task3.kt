package org.example.lesson_4

const val SUN_WEATHER: Boolean = true
const val OPEN_TENT: Boolean = true
const val HUMIDITY_AIR_PERCENT: Int = 20
const val SEASON: String = "не зима"
fun main(){
    var todaySunWeather: Boolean = true
    var nowOpenTent: Boolean = true
    var nowHumidityAir = 20
    var nowSeason: String = "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? " +
    "${(SUN_WEATHER == todaySunWeather) && (OPEN_TENT == nowOpenTent)
            && (HUMIDITY_AIR_PERCENT == nowHumidityAir) && (SEASON == nowSeason)}")
}
