package com.xiaochen.listscroll.adapter;

import android.content.Context;

import com.xiaochen.listscroll.itemView.AbsItemLayout;
import com.xiaochen.listscroll.itemView.Type1Layout;
import com.xiaochen.listscroll.itemView.Type2Layout;

/**
 * Created by tanfujun on 10/13/16.
 */

public class ViewFactory {
    public static final int TOTAL_COUNT = 7;

    public static final int TYPE_1 = 1;
    public static final int TYPE_2 = 2;
    public static final int TYPE_3 = 3;
    public static final int TYPE_4 = 4;
    public static final int TYPE_5 = 5;
    public static final int TYPE_6 = 6;
    public static final int TYPE_7 = 7;

    public static AbsItemLayout createView(Context context, int type) {
        switch (type) {
            case TYPE_1:
                Type1Layout type1Layout = new Type1Layout();
                return type1Layout;
            case TYPE_2:
                Type2Layout type2Layout = new Type2Layout();
                return type2Layout;
            case TYPE_3:
                Type1Layout type3Layout = new Type1Layout();
                return type3Layout;
            case TYPE_4:
                Type1Layout type4Layout = new Type1Layout();
                return type4Layout;
            case TYPE_5:
                Type1Layout type5Layout = new Type1Layout();
                return type5Layout;
            case TYPE_6:
                Type1Layout type6Layout = new Type1Layout();
                return type6Layout;
            case TYPE_7:
                Type1Layout type7Layout = new Type1Layout();
                return type7Layout;
            default:
                return null;
        }
    }
}
