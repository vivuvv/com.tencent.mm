package com.tencent.mm.compatible.util;

import android.os.Build.VERSION;

public final class c
{
  public static boolean bU(int paramInt)
  {
    return Build.VERSION.SDK_INT >= paramInt;
  }
  
  public static boolean bV(int paramInt)
  {
    return Build.VERSION.SDK_INT < paramInt;
  }
  
  public static boolean bW(int paramInt)
  {
    return Build.VERSION.SDK_INT > paramInt;
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.compatible.util.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */