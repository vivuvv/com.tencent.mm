package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class vt
  extends c
{
  private final int height = 129;
  private final int width = 129;
  
  protected final int h(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 129;
      return 129;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Object localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Object localObject3 = c.h(paramVarArgs);
      ((Paint)localObject3).setFlags(385);
      ((Paint)localObject3).setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      ((Paint)localObject3).setStrokeWidth(1.0F);
      ((Paint)localObject3).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject3).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject3).setStrokeMiter(4.0F);
      ((Paint)localObject3).setPathEffect(null);
      Paint localPaint = c.a((Paint)localObject3, paramVarArgs);
      localPaint.set((Paint)localObject3);
      localPaint.setStrokeWidth(1.0F);
      localCanvas.save();
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 13.0F, 0.0F, 1.0F, 13.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject3).set((Paint)localObject2);
      ((Paint)localObject3).setColor(-1150121);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 31.0F, 0.0F, 1.0F, 0.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject3, paramVarArgs);
      localPaint.set((Paint)localObject3);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(1.0F, 3.8065174F);
      ((Path)localObject3).cubicTo(12.045206F, -0.7156839F, 24.602074F, -1.1991264F, 36.0F, 2.3058314F);
      ((Path)localObject3).cubicTo(35.798447F, 14.20053F, 35.46588F, 26.09523F, 35.19378F, 38.0F);
      ((Path)localObject3).cubicTo(23.795855F, 26.608887F, 12.387849F, 15.217773F, 1.0F, 3.8065174F);
      ((Path)localObject3).lineTo(1.0F, 3.8065174F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject3).set((Paint)localObject2);
      ((Paint)localObject3).setColor(-9676047);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 70.0F, 0.0F, 1.0F, 4.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject3, paramVarArgs);
      localPaint.set((Paint)localObject3);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(1.0240741F, 0.0F);
      ((Path)localObject3).cubicTo(12.452677F, 4.1678624F, 21.496967F, 13.53802F, 27.0F, 24.213774F);
      ((Path)localObject3).cubicTo(18.388306F, 32.52941F, 9.676009F, 40.74462F, 1.0140136F, 49.0F);
      ((Path)localObject3).cubicTo(1.0039533F, 32.659973F, 0.98383254F, 16.329987F, 1.0240741F, 0.0F);
      ((Path)localObject3).lineTo(1.0240741F, 0.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject3).set((Paint)localObject2);
      ((Paint)localObject3).setColor(49152);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 4.0F, 0.0F, 1.0F, 5.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject3, paramVarArgs);
      localPaint.set((Paint)localObject3);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(0.0F, 25.98406F);
      ((Path)localObject3).cubicTo(4.1862326F, 14.546246F, 13.542512F, 5.4925656F, 24.22393F, 0.0F);
      ((Path)localObject3).cubicTo(32.526123F, 8.621115F, 40.737965F, 17.322708F, 49.0F, 25.98406F);
      ((Path)localObject3).cubicTo(32.666668F, 25.994122F, 16.333334F, 26.01424F, 0.0F, 25.98406F);
      ((Path)localObject3).lineTo(0.0F, 25.98406F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject3).set((Paint)localObject2);
      ((Paint)localObject3).setColor(-10970130);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 64.0F, 0.0F, 1.0F, 31.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject3, paramVarArgs);
      localPaint.set((Paint)localObject3);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(0.0F, 35.192852F);
      ((Path)localObject3).cubicTo(11.398648F, 23.781782F, 22.797297F, 12.390891F, 34.216137F, 1.0F);
      ((Path)localObject3).cubicTo(38.719055F, 12.057941F, 39.19358F, 24.59902F, 35.690186F, 36.0F);
      ((Path)localObject3).cubicTo(23.796824F, 35.788124F, 11.90346F, 35.465263F, 0.0F, 35.192852F);
      ((Path)localObject3).lineTo(0.0F, 35.192852F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject3).set((Paint)localObject2);
      ((Paint)localObject3).setColor(-1124019);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 35.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject3, paramVarArgs);
      localPaint.set((Paint)localObject3);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(2.276762F, 1.0F);
      ((Path)localObject3).cubicTo(14.184508F, 1.2217742F, 26.092255F, 1.5443548F, 38.0F, 1.8165323F);
      ((Path)localObject3).cubicTo(26.616114F, 13.207662F, 15.242303F, 24.618952F, 3.8382685F, 36.0F);
      ((Path)localObject3).cubicTo(-0.6951373F, 24.951612F, -1.2089233F, 12.40121F, 2.276762F, 1.0F);
      ((Path)localObject3).lineTo(2.276762F, 1.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject3).set((Paint)localObject2);
      ((Paint)localObject3).setColor(-5117108);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 5.0F, 0.0F, 1.0F, 48.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject3, paramVarArgs);
      localPaint.set((Paint)localObject3);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(27.987633F, 1.0F);
      ((Path)localObject3).cubicTo(27.947277F, 17.333334F, 28.078432F, 33.666668F, 27.917011F, 50.0F);
      ((Path)localObject3).cubicTo(23.518278F, 49.399876F, 19.815678F, 46.80935F, 16.264406F, 44.348846F);
      ((Path)localObject3).cubicTo(9.9185295F, 39.65789F, 4.369671F, 33.616657F, 1.0F, 26.455194F);
      ((Path)localObject3).cubicTo(10.049685F, 18.033476F, 18.968214F, 9.471729F, 27.987633F, 1.0F);
      ((Path)localObject3).lineTo(27.987633F, 1.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject3).set((Paint)localObject2);
      ((Paint)localObject3).setColor(-10818218);
      arrayOfFloat = c.a(arrayOfFloat, 1.0F, 0.0F, 37.0F, 0.0F, 1.0F, 64.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues(arrayOfFloat);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localPaint = c.a((Paint)localObject3, paramVarArgs);
      localPaint.set((Paint)localObject3);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(0.8420746F, 0.0F);
      ((Path)localObject3).cubicTo(11.907926F, 11.243707F, 22.924242F, 22.527784F, 34.0F, 33.751305F);
      ((Path)localObject3).cubicTo(23.33042F, 38.343662F, 11.174826F, 39.352974F, 0.0F, 36.092903F);
      ((Path)localObject3).cubicTo(0.2972028F, 24.061935F, 0.5547786F, 12.030968F, 0.8420746F, 0.0F);
      ((Path)localObject3).lineTo(0.8420746F, 0.0F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a((Paint)localObject2, paramVarArgs);
      ((Paint)localObject3).set((Paint)localObject2);
      ((Paint)localObject3).setColor(-11083026);
      localObject2 = c.a(arrayOfFloat, 1.0F, 0.0F, 51.0F, 0.0F, 1.0F, 70.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a((Paint)localObject3, paramVarArgs);
      ((Paint)localObject1).set((Paint)localObject3);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(0.0F, 1.004426F);
      ((Path)localObject2).cubicTo(15.663328F, 0.99446756F, 31.326656F, 1.004426F, 47.0F, 1.004426F);
      ((Path)localObject2).cubicTo(42.41317F, 11.610118F, 34.160877F, 20.502966F, 23.965694F, 26.0F);
      ((Path)localObject2).cubicTo(15.973791F, 17.664822F, 7.981888F, 9.349562F, 0.0F, 1.004426F);
      ((Path)localObject2).lineTo(0.0F, 1.004426F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.svg.a.a.vt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */