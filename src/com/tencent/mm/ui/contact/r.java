package com.tencent.mm.ui.contact;

import com.tencent.mm.model.i;
import java.util.HashSet;

public final class r
{
  public static final int llA = n(new int[] { 16, 1, 2, 4, 64, 4096 });
  public static final int llB = n(new int[] { lly, 64, 16384, 4096 });
  public static final int llC = n(new int[] { 16, 2, 16384, 4 });
  public static final int llD = n(new int[] { lly, 16384, 64, 4096 });
  public static final int llE = n(new int[] { lly, 16384, 64, 131072, 8192 });
  public static final int llF = n(new int[] { 16, 32, 1, 4, 2, 64 });
  public static final int llG = n(new int[] { llz, 131072 });
  public static final int lly = n(new int[] { 256, 16, 1, 2, 4 });
  public static final int llz = n(new int[] { 16, 1, 2, 4, 64, 16384 });
  
  public static boolean aW(int paramInt1, int paramInt2)
  {
    return (paramInt1 & paramInt2) > 0;
  }
  
  public static int bR(int paramInt1, int paramInt2)
  {
    return (paramInt2 ^ 0xFFFFFFFF) & paramInt1;
  }
  
  public static HashSet bhu()
  {
    HashSet localHashSet = new HashSet();
    localHashSet.add("weixin");
    return localHashSet;
  }
  
  public static HashSet bhv()
  {
    HashSet localHashSet = new HashSet();
    localHashSet.add("officialaccounts");
    localHashSet.add("newsapp");
    String[] arrayOfString = i.bAc;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      localHashSet.add(arrayOfString[i]);
      i += 1;
    }
    localHashSet.add("weibo");
    localHashSet.add("qqmail");
    localHashSet.add("fmessage");
    localHashSet.add("tmessage");
    localHashSet.add("qmessage");
    localHashSet.add("qqsync");
    localHashSet.add("floatbottle");
    localHashSet.add("lbsapp");
    localHashSet.add("shakeapp");
    localHashSet.add("medianote");
    localHashSet.add("qqfriend");
    localHashSet.add("readerapp");
    localHashSet.add("newsapp");
    localHashSet.add("blogapp");
    localHashSet.add("facebookapp");
    localHashSet.add("masssendapp");
    localHashSet.add("meishiapp");
    localHashSet.add("feedsapp");
    localHashSet.add("voipapp");
    localHashSet.add("filehelper");
    localHashSet.add("officialaccounts");
    localHashSet.add("helper_entry");
    localHashSet.add("pc_share");
    localHashSet.add("cardpackage");
    localHashSet.add("voicevoipapp");
    localHashSet.add("voiceinputapp");
    localHashSet.add("linkedinplugin");
    return localHashSet;
  }
  
  public static void h(HashSet paramHashSet)
  {
    paramHashSet.remove("filehelper");
  }
  
  public static int n(int... paramVarArgs)
  {
    int i = 0;
    int k = paramVarArgs.length;
    int j = 0;
    while (i < k)
    {
      j |= paramVarArgs[i];
      i += 1;
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.contact.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */