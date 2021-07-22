package github.openpump.Assetsscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import github.openpump.R


/**
 * Shows a Assets form to showcase UI state persistence. It has a button that goes to []
 */
class AssetsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_assets, container, false)

        //Навигация дальше
//        view.findViewById<Button>(R.id.signup_btn).setOnClickListener {
//            findNavController().navigate(R.id.action_register_to_registered)
//        }
        return view
    }
}