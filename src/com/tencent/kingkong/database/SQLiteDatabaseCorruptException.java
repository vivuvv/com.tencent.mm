package com.tencent.kingkong.database;

import com.tencent.mm.dbsupport.newcursor.g;

public class SQLiteDatabaseCorruptException
  extends SQLiteException
{
  public SQLiteDatabaseCorruptException()
  {
    g.qI();
  }
  
  public SQLiteDatabaseCorruptException(String paramString)
  {
    super(paramString);
    g.qI();
  }
}

/* Location:
 * Qualified Name:     com.tencent.kingkong.database.SQLiteDatabaseCorruptException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */