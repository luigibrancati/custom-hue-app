package ge;

import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 extends AbstractC4252p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee.e f35733b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ce.b primitiveSerializer) {
        super(primitiveSerializer, null);
        AbstractC4862t.e(primitiveSerializer, "primitiveSerializer");
        this.f35733b = new C4250n0(primitiveSerializer.getDescriptor());
    }

    @Override // ge.AbstractC4223a, ce.InterfaceC3118a
    public final Object deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return h(decoder, null);
    }

    @Override // ge.AbstractC4223a
    public final Iterator f(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // ge.AbstractC4252p, ce.b, ce.g, ce.InterfaceC3118a
    public final ee.e getDescriptor() {
        return this.f35733b;
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final AbstractC4248m0 c() {
        return (AbstractC4248m0) m(t());
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int d(AbstractC4248m0 abstractC4248m0) {
        AbstractC4862t.e(abstractC4248m0, "<this>");
        return abstractC4248m0.d();
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void e(AbstractC4248m0 abstractC4248m0, int i10) {
        AbstractC4862t.e(abstractC4248m0, "<this>");
        abstractC4248m0.b(i10);
    }

    @Override // ge.AbstractC4252p, ce.g
    public final void serialize(InterfaceC4050f encoder, Object obj) {
        AbstractC4862t.e(encoder, "encoder");
        int iG = g(obj);
        ee.e eVar = this.f35733b;
        InterfaceC4048d interfaceC4048dK = encoder.k(eVar, iG);
        w(interfaceC4048dK, obj, iG);
        interfaceC4048dK.c(eVar);
    }

    public abstract Object t();

    @Override // ge.AbstractC4252p
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void p(AbstractC4248m0 abstractC4248m0, int i10, Object obj) {
        AbstractC4862t.e(abstractC4248m0, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final Object n(AbstractC4248m0 abstractC4248m0) {
        AbstractC4862t.e(abstractC4248m0, "<this>");
        return abstractC4248m0.a();
    }

    public abstract void w(InterfaceC4048d interfaceC4048d, Object obj, int i10);
}
