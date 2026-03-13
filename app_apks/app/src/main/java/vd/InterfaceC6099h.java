package vd;

import gc.U;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;

/* JADX INFO: renamed from: vd.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC6099h extends InterfaceC6102k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46011a = a.f46012a;

    /* JADX INFO: renamed from: vd.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f46012a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final vc.l f46013b = C0630a.f46014a;

        /* JADX INFO: renamed from: vd.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0630a extends v implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0630a f46014a = new C0630a();

            public C0630a() {
                super(1);
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(kd.f it) {
                AbstractC4862t.e(it, "it");
                return Boolean.TRUE;
            }
        }

        public final vc.l a() {
            return f46013b;
        }
    }

    /* JADX INFO: renamed from: vd.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC6100i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f46015b = new b();

        @Override // vd.AbstractC6100i, vd.InterfaceC6099h
        public Set b() {
            return U.d();
        }

        @Override // vd.AbstractC6100i, vd.InterfaceC6099h
        public Set d() {
            return U.d();
        }

        @Override // vd.AbstractC6100i, vd.InterfaceC6099h
        public Set g() {
            return U.d();
        }
    }

    Collection a(kd.f fVar, Tc.b bVar);

    Set b();

    Collection c(kd.f fVar, Tc.b bVar);

    Set d();

    Set g();
}
