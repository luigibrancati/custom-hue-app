package i6;

import b6.AbstractC2847p;
import j6.InterfaceC4725d;
import java.util.Iterator;
import java.util.concurrent.Executor;
import k6.InterfaceC4806b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f37302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4725d f37303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f37304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4806b f37305d;

    public v(Executor executor, InterfaceC4725d interfaceC4725d, x xVar, InterfaceC4806b interfaceC4806b) {
        this.f37302a = executor;
        this.f37303b = interfaceC4725d;
        this.f37304c = xVar;
        this.f37305d = interfaceC4806b;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator it = vVar.f37303b.L().iterator();
        while (it.hasNext()) {
            vVar.f37304c.b((AbstractC2847p) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f37302a.execute(new Runnable() { // from class: i6.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f37300a;
                vVar.f37305d.c(new InterfaceC4806b.a() { // from class: i6.u
                    @Override // k6.InterfaceC4806b.a
                    public final Object l() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }
}
