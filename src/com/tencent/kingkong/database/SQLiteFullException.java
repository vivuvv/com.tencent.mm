package com.tencent.kingkong.database;

import com.tencent.mm.dbsupport.newcursor.g;

public class SQLiteFullException
  extends SQLiteException
{
  public SQLiteFullException()
  {
    g.qI();
  }
  
  public SQLiteFullException(String paramString)
  {
    super(paramString);
    g.qI();
  }
}

/* Location:
 * Qualified Name:     com.tencent.kingkong.database.SQLiteFullException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */