package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.mm.sdk.platformtools.ay;

public final class g
{
  public int backgroundColor;
  public Object data;
  public int end;
  public String gZd;
  public int linkColor;
  public int start;
  public int type;
  public String url;
  
  public g(String paramString, int paramInt, Object paramObject)
  {
    url = paramString;
    data = paramObject;
    type = paramInt;
  }
  
  public final Object c(Class paramClass)
  {
    if (paramClass.isInstance(data)) {
      return paramClass.cast(data);
    }
    return null;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof g)) {
      return hashCode() == ((g)paramObject).hashCode();
    }
    return super.equals(paramObject);
  }
  
  public final int hashCode()
  {
    int j = super.hashCode();
    int i = j;
    if (!ay.kz(url)) {
      i = j + url.hashCode();
    }
    j = i + type + end + start;
    i = j;
    if (data != null) {
      i = j + data.hashCode();
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */