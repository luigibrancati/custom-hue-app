package ge;

import de.AbstractC3918a;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4856m;

/* JADX INFO: renamed from: ge.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4213B extends o0 implements ce.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C4213B f35635c = new C4213B();

    public C4213B() {
        super(AbstractC3918a.C(C4856m.f39795a));
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C4212A m(float[] fArr) {
        AbstractC4862t.e(fArr, "<this>");
        return new C4212A(fArr);
    }

    @Override // ge.o0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void w(InterfaceC4048d encoder, float[] content, int i10) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.B(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int g(float[] fArr) {
        AbstractC4862t.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // ge.o0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public float[] t() {
        return new float[0];
    }

    @Override // ge.AbstractC4252p, ge.AbstractC4223a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC4047c decoder, int i10, C4212A builder, boolean z10) {
        AbstractC4862t.e(decoder, "decoder");
        AbstractC4862t.e(builder, "builder");
        builder.e(decoder.p(getDescriptor(), i10));
    }
}
