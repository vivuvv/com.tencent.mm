package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class SettingSnsBackgroundUI$6
  implements DialogInterface.OnClickListener
{
  SettingSnsBackgroundUI$6(SettingSnsBackgroundUI paramSettingSnsBackgroundUI) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    haX.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */