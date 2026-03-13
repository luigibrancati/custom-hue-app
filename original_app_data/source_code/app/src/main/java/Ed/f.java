package Ed;

import Lc.InterfaceC1180h;
import gc.C4206t;
import gc.T;
import gc.U;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vd.C6095d;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f implements InterfaceC6099h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f3402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3403c;

    public f(g kind, String... formatParams) {
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(formatParams, "formatParams");
        this.f3402b = kind;
        String strB = kind.b();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC4862t.d(str, "format(this, *args)");
        this.f3403c = str;
    }

    @Override // vd.InterfaceC6099h
    public Set b() {
        return U.d();
    }

    @Override // vd.InterfaceC6099h
    public Set d() {
        return U.d();
    }

    @Override // vd.InterfaceC6102k
    public InterfaceC1180h e(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        String str = String.format(b.ERROR_CLASS.b(), Arrays.copyOf(new Object[]{name}, 1));
        AbstractC4862t.d(str, "format(this, *args)");
        kd.f fVarW = kd.f.w(str);
        AbstractC4862t.d(fVarW, "special(ErrorEntity.ERRO…S.debugText.format(name))");
        return new a(fVarW);
    }

    @Override // vd.InterfaceC6102k
    public Collection f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        return C4206t.k();
    }

    @Override // vd.InterfaceC6099h
    public Set g() {
        return U.d();
    }

    @Override // vd.InterfaceC6099h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return T.c(new c(k.f3414a.h()));
    }

    @Override // vd.InterfaceC6099h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return k.f3414a.j();
    }

    public final String j() {
        return this.f3403c;
    }

    public String toString() {
        return "ErrorScope{" + this.f3403c + '}';
    }
}
