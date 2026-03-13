package ge;

import de.AbstractC3918a;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4855l;

/* JADX INFO: renamed from: ge.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4254s extends o0 implements ce.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C4254s f35743c = new C4254s();

    public C4254s() {
        super(AbstractC3918a.B(C4855l.f39794a));
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public r m(double[] dArr) {
        AbstractC4862t.e(dArr, "<this>");
        return new r(dArr);
    }

    @Override // ge.o0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void w(InterfaceC4048d encoder, double[] content, int i10) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.v(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int g(double[] dArr) {
        AbstractC4862t.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // ge.o0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public double[] t() {
        return new double[0];
    }

    @Override // ge.AbstractC4252p, ge.AbstractC4223a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC4047c decoder, int i10, r builder, boolean z10) {
        AbstractC4862t.e(decoder, "decoder");
        AbstractC4862t.e(builder, "builder");
        builder.e(decoder.B(getDescriptor(), i10));
    }
}
