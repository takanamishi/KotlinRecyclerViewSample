package test.recyclerviewsample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.bindView

class ItemListAdapter(val items: List<String>, val itemClick: (String) -> Unit) :
        RecyclerView.Adapter<ItemListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view = view, itemClick = itemClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setUp(items[position])
    }

    override fun getItemCount(): Int {
        return this.items.count()
    }

    class ViewHolder(view: View, val itemClick: (String) -> Unit) : RecyclerView.ViewHolder(view) {
        private val textView: TextView by bindView(R.id.item_text_view)

        fun setUp(itemName: String) {
            this.textView.text = itemName
            this.itemView.setOnClickListener { itemClick(itemName) }
        }
    }
}
