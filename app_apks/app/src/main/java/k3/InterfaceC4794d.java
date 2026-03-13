package k3;

/* JADX INFO: renamed from: k3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4794d extends AutoCloseable {
    default boolean A0(int i10) {
        return getLong(i10) != 0;
    }

    String K0(int i10);

    void N(int i10, String str);

    boolean X0();

    @Override // java.lang.AutoCloseable
    void close();

    byte[] getBlob(int i10);

    int getColumnCount();

    String getColumnName(int i10);

    long getLong(int i10);

    boolean isNull(int i10);

    void r(int i10, long j10);

    void reset();

    void s(int i10, byte[] bArr);

    void t(int i10);
}
