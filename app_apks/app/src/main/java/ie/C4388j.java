package ie;

import fc.C4009B;
import fc.C4012E;
import fc.C4041x;
import fc.C4043z;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ie.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4388j extends C4386h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4388j(InterfaceC4393o writer, boolean z10) {
        super(writer);
        AbstractC4862t.e(writer, "writer");
        this.f37536c = z10;
    }

    @Override // ie.C4386h
    public void e(byte b10) {
        boolean z10 = this.f37536c;
        String strQ = C4041x.q(C4041x.b(b10));
        if (z10) {
            n(strQ);
        } else {
            k(strQ);
        }
    }

    @Override // ie.C4386h
    public void i(int i10) {
        boolean z10 = this.f37536c;
        String unsignedString = Integer.toUnsignedString(C4043z.b(i10));
        if (z10) {
            n(unsignedString);
        } else {
            k(unsignedString);
        }
    }

    @Override // ie.C4386h
    public void j(long j10) {
        boolean z10 = this.f37536c;
        String unsignedString = Long.toUnsignedString(C4009B.b(j10));
        if (z10) {
            n(unsignedString);
        } else {
            k(unsignedString);
        }
    }

    @Override // ie.C4386h
    public void l(short s10) {
        boolean z10 = this.f37536c;
        String strS = C4012E.s(C4012E.b(s10));
        if (z10) {
            n(strS);
        } else {
            k(strS);
        }
    }
}
