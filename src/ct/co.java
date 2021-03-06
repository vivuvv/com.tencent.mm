package ct;

import android.os.Bundle;
import com.tencent.map.geolocation.TencentPoi;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.jdt.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class co
{
  public int a;
  public final ArrayList b = new ArrayList();
  public cs c;
  
  co() {}
  
  public co(JSONObject paramJSONObject)
  {
    a = paramJSONObject.optInt("stat");
    if (paramJSONObject.has("subnation")) {
      c = new cs(paramJSONObject.optJSONObject("subnation"));
    }
    for (;;)
    {
      paramJSONObject = paramJSONObject.optJSONArray("poilist");
      if (paramJSONObject != null) {
        try
        {
          int j = paramJSONObject.length();
          int i = 0;
          for (;;)
          {
            if (i < j)
            {
              cr localcr = new cr(paramJSONObject.getJSONObject(i));
              b.add(localcr);
              i += 1;
              continue;
              if (paramJSONObject.has("results"))
              {
                c = a(paramJSONObject.optJSONArray("results"));
                break;
              }
              c = cs.a;
              b.a.b("DetailsData", "DetailsData: unknown json " + paramJSONObject.toString());
            }
          }
        }
        catch (JSONException paramJSONObject)
        {
          b.a.a("DetailsData", "json error", paramJSONObject);
        }
      }
    }
  }
  
  private static cs a(@Nullable JSONArray paramJSONArray)
  {
    int i = 2;
    if (paramJSONArray == null) {
      localObject1 = null;
    }
    cs localcs;
    int j;
    Object localObject2;
    do
    {
      return (cs)localObject1;
      localcs = cs.a(cs.a);
      j = paramJSONArray.length();
      if (j > 0)
      {
        localObject1 = paramJSONArray.optJSONObject(0);
        b = ((JSONObject)localObject1).optString("n");
        e = ((JSONObject)localObject1).optString("p");
        f = ((JSONObject)localObject1).optString("c");
        g = ((JSONObject)localObject1).optString("d");
        d = ((JSONObject)localObject1).optString("adcode");
      }
      if (j > 1)
      {
        localObject1 = paramJSONArray.optJSONObject(1);
        localObject2 = ((JSONObject)localObject1).optString("address_name");
        l.putString("addrdesp.name", (String)localObject2);
        localObject2 = ((JSONObject)localObject1).optJSONObject("landmark");
        localObject1 = ((JSONObject)localObject1).optJSONObject("second_landmark");
        if (localObject2 != null) {
          l.putParcelable("addrdesp.landmark", new cn((JSONObject)localObject2));
        }
        if (localObject1 != null) {
          l.putParcelable("addrdesp.second_landmark", new cn((JSONObject)localObject1));
        }
      }
      localObject1 = localcs;
    } while (j <= 2);
    Object localObject1 = new ArrayList();
    if (i < j)
    {
      localObject2 = new cn(paramJSONArray.optJSONObject(i));
      ((ArrayList)localObject1).add(localObject2);
      if ("ST".equals(b)) {
        j = a;
      }
      for (;;)
      {
        i += 1;
        break;
        if ("ST_NO".equals(b)) {
          k = a;
        }
      }
    }
    l.putParcelableArrayList("addrdesp.results", (ArrayList)localObject1);
    return localcs;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("DetailsData{");
    localStringBuilder.append("subnation=").append(c).append(",");
    localStringBuilder.append("poilist=[");
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext()) {
      localStringBuilder.append((TencentPoi)localIterator.next()).append(",");
    }
    localStringBuilder.append("]");
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ct.co
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */