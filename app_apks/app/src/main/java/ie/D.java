package ie;

import gc.C4179C;
import gc.Q;
import he.AbstractC4304b;
import he.C4298A;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class D extends C4378B {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C4298A f37472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f37473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f37474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f37475o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(AbstractC4304b json, C4298A value) {
        super(json, value, null, null, 12, null);
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(value, "value");
        this.f37472l = value;
        List listV0 = C4179C.V0(D0().keySet());
        this.f37473m = listV0;
        this.f37474n = listV0.size() * 2;
        this.f37475o = -1;
    }

    @Override // ie.C4378B, ie.AbstractC4381c
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public C4298A D0() {
        return this.f37472l;
    }

    @Override // ie.C4378B, ie.AbstractC4381c, ge.z0, fe.InterfaceC4047c
    public void c(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
    }

    @Override // ie.C4378B, ge.U
    public String i0(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return (String) this.f37473m.get(i10 / 2);
    }

    @Override // ie.C4378B, fe.InterfaceC4047c
    public int j(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        int i10 = this.f37475o;
        if (i10 >= this.f37474n - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f37475o = i11;
        return i11;
    }

    @Override // ie.C4378B, ie.AbstractC4381c
    public he.h o0(String tag) {
        AbstractC4862t.e(tag, "tag");
        return this.f37475o % 2 == 0 ? he.i.a(tag) : (he.h) Q.j(D0(), tag);
    }
}
