package ningrum.rohma.jetpacknavigator


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
class InputFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        buttonsubmit.setOnClickListener{it:View!
            if(editTextnama.text.toString().isNotEmpty()){
                val input:String = editTextnama.text.toString()
                val bundle = Bundle()
                bundle.putString("args", input)
            }
            nav.navigate(R.id.action_inputFragment_to_hasilFragment,bundle)
        }
    }

}
