package C2;

import G1.AbstractC0853a;
import i2.O;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O.a f1069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f1071e;

    public u(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        AbstractC0853a.a((bArr2 == null) ^ (i10 == 0));
        this.f1067a = z10;
        this.f1068b = str;
        this.f1070d = i10;
        this.f1071e = bArr2;
        this.f1069c = new O.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b10 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b10 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b10 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b10 = 3;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 2;
            default:
                G1.t.h("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
