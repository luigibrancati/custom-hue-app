package Fe;

import Od.C1823c;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import gc.C4202o;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: renamed from: Fe.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0843e implements InterfaceC0845g, InterfaceC0844f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E f4108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4109b;

    /* JADX INFO: renamed from: Fe.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C0843e f4110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public E f4111b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f4113d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f4112c = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4114e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4115f = -1;

        public final void a(E e10) {
            this.f4111b = e10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4110a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f4110a = null;
            a(null);
            this.f4112c = -1L;
            this.f4113d = null;
            this.f4114e = -1;
            this.f4115f = -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r0 = new Fe.C0843e().h1(r8).g1(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r0.p0());
     */
    @Override // Fe.InterfaceC0845g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long B0() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.C0843e.B0():long");
    }

    public long C(C0846h targetBytes) {
        AbstractC4862t.e(targetBytes, "targetBytes");
        return D(targetBytes, 0L);
    }

    public final void C0(long j10) {
        this.f4109b = j10;
    }

    public long D(C0846h targetBytes, long j10) {
        int i10;
        int i11;
        AbstractC4862t.e(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        E e10 = this.f4108a;
        if (e10 == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                e10 = e10.f4071g;
                AbstractC4862t.b(e10);
                size -= (long) (e10.f4067c - e10.f4066b);
            }
            if (targetBytes.size() == 2) {
                byte bQ = targetBytes.q(0);
                byte bQ2 = targetBytes.q(1);
                while (size < size()) {
                    byte[] bArr = e10.f4065a;
                    i10 = (int) ((((long) e10.f4066b) + j10) - size);
                    int i12 = e10.f4067c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bQ || b10 == bQ2) {
                            i11 = e10.f4066b;
                        } else {
                            i10++;
                        }
                    }
                    size += (long) (e10.f4067c - e10.f4066b);
                    e10 = e10.f4070f;
                    AbstractC4862t.b(e10);
                    j10 = size;
                }
            } else {
                byte[] bArrB = targetBytes.B();
                while (size < size()) {
                    byte[] bArr2 = e10.f4065a;
                    i10 = (int) ((((long) e10.f4066b) + j10) - size);
                    int i13 = e10.f4067c;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : bArrB) {
                            if (b11 == b12) {
                                i11 = e10.f4066b;
                            }
                        }
                        i10++;
                    }
                    size += (long) (e10.f4067c - e10.f4066b);
                    e10 = e10.f4070f;
                    AbstractC4862t.b(e10);
                    j10 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (e10.f4067c - e10.f4066b)) + size;
            if (j11 > j10) {
                break;
            }
            e10 = e10.f4070f;
            AbstractC4862t.b(e10);
            size = j11;
        }
        if (targetBytes.size() == 2) {
            byte bQ3 = targetBytes.q(0);
            byte bQ4 = targetBytes.q(1);
            while (size < size()) {
                byte[] bArr3 = e10.f4065a;
                i10 = (int) ((((long) e10.f4066b) + j10) - size);
                int i14 = e10.f4067c;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bQ3 || b13 == bQ4) {
                        i11 = e10.f4066b;
                    } else {
                        i10++;
                    }
                }
                size += (long) (e10.f4067c - e10.f4066b);
                e10 = e10.f4070f;
                AbstractC4862t.b(e10);
                j10 = size;
            }
        } else {
            byte[] bArrB2 = targetBytes.B();
            while (size < size()) {
                byte[] bArr4 = e10.f4065a;
                i10 = (int) ((((long) e10.f4066b) + j10) - size);
                int i15 = e10.f4067c;
                while (i10 < i15) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : bArrB2) {
                        if (b14 == b15) {
                            i11 = e10.f4066b;
                        }
                    }
                    i10++;
                }
                size += (long) (e10.f4067c - e10.f4066b);
                e10 = e10.f4070f;
                AbstractC4862t.b(e10);
                j10 = size;
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    public boolean F(long j10, C0846h bytes) {
        AbstractC4862t.e(bytes, "bytes");
        return G(j10, bytes, 0, bytes.size());
    }

    public boolean G(long j10, C0846h bytes, int i10, int i11) {
        AbstractC4862t.e(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || size() - j10 < i11 || bytes.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (q(((long) i12) + j10) != bytes.q(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public final C0846h G0() {
        if (size() <= 2147483647L) {
            return Q0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public byte[] H() {
        return b0(size());
    }

    @Override // Fe.H
    public void J(C0843e source, long j10) {
        E e10;
        AbstractC4862t.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0840b.b(source.size(), 0L, j10);
        while (j10 > 0) {
            E e11 = source.f4108a;
            AbstractC4862t.b(e11);
            int i10 = e11.f4067c;
            AbstractC4862t.b(source.f4108a);
            if (j10 < i10 - r1.f4066b) {
                E e12 = this.f4108a;
                if (e12 != null) {
                    AbstractC4862t.b(e12);
                    e10 = e12.f4071g;
                } else {
                    e10 = null;
                }
                if (e10 != null && e10.f4069e) {
                    if ((((long) e10.f4067c) + j10) - ((long) (e10.f4068d ? 0 : e10.f4066b)) <= 8192) {
                        E e13 = source.f4108a;
                        AbstractC4862t.b(e13);
                        e13.f(e10, (int) j10);
                        source.C0(source.size() - j10);
                        C0(size() + j10);
                        return;
                    }
                }
                E e14 = source.f4108a;
                AbstractC4862t.b(e14);
                source.f4108a = e14.e((int) j10);
            }
            E e15 = source.f4108a;
            AbstractC4862t.b(e15);
            long j11 = e15.f4067c - e15.f4066b;
            source.f4108a = e15.b();
            E e16 = this.f4108a;
            if (e16 == null) {
                this.f4108a = e15;
                e15.f4071g = e15;
                e15.f4070f = e15;
            } else {
                AbstractC4862t.b(e16);
                E e17 = e16.f4071g;
                AbstractC4862t.b(e17);
                e17.c(e15).a();
            }
            source.C0(source.size() - j11);
            C0(size() + j11);
            j10 -= j11;
        }
    }

    public C0846h K() {
        return q0(size());
    }

    @Override // Fe.InterfaceC0845g
    public String O(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jU = u((byte) 10, 0L, j11);
        if (jU != -1) {
            return Ge.a.b(this, jU);
        }
        if (j11 < size() && q(j11 - 1) == 13 && q(j11) == 10) {
            return Ge.a.b(this, j11);
        }
        C0843e c0843e = new C0843e();
        m(c0843e, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + c0843e.K().x() + (char) 8230);
    }

    @Override // Fe.InterfaceC0845g
    public int P0() {
        return AbstractC0840b.f(readInt());
    }

    public final C0846h Q0(int i10) {
        if (i10 == 0) {
            return C0846h.f4118e;
        }
        AbstractC0840b.b(size(), 0L, i10);
        E e10 = this.f4108a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            AbstractC4862t.b(e10);
            int i14 = e10.f4067c;
            int i15 = e10.f4066b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            e10 = e10.f4070f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        E e11 = this.f4108a;
        int i16 = 0;
        while (i11 < i10) {
            AbstractC4862t.b(e11);
            bArr[i16] = e11.f4065a;
            i11 += e11.f4067c - e11.f4066b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = e11.f4066b;
            e11.f4068d = true;
            i16++;
            e11 = e11.f4070f;
        }
        return new G(bArr, iArr);
    }

    public void S(byte[] sink) throws EOFException {
        AbstractC4862t.e(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // Fe.J
    public long V0(C0843e sink, long j10) {
        AbstractC4862t.e(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.J(this, j10);
        return j10;
    }

    public final E W0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        E e10 = this.f4108a;
        if (e10 != null) {
            AbstractC4862t.b(e10);
            E e11 = e10.f4071g;
            AbstractC4862t.b(e11);
            return (e11.f4067c + i10 > 8192 || !e11.f4069e) ? e11.c(F.c()) : e11;
        }
        E eC = F.c();
        this.f4108a = eC;
        eC.f4071g = eC;
        eC.f4070f = eC;
        return eC;
    }

    @Override // Fe.InterfaceC0845g
    public String Z() {
        return O(Long.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[EDGE_INSN: B:43:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // Fe.InterfaceC0845g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long Z0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            Fe.E r6 = r14.f4108a
            kotlin.jvm.internal.AbstractC4862t.b(r6)
            byte[] r7 = r6.f4065a
            int r8 = r6.f4066b
            int r9 = r6.f4067c
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            Fe.e r14 = new Fe.e
            r14.<init>()
            Fe.e r14 = r14.I0(r4)
            Fe.e r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.p0()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = Fe.AbstractC0840b.i(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L93:
            if (r8 != r9) goto L9f
            Fe.E r7 = r6.b()
            r14.f4108a = r7
            Fe.F.b(r6)
            goto La1
        L9f:
            r6.f4066b = r8
        La1:
            if (r1 != 0) goto La7
            Fe.E r6 = r14.f4108a
            if (r6 != 0) goto Ld
        La7:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.C0(r1)
            return r4
        Lb1:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.C0843e.Z0():long");
    }

    public final void a() throws EOFException {
        skip(size());
    }

    public long a0() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        E e10 = this.f4108a;
        AbstractC4862t.b(e10);
        int i10 = e10.f4066b;
        int i11 = e10.f4067c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & KeyboardMap.kValueMask) << 32) | (KeyboardMap.kValueMask & ((long) readInt()));
        }
        byte[] bArr = e10.f4065a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        C0(size() - 8);
        if (i13 != i11) {
            e10.f4066b = i13;
            return j11;
        }
        this.f4108a = e10.b();
        F.b(e10);
        return j11;
    }

    @Override // Fe.InterfaceC0845g
    public byte[] b0(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        S(bArr);
        return bArr;
    }

    @Override // Fe.InterfaceC0845g
    public InputStream b1() {
        return new b();
    }

    @Override // Fe.InterfaceC0844f
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C0843e U(C0846h byteString) {
        AbstractC4862t.e(byteString, "byteString");
        byteString.S(this, 0, byteString.size());
        return this;
    }

    @Override // Fe.InterfaceC0845g
    public short d0() {
        return AbstractC0840b.h(readShort());
    }

    @Override // Fe.InterfaceC0844f
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public C0843e write(byte[] source) {
        AbstractC4862t.e(source, "source");
        return write(source, 0, source.length);
    }

    @Override // Fe.InterfaceC0845g
    public long e0() {
        return AbstractC0840b.g(a0());
    }

    @Override // Fe.InterfaceC0844f
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public C0843e write(byte[] source, int i10, int i11) {
        AbstractC4862t.e(source, "source");
        long j10 = i11;
        AbstractC0840b.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            E eW0 = W0(1);
            int iMin = Math.min(i12 - i10, 8192 - eW0.f4067c);
            int i13 = i10 + iMin;
            C4202o.i(source, eW0.f4065a, eW0.f4067c, i10, i13);
            eW0.f4067c += iMin;
            i10 = i13;
        }
        C0(size() + j10);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0843e)) {
            return false;
        }
        C0843e c0843e = (C0843e) obj;
        if (size() != c0843e.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        E e10 = this.f4108a;
        AbstractC4862t.b(e10);
        E e11 = c0843e.f4108a;
        AbstractC4862t.b(e11);
        int i10 = e10.f4066b;
        int i11 = e11.f4066b;
        long j10 = 0;
        while (j10 < size()) {
            long jMin = Math.min(e10.f4067c - i10, e11.f4067c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (e10.f4065a[i10] != e11.f4065a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == e10.f4067c) {
                e10 = e10.f4070f;
                AbstractC4862t.b(e10);
                i10 = e10.f4066b;
            }
            if (i11 == e11.f4067c) {
                e11 = e11.f4070f;
                AbstractC4862t.b(e11);
                i11 = e11.f4066b;
            }
            j10 += jMin;
        }
        return true;
    }

    @Override // Fe.InterfaceC0845g
    public long f0(H sink) {
        AbstractC4862t.e(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.J(this, size);
        }
        return size;
    }

    public long f1(J source) {
        AbstractC4862t.e(source, "source");
        long j10 = 0;
        while (true) {
            long jV0 = source.V0(this, 8192L);
            if (jV0 == -1) {
                return j10;
            }
            j10 += jV0;
        }
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0843e clone() {
        return j();
    }

    @Override // Fe.InterfaceC0844f
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public C0843e writeByte(int i10) {
        E eW0 = W0(1);
        byte[] bArr = eW0.f4065a;
        int i11 = eW0.f4067c;
        eW0.f4067c = i11 + 1;
        bArr[i11] = (byte) i10;
        C0(size() + 1);
        return this;
    }

    @Override // Fe.InterfaceC0844f
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public C0843e l0(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return T("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        E eW0 = W0(i10);
        byte[] bArr = eW0.f4065a;
        int i11 = eW0.f4067c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = Ge.a.a()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        eW0.f4067c += i10;
        C0(size() + ((long) i10));
        return this;
    }

    public int hashCode() {
        E e10 = this.f4108a;
        if (e10 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = e10.f4067c;
            for (int i12 = e10.f4066b; i12 < i11; i12++) {
                i10 = (i10 * 31) + e10.f4065a[i12];
            }
            e10 = e10.f4070f;
            AbstractC4862t.b(e10);
        } while (e10 != this.f4108a);
        return i10;
    }

    public final long i() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        E e10 = this.f4108a;
        AbstractC4862t.b(e10);
        E e11 = e10.f4071g;
        AbstractC4862t.b(e11);
        int i10 = e11.f4067c;
        return (i10 >= 8192 || !e11.f4069e) ? size : size - ((long) (i10 - e11.f4066b));
    }

    @Override // Fe.InterfaceC0844f
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public C0843e I0(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        E eW0 = W0(i10);
        byte[] bArr = eW0.f4065a;
        int i11 = eW0.f4067c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = Ge.a.a()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        eW0.f4067c += i10;
        C0(size() + ((long) i10));
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final C0843e j() {
        C0843e c0843e = new C0843e();
        if (size() == 0) {
            return c0843e;
        }
        E e10 = this.f4108a;
        AbstractC4862t.b(e10);
        E eD = e10.d();
        c0843e.f4108a = eD;
        eD.f4071g = eD;
        eD.f4070f = eD;
        for (E e11 = e10.f4070f; e11 != e10; e11 = e11.f4070f) {
            E e12 = eD.f4071g;
            AbstractC4862t.b(e12);
            AbstractC4862t.b(e11);
            e12.c(e11.d());
        }
        c0843e.C0(size());
        return c0843e;
    }

    @Override // Fe.InterfaceC0845g
    public void j0(long j10) throws EOFException {
        if (this.f4109b < j10) {
            throw new EOFException();
        }
    }

    @Override // Fe.InterfaceC0844f
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public C0843e writeInt(int i10) {
        E eW0 = W0(4);
        byte[] bArr = eW0.f4065a;
        int i11 = eW0.f4067c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        eW0.f4067c = i11 + 4;
        C0(size() + 4);
        return this;
    }

    public String k0(long j10, Charset charset) throws EOFException {
        AbstractC4862t.e(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f4109b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        E e10 = this.f4108a;
        AbstractC4862t.b(e10);
        int i10 = e10.f4066b;
        if (((long) i10) + j10 > e10.f4067c) {
            return new String(b0(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(e10.f4065a, i10, i11, charset);
        int i12 = e10.f4066b + i11;
        e10.f4066b = i12;
        this.f4109b -= j10;
        if (i12 == e10.f4067c) {
            this.f4108a = e10.b();
            F.b(e10);
        }
        return str;
    }

    @Override // Fe.InterfaceC0844f
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public C0843e writeShort(int i10) {
        E eW0 = W0(2);
        byte[] bArr = eW0.f4065a;
        int i11 = eW0.f4067c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        eW0.f4067c = i11 + 2;
        C0(size() + 2);
        return this;
    }

    public C0843e l1(String string, int i10, int i11, Charset charset) {
        AbstractC4862t.e(string, "string");
        AbstractC4862t.e(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (AbstractC4862t.a(charset, C1823c.f12394b)) {
            return W(string, i10, i11);
        }
        String strSubstring = string.substring(i10, i11);
        AbstractC4862t.d(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        AbstractC4862t.d(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    public final C0843e m(C0843e out, long j10, long j11) {
        AbstractC4862t.e(out, "out");
        long j12 = j10;
        AbstractC0840b.b(size(), j12, j11);
        if (j11 != 0) {
            out.C0(out.size() + j11);
            E e10 = this.f4108a;
            while (true) {
                AbstractC4862t.b(e10);
                int i10 = e10.f4067c;
                int i11 = e10.f4066b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                e10 = e10.f4070f;
            }
            E e11 = e10;
            long j13 = j11;
            while (j13 > 0) {
                AbstractC4862t.b(e11);
                E eD = e11.d();
                int i12 = eD.f4066b + ((int) j12);
                eD.f4066b = i12;
                eD.f4067c = Math.min(i12 + ((int) j13), eD.f4067c);
                E e12 = out.f4108a;
                if (e12 == null) {
                    eD.f4071g = eD;
                    eD.f4070f = eD;
                    out.f4108a = eD;
                } else {
                    AbstractC4862t.b(e12);
                    E e13 = e12.f4071g;
                    AbstractC4862t.b(e13);
                    e13.c(eD);
                }
                j13 -= (long) (eD.f4067c - eD.f4066b);
                e11 = e11.f4070f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // Fe.InterfaceC0844f
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C0843e T(String string) {
        AbstractC4862t.e(string, "string");
        return W(string, 0, string.length());
    }

    @Override // Fe.J
    public K n() {
        return K.f4081e;
    }

    @Override // Fe.InterfaceC0844f
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public C0843e W(String string, int i10, int i11) {
        char cCharAt;
        AbstractC4862t.e(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                E eW0 = W0(1);
                byte[] bArr = eW0.f4065a;
                int i12 = eW0.f4067c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = eW0.f4067c;
                int i15 = (i12 + i10) - i14;
                eW0.f4067c = i14 + i15;
                C0(size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    E eW02 = W0(2);
                    byte[] bArr2 = eW02.f4065a;
                    int i16 = eW02.f4067c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    eW02.f4067c = i16 + 2;
                    C0(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    E eW03 = W0(3);
                    byte[] bArr3 = eW03.f4065a;
                    int i17 = eW03.f4067c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    eW03.f4067c = i17 + 3;
                    C0(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                        E eW04 = W0(4);
                        byte[] bArr4 = eW04.f4065a;
                        int i20 = eW04.f4067c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        eW04.f4067c = i20 + 4;
                        C0(size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    @Override // Fe.InterfaceC0845g
    public String o0(long j10) {
        return k0(j10, C1823c.f12394b);
    }

    @Override // Fe.InterfaceC0844f
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public C0843e B(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            E eW0 = W0(2);
            byte[] bArr = eW0.f4065a;
            int i11 = eW0.f4067c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            eW0.f4067c = i11 + 2;
            C0(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            E eW02 = W0(3);
            byte[] bArr2 = eW02.f4065a;
            int i12 = eW02.f4067c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            eW02.f4067c = i12 + 3;
            C0(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC0840b.j(i10));
        }
        E eW03 = W0(4);
        byte[] bArr3 = eW03.f4065a;
        int i13 = eW03.f4067c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        eW03.f4067c = i13 + 4;
        C0(size() + 4);
        return this;
    }

    @Override // Fe.InterfaceC0845g
    public boolean p(long j10) {
        return this.f4109b >= j10;
    }

    public String p0() {
        return k0(this.f4109b, C1823c.f12394b);
    }

    @Override // Fe.InterfaceC0845g
    public InterfaceC0845g peek() {
        return v.c(new B(this));
    }

    public final byte q(long j10) {
        AbstractC0840b.b(size(), j10, 1L);
        E e10 = this.f4108a;
        if (e10 == null) {
            AbstractC4862t.b(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                e10 = e10.f4071g;
                AbstractC4862t.b(e10);
                size -= (long) (e10.f4067c - e10.f4066b);
            }
            AbstractC4862t.b(e10);
            return e10.f4065a[(int) ((((long) e10.f4066b) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (e10.f4067c - e10.f4066b)) + j11;
            if (j12 > j10) {
                AbstractC4862t.b(e10);
                return e10.f4065a[(int) ((((long) e10.f4066b) + j10) - j11)];
            }
            e10 = e10.f4070f;
            AbstractC4862t.b(e10);
            j11 = j12;
        }
    }

    @Override // Fe.InterfaceC0845g
    public C0846h q0(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new C0846h(b0(j10));
        }
        C0846h c0846hQ0 = Q0((int) j10);
        skip(j10);
        return c0846hQ0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC4862t.e(sink, "sink");
        E e10 = this.f4108a;
        if (e10 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), e10.f4067c - e10.f4066b);
        sink.put(e10.f4065a, e10.f4066b, iMin);
        int i10 = e10.f4066b + iMin;
        e10.f4066b = i10;
        this.f4109b -= (long) iMin;
        if (i10 == e10.f4067c) {
            this.f4108a = e10.b();
            F.b(e10);
        }
        return iMin;
    }

    @Override // Fe.InterfaceC0845g
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        E e10 = this.f4108a;
        AbstractC4862t.b(e10);
        int i10 = e10.f4066b;
        int i11 = e10.f4067c;
        int i12 = i10 + 1;
        byte b10 = e10.f4065a[i10];
        C0(size() - 1);
        if (i12 != i11) {
            e10.f4066b = i12;
            return b10;
        }
        this.f4108a = e10.b();
        F.b(e10);
        return b10;
    }

    @Override // Fe.InterfaceC0845g
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        E e10 = this.f4108a;
        AbstractC4862t.b(e10);
        int i10 = e10.f4066b;
        int i11 = e10.f4067c;
        if (i11 - i10 < 4) {
            return (readByte() & ForkServer.ERROR) | ((readByte() & ForkServer.ERROR) << 24) | ((readByte() & ForkServer.ERROR) << 16) | ((readByte() & ForkServer.ERROR) << 8);
        }
        byte[] bArr = e10.f4065a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & ForkServer.ERROR) << 16) | ((bArr[i10] & ForkServer.ERROR) << 24) | ((bArr[i10 + 2] & ForkServer.ERROR) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & ForkServer.ERROR) | i13;
        C0(size() - 4);
        if (i14 != i11) {
            e10.f4066b = i14;
            return i15;
        }
        this.f4108a = e10.b();
        F.b(e10);
        return i15;
    }

    @Override // Fe.InterfaceC0845g
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        E e10 = this.f4108a;
        AbstractC4862t.b(e10);
        int i10 = e10.f4066b;
        int i11 = e10.f4067c;
        if (i11 - i10 < 2) {
            return (short) ((readByte() & ForkServer.ERROR) | ((readByte() & ForkServer.ERROR) << 8));
        }
        byte[] bArr = e10.f4065a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & ForkServer.ERROR) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & ForkServer.ERROR) | i13;
        C0(size() - 2);
        if (i14 == i11) {
            this.f4108a = e10.b();
            F.b(e10);
        } else {
            e10.f4066b = i14;
        }
        return (short) i15;
    }

    public final long size() {
        return this.f4109b;
    }

    @Override // Fe.InterfaceC0845g
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            E e10 = this.f4108a;
            if (e10 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, e10.f4067c - e10.f4066b);
            long j11 = iMin;
            C0(size() - j11);
            j10 -= j11;
            int i10 = e10.f4066b + iMin;
            e10.f4066b = i10;
            if (i10 == e10.f4067c) {
                this.f4108a = e10.b();
                F.b(e10);
            }
        }
    }

    public String toString() {
        return G0().toString();
    }

    public long u(byte b10, long j10, long j11) {
        E e10;
        int i10;
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (e10 = this.f4108a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                e10 = e10.f4071g;
                AbstractC4862t.b(e10);
                size -= (long) (e10.f4067c - e10.f4066b);
            }
            while (size < j11) {
                byte[] bArr = e10.f4065a;
                int iMin = (int) Math.min(e10.f4067c, (((long) e10.f4066b) + j11) - size);
                i10 = (int) ((((long) e10.f4066b) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (e10.f4067c - e10.f4066b);
                e10 = e10.f4070f;
                AbstractC4862t.b(e10);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (e10.f4067c - e10.f4066b)) + size;
            if (j12 > j10) {
                break;
            }
            e10 = e10.f4070f;
            AbstractC4862t.b(e10);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = e10.f4065a;
            int iMin2 = (int) Math.min(e10.f4067c, (((long) e10.f4066b) + j11) - size);
            i10 = (int) ((((long) e10.f4066b) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (e10.f4067c - e10.f4066b);
            e10 = e10.f4070f;
            AbstractC4862t.b(e10);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - e10.f4066b)) + size;
    }

    public int x0() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (size() == 0) {
            throw new EOFException();
        }
        byte bQ = q(0L);
        if ((bQ & 128) == 0) {
            i10 = bQ & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bQ & 224) == 192) {
            i10 = bQ & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bQ & 240) == 224) {
            i10 = bQ & 15;
            i11 = 3;
            i12 = RecognitionOptions.PDF417;
        } else {
            if ((bQ & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bQ & 7;
            i11 = 4;
            i12 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        long j10 = i11;
        if (size() < j10) {
            throw new EOFException("size < " + i11 + ": " + size() + " (to read code point prefixed 0x" + AbstractC0840b.i(bQ) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bQ2 = q(j11);
            if ((bQ2 & 192) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bQ2 & 63);
        }
        skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    @Override // Fe.InterfaceC0845g
    public boolean z0() {
        return this.f4109b == 0;
    }

    /* JADX INFO: renamed from: Fe.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C0843e.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C0843e.this.size() > 0) {
                return C0843e.this.readByte() & ForkServer.ERROR;
            }
            return -1;
        }

        public String toString() {
            return C0843e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            AbstractC4862t.e(sink, "sink");
            return C0843e.this.read(sink, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC4862t.e(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            E eW0 = W0(1);
            int iMin = Math.min(i10, 8192 - eW0.f4067c);
            source.get(eW0.f4065a, eW0.f4067c, iMin);
            i10 -= iMin;
            eW0.f4067c += iMin;
        }
        this.f4109b += (long) iRemaining;
        return iRemaining;
    }

    public int read(byte[] sink, int i10, int i11) {
        AbstractC4862t.e(sink, "sink");
        AbstractC0840b.b(sink.length, i10, i11);
        E e10 = this.f4108a;
        if (e10 == null) {
            return -1;
        }
        int iMin = Math.min(i11, e10.f4067c - e10.f4066b);
        byte[] bArr = e10.f4065a;
        int i12 = e10.f4066b;
        C4202o.i(bArr, sink, i10, i12, i12 + iMin);
        e10.f4066b += iMin;
        C0(size() - ((long) iMin));
        if (e10.f4066b == e10.f4067c) {
            this.f4108a = e10.b();
            F.b(e10);
        }
        return iMin;
    }

    @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // Fe.InterfaceC0845g
    public C0843e e() {
        return this;
    }

    @Override // Fe.InterfaceC0844f, Fe.H, java.io.Flushable
    public void flush() {
    }

    @Override // Fe.InterfaceC0844f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C0843e M() {
        return this;
    }
}
