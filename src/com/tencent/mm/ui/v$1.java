package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;

final class v$1
  implements View.OnApplyWindowInsetsListener
{
  v$1(View paramView1, View paramView2) {}
  
  public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    paramView = (ViewGroup.MarginLayoutParams)kry.getLayoutParams();
    v.n(leftMargin, topMargin, rightMargin, bottomMargin);
    krz.setPadding(krz.getPaddingLeft(), krz.getPaddingTop(), rightMargin, bottomMargin);
    return kry.onApplyWindowInsets(paramWindowInsets);
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.v.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */