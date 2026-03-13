package i2;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class z implements InterfaceC4337q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4337q f37066a;

    public z(InterfaceC4337q interfaceC4337q) {
        this.f37066a = interfaceC4337q;
    }

    @Override // i2.InterfaceC4337q
    public int a(int i10) {
        return this.f37066a.a(i10);
    }

    @Override // i2.InterfaceC4337q
    public boolean d(int i10, boolean z10) {
        return this.f37066a.d(i10, z10);
    }

    @Override // i2.InterfaceC4337q
    public boolean e(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f37066a.e(bArr, i10, i11, z10);
    }

    @Override // i2.InterfaceC4337q
    public long getLength() {
        return this.f37066a.getLength();
    }

    @Override // i2.InterfaceC4337q
    public long getPosition() {
        return this.f37066a.getPosition();
    }

    @Override // i2.InterfaceC4337q
    public void i() {
        this.f37066a.i();
    }

    @Override // i2.InterfaceC4337q
    public boolean j(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f37066a.j(bArr, i10, i11, z10);
    }

    @Override // i2.InterfaceC4337q
    public long m() {
        return this.f37066a.m();
    }

    @Override // i2.InterfaceC4337q
    public void o(int i10) {
        this.f37066a.o(i10);
    }

    @Override // i2.InterfaceC4337q
    public int p(byte[] bArr, int i10, int i11) {
        return this.f37066a.p(bArr, i10, i11);
    }

    @Override // i2.InterfaceC4337q
    public void q(int i10) {
        this.f37066a.q(i10);
    }

    @Override // i2.InterfaceC4337q
    public boolean r(int i10, boolean z10) {
        return this.f37066a.r(i10, z10);
    }

    @Override // i2.InterfaceC4337q, D1.InterfaceC0749g
    public int read(byte[] bArr, int i10, int i11) {
        return this.f37066a.read(bArr, i10, i11);
    }

    @Override // i2.InterfaceC4337q
    public void readFully(byte[] bArr, int i10, int i11) {
        this.f37066a.readFully(bArr, i10, i11);
    }

    @Override // i2.InterfaceC4337q
    public void s(byte[] bArr, int i10, int i11) {
        this.f37066a.s(bArr, i10, i11);
    }
}
