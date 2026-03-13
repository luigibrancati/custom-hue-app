package n0;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: renamed from: n0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5067e {
    public static final long a(float f10, float f11) {
        return AbstractC5066d.b((((long) Float.floatToRawIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToRawIntBits(f10) << 32));
    }
}
