package com.example.profiles


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_profiles.view.*

/**
 * A simple [Fragment] subclass.
 */
class profiles : Fragment(), View.OnClickListener {

    //2
    companion object {

        fun newInstance(): profiles {
            return profiles()
        }
    }

    //3
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view: View = inflater!!.inflate(R.layout.fragment_profiles, container, false)
        view.b1.setOnClickListener(this)
        view.b2.setOnClickListener(this)
        view.b3.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View?) {
        val activity = requireActivity() as MainActivity
        when(v!!.id){
            R.id.b1 ->{
                Log.d("JOHN", "pressed!")
                activity.replaceFragment(profileDetails())
            }
            R.id.b2 ->{
                activity.replaceFragment(profileDetails())
            }
            R.id.b3 ->{
                activity.replaceFragment(profileDetails())
            }
        }
    }
}
