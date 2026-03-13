package p0;

import io.flutter.embedding.android.KeyboardMap;
import o0.AbstractC5189f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC5369c {
    public J(String str, int i10) {
        super(str, AbstractC5368b.f42065a.c(), i10, null);
    }

    @Override // p0.AbstractC5369c
    public float c(int i10) {
        return 2.0f;
    }

    @Override // p0.AbstractC5369c
    public float d(int i10) {
        return -2.0f;
    }

    @Override // p0.AbstractC5369c
    public long h(float f10, float f11, float f12) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f)) & KeyboardMap.kValueMask);
    }

    @Override // p0.AbstractC5369c
    public float i(float f10, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    @Override // p0.AbstractC5369c
    public long j(float f10, float f11, float f12, float f13, AbstractC5369c abstractC5369c) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        return AbstractC5189f.a(f10, f11, f12 <= 2.0f ? f12 : 2.0f, f13, abstractC5369c);
    }
}
