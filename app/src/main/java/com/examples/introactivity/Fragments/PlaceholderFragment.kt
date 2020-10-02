package com.examples.introactivity.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.examples.introactivity.R

class PlaceholderFragment: Fragment(){
    private lateinit var pageViewModel: PageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel::class.java).apply {
            val int = arguments?.getInt(ARG_SECTION_NUMBER)!!
            setIndex(int)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_first, container, false)
        val image:ImageButton = root.findViewById(R.id.imageButton)
        val heading: TextView = root.findViewById(R.id.headerTextView)
        val message: TextView = root.findViewById(R.id.messageTextView)
        val button : Button = root.findViewById(R.id.button2)

        pageViewModel.heading.observe(this, Observer<String> {
            heading.text = it
        })
        pageViewModel.message.observe(this, Observer<String> {
            message.text = it
        })
        pageViewModel.image.observe(this, Observer<Int> {
            image.setImageResource(it)
        })
        button.setOnClickListener {
            Toast.makeText(activity, "Button", Toast.LENGTH_SHORT).show()

            val intent2 = Intent(activity, LaunchActivity::class.java)
            startActivity(intent2)

            activity?.finish()
        }
        return root
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}