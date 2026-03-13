package vd;

import vd.C6095d;

/* JADX INFO: renamed from: vd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6094c {

    /* JADX INFO: renamed from: vd.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC6094c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f45971a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f45972b;

        static {
            C6095d.a aVar = C6095d.f45974c;
            f45972b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        @Override // vd.AbstractC6094c
        public int a() {
            return f45972b;
        }
    }

    /* JADX INFO: renamed from: vd.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC6094c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f45973a = new b();

        @Override // vd.AbstractC6094c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
