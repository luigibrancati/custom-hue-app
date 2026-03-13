package C2;

import G1.C;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f1042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f1044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UUID[] f1045d;

        public a(UUID uuid, int i10, byte[] bArr, UUID[] uuidArr) {
            this.f1042a = uuid;
            this.f1043b = i10;
            this.f1044c = bArr;
            this.f1045d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        C c10 = new C(bArr);
        if (c10.j() < 32) {
            return null;
        }
        c10.a0(0);
        int iA = c10.a();
        int iU = c10.u();
        if (iU != iA) {
            G1.t.h("PsshAtomUtil", "Advertised atom size (" + iU + ") does not match buffer size: " + iA);
            return null;
        }
        int iU2 = c10.u();
        if (iU2 != 1886614376) {
            G1.t.h("PsshAtomUtil", "Atom type is not pssh: " + iU2);
            return null;
        }
        int iQ = b.q(c10.u());
        if (iQ > 1) {
            G1.t.h("PsshAtomUtil", "Unsupported pssh version: " + iQ);
            return null;
        }
        UUID uuid = new UUID(c10.E(), c10.E());
        if (iQ == 1) {
            int iP = c10.P();
            uuidArr = new UUID[iP];
            for (int i10 = 0; i10 < iP; i10++) {
                uuidArr[i10] = new UUID(c10.E(), c10.E());
            }
        } else {
            uuidArr = null;
        }
        int iP2 = c10.P();
        int iA2 = c10.a();
        if (iP2 == iA2) {
            byte[] bArr2 = new byte[iP2];
            c10.q(bArr2, 0, iP2);
            return new a(uuid, iQ, bArr2, uuidArr);
        }
        G1.t.h("PsshAtomUtil", "Atom data size (" + iP2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f1042a)) {
            return aVarD.f1044c;
        }
        G1.t.h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f1042a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f1042a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f1043b;
    }
}
