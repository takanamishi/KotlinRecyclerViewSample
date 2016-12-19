package test.recyclerviewsample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import butterknife.bindView

class MainActivity : AppCompatActivity() {
    private val recyclerView: RecyclerView by bindView(R.id.recycler_view)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ItemListAdapter(items = listOf("Apple", "Pineapple", "Pen")) { itemName ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("itemName", itemName)
            this.startActivity(intent)
        }
        this.recyclerView.adapter = adapter
    }
}
