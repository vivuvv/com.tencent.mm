package android.support.v7.internal.widget;

final class c$e
  implements Runnable
{
  private c$e(c paramc) {}
  
  public final void run()
  {
    if (pD.pp)
    {
      if (pD.getAdapter() != null) {
        pD.post(this);
      }
      return;
    }
    c.b(pD);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.c.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */