package com.example.formulario

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.formulario.databinding.FragmentInicioBinding


/**
 * A simple [Fragment] subclass.
 * Use the [inicioFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class inicioFragment : Fragment() {
    private lateinit var binding:FragmentInicioBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_inicio,container,false)


        binding.btnContinuar.setOnClickListener{view:View->
            view.findNavController().navigate(inicioFragmentDirections.actionInicioFragmentToHojaVidaFragment())

            }
        setHasOptionsMenu(true)
        return binding.root
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu_inicio,menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return NavigationUI.onNavDestinationSelected(item!!,requireView().findNavController()) ||super.onOptionsItemSelected(item)
    }
}



