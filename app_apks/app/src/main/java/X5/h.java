package X5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f18134j;

    public h(boolean z10, i iVar) {
        this.f18119a = z10;
        this.f18134j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f18120b = iVar.g(byteBufferAllocate, 16L);
        this.f18121c = iVar.h(byteBufferAllocate, 32L);
        this.f18122d = iVar.h(byteBufferAllocate, 40L);
        this.f18123e = iVar.g(byteBufferAllocate, 54L);
        this.f18124f = iVar.g(byteBufferAllocate, 56L);
        this.f18125g = iVar.g(byteBufferAllocate, 58L);
        this.f18126h = iVar.g(byteBufferAllocate, 60L);
        this.f18127i = iVar.g(byteBufferAllocate, 62L);
    }

    @Override // X5.d
    public c a(long j10, int i10) {
        return new b(this.f18134j, this, j10, i10);
    }

    @Override // X5.d
    public e b(long j10) {
        return new k(this.f18134j, this, j10);
    }

    @Override // X5.d
    public f c(int i10) {
        return new m(this.f18134j, this, i10);
    }
}
