package r8;

import O8.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import x8.F;
import x8.G;

/* JADX INFO: renamed from: r8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5675d implements InterfaceC5672a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f43821c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O8.a f43822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f43823b = new AtomicReference(null);

    /* JADX INFO: renamed from: r8.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements h {
        public b() {
        }

        @Override // r8.h
        public File a() {
            return null;
        }

        @Override // r8.h
        public F.a b() {
            return null;
        }

        @Override // r8.h
        public File c() {
            return null;
        }

        @Override // r8.h
        public File d() {
            return null;
        }

        @Override // r8.h
        public File e() {
            return null;
        }

        @Override // r8.h
        public File f() {
            return null;
        }

        @Override // r8.h
        public File g() {
            return null;
        }
    }

    public C5675d(O8.a aVar) {
        this.f43822a = aVar;
        aVar.a(new a.InterfaceC0156a() { // from class: r8.b
            @Override // O8.a.InterfaceC0156a
            public final void a(O8.b bVar) {
                C5675d.f(this.f43816a, bVar);
            }
        });
    }

    public static /* synthetic */ void f(C5675d c5675d, O8.b bVar) {
        c5675d.getClass();
        g.f().b("Crashlytics native component now available.");
        c5675d.f43823b.set((InterfaceC5672a) bVar.get());
    }

    @Override // r8.InterfaceC5672a
    public h a(String str) {
        InterfaceC5672a interfaceC5672a = (InterfaceC5672a) this.f43823b.get();
        return interfaceC5672a == null ? f43821c : interfaceC5672a.a(str);
    }

    @Override // r8.InterfaceC5672a
    public boolean b() {
        InterfaceC5672a interfaceC5672a = (InterfaceC5672a) this.f43823b.get();
        return interfaceC5672a != null && interfaceC5672a.b();
    }

    @Override // r8.InterfaceC5672a
    public boolean c(String str) {
        InterfaceC5672a interfaceC5672a = (InterfaceC5672a) this.f43823b.get();
        return interfaceC5672a != null && interfaceC5672a.c(str);
    }

    @Override // r8.InterfaceC5672a
    public void d(final String str, final String str2, final long j10, final G g10) {
        g.f().i("Deferring native open session: " + str);
        this.f43822a.a(new a.InterfaceC0156a() { // from class: r8.c
            @Override // O8.a.InterfaceC0156a
            public final void a(O8.b bVar) {
                ((InterfaceC5672a) bVar.get()).d(str, str2, j10, g10);
            }
        });
    }
}
