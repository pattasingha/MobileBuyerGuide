package com.example.mobilebuyerguide.view.fragment


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.mobilebuyerguide.R
import com.example.mobilebuyerguide.presentation.contract.MobileListContract
import com.example.mobilebuyerguide.presentation.display.MobileItemDisplay
import com.example.mobilebuyerguide.presentation.presenter.MobileListPresenter
import com.example.mobilebuyerguide.view.adapter.MobileListAdapter
import javax.inject.Inject

class MobileListFragment : BaseFragment(), MobileListContract.MobileListView {

    @Inject
    lateinit var mobileListPresenter: MobileListPresenter

    private lateinit var mobileListDisplay: ArrayList<MobileItemDisplay>
    private lateinit var adapter: MobileListAdapter
    private lateinit var recyclerMobileList: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mobile_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerMobileList = view.findViewById(R.id.rv_mobile_list)
        mobileListPresenter.setView(this)
        mobileListPresenter.getMobileList()
        setAdapter()
    }

    override fun showMobileList(mobileList: List<MobileItemDisplay>) {
        this.mobileListDisplay = mobileList as ArrayList<MobileItemDisplay>
        this.adapter.setData(mobileList)
        Log.d("FRAGMENT", mobileList.toString())
    }

    private fun setAdapter() {
        this.adapter = MobileListAdapter()
        recyclerMobileList.let {
            it.layoutManager = LinearLayoutManager(context)
            it.adapter = adapter
        }
    }
}
