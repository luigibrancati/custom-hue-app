package X5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f18133j;

    public g(boolean z10, i iVar) {
        this.f18119a = z10;
        this.f18133j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f18120b = iVar.g(byteBufferAllocate, 16L);
        this.f18121c = iVar.j(byteBufferAllocate, 28L);
        this.f18122d = iVar.j(byteBufferAllocate, 32L);
        this.f18123e = iVar.g(byteBufferAllocate, 42L);
        this.f18124f = iVar.g(byteBufferAllocate, 44L);
        this.f18125g = iVar.g(byteBufferAllocate, 46L);
        this.f18126h = iVar.g(byteBufferAllocate, 48L);
        this.f18127i = iVar.g(byteBufferAllocate, 50L);
    }

    @Override // X5.d
    public c a(long j10, int i10) {
        return new a(this.f18133j, this, j10, i10);
    }

    @Override // X5.d
    public e b(long j10) {
        return new j(this.f18133j, this, j10);
    }

    @Override // X5.d
    public f c(int i10) {
        return new l(this.f18133j, this, i10);
    }
}
