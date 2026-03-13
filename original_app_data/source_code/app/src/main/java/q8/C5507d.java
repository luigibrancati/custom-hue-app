package q8;

import O8.a;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l8.InterfaceC4964a;
import s8.InterfaceC5810a;
import t8.InterfaceC5858a;

/* JADX INFO: renamed from: q8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5507d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O8.a f43303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile InterfaceC5810a f43304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile t8.b f43305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f43306d;

    public C5507d(O8.a aVar) {
        this(aVar, new t8.c(), new s8.f());
    }

    public static /* synthetic */ void a(C5507d c5507d, O8.b bVar) {
        c5507d.getClass();
        r8.g.f().b("AnalyticsConnector now available.");
        InterfaceC4964a interfaceC4964a = (InterfaceC4964a) bVar.get();
        s8.e eVar = new s8.e(interfaceC4964a);
        e eVar2 = new e();
        if (g(interfaceC4964a, eVar2) == null) {
            r8.g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        r8.g.f().b("Registered Firebase Analytics listener.");
        s8.d dVar = new s8.d();
        s8.c cVar = new s8.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (c5507d) {
            try {
                Iterator it = c5507d.f43306d.iterator();
                while (it.hasNext()) {
                    dVar.a((InterfaceC5858a) it.next());
                }
                eVar2.d(dVar);
                eVar2.e(cVar);
                c5507d.f43305c = dVar;
                c5507d.f43304b = cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void c(C5507d c5507d, InterfaceC5858a interfaceC5858a) {
        synchronized (c5507d) {
            try {
                if (c5507d.f43305c instanceof t8.c) {
                    c5507d.f43306d.add(interfaceC5858a);
                }
                c5507d.f43305c.a(interfaceC5858a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static InterfaceC4964a.InterfaceC0523a g(InterfaceC4964a interfaceC4964a, e eVar) {
        InterfaceC4964a.InterfaceC0523a interfaceC0523aG = interfaceC4964a.g("clx", eVar);
        if (interfaceC0523aG != null) {
            return interfaceC0523aG;
        }
        r8.g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        InterfaceC4964a.InterfaceC0523a interfaceC0523aG2 = interfaceC4964a.g("crash", eVar);
        if (interfaceC0523aG2 != null) {
            r8.g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return interfaceC0523aG2;
    }

    public InterfaceC5810a d() {
        return new InterfaceC5810a() { // from class: q8.b
            @Override // s8.InterfaceC5810a
            public final void a(String str, Bundle bundle) {
                this.f43301a.f43304b.a(str, bundle);
            }
        };
    }

    public t8.b e() {
        return new t8.b() { // from class: q8.a
            @Override // t8.b
            public final void a(InterfaceC5858a interfaceC5858a) {
                C5507d.c(this.f43300a, interfaceC5858a);
            }
        };
    }

    public final void f() {
        this.f43303a.a(new a.InterfaceC0156a() { // from class: q8.c
            @Override // O8.a.InterfaceC0156a
            public final void a(O8.b bVar) {
                C5507d.a(this.f43302a, bVar);
            }
        });
    }

    public C5507d(O8.a aVar, t8.b bVar, InterfaceC5810a interfaceC5810a) {
        this.f43303a = aVar;
        this.f43305c = bVar;
        this.f43306d = new ArrayList();
        this.f43304b = interfaceC5810a;
        f();
    }
}
