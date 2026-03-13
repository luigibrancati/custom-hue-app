package ke;

import le.C4996a;
import me.C5055b;
import me.InterfaceC5054a;

/* JADX INFO: renamed from: ke.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4840b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C4840b f39665d = new C0518b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final le.c f39666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5054a f39667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39668c;

    /* JADX INFO: renamed from: ke.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0518b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public le.c f39669a = C4996a.f40092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC5054a f39670b = C5055b.f40400a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f39671c;

        public C4840b a() {
            return new C4840b(this.f39669a, this.f39670b, Boolean.valueOf(this.f39671c));
        }

        public C0518b b(InterfaceC5054a interfaceC5054a) {
            p.e(interfaceC5054a, "connectionBuilder cannot be null");
            this.f39670b = interfaceC5054a;
            return this;
        }

        public C0518b c(Boolean bool) {
            this.f39671c = bool.booleanValue();
            return this;
        }
    }

    public le.c a() {
        return this.f39666a;
    }

    public InterfaceC5054a b() {
        return this.f39667b;
    }

    public boolean c() {
        return this.f39668c;
    }

    public C4840b(le.c cVar, InterfaceC5054a interfaceC5054a, Boolean bool) {
        this.f39666a = cVar;
        this.f39667b = interfaceC5054a;
        this.f39668c = bool.booleanValue();
    }
}
