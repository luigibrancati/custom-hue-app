package Ge;

import Fe.AbstractC0852n;
import Fe.C0843e;
import Fe.J;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC0852n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(J delegate, long j10, boolean z10) {
        super(delegate);
        AbstractC4862t.e(delegate, "delegate");
        this.f4739b = j10;
        this.f4740c = z10;
    }

    @Override // Fe.AbstractC0852n, Fe.J
    public long V0(C0843e sink, long j10) throws IOException {
        AbstractC4862t.e(sink, "sink");
        long j11 = this.f4741d;
        long j12 = this.f4739b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f4740c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long jV0 = super.V0(sink, j10);
        if (jV0 != -1) {
            this.f4741d += jV0;
        }
        long j14 = this.f4741d;
        long j15 = this.f4739b;
        if ((j14 >= j15 || jV0 != -1) && j14 <= j15) {
            return jV0;
        }
        if (jV0 > 0 && j14 > j15) {
            b(sink, sink.size() - (this.f4741d - this.f4739b));
        }
        throw new IOException("expected " + this.f4739b + " bytes but got " + this.f4741d);
    }

    public final void b(C0843e c0843e, long j10) throws EOFException {
        C0843e c0843e2 = new C0843e();
        c0843e2.f1(c0843e);
        c0843e.J(c0843e2, j10);
        c0843e2.a();
    }
}
