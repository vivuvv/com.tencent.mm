package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Base64;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.am.a;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.t;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.smtt.sdk.WebView;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class q
{
  private static am cmc = null;
  
  public static final String AY(String paramString)
  {
    String str = paramString;
    if (!ay.kz(paramString)) {}
    try
    {
      str = URLEncoder.encode(paramString, "utf-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      com.tencent.mm.sdk.platformtools.u.e("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "URLEncode fail, throw : %s", new Object[] { localUnsupportedEncodingException.getMessage() });
    }
    return paramString;
  }
  
  public static final String AZ(String paramString)
  {
    Object localObject = paramString;
    if (!ay.kz(paramString)) {}
    try
    {
      localObject = paramString.getBytes("utf-8");
      paramString = (String)localObject;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        paramString = paramString.getBytes();
        com.tencent.mm.sdk.platformtools.u.e("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "getBytes fail, throw : %s", new Object[] { localUnsupportedEncodingException.getMessage() });
      }
    }
    localObject = Base64.encodeToString(paramString, 2);
    return (String)localObject;
  }
  
  public static final String M(Map paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap.get(str);
      if ((!ay.kz(str)) && (localObject != null) && ((!(localObject instanceof String)) || (!ay.kz((String)localObject))))
      {
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append("&");
        }
        localStringBuilder.append(str);
        localStringBuilder.append("=");
        localStringBuilder.append(localObject);
      }
    }
    return localStringBuilder.toString();
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    if (cmc == null) {
      cmc = new am(1, "webview-save-image", 1);
    }
    cmc.c(new b(paramContext, paramString1, paramString2, paramBoolean));
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, a parama)
  {
    if (cmc == null) {
      cmc = new am(1, "webview-save-image", 1);
    }
    cmc.c(new b(paramContext, paramString1, paramString2, paramBoolean, 1, parama));
  }
  
  public static void a(WebView paramWebView)
  {
    com.tencent.mm.sdk.platformtools.u.d("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "initIFrame");
    paramWebView.evaluateJavascript("javascript:var edw_iframe = document.getElementById('_edw_iframe_');if (edw_iframe === null) {edw_iframe = document.createElement('iframe');edw_iframe.id = '_edw_iframe_';edw_iframe.style.display = 'none';document.documentElement.appendChild(edw_iframe);}", null);
  }
  
  public static void a(WebView paramWebView, String paramString1, String paramString2)
  {
    if ((paramWebView == null) || (ay.kz(paramString1)) || (ay.kz(paramString2)))
    {
      com.tencent.mm.sdk.platformtools.u.e("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "getJsResult fail, invalid argument, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
      return;
    }
    com.tencent.mm.sdk.platformtools.u.d("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "getJsResult, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
    a(paramWebView);
    paramWebView.evaluateJavascript("javascript:document.getElementById('_edw_iframe_').src = '" + paramString1 + "' + " + paramString2, null);
  }
  
  public static String aSW()
  {
    int i = com.tencent.mm.compatible.d.u.oN();
    if (i == 0) {
      return "127.0.0.1";
    }
    if (i == 1) {
      return cV(y.getContext());
    }
    try
    {
      InetAddress localInetAddress;
      do
      {
        localObject1 = NetworkInterface.getNetworkInterfaces();
        Object localObject2;
        while (!((Enumeration)localObject2).hasMoreElements())
        {
          do
          {
            if (!((Enumeration)localObject1).hasMoreElements()) {
              break;
            }
            localObject2 = (NetworkInterface)((Enumeration)localObject1).nextElement();
          } while (localObject2 == null);
          localObject2 = ((NetworkInterface)localObject2).getInetAddresses();
        }
        localInetAddress = (InetAddress)((Enumeration)localObject2).nextElement();
      } while ((localInetAddress == null) || (localInetAddress.isLoopbackAddress()) || (!(localInetAddress instanceof Inet4Address)));
      if (ay.kz(localInetAddress.getHostAddress())) {
        return "127.0.0.1";
      }
      Object localObject1 = localInetAddress.getHostAddress();
      return (String)localObject1;
    }
    catch (Exception localException) {}
    return "127.0.0.1";
  }
  
  public static String aT(Context paramContext, String paramString)
  {
    Object localObject = "!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg, appendUserAgent fail, context is null, stack = " + ay.aVJ();
    boolean bool;
    if (paramContext != null)
    {
      bool = true;
      Assert.assertTrue((String)localObject, bool);
      if (paramString != null) {
        break label192;
      }
    }
    label192:
    for (paramString = " MicroMessenger/";; paramString = paramString + " MicroMessenger/")
    {
      localObject = as(paramContext, y.getPackageName());
      paramContext = paramString;
      if (localObject != null)
      {
        paramContext = paramString + versionName;
        paramContext = paramContext + "." + versionCode;
      }
      paramString = ah.dt(y.getContext());
      paramContext = paramContext + " NetType/" + paramString;
      paramContext = paramContext + " Language/" + t.dn(y.getContext());
      com.tencent.mm.sdk.platformtools.u.i("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "appendUserAgent, uaStr = " + paramContext);
      return paramContext;
      bool = false;
      break;
    }
  }
  
  public static PackageInfo as(Context paramContext, String paramString)
  {
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.u.e("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "getPackageInfo fail, packageName is null");
      return null;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  public static String bX(String paramString1, String paramString2)
  {
    if ((ay.kz(paramString1)) || (ay.kz(paramString2)))
    {
      com.tencent.mm.sdk.platformtools.u.e("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "genJsCode fail, invalid argument, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
      return null;
    }
    com.tencent.mm.sdk.platformtools.u.d("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "genJsCode, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
    return "document.getElementById('_edw_iframe_').src = '" + paramString1 + "' + " + paramString2;
  }
  
  private static String cV(Context paramContext)
  {
    paramContext = (WifiManager)paramContext.getSystemService("wifi");
    int i;
    try
    {
      paramContext = paramContext.getConnectionInfo();
      if (paramContext == null) {
        return "127.0.0.1";
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = null;
      }
      i = paramContext.getIpAddress();
    }
    return String.format("%d.%d.%d.%d", tmp80_66);
  }
  
  public static abstract interface a
  {
    public abstract void yM(String paramString);
  }
  
  private static final class b
    implements am.a
  {
    private static Pattern iTq = Pattern.compile("image/[A-Za-z0-9]+");
    private static Pattern iTr = Pattern.compile("filename=[A-Za-z0-9@.]+.[A-Za-z0-9]+");
    private int auE;
    private String bYm;
    private Context context;
    private String iTs;
    private String iTt;
    private boolean iTu;
    private q.a iTv;
    private String imagePath;
    
    public b(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
    {
      this(paramContext, paramString1, paramString2, paramBoolean, 0, null);
    }
    
    public b(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, int paramInt, q.a parama)
    {
      context = paramContext;
      bYm = paramString1;
      iTt = paramString2;
      iTu = paramBoolean;
      auE = paramInt;
      iTv = parama;
    }
    
    private void a(String paramString1, String paramString2, InputStream paramInputStream)
    {
      com.tencent.mm.sdk.platformtools.u.i("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "contentType = %s, dispositionType = %s", new Object[] { paramString1, paramString2 });
      Object localObject2 = null;
      Object localObject1 = localObject2;
      if (!ay.kz(paramString1))
      {
        paramString1 = iTq.matcher(paramString1);
        localObject1 = localObject2;
        if (paramString1.find()) {
          localObject1 = paramString1.group().substring(paramString1.group().lastIndexOf('/') + 1);
        }
      }
      paramString1 = (String)localObject1;
      if (ay.kz((String)localObject1))
      {
        paramString1 = (String)localObject1;
        if (!ay.kz(paramString2))
        {
          paramString2 = iTr.matcher(paramString2);
          paramString1 = (String)localObject1;
          if (paramString2.find()) {
            paramString1 = paramString2.group().substring(paramString2.group().lastIndexOf('.') + 1);
          }
        }
      }
      paramString2 = paramString1;
      int i;
      if (ay.kz(paramString1))
      {
        paramString1 = new o(bYm);
        i = dtS.lastIndexOf('.');
        if (i != -1) {
          break label221;
        }
      }
      label221:
      for (paramString2 = "jpg";; paramString2 = dtS.substring(i + 1))
      {
        imagePath = k.kt(paramString2);
        paramString1 = new FileOutputStream(imagePath);
        paramString2 = new byte[' '];
        for (;;)
        {
          i = paramInputStream.read(paramString2);
          if (i == -1) {
            break;
          }
          paramString1.write(paramString2, 0, i);
        }
      }
      try
      {
        paramString1.flush();
        paramString1.close();
        if (auE == 0)
        {
          iTs = context.getString(2131428844, new Object[] { k.FD() });
          k.d(imagePath, context);
        }
        return;
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.u.e("!32@/B4Tb64lLpJLnjolkGdCeaEhhwktoazg", "close os failed : %s", new Object[] { paramString1.getMessage() });
        }
      }
    }
    
    private static void a(HttpURLConnection paramHttpURLConnection, InputStream paramInputStream)
    {
      if (paramHttpURLConnection != null) {
        paramHttpURLConnection.disconnect();
      }
      if (paramInputStream != null) {}
      try
      {
        paramInputStream.close();
        return;
      }
      catch (Exception paramHttpURLConnection) {}
    }
    
    /* Error */
    public final boolean vd()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 4
      //   3: aconst_null
      //   4: astore 5
      //   6: aconst_null
      //   7: astore 6
      //   9: aconst_null
      //   10: astore 7
      //   12: aconst_null
      //   13: astore_3
      //   14: iconst_0
      //   15: istore_1
      //   16: aload_0
      //   17: getfield 57	com/tencent/mm/pluginsdk/ui/tools/q$b:iTu	Z
      //   20: ifne +18 -> 38
      //   23: aload_0
      //   24: aload_0
      //   25: getfield 51	com/tencent/mm/pluginsdk/ui/tools/q$b:context	Landroid/content/Context;
      //   28: ldc -81
      //   30: invokevirtual 177	android/content/Context:getString	(I)Ljava/lang/String;
      //   33: putfield 154	com/tencent/mm/pluginsdk/ui/tools/q$b:iTs	Ljava/lang/String;
      //   36: iconst_1
      //   37: ireturn
      //   38: aload_0
      //   39: getfield 53	com/tencent/mm/pluginsdk/ui/tools/q$b:bYm	Ljava/lang/String;
      //   42: invokestatic 81	com/tencent/mm/sdk/platformtools/ay:kz	(Ljava/lang/String;)Z
      //   45: ifeq +5 -> 50
      //   48: iconst_0
      //   49: ireturn
      //   50: aload_0
      //   51: getfield 53	com/tencent/mm/pluginsdk/ui/tools/q$b:bYm	Ljava/lang/String;
      //   54: astore_2
      //   55: iconst_0
      //   56: invokestatic 183	com/tencent/smtt/sdk/d:is	(Z)Lcom/tencent/smtt/sdk/d;
      //   59: astore 8
      //   61: aload 8
      //   63: ifnull +139 -> 202
      //   66: aload 8
      //   68: invokevirtual 186	com/tencent/smtt/sdk/d:bln	()Z
      //   71: ifeq +131 -> 202
      //   74: aload 8
      //   76: invokevirtual 190	com/tencent/smtt/sdk/d:blm	()Lcom/tencent/smtt/sdk/t;
      //   79: getfield 196	com/tencent/smtt/sdk/t:mDexLoader	Lcom/tencent/smtt/export/external/DexLoader;
      //   82: ldc -58
      //   84: ldc -56
      //   86: iconst_1
      //   87: anewarray 202	java/lang/Class
      //   90: dup
      //   91: iconst_0
      //   92: ldc 97
      //   94: aastore
      //   95: iconst_1
      //   96: anewarray 4	java/lang/Object
      //   99: dup
      //   100: iconst_0
      //   101: aload_2
      //   102: aastore
      //   103: invokevirtual 208	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
      //   106: astore_2
      //   107: aload_2
      //   108: ifnonnull +83 -> 191
      //   111: iload_1
      //   112: ifeq +193 -> 305
      //   115: new 210	java/net/URL
      //   118: dup
      //   119: aload_0
      //   120: getfield 53	com/tencent/mm/pluginsdk/ui/tools/q$b:bYm	Ljava/lang/String;
      //   123: invokespecial 211	java/net/URL:<init>	(Ljava/lang/String;)V
      //   126: invokevirtual 215	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   129: checkcast 217	javax/net/ssl/HttpsURLConnection
      //   132: astore_2
      //   133: aload 7
      //   135: astore_3
      //   136: aload_2
      //   137: ldc -37
      //   139: invokevirtual 222	javax/net/ssl/HttpsURLConnection:setRequestMethod	(Ljava/lang/String;)V
      //   142: aload 7
      //   144: astore_3
      //   145: aload_2
      //   146: ldc -32
      //   148: aload_0
      //   149: getfield 55	com/tencent/mm/pluginsdk/ui/tools/q$b:iTt	Ljava/lang/String;
      //   152: invokevirtual 228	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   155: aload 7
      //   157: astore_3
      //   158: aload_2
      //   159: invokevirtual 232	javax/net/ssl/HttpsURLConnection:getResponseCode	()I
      //   162: sipush 200
      //   165: if_icmpeq +45 -> 210
      //   168: aload 7
      //   170: astore_3
      //   171: aload_0
      //   172: aload_0
      //   173: getfield 51	com/tencent/mm/pluginsdk/ui/tools/q$b:context	Landroid/content/Context;
      //   176: ldc -23
      //   178: invokevirtual 177	android/content/Context:getString	(I)Ljava/lang/String;
      //   181: putfield 154	com/tencent/mm/pluginsdk/ui/tools/q$b:iTs	Ljava/lang/String;
      //   184: aload_2
      //   185: aconst_null
      //   186: invokestatic 235	com/tencent/mm/pluginsdk/ui/tools/q$b:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   189: iconst_1
      //   190: ireturn
      //   191: aload_2
      //   192: checkcast 237	java/lang/Boolean
      //   195: invokevirtual 240	java/lang/Boolean:booleanValue	()Z
      //   198: istore_1
      //   199: goto -88 -> 111
      //   202: aload_2
      //   203: invokestatic 245	android/webkit/URLUtil:isHttpsUrl	(Ljava/lang/String;)Z
      //   206: istore_1
      //   207: goto -96 -> 111
      //   210: aload 7
      //   212: astore_3
      //   213: aload_2
      //   214: invokevirtual 248	javax/net/ssl/HttpsURLConnection:getContentType	()Ljava/lang/String;
      //   217: astore 5
      //   219: aload 7
      //   221: astore_3
      //   222: aload_2
      //   223: invokevirtual 252	javax/net/ssl/HttpsURLConnection:getInputStream	()Ljava/io/InputStream;
      //   226: astore 4
      //   228: aload 4
      //   230: astore_3
      //   231: aload_0
      //   232: aload 5
      //   234: aload_2
      //   235: ldc -2
      //   237: invokevirtual 257	javax/net/ssl/HttpsURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
      //   240: aload 4
      //   242: invokespecial 259	com/tencent/mm/pluginsdk/ui/tools/q$b:a	(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
      //   245: aload_2
      //   246: aload 4
      //   248: invokestatic 235	com/tencent/mm/pluginsdk/ui/tools/q$b:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   251: goto -62 -> 189
      //   254: astore 4
      //   256: aconst_null
      //   257: astore_2
      //   258: ldc 67
      //   260: ldc_w 261
      //   263: iconst_1
      //   264: anewarray 4	java/lang/Object
      //   267: dup
      //   268: iconst_0
      //   269: aload 4
      //   271: invokevirtual 163	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   274: aastore
      //   275: invokestatic 166	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   278: aload_3
      //   279: aload_2
      //   280: invokestatic 235	com/tencent/mm/pluginsdk/ui/tools/q$b:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   283: goto -94 -> 189
      //   286: astore_2
      //   287: aconst_null
      //   288: astore 5
      //   290: aload 4
      //   292: astore_3
      //   293: aload 5
      //   295: astore 4
      //   297: aload 4
      //   299: aload_3
      //   300: invokestatic 235	com/tencent/mm/pluginsdk/ui/tools/q$b:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   303: aload_2
      //   304: athrow
      //   305: new 210	java/net/URL
      //   308: dup
      //   309: aload_0
      //   310: getfield 53	com/tencent/mm/pluginsdk/ui/tools/q$b:bYm	Ljava/lang/String;
      //   313: invokespecial 211	java/net/URL:<init>	(Ljava/lang/String;)V
      //   316: invokevirtual 215	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   319: checkcast 169	java/net/HttpURLConnection
      //   322: astore_2
      //   323: aload_2
      //   324: ldc -37
      //   326: invokevirtual 262	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
      //   329: aload_2
      //   330: ldc -32
      //   332: aload_0
      //   333: getfield 55	com/tencent/mm/pluginsdk/ui/tools/q$b:iTt	Ljava/lang/String;
      //   336: invokevirtual 263	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   339: aload_2
      //   340: invokevirtual 264	java/net/HttpURLConnection:getResponseCode	()I
      //   343: sipush 200
      //   346: if_icmpeq +24 -> 370
      //   349: aload_0
      //   350: aload_0
      //   351: getfield 51	com/tencent/mm/pluginsdk/ui/tools/q$b:context	Landroid/content/Context;
      //   354: ldc -23
      //   356: invokevirtual 177	android/content/Context:getString	(I)Ljava/lang/String;
      //   359: putfield 154	com/tencent/mm/pluginsdk/ui/tools/q$b:iTs	Ljava/lang/String;
      //   362: aload_2
      //   363: aconst_null
      //   364: invokestatic 235	com/tencent/mm/pluginsdk/ui/tools/q$b:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   367: goto -178 -> 189
      //   370: aload_2
      //   371: invokevirtual 265	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
      //   374: astore 4
      //   376: aload_2
      //   377: invokevirtual 266	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   380: astore_3
      //   381: aload_0
      //   382: aload 4
      //   384: aload_2
      //   385: ldc -2
      //   387: invokevirtual 267	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
      //   390: aload_3
      //   391: invokespecial 259	com/tencent/mm/pluginsdk/ui/tools/q$b:a	(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
      //   394: aload_2
      //   395: aload_3
      //   396: invokestatic 235	com/tencent/mm/pluginsdk/ui/tools/q$b:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   399: goto -210 -> 189
      //   402: astore_2
      //   403: aconst_null
      //   404: astore_3
      //   405: aload 5
      //   407: astore 4
      //   409: ldc 67
      //   411: ldc_w 269
      //   414: iconst_1
      //   415: anewarray 4	java/lang/Object
      //   418: dup
      //   419: iconst_0
      //   420: aload_2
      //   421: invokevirtual 163	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   424: aastore
      //   425: invokestatic 166	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   428: aload 4
      //   430: aload_3
      //   431: invokestatic 235	com/tencent/mm/pluginsdk/ui/tools/q$b:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   434: goto -245 -> 189
      //   437: astore_2
      //   438: aconst_null
      //   439: astore_3
      //   440: aload 6
      //   442: astore 4
      //   444: aload 4
      //   446: aload_3
      //   447: invokestatic 235	com/tencent/mm/pluginsdk/ui/tools/q$b:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
      //   450: aload_2
      //   451: athrow
      //   452: astore 5
      //   454: aconst_null
      //   455: astore_3
      //   456: aload_2
      //   457: astore 4
      //   459: aload 5
      //   461: astore_2
      //   462: goto -18 -> 444
      //   465: astore 5
      //   467: aload_2
      //   468: astore 4
      //   470: aload 5
      //   472: astore_2
      //   473: goto -29 -> 444
      //   476: astore_2
      //   477: goto -33 -> 444
      //   480: astore 5
      //   482: aconst_null
      //   483: astore_3
      //   484: aload_2
      //   485: astore 4
      //   487: aload 5
      //   489: astore_2
      //   490: goto -81 -> 409
      //   493: astore 5
      //   495: aload_2
      //   496: astore 4
      //   498: aload 5
      //   500: astore_2
      //   501: goto -92 -> 409
      //   504: astore 5
      //   506: aload_2
      //   507: astore 4
      //   509: aload 5
      //   511: astore_2
      //   512: goto -215 -> 297
      //   515: astore 4
      //   517: aload_2
      //   518: astore 5
      //   520: aload 4
      //   522: astore_2
      //   523: aload_3
      //   524: astore 4
      //   526: aload 5
      //   528: astore_3
      //   529: goto -232 -> 297
      //   532: astore 4
      //   534: aconst_null
      //   535: astore 5
      //   537: aload_2
      //   538: astore_3
      //   539: aload 5
      //   541: astore_2
      //   542: goto -284 -> 258
      //   545: astore 6
      //   547: aload 4
      //   549: astore_3
      //   550: aload_2
      //   551: astore 5
      //   553: aload 6
      //   555: astore 4
      //   557: aload_3
      //   558: astore_2
      //   559: aload 5
      //   561: astore_3
      //   562: goto -304 -> 258
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	565	0	this	b
      //   15	192	1	bool	boolean
      //   54	226	2	localObject1	Object
      //   286	18	2	localObject2	Object
      //   322	73	2	localHttpURLConnection	HttpURLConnection
      //   402	19	2	localException1	Exception
      //   437	20	2	localObject3	Object
      //   461	12	2	localObject4	Object
      //   476	9	2	localObject5	Object
      //   489	70	2	localObject6	Object
      //   13	549	3	localObject7	Object
      //   1	246	4	localInputStream	InputStream
      //   254	37	4	localException2	Exception
      //   295	213	4	localObject8	Object
      //   515	6	4	localObject9	Object
      //   524	1	4	localObject10	Object
      //   532	16	4	localException3	Exception
      //   555	1	4	localObject11	Object
      //   4	402	5	str	String
      //   452	8	5	localObject12	Object
      //   465	6	5	localObject13	Object
      //   480	8	5	localException4	Exception
      //   493	6	5	localException5	Exception
      //   504	6	5	localObject14	Object
      //   518	42	5	localObject15	Object
      //   7	434	6	localObject16	Object
      //   545	9	6	localException6	Exception
      //   10	210	7	localObject17	Object
      //   59	16	8	locald	com.tencent.smtt.sdk.d
      // Exception table:
      //   from	to	target	type
      //   115	133	254	java/lang/Exception
      //   115	133	286	finally
      //   305	323	402	java/lang/Exception
      //   305	323	437	finally
      //   323	362	452	finally
      //   370	381	452	finally
      //   381	394	465	finally
      //   409	428	476	finally
      //   323	362	480	java/lang/Exception
      //   370	381	480	java/lang/Exception
      //   381	394	493	java/lang/Exception
      //   136	142	504	finally
      //   145	155	504	finally
      //   158	168	504	finally
      //   171	184	504	finally
      //   213	219	504	finally
      //   222	228	504	finally
      //   231	245	504	finally
      //   258	278	515	finally
      //   136	142	532	java/lang/Exception
      //   145	155	532	java/lang/Exception
      //   158	168	532	java/lang/Exception
      //   171	184	532	java/lang/Exception
      //   213	219	532	java/lang/Exception
      //   222	228	532	java/lang/Exception
      //   231	245	545	java/lang/Exception
    }
    
    public final boolean ve()
    {
      if (1 == auE)
      {
        iTv.yM(imagePath);
        return true;
      }
      if (!ay.kz(iTs))
      {
        Toast.makeText(context, iTs, 1).show();
        return true;
      }
      Toast.makeText(context, context.getString(2131428937), 1).show();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */