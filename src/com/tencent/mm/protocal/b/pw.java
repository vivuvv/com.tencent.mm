package com.tencent.mm.protocal.b;

import a.a.a.b;
import java.util.LinkedList;

public final class pw
  extends adm
{
  public int eJB;
  public LinkedList hAl = new LinkedList();
  public String hsu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (a.a.a.c.a)paramVarArgs[0];
      if (hLQ == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (hLQ != null)
      {
        paramVarArgs.bN(1, hLQ.kS());
        hLQ.a(paramVarArgs);
      }
      paramVarArgs.bM(2, eJB);
      paramVarArgs.d(3, 8, hAl);
      if (hsu != null) {
        paramVarArgs.U(4, hsu);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (hLQ == null) {
        break label532;
      }
    }
    label532:
    for (paramInt = a.a.a.a.bJ(1, hLQ.kS()) + 0;; paramInt = 0)
    {
      int i = paramInt + a.a.a.a.bI(2, eJB) + a.a.a.a.c(3, 8, hAl);
      paramInt = i;
      if (hsu != null) {
        paramInt = i + a.a.a.b.b.a.T(4, hsu);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        hAl.clear();
        paramVarArgs = new a.a.a.a.a(paramVarArgs, hfZ);
        for (paramInt = adm.a(paramVarArgs); paramInt > 0; paramInt = adm.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.aVo();
          }
        }
        if (hLQ != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (a.a.a.a.a)paramVarArgs[0];
        pw localpw = (pw)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((a.a.a.a.a)localObject1).pL(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ck();
            localObject2 = new a.a.a.a.a((byte[])localObject2, hfZ);
            for (bool = true; bool; bool = ((ck)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.al.a)localObject1, adm.a((a.a.a.a.a)localObject2))) {}
            hLQ = ((ck)localObject1);
            paramInt += 1;
          }
        case 2: 
          eJB = jMD.aVp();
          return 0;
        case 3: 
          paramVarArgs = ((a.a.a.a.a)localObject1).pL(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new wk();
            localObject2 = new a.a.a.a.a((byte[])localObject2, hfZ);
            for (bool = true; bool; bool = ((wk)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.al.a)localObject1, adm.a((a.a.a.a.a)localObject2))) {}
            hAl.add(localObject1);
            paramInt += 1;
          }
        }
        hsu = jMD.readString();
        return 0;
      }
      return -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.protocal.b.pw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */