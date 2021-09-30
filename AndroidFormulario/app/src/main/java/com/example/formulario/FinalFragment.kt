package com.example.formulario

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.formulario.databinding.FragmentFinalBinding


/**
 * A simple [Fragment] subclass.
 * Use the [FinalFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FinalFragment : Fragment() {
    private lateinit var binding: FragmentFinalBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_final,container,false)

        val args: FinalFragmentArgs by navArgs()

        binding.nombreE.text =args.persona.nombreEm
        binding.apellido.text=args.persona.apellido
        binding.cedula.text=args.persona.cedula
        binding.cargo.text=args.persona.cargo

        binding.empresa.text=args.persona.nombreEm
        binding.escuela.text=args.persona.escuela
        binding.colegio.text=args.persona.colegio








        return binding.root
    }

    }



