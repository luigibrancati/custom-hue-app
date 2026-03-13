package ua;

import ka.P;
import pa.AbstractC5451b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f45500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC6012c f45503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f45504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EnumC6011b f45505f;

    public f(P p10, int i10, long j10, EnumC6012c enumC6012c, e eVar, EnumC6011b enumC6011b) {
        this.f45500a = p10;
        this.f45501b = i10;
        this.f45502c = j10;
        this.f45503d = enumC6012c;
        this.f45504e = eVar;
        this.f45505f = enumC6011b;
    }

    public P a() {
        return this.f45500a;
    }

    public int b() {
        return this.f45501b;
    }

    public e c() {
        return this.f45504e;
    }

    public EnumC6011b d() {
        return this.f45505f;
    }

    public String toString() {
        return "ScanResult{bleDevice=" + this.f45500a + ", rssi=" + this.f45501b + ", timestampNanos=" + this.f45502c + ", callbackType=" + this.f45503d + ", scanRecord=" + AbstractC5451b.a(this.f45504e.f()) + ", isConnectable=" + this.f45505f + '}';
    }
}
