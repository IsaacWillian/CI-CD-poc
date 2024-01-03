package com.isaaclabs.pomodorotimer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.isaaclabs.pomodorotimer.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private val binding:FragmentHomeBinding
        get() = _binding!!
    private var _binding: FragmentHomeBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    companion object {
        fun newInstance() = HomeFragment()
    }
}