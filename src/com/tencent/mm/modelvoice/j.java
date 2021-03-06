package com.tencent.mm.modelvoice;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.u;
import com.tencent.qqpinyin.voicerecoapi.TRSpeexNative;
import java.io.FileInputStream;

public final class j
  implements d
{
  String anC = "";
  com.tencent.mm.compatible.util.a apl;
  String cgY = "";
  String cgZ = "";
  MediaPlayer.OnCompletionListener chg = new MediaPlayer.OnCompletionListener()
  {
    public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
    {
      if (apl != null) {
        apl.oV();
      }
      try
      {
        status = 0;
        if (chk != null)
        {
          chk.stop();
          chk.release();
          chk = null;
        }
        try
        {
          j.a(j.this);
          return;
        }
        catch (InterruptedException paramAnonymousMediaPlayer)
        {
          u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "exception:%s", new Object[] { ay.b(paramAnonymousMediaPlayer) });
          return;
        }
        return;
      }
      catch (Exception paramAnonymousMediaPlayer)
      {
        u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "exception:%s", new Object[] { ay.b(paramAnonymousMediaPlayer) });
        u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "setCompletion File[" + anC + "] ErrMsg[" + paramAnonymousMediaPlayer.getStackTrace() + "]");
      }
    }
  };
  MediaPlayer.OnErrorListener chh = new MediaPlayer.OnErrorListener()
  {
    public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      u.d("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "onError");
      if (apl != null) {
        apl.oV();
      }
      if (chm != null) {
        chm.onError();
      }
      try
      {
        status = -1;
        if (chk != null)
        {
          chk.stop();
          chk.release();
          chk = null;
        }
        try
        {
          j.a(j.this);
          return false;
        }
        catch (InterruptedException paramAnonymousMediaPlayer)
        {
          u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "exception:%s", new Object[] { ay.b(paramAnonymousMediaPlayer) });
          return false;
        }
        return false;
      }
      catch (Exception paramAnonymousMediaPlayer)
      {
        u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "setErrorListener File[" + anC + "] ErrMsg[" + paramAnonymousMediaPlayer.getStackTrace() + "]");
      }
    }
  };
  AudioTrack chk;
  d.a chl = null;
  d.b chm = null;
  private int chn = 2;
  private int cho = 16000;
  private int chp = 1;
  private int chq = 20;
  private Runnable chr;
  com.tencent.qqpinyin.voicerecoapi.a chs = null;
  private int cht;
  int chu = 0;
  boolean chv = false;
  byte[] chw = new byte[com.tencent.qqpinyin.voicerecoapi.a.lQK];
  int chx = 0;
  FileInputStream chy = null;
  int chz = 314;
  int status = 0;
  
  public j()
  {
    com.tencent.qqpinyin.voicerecoapi.a locala = chs;
    if (lQO != 0) {
      i = -103;
    }
    for (;;)
    {
      if (i != 0) {
        u.e("speex", "res: " + i);
      }
      return;
      int j = lQP.nativeTRSpeexDecodeInit();
      if ((j == -1) || (j == -100) || (j == -101) || (j == -102))
      {
        i = j;
      }
      else
      {
        lQO = j;
        lQM = new byte[com.tencent.qqpinyin.voicerecoapi.a.lQK * 15];
      }
    }
  }
  
  public j(Context paramContext)
  {
    this();
    apl = new com.tencent.mm.compatible.util.a(paramContext);
  }
  
  private void be(boolean paramBoolean)
  {
    int j = 3;
    if (!com.tencent.mm.a.e.ax(anC)) {
      return;
    }
    int i;
    if (paramBoolean) {
      i = 3;
    }
    label289:
    for (;;)
    {
      try
      {
        if (!bsLbpH) {
          break label289;
        }
        p.bsL.dump();
        if (bsLbpO != 1) {
          break label289;
        }
        i = j;
        cht = AudioTrack.getMinBufferSize(cho, chn, 2);
        if (chk != null)
        {
          chk.stop();
          chk.release();
          chk = null;
        }
        chk = new AudioTrack(i, cho, chn, 2, cht * 8, 1);
        chz = (cho / 1000 * chp * chq * 2);
        if ((paramBoolean) && (apl != null)) {
          apl.requestFocus();
        }
        AudioTrack localAudioTrack = chk;
        if (localAudioTrack == null) {
          break;
        }
        i = 0;
      }
      catch (Exception localException1)
      {
        try
        {
          chk.play();
          chr = new Runnable()
          {
            /* Error */
            public final void run()
            {
              // Byte code:
              //   0: bipush -16
              //   2: invokestatic 29	android/os/Process:setThreadPriority	(I)V
              //   5: aload_0
              //   6: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   9: new 31	java/io/FileInputStream
              //   12: dup
              //   13: aload_0
              //   14: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   17: getfield 35	com/tencent/mm/modelvoice/j:anC	Ljava/lang/String;
              //   20: invokespecial 38	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
              //   23: putfield 42	com/tencent/mm/modelvoice/j:chy	Ljava/io/FileInputStream;
              //   26: aload_0
              //   27: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   30: getfield 46	com/tencent/mm/modelvoice/j:status	I
              //   33: iconst_1
              //   34: if_icmpeq +14 -> 48
              //   37: aload_0
              //   38: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   41: getfield 46	com/tencent/mm/modelvoice/j:status	I
              //   44: iconst_2
              //   45: if_icmpne +709 -> 754
              //   48: aload_0
              //   49: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   52: aload_0
              //   53: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   56: getfield 42	com/tencent/mm/modelvoice/j:chy	Ljava/io/FileInputStream;
              //   59: aload_0
              //   60: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   63: getfield 50	com/tencent/mm/modelvoice/j:chw	[B
              //   66: invokevirtual 54	java/io/FileInputStream:read	([B)I
              //   69: putfield 57	com/tencent/mm/modelvoice/j:chx	I
              //   72: aload_0
              //   73: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   76: getfield 57	com/tencent/mm/modelvoice/j:chx	I
              //   79: iconst_m1
              //   80: if_icmpeq +552 -> 632
              //   83: aload_0
              //   84: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   87: getfield 61	com/tencent/mm/modelvoice/j:chs	Lcom/tencent/qqpinyin/voicerecoapi/a;
              //   90: astore 4
              //   92: aload_0
              //   93: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   96: getfield 50	com/tencent/mm/modelvoice/j:chw	[B
              //   99: astore_3
              //   100: aload_0
              //   101: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   104: getfield 57	com/tencent/mm/modelvoice/j:chx	I
              //   107: istore_1
              //   108: aload 4
              //   110: getfield 66	com/tencent/qqpinyin/voicerecoapi/a:lQO	I
              //   113: ifne +194 -> 307
              //   116: new 68	com/tencent/qqpinyin/voicerecoapi/b
              //   119: dup
              //   120: bipush -102
              //   122: invokespecial 70	com/tencent/qqpinyin/voicerecoapi/b:<init>	(I)V
              //   125: athrow
              //   126: astore_3
              //   127: ldc 72
              //   129: ldc 74
              //   131: iconst_1
              //   132: anewarray 4	java/lang/Object
              //   135: dup
              //   136: iconst_0
              //   137: aload_3
              //   138: invokestatic 80	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
              //   141: aastore
              //   142: invokestatic 86	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   145: aload_0
              //   146: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   149: getfield 90	com/tencent/mm/modelvoice/j:chh	Landroid/media/MediaPlayer$OnErrorListener;
              //   152: ifnull +19 -> 171
              //   155: aload_0
              //   156: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   159: getfield 90	com/tencent/mm/modelvoice/j:chh	Landroid/media/MediaPlayer$OnErrorListener;
              //   162: aconst_null
              //   163: iconst_0
              //   164: iconst_0
              //   165: invokeinterface 96 4 0
              //   170: pop
              //   171: aload_0
              //   172: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   175: iconst_0
              //   176: putfield 46	com/tencent/mm/modelvoice/j:status	I
              //   179: aload_0
              //   180: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   183: getfield 42	com/tencent/mm/modelvoice/j:chy	Ljava/io/FileInputStream;
              //   186: ifnull +21 -> 207
              //   189: aload_0
              //   190: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   193: getfield 42	com/tencent/mm/modelvoice/j:chy	Ljava/io/FileInputStream;
              //   196: invokevirtual 99	java/io/FileInputStream:close	()V
              //   199: aload_0
              //   200: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   203: aconst_null
              //   204: putfield 42	com/tencent/mm/modelvoice/j:chy	Ljava/io/FileInputStream;
              //   207: aload_0
              //   208: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   211: getfield 61	com/tencent/mm/modelvoice/j:chs	Lcom/tencent/qqpinyin/voicerecoapi/a;
              //   214: astore_3
              //   215: aload_3
              //   216: getfield 66	com/tencent/qqpinyin/voicerecoapi/a:lQO	I
              //   219: ifne +577 -> 796
              //   222: bipush -102
              //   224: istore_1
              //   225: aload_0
              //   226: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   229: getfield 46	com/tencent/mm/modelvoice/j:status	I
              //   232: iconst_3
              //   233: if_icmpeq +48 -> 281
              //   236: aload_0
              //   237: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   240: getfield 103	com/tencent/mm/modelvoice/j:chl	Lcom/tencent/mm/modelvoice/d$a;
              //   243: ifnull +15 -> 258
              //   246: aload_0
              //   247: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   250: getfield 103	com/tencent/mm/modelvoice/j:chl	Lcom/tencent/mm/modelvoice/d$a;
              //   253: invokeinterface 108 1 0
              //   258: aload_0
              //   259: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   262: getfield 112	com/tencent/mm/modelvoice/j:chg	Landroid/media/MediaPlayer$OnCompletionListener;
              //   265: ifnull +16 -> 281
              //   268: aload_0
              //   269: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   272: getfield 112	com/tencent/mm/modelvoice/j:chg	Landroid/media/MediaPlayer$OnCompletionListener;
              //   275: aconst_null
              //   276: invokeinterface 118 2 0
              //   281: iload_1
              //   282: ifeq +24 -> 306
              //   285: ldc 72
              //   287: new 120	java/lang/StringBuilder
              //   290: dup
              //   291: ldc 122
              //   293: invokespecial 123	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
              //   296: iload_1
              //   297: invokevirtual 127	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
              //   300: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
              //   303: invokestatic 134	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;)V
              //   306: return
              //   307: aload_3
              //   308: ifnull +8 -> 316
              //   311: aload_3
              //   312: arraylength
              //   313: ifne +13 -> 326
              //   316: new 68	com/tencent/qqpinyin/voicerecoapi/b
              //   319: dup
              //   320: bipush -104
              //   322: invokespecial 70	com/tencent/qqpinyin/voicerecoapi/b:<init>	(I)V
              //   325: athrow
              //   326: aload 4
              //   328: getfield 138	com/tencent/qqpinyin/voicerecoapi/a:lQP	Lcom/tencent/qqpinyin/voicerecoapi/TRSpeexNative;
              //   331: aload 4
              //   333: getfield 66	com/tencent/qqpinyin/voicerecoapi/a:lQO	I
              //   336: aload_3
              //   337: iconst_0
              //   338: iload_1
              //   339: aload 4
              //   341: getfield 141	com/tencent/qqpinyin/voicerecoapi/a:lQM	[B
              //   344: invokevirtual 147	com/tencent/qqpinyin/voicerecoapi/TRSpeexNative:nativeTRSpeexDecode	(I[BII[B)I
              //   347: istore_1
              //   348: iload_1
              //   349: ifge +472 -> 821
              //   352: new 68	com/tencent/qqpinyin/voicerecoapi/b
              //   355: dup
              //   356: iload_1
              //   357: invokespecial 70	com/tencent/qqpinyin/voicerecoapi/b:<init>	(I)V
              //   360: athrow
              //   361: aload_0
              //   362: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   365: iconst_0
              //   366: putfield 46	com/tencent/mm/modelvoice/j:status	I
              //   369: goto -343 -> 26
              //   372: iload_1
              //   373: newarray <illegal type>
              //   375: astore_3
              //   376: aload 4
              //   378: getfield 141	com/tencent/qqpinyin/voicerecoapi/a:lQM	[B
              //   381: iconst_0
              //   382: aload_3
              //   383: iconst_0
              //   384: iload_1
              //   385: invokestatic 153	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
              //   388: goto +439 -> 827
              //   391: aload_3
              //   392: arraylength
              //   393: istore_1
              //   394: iconst_0
              //   395: istore_2
              //   396: iload_1
              //   397: aload_0
              //   398: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   401: getfield 156	com/tencent/mm/modelvoice/j:chz	I
              //   404: if_icmplt +96 -> 500
              //   407: aload_0
              //   408: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   411: getfield 46	com/tencent/mm/modelvoice/j:status	I
              //   414: iconst_1
              //   415: if_icmpne +85 -> 500
              //   418: aload_0
              //   419: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   422: getfield 160	com/tencent/mm/modelvoice/j:chv	Z
              //   425: ifeq +12 -> 437
              //   428: ldc2_w 161
              //   431: invokestatic 168	java/lang/Thread:sleep	(J)V
              //   434: goto -38 -> 396
              //   437: aload_0
              //   438: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   441: getfield 172	com/tencent/mm/modelvoice/j:chk	Landroid/media/AudioTrack;
              //   444: ifnull -48 -> 396
              //   447: aload_0
              //   448: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   451: getfield 160	com/tencent/mm/modelvoice/j:chv	Z
              //   454: ifne -58 -> 396
              //   457: aload_0
              //   458: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   461: getfield 172	com/tencent/mm/modelvoice/j:chk	Landroid/media/AudioTrack;
              //   464: aload_3
              //   465: iload_2
              //   466: aload_0
              //   467: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   470: getfield 156	com/tencent/mm/modelvoice/j:chz	I
              //   473: invokevirtual 178	android/media/AudioTrack:write	([BII)I
              //   476: pop
              //   477: iload_2
              //   478: aload_0
              //   479: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   482: getfield 156	com/tencent/mm/modelvoice/j:chz	I
              //   485: iadd
              //   486: istore_2
              //   487: iload_1
              //   488: aload_0
              //   489: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   492: getfield 156	com/tencent/mm/modelvoice/j:chz	I
              //   495: isub
              //   496: istore_1
              //   497: goto -101 -> 396
              //   500: iload_1
              //   501: aload_0
              //   502: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   505: getfield 156	com/tencent/mm/modelvoice/j:chz	I
              //   508: if_icmpge +31 -> 539
              //   511: iload_1
              //   512: ifle +27 -> 539
              //   515: aload_0
              //   516: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   519: getfield 172	com/tencent/mm/modelvoice/j:chk	Landroid/media/AudioTrack;
              //   522: ifnull +17 -> 539
              //   525: aload_0
              //   526: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   529: getfield 172	com/tencent/mm/modelvoice/j:chk	Landroid/media/AudioTrack;
              //   532: aload_3
              //   533: iload_2
              //   534: iload_1
              //   535: invokevirtual 178	android/media/AudioTrack:write	([BII)I
              //   538: pop
              //   539: aload_0
              //   540: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   543: getfield 46	com/tencent/mm/modelvoice/j:status	I
              //   546: iconst_2
              //   547: if_icmpne +151 -> 698
              //   550: aload_0
              //   551: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   554: getfield 181	com/tencent/mm/modelvoice/j:cgZ	Ljava/lang/String;
              //   557: astore_3
              //   558: aload_3
              //   559: monitorenter
              //   560: ldc 72
              //   562: ldc -73
              //   564: invokestatic 186	com/tencent/mm/sdk/platformtools/u:v	(Ljava/lang/String;Ljava/lang/String;)V
              //   567: aload_0
              //   568: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   571: getfield 181	com/tencent/mm/modelvoice/j:cgZ	Ljava/lang/String;
              //   574: invokevirtual 189	java/lang/Object:notify	()V
              //   577: ldc 72
              //   579: ldc -65
              //   581: invokestatic 186	com/tencent/mm/sdk/platformtools/u:v	(Ljava/lang/String;Ljava/lang/String;)V
              //   584: aload_3
              //   585: monitorexit
              //   586: aload_0
              //   587: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   590: getfield 194	com/tencent/mm/modelvoice/j:cgY	Ljava/lang/String;
              //   593: astore_3
              //   594: aload_3
              //   595: monitorenter
              //   596: ldc 72
              //   598: ldc -60
              //   600: invokestatic 186	com/tencent/mm/sdk/platformtools/u:v	(Ljava/lang/String;Ljava/lang/String;)V
              //   603: aload_0
              //   604: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   607: getfield 194	com/tencent/mm/modelvoice/j:cgY	Ljava/lang/String;
              //   610: invokevirtual 199	java/lang/Object:wait	()V
              //   613: ldc 72
              //   615: ldc -55
              //   617: invokestatic 186	com/tencent/mm/sdk/platformtools/u:v	(Ljava/lang/String;Ljava/lang/String;)V
              //   620: aload_3
              //   621: monitorexit
              //   622: goto -596 -> 26
              //   625: astore 4
              //   627: aload_3
              //   628: monitorexit
              //   629: aload 4
              //   631: athrow
              //   632: aload_0
              //   633: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   636: iconst_0
              //   637: putfield 46	com/tencent/mm/modelvoice/j:status	I
              //   640: goto -101 -> 539
              //   643: astore 4
              //   645: ldc 72
              //   647: ldc 74
              //   649: iconst_1
              //   650: anewarray 4	java/lang/Object
              //   653: dup
              //   654: iconst_0
              //   655: aload 4
              //   657: invokestatic 80	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
              //   660: aastore
              //   661: invokestatic 86	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   664: goto -80 -> 584
              //   667: astore 4
              //   669: aload_3
              //   670: monitorexit
              //   671: aload 4
              //   673: athrow
              //   674: astore 4
              //   676: ldc 72
              //   678: ldc 74
              //   680: iconst_1
              //   681: anewarray 4	java/lang/Object
              //   684: dup
              //   685: iconst_0
              //   686: aload 4
              //   688: invokestatic 80	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
              //   691: aastore
              //   692: invokestatic 86	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   695: goto -75 -> 620
              //   698: aload_0
              //   699: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   702: getfield 181	com/tencent/mm/modelvoice/j:cgZ	Ljava/lang/String;
              //   705: astore_3
              //   706: aload_3
              //   707: monitorenter
              //   708: aload_0
              //   709: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   712: getfield 181	com/tencent/mm/modelvoice/j:cgZ	Ljava/lang/String;
              //   715: invokevirtual 189	java/lang/Object:notify	()V
              //   718: aload_3
              //   719: monitorexit
              //   720: goto -694 -> 26
              //   723: astore 4
              //   725: aload_3
              //   726: monitorexit
              //   727: aload 4
              //   729: athrow
              //   730: astore 4
              //   732: ldc 72
              //   734: ldc 74
              //   736: iconst_1
              //   737: anewarray 4	java/lang/Object
              //   740: dup
              //   741: iconst_0
              //   742: aload 4
              //   744: invokestatic 80	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
              //   747: aastore
              //   748: invokestatic 86	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   751: goto -33 -> 718
              //   754: aload_0
              //   755: getfield 14	com/tencent/mm/modelvoice/j$3:chA	Lcom/tencent/mm/modelvoice/j;
              //   758: getfield 46	com/tencent/mm/modelvoice/j:status	I
              //   761: iconst_3
              //   762: if_icmpeq -583 -> 179
              //   765: ldc2_w 202
              //   768: invokestatic 168	java/lang/Thread:sleep	(J)V
              //   771: goto -592 -> 179
              //   774: astore_3
              //   775: ldc 72
              //   777: ldc 74
              //   779: iconst_1
              //   780: anewarray 4	java/lang/Object
              //   783: dup
              //   784: iconst_0
              //   785: aload_3
              //   786: invokestatic 80	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
              //   789: aastore
              //   790: invokestatic 86	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   793: goto -594 -> 199
              //   796: aload_3
              //   797: aconst_null
              //   798: putfield 141	com/tencent/qqpinyin/voicerecoapi/a:lQM	[B
              //   801: aload_3
              //   802: getfield 138	com/tencent/qqpinyin/voicerecoapi/a:lQP	Lcom/tencent/qqpinyin/voicerecoapi/TRSpeexNative;
              //   805: aload_3
              //   806: getfield 66	com/tencent/qqpinyin/voicerecoapi/a:lQO	I
              //   809: invokevirtual 207	com/tencent/qqpinyin/voicerecoapi/TRSpeexNative:nativeTRSpeexDecodeRelease	(I)I
              //   812: istore_1
              //   813: aload_3
              //   814: iconst_0
              //   815: putfield 66	com/tencent/qqpinyin/voicerecoapi/a:lQO	I
              //   818: goto -593 -> 225
              //   821: iload_1
              //   822: ifne -450 -> 372
              //   825: aconst_null
              //   826: astore_3
              //   827: aload_3
              //   828: ifnull -467 -> 361
              //   831: iload_1
              //   832: ifne -441 -> 391
              //   835: goto -474 -> 361
              // Local variable table:
              //   start	length	slot	name	signature
              //   0	838	0	this	3
              //   107	725	1	i	int
              //   395	139	2	j	int
              //   99	1	3	arrayOfByte	byte[]
              //   126	12	3	localException1	Exception
              //   774	40	3	localIOException	java.io.IOException
              //   826	2	3	localObject2	Object
              //   90	287	4	locala	com.tencent.qqpinyin.voicerecoapi.a
              //   625	5	4	localObject3	Object
              //   643	13	4	localException2	Exception
              //   667	5	4	localObject4	Object
              //   674	13	4	localException3	Exception
              //   723	5	4	localObject5	Object
              //   730	13	4	localException4	Exception
              // Exception table:
              //   from	to	target	type
              //   0	26	126	java/lang/Exception
              //   26	48	126	java/lang/Exception
              //   48	126	126	java/lang/Exception
              //   311	316	126	java/lang/Exception
              //   316	326	126	java/lang/Exception
              //   326	348	126	java/lang/Exception
              //   352	361	126	java/lang/Exception
              //   361	369	126	java/lang/Exception
              //   372	388	126	java/lang/Exception
              //   391	394	126	java/lang/Exception
              //   396	434	126	java/lang/Exception
              //   437	497	126	java/lang/Exception
              //   500	511	126	java/lang/Exception
              //   515	539	126	java/lang/Exception
              //   539	560	126	java/lang/Exception
              //   586	596	126	java/lang/Exception
              //   629	632	126	java/lang/Exception
              //   632	640	126	java/lang/Exception
              //   671	674	126	java/lang/Exception
              //   698	708	126	java/lang/Exception
              //   727	730	126	java/lang/Exception
              //   754	771	126	java/lang/Exception
              //   596	620	625	finally
              //   620	622	625	finally
              //   627	629	625	finally
              //   676	695	625	finally
              //   560	584	643	java/lang/Exception
              //   560	584	667	finally
              //   584	586	667	finally
              //   645	664	667	finally
              //   669	671	667	finally
              //   596	620	674	java/lang/Exception
              //   708	718	723	finally
              //   718	720	723	finally
              //   725	727	723	finally
              //   732	751	723	finally
              //   708	718	730	java/lang/Exception
              //   189	199	774	java/io/IOException
            }
          };
          com.tencent.mm.sdk.i.e.a(chr, "SpeexPlayer_play");
          return;
        }
        catch (Exception localException2)
        {
          u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "audioTrack error:%s", new Object[] { localException2.getMessage() });
          return;
        }
        localException1 = localException1;
        if (apl != null) {
          apl.oV();
        }
        u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "playImp : fail, exception = " + localException1.getMessage());
        u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "exception:%s", new Object[] { ay.b(localException1) });
        return;
      }
    }
  }
  
  private boolean t(String paramString, boolean paramBoolean)
  {
    if (status != 0)
    {
      u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "startPlay error status:" + status);
      return false;
    }
    status = 1;
    anC = paramString;
    try
    {
      be(paramBoolean);
      return true;
    }
    catch (Exception paramString)
    {
      try
      {
        be(true);
      }
      catch (Exception localException)
      {
        u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "startPlay File[" + anC + "] failed");
        u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "exception:%s", new Object[] { ay.b(paramString) });
        status = -1;
      }
    }
    return false;
  }
  
  public final void a(d.a parama)
  {
    chl = parama;
  }
  
  public final void a(d.b paramb)
  {
    chm = paramb;
  }
  
  public final void ak(boolean paramBoolean)
  {
    int j = 3;
    chv = true;
    int i;
    if (chp == 2)
    {
      chn = 3;
      cht = AudioTrack.getMinBufferSize(cho, chn, 2);
      if (chk != null)
      {
        chk.stop();
        chk.release();
        chk = null;
      }
      if (!paramBoolean) {
        break label145;
      }
      i = 3;
      if (!bsLbpH) {
        break label174;
      }
      p.bsL.dump();
      if (bsLbpO != 1) {
        break label174;
      }
      i = j;
    }
    label145:
    label174:
    for (;;)
    {
      chk = new AudioTrack(i, cho, chn, 2, cht * 8, 1);
      try
      {
        chk.play();
        chv = false;
        return;
        chn = 2;
        break;
        i = 0;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "audioTrack error:%s", new Object[] { localException.getMessage() });
        }
      }
    }
  }
  
  public final boolean c(String paramString, boolean paramBoolean, int paramInt)
  {
    return t(paramString, paramBoolean);
  }
  
  public final int getStatus()
  {
    return status;
  }
  
  public final boolean isPlaying()
  {
    return status == 1;
  }
  
  public final boolean lB()
  {
    if (status != 2) {
      return false;
    }
    status = 1;
    synchronized (cgY)
    {
      try
      {
        u.v("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "before mpause.notify");
        cgY.notify();
        u.v("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "after mpause.notify");
        return true;
      }
      catch (Exception localException)
      {
        u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "exception:%s", new Object[] { ay.b(localException) });
        return false;
      }
    }
  }
  
  public final double lE()
  {
    return 0.0D;
  }
  
  public final boolean lv()
  {
    u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "stop  status:" + status);
    if ((status != 1) && (status != 2))
    {
      u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "stop  error status:" + status);
      return false;
    }
    status = 3;
    synchronized (cgY)
    {
      try
      {
        cgY.notify();
        return true;
      }
      catch (Exception localException)
      {
        u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "exception:%s", new Object[] { ay.b(localException) });
        return false;
      }
    }
  }
  
  public final boolean pause()
  {
    if (status != 1) {
      return false;
    }
    status = 2;
    synchronized (cgZ)
    {
      try
      {
        u.v("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "before mOk.wait");
        long l = System.currentTimeMillis();
        cgZ.wait();
        u.v("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "after mOk.wait time:" + (System.currentTimeMillis() - l));
        return true;
      }
      catch (Exception localException)
      {
        u.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "exception:%s", new Object[] { ay.b(localException) });
        return false;
      }
    }
  }
  
  public final boolean s(String paramString, boolean paramBoolean)
  {
    return t(paramString, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.modelvoice.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */