package com.example.secretsanta.ui.rules

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.secretsanta.R

class RulesFragment : Fragment() {

    private lateinit var rulesViewModel: RulesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rulesViewModel =
            ViewModelProviders.of(this).get(RulesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        rulesViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}