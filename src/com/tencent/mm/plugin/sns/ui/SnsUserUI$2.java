package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class SnsUserUI$2
  implements DialogInterface.OnClickListener
{
  SnsUserUI$2(SnsUserUI paramSnsUserUI) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    hme.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */