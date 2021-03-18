package com.dapplecompany.dapple.utils

import android.content.Context
import android.content.Intent
import android.view.MenuItem
import com.dapplecompany.dapple.Home.HomeActivity
import com.dapplecompany.dapple.Profile.ProfileActivity
import com.dapplecompany.dapple.R
import com.dapplecompany.dapple.Search.SearchActivity
import com.dapplecompany.dapple.Share.ShareActivity
import com.dapplecompany.dapple.Star.StarActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

class BottomNavigationViewHelper {
    fun setupBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx){
        bottomNavigationViewEx.enableAnimation(false)
        //bottomNavigationViewEx.enableItemShiftingMode(false)
        //bottomNavigationViewEx.enableShiftingMode(false)
        bottomNavigationViewEx.setTextVisibility(false)
    }
    fun setupNavigation(context: Context, bottomNavigationViewEx: BottomNavigationViewEx){
        bottomNavigationViewEx.onNavigationItemSelectedListener= object : BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {
                    R.id.ic_home -> {
                        val intent = Intent(context, HomeActivity::class.java)
                        context.startActivity(intent)
                        return true
                    }
                    R.id.ic_search -> {
                        val intent = Intent(context, SearchActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        context.startActivity(intent)
                    }
                    R.id.ic_share -> {
                        val intent = Intent(context, ShareActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        context.startActivity(intent)
                        return true
                    }
                    R.id.ic_star -> {
                        val intent = Intent(context, StarActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        context.startActivity(intent)
                        return true
                    }
                    R.id.ic_profile -> {
                        val intent = Intent(context, ProfileActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                        context.startActivity(intent)
                        return true
                    }

                }
                return false
            }

        }
    }

}