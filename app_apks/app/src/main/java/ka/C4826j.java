package ka;

import ka.InterfaceC4817a;

/* JADX INFO: renamed from: ka.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4826j implements W3.c {

    /* JADX INFO: renamed from: ka.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4826j f39491a = new C4826j();
    }

    public static C4826j a() {
        return a.f39491a;
    }

    public static int c() {
        return InterfaceC4817a.c.i();
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
