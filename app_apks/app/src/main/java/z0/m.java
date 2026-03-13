package z0;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final long a(long j10, float f10) {
        return l.b(j10 | (((long) Float.floatToRawIntBits(f10)) & KeyboardMap.kValueMask));
    }
}
