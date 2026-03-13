package H1;

import G1.AbstractC0853a;
import G1.B;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5214a;

        public b(e eVar, d dVar) throws c {
            int i10 = dVar.f5215a;
            AbstractC0853a.a(i10 == 6 || i10 == 3);
            byte[] bArr = new byte[Math.min(4, dVar.f5216b.remaining())];
            dVar.f5216b.asReadOnlyBuffer().get(bArr);
            B b10 = new B(bArr);
            h.f(eVar.f5217a);
            if (b10.g()) {
                this.f5214a = false;
                return;
            }
            int iH = b10.h(2);
            boolean zG = b10.g();
            h.f(eVar.f5218b);
            if (!zG) {
                this.f5214a = true;
                return;
            }
            boolean zG2 = (iH == 3 || iH == 0) ? true : b10.g();
            b10.q();
            h.f(!eVar.f5220d);
            if (b10.g()) {
                h.f(!eVar.f5221e);
                b10.q();
            }
            h.f(eVar.f5219c);
            if (iH != 3) {
                b10.q();
            }
            b10.r(eVar.f5222f);
            if (iH != 2 && iH != 0 && !zG2) {
                b10.r(3);
            }
            this.f5214a = ((iH == 3 || iH == 0) ? 255 : b10.h(8)) != 0;
        }

        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.f5214a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends Exception {
        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f5216b;

        public d(int i10, ByteBuffer byteBuffer) {
            this.f5215a = i10;
            this.f5216b = byteBuffer;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f5218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f5219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f5220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f5221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f5222f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f5223g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f5224h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f5225i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f5226j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f5227k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f5228l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f5229m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f5230n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f5231o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f5232p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f5233q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final byte f5234r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final byte f5235s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final byte f5236t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        public e(d dVar) {
            int iH;
            int iH2;
            boolean zG;
            ?? r82;
            AbstractC0853a.a(dVar.f5215a == 1);
            byte[] bArr = new byte[dVar.f5216b.remaining()];
            dVar.f5216b.asReadOnlyBuffer().get(bArr);
            B b10 = new B(bArr);
            this.f5223g = b10.h(3);
            b10.q();
            boolean zG2 = b10.g();
            this.f5217a = zG2;
            if (zG2) {
                iH2 = b10.h(5);
                this.f5218b = false;
                this.f5226j = false;
                r82 = 0;
                iH = 0;
            } else {
                if (b10.g()) {
                    b(b10);
                    boolean zG3 = b10.g();
                    this.f5218b = zG3;
                    if (zG3) {
                        b10.r(47);
                    }
                } else {
                    this.f5218b = false;
                }
                this.f5226j = b10.g();
                int iH3 = b10.h(5);
                int iH4 = 0;
                int i10 = 0;
                boolean z10 = false;
                iH = 0;
                while (i10 <= iH3) {
                    b10.r(12);
                    if (i10 == 0) {
                        iH4 = b10.h(5);
                        zG = z10;
                        if (iH4 > 7) {
                            zG = b10.g();
                        }
                    } else {
                        zG = z10;
                        if (b10.h(5) > 7) {
                            b10.q();
                            zG = z10;
                        }
                    }
                    if (this.f5218b) {
                        b10.q();
                    }
                    if (this.f5226j && b10.g()) {
                        if (i10 == 0) {
                            iH = b10.h(4);
                        } else {
                            b10.r(4);
                        }
                    }
                    i10++;
                    z10 = zG;
                }
                iH2 = iH4;
                r82 = z10;
            }
            int iH5 = b10.h(4);
            int iH6 = b10.h(4);
            b10.r(iH5 + 1);
            b10.r(iH6 + 1);
            if (this.f5217a) {
                this.f5219c = false;
            } else {
                this.f5219c = b10.g();
            }
            if (this.f5219c) {
                b10.r(4);
                b10.r(3);
            }
            b10.r(3);
            if (this.f5217a) {
                this.f5221e = true;
                this.f5220d = true;
                this.f5222f = 0;
            } else {
                b10.r(4);
                boolean zG4 = b10.g();
                if (zG4) {
                    b10.r(2);
                }
                if (b10.g()) {
                    this.f5220d = true;
                } else {
                    this.f5220d = b10.g();
                }
                if (!this.f5220d || b10.g()) {
                    this.f5221e = true;
                } else {
                    this.f5221e = b10.g();
                }
                if (zG4) {
                    this.f5222f = b10.h(3) + 1;
                } else {
                    this.f5222f = 0;
                }
            }
            this.f5224h = iH2;
            this.f5225i = r82;
            this.f5227k = iH;
            b10.r(3);
            boolean zG5 = b10.g();
            this.f5228l = zG5;
            if (this.f5223g == 2 && zG5) {
                this.f5229m = b10.g();
            } else {
                this.f5229m = false;
            }
            if (this.f5223g != 1) {
                this.f5230n = b10.g();
            } else {
                this.f5230n = false;
            }
            if (b10.g()) {
                this.f5234r = (byte) b10.h(8);
                this.f5235s = (byte) b10.h(8);
                this.f5236t = (byte) b10.h(8);
            } else {
                this.f5234r = (byte) 0;
                this.f5235s = (byte) 0;
                this.f5236t = (byte) 0;
            }
            if (this.f5230n) {
                b10.q();
                this.f5231o = false;
                this.f5232p = false;
                this.f5233q = 0;
            } else if (this.f5234r == 1 && this.f5235s == 13 && this.f5236t == 0) {
                this.f5231o = false;
                this.f5232p = false;
                this.f5233q = 0;
            } else {
                b10.q();
                int i11 = this.f5223g;
                if (i11 == 0) {
                    this.f5231o = true;
                    this.f5232p = true;
                } else if (i11 == 1) {
                    this.f5231o = false;
                    this.f5232p = false;
                } else if (this.f5229m) {
                    boolean zG6 = b10.g();
                    this.f5231o = zG6;
                    if (zG6) {
                        this.f5232p = b10.g();
                    } else {
                        this.f5232p = false;
                    }
                } else {
                    this.f5231o = true;
                    this.f5232p = false;
                }
                if (this.f5231o && this.f5232p) {
                    this.f5233q = b10.h(2);
                } else {
                    this.f5233q = 0;
                }
            }
            b10.q();
        }

        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        public static void b(B b10) {
            b10.r(64);
            if (b10.g()) {
                h.d(b10);
            }
        }
    }

    public static int c(ByteBuffer byteBuffer) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            byte b10 = byteBuffer.get();
            i10 |= (b10 & 127) << (i11 * 7);
            if ((b10 & 128) == 0) {
                return i10;
            }
        }
        return i10;
    }

    public static void d(B b10) {
        int i10 = 0;
        while (!b10.g()) {
            i10++;
        }
        if (i10 < 32) {
            b10.r(i10);
        }
    }

    public static List e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b10 = byteBufferAsReadOnlyBuffer.get();
            int i10 = (b10 >> 3) & 15;
            if (((b10 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            int iC = ((b10 >> 1) & 1) != 0 ? c(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iC);
            arrayList.add(new d(i10, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iC);
        }
        return arrayList;
    }

    public static void f(boolean z10) throws c {
        if (z10) {
            throw new c();
        }
    }
}
