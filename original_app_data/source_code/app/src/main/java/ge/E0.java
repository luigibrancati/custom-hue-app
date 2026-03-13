package ge;

import de.AbstractC3918a;
import fc.C4008A;
import fc.C4043z;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class E0 extends o0 implements ce.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E0 f35644c = new E0();

    public E0() {
        super(AbstractC3918a.u(C4043z.f34293b));
    }

    public D0 A(int[] toBuilder) {
        AbstractC4862t.e(toBuilder, "$this$toBuilder");
        return new D0(toBuilder, null);
    }

    public void B(InterfaceC4048d encoder, int[] content, int i10) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.h(getDescriptor(), i11).D(C4008A.n(content, i11));
        }
    }

    @Override // ge.AbstractC4223a
    public /* bridge */ /* synthetic */ int g(Object obj) {
        return x(((C4008A) obj).y());
    }

    @Override // ge.AbstractC4223a
    public /* bridge */ /* synthetic */ Object m(Object obj) {
        return A(((C4008A) obj).y());
    }

    @Override // ge.o0
    public /* bridge */ /* synthetic */ Object t() {
        return C4008A.c(y());
    }

    @Override // ge.o0
    public /* bridge */ /* synthetic */ void w(InterfaceC4048d interfaceC4048d, Object obj, int i10) {
        B(interfaceC4048d, ((C4008A) obj).y(), i10);
    }

    public int x(int[] collectionSize) {
        AbstractC4862t.e(collectionSize, "$this$collectionSize");
        return C4008A.r(collectionSize);
    }

    public int[] y() {
        return C4008A.d(0);
    }

    @Override // ge.AbstractC4252p, ge.AbstractC4223a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC4047c decoder, int i10, D0 builder, boolean z10) {
        AbstractC4862t.e(decoder, "decoder");
        AbstractC4862t.e(builder, "builder");
        builder.e(C4043z.b(decoder.r(getDescriptor(), i10).h()));
    }
}
