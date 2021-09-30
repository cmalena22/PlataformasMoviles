package com.example.examen_cinthiaiza

import android.os.Bundle
import android.view.*
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.examen_cinthiaiza.databinding.FragmentLoginBinding
import kotlinx.android.synthetic.main.fragment_login.*


/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    private lateinit var binding:FragmentLoginBinding
    // TODO: Rename and change types of parameters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)

        binding.iniciaSesion.setOnClickListener{view:View->
           var usuario=binding.Usuario as EditText
            var contra =  binding.Contra as EditText
        val usu= usuario.getText().toString()
            var cont=contra.getText().toString()
            view.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToInicioFragment3(usu,cont))

        }

        binding.Registrar.setOnClickListener{view:View->
            view.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToRegistroFragment())

        }
        setHasOptionsMenu(true)
        return binding.root
        // Inflate the layout for this fragment
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.inicio_menu,menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return NavigationUI.onNavDestinationSelected(item!!,requireView().findNavController()) ||super.onOptionsItemSelected(item)
    }

    }



