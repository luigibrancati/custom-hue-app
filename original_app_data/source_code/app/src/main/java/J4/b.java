package J4;

import fc.C4029l;
import fc.InterfaceC4028k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements D4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4028k f6103a = C4029l.b(a.f6104a);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6104a = new a();

        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4.a invoke() {
            return new C4.a();
        }
    }

    private final A4.a b() {
        return (A4.a) this.f6103a.getValue();
    }

    @Override // D4.c
    public A4.a a(D4.a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        return b();
    }
}
