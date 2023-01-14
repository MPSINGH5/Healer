package com.example.healer.ui.on_boarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.example.healer.R
import com.example.healer.databinding.FragmentFrag1Binding


class Frag1 : Fragment() {


    var _binding: FragmentFrag1Binding?=null
    val binding get()=_binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentFrag1Binding.inflate(inflater,container,false)
       val view=binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButton.setOnClickListener{
            findNavController().navigate(Frag1Directions.actionFrag1ToFrag2())
        }



    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}