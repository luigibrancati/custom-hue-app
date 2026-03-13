package ge;

import de.AbstractC3918a;
import fc.C4012E;
import fc.C4013F;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class K0 extends o0 implements ce.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K0 f35662c = new K0();

    public K0() {
        super(AbstractC3918a.w(C4012E.f34249b));
    }

    public J0 A(short[] toBuilder) {
        AbstractC4862t.e(toBuilder, "$this$toBuilder");
        return new J0(toBuilder, null);
    }

    public void B(InterfaceC4048d encoder, short[] content, int i10) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.h(getDescriptor(), i11).s(C4013F.n(content, i11));
        }
    }

    @Override // ge.AbstractC4223a
    public /* bridge */ /* synthetic */ int g(Object obj) {
        return x(((C4013F) obj).y());
    }

    @Override // ge.AbstractC4223a
    public /* bridge */ /* synthetic */ Object m(Object obj) {
        return A(((C4013F) obj).y());
    }

    @Override // ge.o0
    public /* bridge */ /* synthetic */ Object t() {
        return C4013F.c(y());
    }

    @Override // ge.o0
    public /* bridge */ /* synthetic */ void w(InterfaceC4048d interfaceC4048d, Object obj, int i10) {
        B(interfaceC4048d, ((C4013F) obj).y(), i10);
    }

    public int x(short[] collectionSize) {
        AbstractC4862t.e(collectionSize, "$this$collectionSize");
        return C4013F.r(collectionSize);
    }

    public short[] y() {
        return C4013F.d(0);
    }

    @Override // ge.AbstractC4252p, ge.AbstractC4223a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC4047c decoder, int i10, J0 builder, boolean z10) {
        AbstractC4862t.e(decoder, "decoder");
        AbstractC4862t.e(builder, "builder");
        builder.e(C4012E.b(decoder.r(getDescriptor(), i10).t()));
    }
}
