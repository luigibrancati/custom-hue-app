package Rc;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends f implements bd.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15097c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kd.f fVar, Object value) {
        super(fVar, null);
        AbstractC4862t.e(value, "value");
        this.f15097c = value;
    }

    @Override // bd.o
    public Object getValue() {
        return this.f15097c;
    }
}
