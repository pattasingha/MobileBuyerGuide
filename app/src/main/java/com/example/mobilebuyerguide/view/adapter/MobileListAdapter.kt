package com.example.mobilebuyerguide.view.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mobilebuyerguide.R
import com.example.mobilebuyerguide.presentation.display.MobileItemDisplay
import kotlinx.android.synthetic.main.item_mobile_list.view.*

class MobileListAdapter : RecyclerView.Adapter<MobileHolder>() {

    private var mobileList = arrayListOf<MobileItemDisplay>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobileHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_mobile_list, parent, false)
        return MobileHolder(view)
    }

    override fun getItemCount(): Int {
        return mobileList.size
    }

    override fun onBindViewHolder(holder: MobileHolder, position: Int) {
        val item = mobileList[position]
        holder.bind(item)
    }

    fun setData(mobileList: ArrayList<MobileItemDisplay>) {
        resetMobiles()
        this.mobileList.addAll(mobileList)
        this.notifyDataSetChanged()
    }

    private fun resetMobiles() {
        this.mobileList.clear()
        this.notifyDataSetChanged()
    }
}

class MobileHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    @SuppressLint("SetTextI18n")
    fun bind(mobile: MobileItemDisplay) {
        itemView.item_name.text = mobile.name
        itemView.item_description.text = mobile.description
        itemView.item_price.text = "$${mobile.price}"
        itemView.item_rating.text = mobile.rating.toString()

        Glide.with(itemView.context)
            .load(mobile.image)
            .centerCrop()
            .into(itemView.item_thumbImage)
    }
}
