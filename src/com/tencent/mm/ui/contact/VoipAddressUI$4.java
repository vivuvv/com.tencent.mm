package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class VoipAddressUI$4
  implements DialogInterface.OnClickListener
{
  VoipAddressUI$4(VoipAddressUI paramVoipAddressUI) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    lmM.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.contact.VoipAddressUI.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */