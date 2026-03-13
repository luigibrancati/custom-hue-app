package Bb;

import android.graphics.Bitmap;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import com.google.android.filament.android.TextureHelper;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final void a(Texture texture, Engine engine, Bitmap bitmap, int i10) {
        AbstractC4862t.e(texture, "<this>");
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(bitmap, "bitmap");
        TextureHelper.setBitmap(engine, texture, i10, bitmap);
    }

    public static /* synthetic */ void b(Texture texture, Engine engine, Bitmap bitmap, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        a(texture, engine, bitmap, i10);
    }
}
