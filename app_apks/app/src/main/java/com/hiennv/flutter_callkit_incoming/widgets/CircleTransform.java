package com.hiennv.flutter_callkit_incoming.widgets;

import a4.InterfaceC2641a;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import io.sentry.rrweb.RRWebVideoEvent;
import j4.AbstractC4689h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import l4.InterfaceC4881a;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/widgets/CircleTransform;", "Ll4/a;", "<init>", "()V", "", "key", "()Ljava/lang/String;", "La4/a;", "pool", "Landroid/graphics/Bitmap;", "input", "Lj4/h;", RRWebVideoEvent.JsonKeys.SIZE, "transform", "(La4/a;Landroid/graphics/Bitmap;Lj4/h;Llc/e;)Ljava/lang/Object;", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CircleTransform implements InterfaceC4881a {
    @Override // l4.InterfaceC4881a
    public String key() {
        return "circle";
    }

    @Override // l4.InterfaceC4881a
    public Object transform(InterfaceC2641a interfaceC2641a, Bitmap bitmap, AbstractC4689h abstractC4689h, InterfaceC4988e interfaceC4988e) {
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - iMin) / 2, (bitmap.getHeight() - iMin) / 2, iMin, iMin);
        AbstractC4862t.d(bitmapCreateBitmap, "createBitmap(...)");
        if (!AbstractC4862t.a(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMin, iMin, config);
        AbstractC4862t.d(bitmapCreateBitmap2, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f10 = iMin / 2.0f;
        canvas.drawCircle(f10, f10, f10, paint);
        bitmapCreateBitmap.recycle();
        return bitmapCreateBitmap2;
    }
}
