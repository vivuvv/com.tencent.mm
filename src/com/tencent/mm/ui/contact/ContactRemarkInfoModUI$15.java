package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.widget.MMEditText;

final class ContactRemarkInfoModUI$15
  implements View.OnClickListener
{
  ContactRemarkInfoModUI$15(ContactRemarkInfoModUI paramContactRemarkInfoModUI) {}
  
  public final void onClick(View paramView)
  {
    ContactRemarkInfoModUI.f(ljV);
    ContactRemarkInfoModUI.a(ljV, false, paramView.getId());
    ContactRemarkInfoModUI.h(ljV).performClick();
    ContactRemarkInfoModUI.h(ljV).requestFocus();
    ljV.apz();
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoModUI.15
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */