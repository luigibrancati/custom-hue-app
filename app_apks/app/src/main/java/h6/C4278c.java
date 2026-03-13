package h6;

import Y5.k;
import b6.AbstractC2840i;
import b6.AbstractC2847p;
import b6.u;
import c6.m;
import i6.x;
import j6.InterfaceC4725d;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k6.InterfaceC4806b;

/* JADX INFO: renamed from: h6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4278c implements InterfaceC4280e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f36265f = Logger.getLogger(u.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f36266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f36267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c6.e f36268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4725d f36269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4806b f36270e;

    public C4278c(Executor executor, c6.e eVar, x xVar, InterfaceC4725d interfaceC4725d, InterfaceC4806b interfaceC4806b) {
        this.f36267b = executor;
        this.f36268c = eVar;
        this.f36266a = xVar;
        this.f36269d = interfaceC4725d;
        this.f36270e = interfaceC4806b;
    }

    public static /* synthetic */ Object b(C4278c c4278c, AbstractC2847p abstractC2847p, AbstractC2840i abstractC2840i) {
        c4278c.f36269d.Y0(abstractC2847p, abstractC2840i);
        c4278c.f36266a.b(abstractC2847p, 1);
        return null;
    }

    public static /* synthetic */ void c(final C4278c c4278c, final AbstractC2847p abstractC2847p, k kVar, AbstractC2840i abstractC2840i) {
        c4278c.getClass();
        try {
            m mVar = c4278c.f36268c.get(abstractC2847p.b());
            if (mVar == null) {
                String str = String.format("Transport backend '%s' is not registered", abstractC2847p.b());
                f36265f.warning(str);
                kVar.a(new IllegalArgumentException(str));
            } else {
                final AbstractC2840i abstractC2840iB = mVar.b(abstractC2840i);
                c4278c.f36270e.c(new InterfaceC4806b.a() { // from class: h6.b
                    @Override // k6.InterfaceC4806b.a
                    public final Object l() {
                        return C4278c.b(this.f36262a, abstractC2847p, abstractC2840iB);
                    }
                });
                kVar.a(null);
            }
        } catch (Exception e10) {
            f36265f.warning("Error scheduling event " + e10.getMessage());
            kVar.a(e10);
        }
    }

    @Override // h6.InterfaceC4280e
    public void a(final AbstractC2847p abstractC2847p, final AbstractC2840i abstractC2840i, final k kVar) {
        this.f36267b.execute(new Runnable() { // from class: h6.a
            @Override // java.lang.Runnable
            public final void run() {
                C4278c.c(this.f36258a, abstractC2847p, kVar, abstractC2840i);
            }
        });
    }
}
