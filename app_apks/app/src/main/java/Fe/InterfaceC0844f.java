package Fe;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: Fe.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0844f extends H, WritableByteChannel {
    InterfaceC0844f B(int i10);

    InterfaceC0844f I0(long j10);

    InterfaceC0844f M();

    InterfaceC0844f T(String str);

    InterfaceC0844f U(C0846h c0846h);

    InterfaceC0844f W(String str, int i10, int i11);

    C0843e e();

    @Override // Fe.H, java.io.Flushable
    void flush();

    InterfaceC0844f l0(long j10);

    InterfaceC0844f write(byte[] bArr);

    InterfaceC0844f write(byte[] bArr, int i10, int i11);

    InterfaceC0844f writeByte(int i10);

    InterfaceC0844f writeInt(int i10);

    InterfaceC0844f writeShort(int i10);
}
