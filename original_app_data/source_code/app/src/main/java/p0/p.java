package p0;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.jvm.internal.AbstractC4854k;
import o0.AbstractC5189f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC5369c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f42128e = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public p(String str, int i10) {
        super(str, AbstractC5368b.f42065a.a(), i10, null);
    }

    @Override // p0.AbstractC5369c
    public float c(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // p0.AbstractC5369c
    public float d(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // p0.AbstractC5369c
    public long h(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f13 = (f10 + 16.0f) / 116.0f;
        float f14 = (f11 * 0.002f) + f13;
        float f15 = f14 > 0.20689656f ? f14 * f14 * f14 : (f14 - 0.13793103f) * 0.12841855f;
        float f16 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
        o oVar = o.f42116a;
        return (((long) Float.floatToRawIntBits(f15 * oVar.c()[0])) << 32) | (KeyboardMap.kValueMask & ((long) Float.floatToRawIntBits(f16 * oVar.c()[1])));
    }

    @Override // p0.AbstractC5369c
    public float i(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f13 = ((f10 + 16.0f) / 116.0f) - (f12 * 0.005f);
        return (f13 > 0.20689656f ? f13 * f13 * f13 : 0.12841855f * (f13 - 0.13793103f)) * o.f42116a.c()[2];
    }

    @Override // p0.AbstractC5369c
    public long j(float f10, float f11, float f12, float f13, AbstractC5369c abstractC5369c) {
        o oVar = o.f42116a;
        float f14 = f10 / oVar.c()[0];
        float f15 = f11 / oVar.c()[1];
        float f16 = f12 / oVar.c()[2];
        float fCbrt = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f;
        float f17 = (116.0f * fCbrt2) - 16.0f;
        float f18 = (fCbrt - fCbrt2) * 500.0f;
        float f19 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 100.0f) {
            f17 = 100.0f;
        }
        if (f18 < -128.0f) {
            f18 = -128.0f;
        }
        if (f18 > 128.0f) {
            f18 = 128.0f;
        }
        if (f19 < -128.0f) {
            f19 = -128.0f;
        }
        return AbstractC5189f.a(f17, f18, f19 <= 128.0f ? f19 : 128.0f, f13, abstractC5369c);
    }
}
