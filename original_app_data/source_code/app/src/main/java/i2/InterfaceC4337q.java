package i2;

import D1.InterfaceC0749g;

/* JADX INFO: renamed from: i2.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4337q extends InterfaceC0749g {
    int a(int i10);

    boolean d(int i10, boolean z10);

    boolean e(byte[] bArr, int i10, int i11, boolean z10);

    long getLength();

    long getPosition();

    void i();

    boolean j(byte[] bArr, int i10, int i11, boolean z10);

    long m();

    void o(int i10);

    int p(byte[] bArr, int i10, int i11);

    void q(int i10);

    boolean r(int i10, boolean z10);

    @Override // D1.InterfaceC0749g
    int read(byte[] bArr, int i10, int i11);

    void readFully(byte[] bArr, int i10, int i11);

    void s(byte[] bArr, int i10, int i11);
}
