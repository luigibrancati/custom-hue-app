package a0;

import E.C0817v;
import E.G;
import E.InterfaceC0800m;
import E.W0;
import O.n;
import a0.k;
import android.content.Context;
import androidx.lifecycle.InterfaceC2758n;
import fc.C4015H;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import s.InterfaceC5702a;
import s3.AbstractC5712a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20498b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f20499c = new k(new g());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f20500a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static final k e(Void r02) {
            return k.f20499c;
        }

        public static final k f(l lVar, Object obj) {
            return (k) lVar.invoke(obj);
        }

        public final void c(G cameraXConfig) {
            AbstractC4862t.e(cameraXConfig, "cameraXConfig");
            AbstractC5712a.b("CX:configureInstance");
            try {
                k.f20499c.e(cameraXConfig);
                C4015H c4015h = C4015H.f34254a;
            } finally {
                AbstractC5712a.d();
            }
        }

        public final O7.e d(Context context) {
            AbstractC4862t.e(context, "context");
            X0.h.g(context);
            O7.e eVarG = k.f20499c.g(context);
            final l lVar = new l() { // from class: a0.i
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return k.a.e((Void) obj);
                }
            };
            O7.e eVarX = n.x(eVarG, new InterfaceC5702a() { // from class: a0.j
                @Override // s.InterfaceC5702a
                public final Object apply(Object obj) {
                    return k.a.f(lVar, obj);
                }
            }, N.a.a());
            AbstractC4862t.d(eVarX, "transform(...)");
            return eVarX;
        }

        public a() {
        }
    }

    public k(g gVar) {
        this.f20500a = gVar;
    }

    public final InterfaceC0800m d(InterfaceC2758n lifecycleOwner, C0817v cameraSelector, W0... useCases) {
        AbstractC4862t.e(lifecycleOwner, "lifecycleOwner");
        AbstractC4862t.e(cameraSelector, "cameraSelector");
        AbstractC4862t.e(useCases, "useCases");
        return this.f20500a.m(lifecycleOwner, cameraSelector, (W0[]) Arrays.copyOf(useCases, useCases.length));
    }

    public final void e(G g10) {
        this.f20500a.p(g10);
    }

    public List f() {
        return this.f20500a.q();
    }

    public final O7.e g(Context context) {
        return this.f20500a.v(context, null);
    }

    public final void h() {
        this.f20500a.E();
    }
}
