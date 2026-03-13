package ra;

import ua.C6013d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class F implements InterfaceC5683A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta.F f43858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5690f f43859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f43860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5685a f43861d;

    public F(ta.F f10, C5690f c5690f, x xVar, C5685a c5685a) {
        this.f43858a = f10;
        this.f43859b = c5690f;
        this.f43860c = xVar;
        this.f43861d = c5685a;
    }

    public static boolean b(C6013d[] c6013dArr) {
        boolean zB = true;
        for (C6013d c6013d : c6013dArr) {
            zB &= c6013d.b();
        }
        return !zB;
    }

    @Override // ra.InterfaceC5683A
    public z a(ua.g gVar, C6013d... c6013dArr) {
        boolean zB = b(c6013dArr);
        boolean z10 = gVar.b() != 1;
        Eb.o oVarA = ta.D.a();
        if (z10 && !zB) {
            ma.q.b("ScanSettings.callbackType != CALLBACK_TYPE_ALL_MATCHES but no (or only empty) filters are specified. Falling back to callbackType emulation.", new Object[0]);
            oVarA = this.f43860c.a(gVar.b());
            gVar = gVar.a(1);
        }
        return new z(new qa.r(this.f43858a, this.f43859b, this.f43861d, gVar, new C5689e(new p[0]), c6013dArr), oVarA);
    }
}
