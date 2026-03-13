package ge;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4250n0 extends N {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4250n0(ee.e primitive) {
        super(primitive, null);
        AbstractC4862t.e(primitive, "primitive");
        this.f35730c = primitive.i() + "Array";
    }

    @Override // ee.e
    public String i() {
        return this.f35730c;
    }
}
