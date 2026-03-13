package b6;

import b6.C2834c;

/* JADX INFO: renamed from: b6.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2846o {

    /* JADX INFO: renamed from: b6.o$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public abstract AbstractC2846o a();

        public abstract a b(Y5.c cVar);

        public abstract a c(Y5.d dVar);

        public abstract a d(Y5.h hVar);

        public abstract a e(AbstractC2847p abstractC2847p);

        public abstract a f(String str);
    }

    public static a a() {
        return new C2834c.b();
    }

    public abstract Y5.c b();

    public abstract Y5.d c();

    public byte[] d() {
        return (byte[]) e().apply(c().c());
    }

    public abstract Y5.h e();

    public abstract AbstractC2847p f();

    public abstract String g();
}
