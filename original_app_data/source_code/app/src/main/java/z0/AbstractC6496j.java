package z0;

import io.flutter.embedding.android.KeyboardMap;
import n0.AbstractC5069g;

/* JADX INFO: renamed from: z0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6496j {
    public static final long a(long j10) {
        float f10 = (int) (j10 >> 32);
        return AbstractC5069g.c((((long) Float.floatToRawIntBits((int) (j10 & KeyboardMap.kValueMask))) & KeyboardMap.kValueMask) | (Float.floatToRawIntBits(f10) << 32));
    }
}
