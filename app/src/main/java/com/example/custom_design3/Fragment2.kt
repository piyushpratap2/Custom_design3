package com.example.custom_design3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.custom_design3.databinding.Fragment2Binding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class Fragment2 : Fragment() {
    private lateinit var binding: Fragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment2Binding.inflate(layoutInflater,container,false)
        binding.btn2.setOnClickListener {
            val dialog = BottomSheetDialog(requireContext())
            dialog.setContentView(R.layout.dialog_layout)
            dialog.show()
        }
        return binding.root
    }

}