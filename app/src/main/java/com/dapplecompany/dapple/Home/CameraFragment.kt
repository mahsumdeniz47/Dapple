package com.dapplecompany.dapple.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dapplecompany.dapple.R

class CameraFragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        var view=inflater?.inflate(R.layout.fragment_camera,container,false)
        return view
    }
}