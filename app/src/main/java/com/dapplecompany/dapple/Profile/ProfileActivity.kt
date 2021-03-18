package com.dapplecompany.dapple.Profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dapplecompany.dapple.R
import com.dapplecompany.dapple.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*

class ProfileActivity : AppCompatActivity() {
    private val ACTIVITY_NO=4
    private val TAG="ProfileActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setupNavigatitonView()

    }
    fun setupNavigatitonView() {
        BottomNavigationViewHelper().setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper().setupNavigation(this, bottomNavigationView)
        var menu = bottomNavigationView.menu
        var menuItem = menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)
    }

}