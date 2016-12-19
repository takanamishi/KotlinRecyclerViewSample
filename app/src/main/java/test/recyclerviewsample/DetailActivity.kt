package test.recyclerviewsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import butterknife.bindView

class DetailActivity : AppCompatActivity() {
    private val textView: TextView by bindView(R.id.text_view)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        this.title = "DetailActivity"
        this.textView.text = intent.getStringExtra("itemName")
    }
}
