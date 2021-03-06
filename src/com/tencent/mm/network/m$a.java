package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class m$a
  extends Binder
  implements m
{
  public m$a()
  {
    attachInterface(this, "com.tencent.mm.network.IOnNetworkChange_AIDL");
  }
  
  public static m aa(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.network.IOnNetworkChange_AIDL");
    if ((localIInterface != null) && ((localIInterface instanceof m))) {
      return (m)localIInterface;
    }
    return new a(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.tencent.mm.network.IOnNetworkChange_AIDL");
      return true;
    }
    paramParcel1.enforceInterface("com.tencent.mm.network.IOnNetworkChange_AIDL");
    aK(paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
  
  private static final class a
    implements m
  {
    private IBinder mRemote;
    
    a(IBinder paramIBinder)
    {
      mRemote = paramIBinder;
    }
    
    public final void aK(int paramInt)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.network.IOnNetworkChange_AIDL");
        localParcel1.writeInt(paramInt);
        mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public final IBinder asBinder()
    {
      return mRemote;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.network.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */