package com.ztiany.loadmore.adapter;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public interface AdapterInterface {

    int getLastVisibleItemPosition(RecyclerView recyclerView);

    /**
     * @param itemView load more  itemView
     * @param rv       RecyclerView
     */
    void setItemFullSpan(View itemView, RecyclerView rv);

}
