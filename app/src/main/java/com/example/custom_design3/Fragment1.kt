package com.example.custom_design3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.custom_design3.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private lateinit var binding: Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment1Binding.inflate(layoutInflater,container,false)
        binding.btn1.setOnClickListener {
            val fm = activity?.supportFragmentManager?.beginTransaction()
            if (fm != null) {
                fm.setCustomAnimations(R.anim.fade_in,R.anim.fade_out,R.anim.slide_in,R.anim.slide_out)
                fm.replace(R.id.container,Fragment2())
                fm.addToBackStack(null)
                fm.commit()
            }
        }
        return binding.root
    }

}