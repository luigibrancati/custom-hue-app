package z4;

import fc.C4029l;
import fc.InterfaceC4028k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: z4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6506e implements D4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4028k f48747a = C4029l.b(a.f48748a);

    /* JADX INFO: renamed from: z4.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48748a = new a();

        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B4.b invoke() {
            return new B4.b();
        }
    }

    @Override // D4.c
    public A4.a a(D4.a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        return b();
    }

    public final A4.a b() {
        return (A4.a) this.f48747a.getValue();
    }
}
