package com.example.formulario

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.formulario.databinding.FragmentHojaVidaBinding
import com.example.formulario.databinding.FragmentInicioBinding


class hojaVidaFragment : Fragment() {
    private lateinit var binding: FragmentHojaVidaBinding
    // TODO: Rename and change types of parameters

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                  savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            binding=DataBindingUtil.inflate(inflater,R.layout.fragment_hoja_vida,container,false)

            Toast.makeText(context, "En hoja de vida", Toast.LENGTH_SHORT).show()

            binding.btnContinuarH.setOnClickListener{view : View->
                view.findNavController().navigate(hojaVidaFragmentDirections.actionHojaVidaFragmentToExperienciaLaboralFragment())
            }
            return binding.root
    }
}