package com.example.databasetest;

import android.view.View;
import android.widget.ImageView;

class ViewHolder {
    ImageView icon = null;

    ViewHolder(View base) {
        this.icon = (ImageView) base.findViewById(R.id.icon);
    }



}
