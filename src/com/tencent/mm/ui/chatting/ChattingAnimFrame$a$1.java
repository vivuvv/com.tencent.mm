package com.tencent.mm.ui.chatting;

import android.view.View;
import java.util.List;

final class ChattingAnimFrame$a$1
  implements Runnable
{
  ChattingAnimFrame$a$1(ChattingAnimFrame.a parama) {}
  
  public final void run()
  {
    if (kSd.targetView != null)
    {
      kSd.targetView.clearAnimation();
      ChattingAnimFrame localChattingAnimFrame = kSd.kSc;
      View localView = kSd.targetView;
      gqm.remove(localView);
      localChattingAnimFrame.removeView(localView);
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingAnimFrame.a.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */