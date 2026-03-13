package pa;

import ka.C;

/* JADX INFO: renamed from: pa.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5450a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C.b f42509f;

    public C5450a(int i10, int i11, int i12, boolean z10, boolean z11, C.b bVar) {
        this.f42504a = i10;
        this.f42505b = i11;
        this.f42506c = i12;
        this.f42507d = z10;
        this.f42508e = z11;
        this.f42509f = bVar;
    }

    public C5450a a(C c10) {
        return new C5450a(c10.a() != null ? c10.a().intValue() : this.f42504a, c10.c() != null ? c10.c().intValue() : this.f42505b, c10.f() != null ? c10.f().intValue() : this.f42506c, c10.d() != null ? c10.d().booleanValue() : this.f42507d, c10.e() != null ? c10.e().booleanValue() : this.f42508e, c10.b() != null ? c10.b() : this.f42509f);
    }

    public String toString() {
        return "LoggerSetup{logLevel=" + this.f42504a + ", macAddressLogSetting=" + this.f42505b + ", uuidLogSetting=" + this.f42506c + ", shouldLogAttributeValues=" + this.f42507d + ", shouldLogScannedPeripherals=" + this.f42508e + ", logger=" + this.f42509f + '}';
    }
}
