package com.rackluxury.ferrari.reddit.font;

import com.rackluxury.ferrari.R;

public enum FontStyle {
    Small(R.style.FontStyle_Small, "Small"),
    Normal(R.style.FontStyle_Normal, "Normal"),
    Large(R.style.FontStyle_Large, "Large"),
    XLarge(R.style.FontStyle_XLarge, "XLarge");

    private final int resId;
    private final String title;

    FontStyle(int resId, String title) {
        this.resId = resId;
        this.title = title;
    }

    public int getResId() {
        return resId;
    }

    public String getTitle() {
        return title;
    }
}