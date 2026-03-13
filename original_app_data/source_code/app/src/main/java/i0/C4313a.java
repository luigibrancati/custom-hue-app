package i0;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: i0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4313a extends AtomicInteger {
    public C4313a(int i10) {
        super(i10);
    }

    public byte a() {
        return (byte) intValue();
    }

    public /* bridge */ double b() {
        return super.doubleValue();
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        return a();
    }

    public /* bridge */ float c() {
        return super.floatValue();
    }

    public /* bridge */ int d() {
        return super.intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ double doubleValue() {
        return b();
    }

    public /* bridge */ long e() {
        return super.longValue();
    }

    public short f() {
        return (short) intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ float floatValue() {
        return c();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ int intValue() {
        return d();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ long longValue() {
        return e();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        return f();
    }
}
