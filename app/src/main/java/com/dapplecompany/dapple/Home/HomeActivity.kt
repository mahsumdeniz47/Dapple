package com.dapplecompany.dapple.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dapplecompany.dapple.R
import com.dapplecompany.dapple.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    private val ACTIVITY_NO=0
    private val TAG="HomeActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        //setupNavigatitonView()

    }
    fun setupNavigatitonView(){
        BottomNavigationViewHelper().setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper().setupNavigation(this,bottomNavigationView)
        var menu=bottomNavigationView.menu
        var menuItem=menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)
    }


}