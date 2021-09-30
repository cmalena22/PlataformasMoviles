package com.example.formulario

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.*
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.formulario.databinding.FragmentDatosAcademicosBinding


/**
 * A simple [Fragment] subclass.
 * Use the [datosAcademicosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class datosAcademicosFragment : Fragment() {
    private lateinit var binding: FragmentDatosAcademicosBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_datos_academicos,container,false)


        Toast.makeText(context, "Academicos ", Toast.LENGTH_SHORT).show()
        binding.btnContinuarDA.setOnClickListener{view : View->

            /**
             *   var persona = Persona()
            val nombreEmpresa= binding.NomEmpre as EditText
            val telefono= binding.TelEmpre as EditText
            val periodo= binding.PerioLab as EditText
            val cargo= binding.PosOcu as EditText
            persona.nombreEm=nombreEmpresa.getText().toString()
            persona.telefono=telefono.getText().toString()
            persona.periodo=periodo.getText().toString()
            persona.cargo=cargo.getText().toString()
            binding.persona=persona
             *
             *
             * */
            val args: datosAcademicosFragmentArgs by navArgs()
            var persona = Persona()
            val escuela=binding.NomSecu as EditText
            val colegio=binding.NomCole as EditText
            val universidad=binding.NombreUni as EditText
            val fechaGrado=binding.Gradu as EditText
             val nombreP=args.persona.nombre
            val apellido=args.persona.apellido
            val cedula = args.persona.cedula
            val nombreEmp=args.persona.nombreEm
            val telefono=args.persona.telefono
            val cargo=args.persona.cargo



            persona.nombre=nombreP
            persona.apellido=apellido
            persona.cedula=cedula
            persona.nombreEm=nombreEmp
            persona.telefono=telefono
            persona.cargo=cargo

            persona.escuela=escuela.getText().toString()
            persona.colegio=colegio.getText().toString()
            persona.universidad=universidad.getText().toString()
            persona.fecha=fechaGrado.getText().toString()

            binding.persona=persona



            Toast.makeText(context, "Nombre jugador ${args.persona.nombre}",Toast.LENGTH_SHORT).show()
            Toast.makeText(context, "Apellido ${args.persona.apellido}",Toast.LENGTH_SHORT).show()
            Toast.makeText(context, "cedula ${args.persona.cedula}",Toast.LENGTH_SHORT).show()
            Toast.makeText(context, "Nombre emp ${args.persona.nombreEm}",Toast.LENGTH_SHORT).show()
            Toast.makeText(context, "telefono ${args.persona.telefono}",Toast.LENGTH_SHORT).show()
            Toast.makeText(context, "periodo ${args.persona.periodo}",Toast.LENGTH_SHORT).show()

          view.findNavController().navigate(datosAcademicosFragmentDirections.actionDatosAcademicosFragmentToFinalFragment(binding.persona!!))
        }





        return binding.root
    }
}