package ge;

import de.AbstractC3918a;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends o0 implements ce.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u0 f35750c = new u0();

    public u0() {
        super(AbstractC3918a.F(kotlin.jvm.internal.P.f39779a));
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public t0 m(short[] sArr) {
        AbstractC4862t.e(sArr, "<this>");
        return new t0(sArr);
    }

    @Override // ge.o0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void w(InterfaceC4048d encoder, short[] content, int i10) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.j(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int g(short[] sArr) {
        AbstractC4862t.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // ge.o0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public short[] t() {
        return new short[0];
    }

    @Override // ge.AbstractC4252p, ge.AbstractC4223a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC4047c decoder, int i10, t0 builder, boolean z10) {
        AbstractC4862t.e(decoder, "decoder");
        AbstractC4862t.e(builder, "builder");
        builder.e(decoder.k(getDescriptor(), i10));
    }
}
