package ge;

import de.AbstractC3918a;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4848e;

/* JADX INFO: renamed from: ge.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4241j extends o0 implements ce.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C4241j f35722c = new C4241j();

    public C4241j() {
        super(AbstractC3918a.z(C4848e.f39787a));
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C4239i m(byte[] bArr) {
        AbstractC4862t.e(bArr, "<this>");
        return new C4239i(bArr);
    }

    @Override // ge.o0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void w(InterfaceC4048d encoder, byte[] content, int i10) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.C(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int g(byte[] bArr) {
        AbstractC4862t.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // ge.o0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public byte[] t() {
        return new byte[0];
    }

    @Override // ge.AbstractC4252p, ge.AbstractC4223a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC4047c decoder, int i10, C4239i builder, boolean z10) {
        AbstractC4862t.e(decoder, "decoder");
        AbstractC4862t.e(builder, "builder");
        builder.e(decoder.E(getDescriptor(), i10));
    }
}
