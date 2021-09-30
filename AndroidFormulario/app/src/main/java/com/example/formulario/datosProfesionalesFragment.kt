package com.example.formulario

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.formulario.databinding.FragmentDatosProfesionalesBinding
import com.example.formulario.databinding.FragmentExperienciaLaboralBinding


/**
 * A simple [Fragment] subclass.
 * Use the [datosProfesionalesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class datosProfesionalesFragment : Fragment() {
    private lateinit var binding: FragmentDatosProfesionalesBinding
    // TODO: Rename and change types of parameters
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_datos_profesionales,container,false)

        Toast.makeText(context, "Profesionales ", Toast.LENGTH_SHORT).show()

        binding.btnContinuarDP.setOnClickListener{view : View->
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
 * */  val args: datosProfesionalesFragmentArgs by navArgs()
            var persona = Persona()

           val  nombre:EditText =binding.Nom as EditText;
            //val nombre:String=binding.Nom!!.text.toString()
            val apellido:EditText =binding.Apelli as EditText;
            val cedula:EditText =binding.cedula as EditText;
            val nombreEmpresa =args.persona.nombreEm
            val telefono=args.persona.telefono
            val periodo=args.persona.periodo
            val cargo=args.persona.cargo
            //datos del otro lado

            persona.nombre= nombre.getText().toString()
            persona.apellido=apellido.getText().toString()
            persona.cedula=cedula.getText().toString()
            persona.nombreEm=nombreEmpresa
            persona.telefono=telefono
            persona.periodo=periodo
            persona.cargo=cargo


            binding.persona=persona


            Toast.makeText(context, "Nombre emp ${args.persona.nombreEm}",Toast.LENGTH_SHORT).show()
            Toast.makeText(context, "telefono ${args.persona.telefono}",Toast.LENGTH_SHORT).show()
            Toast.makeText(context, "periodo ${args.persona.periodo}",Toast.LENGTH_SHORT).show()

            view.findNavController().navigate(datosProfesionalesFragmentDirections.actionDatosProfesionalesFragment2ToDatosAcademicosFragment(binding.persona!!))
        }



        return binding.root

    }
}