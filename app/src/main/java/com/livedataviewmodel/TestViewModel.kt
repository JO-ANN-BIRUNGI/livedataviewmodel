package com.livedataviewmodel

import androidx.lifecycle.ViewModel

class TestViewModel : ViewModel () {
    private var homeCounter = 0
    private var awayCounter = 0
    //home functions
    fun getCurrentCount(): Int{
        return homeCounter
    }
    fun getUpdateCount():Int{
        return ++homeCounter
    }
    fun getReducedCount():Int{
        return --homeCounter
    }

    fun getReset():Int{
        return homeCounter
    }
    //away functions
    fun getCurrentAwayCount(): Int{
        return awayCounter
    }
    fun getUpdateAwayCount():Int{
        return ++awayCounter
    }
    fun getReducedAwayCount():Int{
        return --awayCounter
    }
//reset
    fun resetScore():Int{
        awayCounter = 0
        homeCounter = 0
    return awayCounter
    return  homeCounter
    }
}