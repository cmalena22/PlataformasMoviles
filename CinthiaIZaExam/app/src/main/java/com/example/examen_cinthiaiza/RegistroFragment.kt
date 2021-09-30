package com.example.examen_cinthiaiza

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.examen_cinthiaiza.databinding.FragmentRegistroBinding


/**
 * A simple [Fragment] subclass.
 * Use the [RegistroFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegistroFragment : Fragment() {
    private lateinit var binding: FragmentRegistroBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_registro, container, false)


        binding.Guardar.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(RegistroFragmentDirections.actionRegistroFragmentToLoginFragment())

        }
        return binding.root

    }
}



