package fr.android.androidexercises

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import kotlinx.android.synthetic.main.activity_library.*

/**
 * Created by Manon on 19/12/2017.
 */
class LAK : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)
        setSupportActionBar(toolbar)
        messageTextView.text = "Hello World !"
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.inflater
    }
}