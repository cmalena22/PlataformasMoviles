package com.example.formulario

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.formulario.databinding.FragmentExperienciaLaboralBinding


/**
 * A simple [Fragment] subclass.
 * Use the [experienciaLaboralFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class experienciaLaboralFragment : Fragment() {
    private lateinit var binding:FragmentExperienciaLaboralBinding
    // TODO: Rename and change types of parameters
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_experiencia_laboral,container,false)




        Toast.makeText(context, "En experiencia laboral", Toast.LENGTH_SHORT).show()

        binding.btnContinuarEx.setOnClickListener{view : View->
            var persona = Persona()
            val nombreEmpresa= binding.NomEmpre as EditText
            val telefono= binding.TelEmpre as EditText
            val periodo= binding.PerioLab as EditText
            val cargo= binding.PosOcu as EditText
            persona.nombreEm=nombreEmpresa.getText().toString()
            persona.telefono=telefono.getText().toString()
            persona.periodo=periodo.getText().toString()
            persona.cargo=cargo.getText().toString()
            binding.persona=persona
            view.findNavController().navigate(experienciaLaboralFragmentDirections.actionExperienciaLaboralFragmentToDatosProfesionalesFragment2(binding.persona!!))
        }
        return binding.root

    }
}