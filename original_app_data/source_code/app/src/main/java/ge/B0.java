package ge;

import de.AbstractC3918a;
import fc.C4041x;
import fc.C4042y;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class B0 extends o0 implements ce.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B0 f35636c = new B0();

    public B0() {
        super(AbstractC3918a.t(C4041x.f34288b));
    }

    public A0 A(byte[] toBuilder) {
        AbstractC4862t.e(toBuilder, "$this$toBuilder");
        return new A0(toBuilder, null);
    }

    public void B(InterfaceC4048d encoder, byte[] content, int i10) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.h(getDescriptor(), i11).g(C4042y.n(content, i11));
        }
    }

    @Override // ge.AbstractC4223a
    public /* bridge */ /* synthetic */ int g(Object obj) {
        return x(((C4042y) obj).y());
    }

    @Override // ge.AbstractC4223a
    public /* bridge */ /* synthetic */ Object m(Object obj) {
        return A(((C4042y) obj).y());
    }

    @Override // ge.o0
    public /* bridge */ /* synthetic */ Object t() {
        return C4042y.c(y());
    }

    @Override // ge.o0
    public /* bridge */ /* synthetic */ void w(InterfaceC4048d interfaceC4048d, Object obj, int i10) {
        B(interfaceC4048d, ((C4042y) obj).y(), i10);
    }

    public int x(byte[] collectionSize) {
        AbstractC4862t.e(collectionSize, "$this$collectionSize");
        return C4042y.r(collectionSize);
    }

    public byte[] y() {
        return C4042y.d(0);
    }

    @Override // ge.AbstractC4252p, ge.AbstractC4223a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC4047c decoder, int i10, A0 builder, boolean z10) {
        AbstractC4862t.e(decoder, "decoder");
        AbstractC4862t.e(builder, "builder");
        builder.e(C4041x.b(decoder.r(getDescriptor(), i10).G()));
    }
}
