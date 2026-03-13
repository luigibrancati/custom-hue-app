package B7;

import android.util.Pair;
import io.sentry.SentryOptions;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class U {
    public static X509Certificate[][] a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairC = V.c(randomAccessFile);
            if (pairC == null) {
                throw new Q("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairC.first;
            long jLongValue = ((Long) pairC.second).longValue();
            long j10 = (-20) + jLongValue;
            if (j10 >= 0) {
                randomAccessFile.seek(j10);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new Q("ZIP64 APK not supported");
                }
            }
            long jA = V.a(byteBuffer);
            if (jA >= jLongValue) {
                throw new Q("ZIP Central Directory offset out of range: " + jA + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (V.b(byteBuffer) + jA != jLongValue) {
                throw new Q("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jA < 32) {
                throw new Q("APK too small for APK Signing Block. ZIP Central Directory offset: " + jA);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jA - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new Q("No APK Signing Block before ZIP Central Directory");
            }
            int i10 = 0;
            long j11 = byteBufferAllocate.getLong(0);
            if (j11 < byteBufferAllocate.capacity() || j11 > 2147483639) {
                throw new Q("APK Signing Block size out of range: " + j11);
            }
            int i11 = (int) (8 + j11);
            long j12 = jA - ((long) i11);
            if (j12 < 0) {
                throw new Q("APK Signing Block offset out of range: " + j12);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i11);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j12);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j13 = byteBufferAllocate2.getLong(0);
            if (j13 != j11) {
                throw new Q("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j12));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                while (byteBufferSlice.hasRemaining()) {
                    i10++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new Q("Insufficient data to read size of APK Signing Block entry #" + i10);
                    }
                    long j14 = byteBufferSlice.getLong();
                    if (j14 < 4 || j14 > 2147483647L) {
                        throw new Q("APK Signing Block entry #" + i10 + " size out of range: " + j14);
                    }
                    int i12 = (int) j14;
                    int iPosition2 = byteBufferSlice.position() + i12;
                    if (i12 > byteBufferSlice.remaining()) {
                        throw new Q("APK Signing Block entry #" + i10 + " size out of range: " + i12 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrL = l(randomAccessFile.getChannel(), new P(e(byteBufferSlice, i12 - 4), jLongValue2, jA, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        return x509CertificateArrL;
                    }
                    long j15 = jLongValue2;
                    byteBufferSlice.position(iPosition2);
                    jLongValue2 = j15;
                }
                throw new Q("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    public static int c(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    public static String d(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    public static ByteBuffer e(ByteBuffer byteBuffer, int i10) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return e(byteBuffer, i10);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i10 + ", remaining: " + byteBuffer.remaining());
    }

    public static void g(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    public static void h(Map map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        L l10 = new L(fileChannel, 0L, j10);
        L l11 = new L(fileChannel, j11, j12 - j11);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        V.d(byteBufferDuplicate, j10);
        C0693a c0693a = new C0693a(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        try {
            byte[][] bArrK = k(iArr, new r[]{l10, l11, c0693a});
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = iArr[i11];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), bArrK[i11])) {
                    throw new SecurityException(d(i12).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e10) {
            throw new SecurityException("Failed to compute digest(s) of contents", e10);
        }
    }

    public static byte[] i(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i10 + ", available: " + byteBuffer.remaining());
    }

    public static X509Certificate[] j(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferF = f(byteBuffer);
        ByteBuffer byteBufferF2 = f(byteBuffer);
        byte[] bArrI = i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrI2 = null;
        byte[] bArrI3 = null;
        int i10 = -1;
        int i11 = 0;
        while (byteBufferF2.hasRemaining()) {
            i11++;
            try {
                ByteBuffer byteBufferF3 = f(byteBufferF2);
                if (byteBufferF3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i12 = byteBufferF3.getInt();
                arrayList.add(Integer.valueOf(i12));
                if (i12 != 513 && i12 != 514 && i12 != 769) {
                    switch (i12) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i10 != -1) {
                    int iC = c(i12);
                    int iC2 = c(i10);
                    if (iC != 1 && iC2 == 1) {
                    }
                }
                bArrI3 = i(byteBufferF3);
                i10 = i12;
            } catch (IOException | BufferUnderflowException e10) {
                throw new SecurityException("Failed to parse signature record #" + i11, e10);
            }
        }
        if (i10 == -1) {
            if (i11 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i10 == 513 || i10 == 514) {
            str = "EC";
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            str = "DSA";
        }
        if (i10 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i10 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrI));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferF);
            if (!signature.verify(bArrI3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferF.clear();
            ByteBuffer byteBufferF4 = f(byteBufferF);
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (byteBufferF4.hasRemaining()) {
                i13++;
                try {
                    ByteBuffer byteBufferF5 = f(byteBufferF4);
                    if (byteBufferF5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i14 = byteBufferF5.getInt();
                    arrayList2.add(Integer.valueOf(i14));
                    if (i14 == i10) {
                        bArrI2 = i(byteBufferF5);
                    }
                } catch (IOException | BufferUnderflowException e11) {
                    throw new IOException("Failed to parse digest record #" + i13, e11);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iC3 = c(i10);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iC3), bArrI2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrI2)) {
                throw new SecurityException(d(iC3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferF6 = f(byteBufferF);
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            while (byteBufferF6.hasRemaining()) {
                i15++;
                byte[] bArrI4 = i(byteBufferF6);
                try {
                    arrayList3.add(new S((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrI4)), bArrI4));
                } catch (CertificateException e12) {
                    throw new SecurityException("Failed to decode certificate #" + i15, e12);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrI, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e13) {
            throw new SecurityException("Failed to verify " + str2 + " signature", e13);
        }
    }

    public static byte[][] k(int[] iArr, r[] rVarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        char c10;
        int i11;
        String str;
        int i12 = 0;
        int i13 = 0;
        long jZza = 0;
        while (true) {
            j10 = SentryOptions.MAX_EVENT_SIZE_BYTES;
            i10 = 3;
            if (i13 >= 3) {
                break;
            }
            jZza += (rVarArr[i13].zza() + 1048575) / SentryOptions.MAX_EVENT_SIZE_BYTES;
            i13++;
        }
        if (jZza >= 2097151) {
            throw new DigestException("Too many chunks: " + jZza);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i14 = 0;
        while (true) {
            length = iArr.length;
            c10 = 5;
            i11 = 1;
            if (i14 >= length) {
                break;
            }
            int i15 = (int) jZza;
            byte[] bArr2 = new byte[(b(iArr[i14]) * i15) + 5];
            bArr2[0] = 90;
            g(i15, bArr2, 1);
            bArr[i14] = bArr2;
            i14++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i16 = 0;
        while (true) {
            str = " digest not supported";
            if (i16 >= iArr.length) {
                break;
            }
            String strD = d(iArr[i16]);
            try {
                messageDigestArr[i16] = MessageDigest.getInstance(strD);
                i16++;
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strD.concat(" digest not supported"), e10);
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < i10) {
            r rVar = rVarArr[i17];
            int i19 = i17;
            long jZza2 = rVar.zza();
            byte[][] bArr4 = bArr;
            long j11 = 0;
            while (jZza2 > 0) {
                int i20 = i18;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j10);
                g(iMin, bArr3, i11);
                for (int i21 = 0; i21 < length; i21++) {
                    messageDigestArr[i21].update(bArr3);
                }
                try {
                    rVar.a(messageDigestArr, j11, iMin);
                    int i22 = 0;
                    while (i22 < iArr.length) {
                        int i23 = iArr[i22];
                        byte[] bArr5 = bArr4[i22];
                        int iB = b(i23);
                        char c11 = c10;
                        MessageDigest messageDigest = messageDigestArr[i22];
                        int iDigest = messageDigest.digest(bArr5, (i20 * iB) + 5, iB);
                        if (iDigest != iB) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i22++;
                        c10 = c11;
                    }
                    long j12 = iMin;
                    j11 += j12;
                    jZza2 -= j12;
                    i18 = i20 + 1;
                    str = str2;
                    j10 = SentryOptions.MAX_EVENT_SIZE_BYTES;
                    i11 = 1;
                } catch (IOException e11) {
                    throw new DigestException("Failed to digest chunk #" + i20 + " of section #" + i12, e11);
                }
            }
            i12++;
            i17 = i19 + 1;
            bArr = bArr4;
            j10 = SentryOptions.MAX_EVENT_SIZE_BYTES;
            i10 = 3;
            i11 = 1;
        }
        byte[][] bArr6 = bArr;
        String str3 = str;
        byte[][] bArr7 = new byte[iArr.length][];
        for (int i24 = 0; i24 < iArr.length; i24++) {
            int i25 = iArr[i24];
            byte[] bArr8 = bArr6[i24];
            String strD2 = d(i25);
            try {
                bArr7[i24] = MessageDigest.getInstance(strD2).digest(bArr8);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strD2.concat(str3), e12);
            }
        }
        return bArr7;
    }

    public static X509Certificate[][] l(FileChannel fileChannel, P p10) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferF = f(p10.f700a);
                int i10 = 0;
                while (byteBufferF.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(j(f(byteBufferF), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException("Failed to parse/verify signer #" + i10 + " block", e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                h(map, fileChannel, p10.f701b, p10.f702c, p10.f703d, p10.f704e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }
}
