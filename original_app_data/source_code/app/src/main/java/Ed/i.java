package Ed;

import Cd.e0;
import Lc.InterfaceC1180h;
import gc.C4206t;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f3411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f3412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3413c;

    public i(j kind, String... formatParams) {
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(formatParams, "formatParams");
        this.f3411a = kind;
        this.f3412b = formatParams;
        String strB = b.ERROR_TYPE.b();
        String strB2 = kind.b();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strB2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC4862t.d(str, "format(this, *args)");
        String str2 = String.format(strB, Arrays.copyOf(new Object[]{str}, 1));
        AbstractC4862t.d(str2, "format(this, *args)");
        this.f3413c = str2;
    }

    public final j a() {
        return this.f3411a;
    }

    public final String b(int i10) {
        return this.f3412b[i10];
    }

    @Override // Cd.e0
    public List getParameters() {
        return C4206t.k();
    }

    @Override // Cd.e0
    public Ic.g n() {
        return Ic.e.f5685h.a();
    }

    @Override // Cd.e0
    public Collection o() {
        return C4206t.k();
    }

    @Override // Cd.e0
    public e0 p(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // Cd.e0
    public InterfaceC1180h q() {
        return k.f3414a.h();
    }

    @Override // Cd.e0
    public boolean r() {
        return false;
    }

    public String toString() {
        return this.f3413c;
    }
}
