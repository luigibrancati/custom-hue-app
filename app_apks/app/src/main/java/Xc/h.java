package Xc;

import Lc.InterfaceC1185m;
import Lc.f0;
import Yc.n;
import bd.y;
import bd.z;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f19498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1185m f19499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f19501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bd.h f19502e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements l {
        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke(y typeParameter) {
            AbstractC4862t.e(typeParameter, "typeParameter");
            Integer num = (Integer) h.this.f19501d.get(typeParameter);
            if (num == null) {
                return null;
            }
            h hVar = h.this;
            return new n(Xc.a.h(Xc.a.b(hVar.f19498a, hVar), hVar.f19499b.getAnnotations()), typeParameter, hVar.f19500c + num.intValue(), hVar.f19499b);
        }
    }

    public h(g c10, InterfaceC1185m containingDeclaration, z typeParameterOwner, int i10) {
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(containingDeclaration, "containingDeclaration");
        AbstractC4862t.e(typeParameterOwner, "typeParameterOwner");
        this.f19498a = c10;
        this.f19499b = containingDeclaration;
        this.f19500c = i10;
        this.f19501d = Md.a.d(typeParameterOwner.getTypeParameters());
        this.f19502e = c10.e().b(new a());
    }

    @Override // Xc.k
    public f0 a(y javaTypeParameter) {
        AbstractC4862t.e(javaTypeParameter, "javaTypeParameter");
        n nVar = (n) this.f19502e.invoke(javaTypeParameter);
        return nVar != null ? nVar : this.f19498a.f().a(javaTypeParameter);
    }
}
