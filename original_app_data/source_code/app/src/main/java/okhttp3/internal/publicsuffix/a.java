package okhttp3.internal.publicsuffix;

import Ae.h;
import Fe.A;
import Fe.AbstractC0849k;
import Fe.InterfaceC0845g;
import Fe.p;
import Fe.v;
import Nd.t;
import Od.C1823c;
import Od.F;
import fc.C4015H;
import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import qe.m;
import sc.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0555a f41569g = new C0555a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final A f41570h = A.a.e(A.f4048b, "/okhttp3/internal/publicsuffix/" + a.class.getSimpleName() + ".gz", false, 1, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f41571i = {42};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f41572j = C4205s.d("*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f41573k = new a(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f41574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0849k f41575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f41576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CountDownLatch f41577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f41578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f41579f;

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0555a {
        public /* synthetic */ C0555a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            int iB;
            boolean z10;
            int iB2;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iB = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iB = m.b(bArr2[i17][i18], 255);
                        z10 = z12;
                    }
                    iB2 = iB - m.b(bArr[i14 + i19], 255);
                    if (iB2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iB2 >= 0) {
                    if (iB2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                return new String(bArr, i14, i16, C1823c.f12394b);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i13;
            }
            return null;
        }

        public final a c() {
            return a.f41573k;
        }

        public C0555a() {
        }
    }

    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List b(List list) {
        String str;
        String strB;
        String str2;
        List listK;
        List listK2;
        if (this.f41576c.get() || !this.f41576c.compareAndSet(false, true)) {
            try {
                this.f41577d.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.f41578e == null) {
            throw new IllegalStateException(("Unable to load " + f41570h + " resource from the classpath.").toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 < size; i10++) {
            byte[] bytes = ((String) list.get(i10)).getBytes(C1823c.f12394b);
            AbstractC4862t.d(bytes, "getBytes(...)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strB = null;
                break;
            }
            C0555a c0555a = f41569g;
            byte[] bArr2 = this.f41578e;
            if (bArr2 == null) {
                AbstractC4862t.p("publicSuffixListBytes");
                bArr2 = null;
            }
            strB = c0555a.b(bArr2, bArr, i11);
            if (strB != null) {
                break;
            }
            i11++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i12 = 0; i12 < length; i12++) {
                bArr3[i12] = f41571i;
                C0555a c0555a2 = f41569g;
                byte[] bArr4 = this.f41578e;
                if (bArr4 == null) {
                    AbstractC4862t.p("publicSuffixListBytes");
                    bArr4 = null;
                }
                String strB2 = c0555a2.b(bArr4, bArr3, i12);
                if (strB2 != null) {
                    str2 = strB2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i13 = size - 1;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                C0555a c0555a3 = f41569g;
                byte[] bArr5 = this.f41579f;
                if (bArr5 == null) {
                    AbstractC4862t.p("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strB3 = c0555a3.b(bArr5, bArr, i14);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
                i14++;
            }
        }
        if (str != null) {
            return F.H0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strB == null && str2 == null) {
            return f41572j;
        }
        if (strB == null || (listK = F.H0(strB, new char[]{'.'}, false, 0, 6, null)) == null) {
            listK = C4206t.k();
        }
        if (str2 == null || (listK2 = F.H0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listK2 = C4206t.k();
        }
        return listK.size() > listK2.size() ? listK : listK2;
    }

    public final String c(String domain) {
        int size;
        int size2;
        AbstractC4862t.e(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        AbstractC4862t.b(unicode);
        List listF = f(unicode);
        List listB = b(listF);
        if (listF.size() == listB.size() && ((String) listB.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listB.get(0)).charAt(0) == '!') {
            size = listF.size();
            size2 = listB.size();
        } else {
            size = listF.size();
            size2 = listB.size() + 1;
        }
        return t.G(t.x(C4179C.X(f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void d() {
        try {
            InterfaceC0845g interfaceC0845gC = v.c(new p(this.f41575b.q(this.f41574a)));
            try {
                byte[] bArrB0 = interfaceC0845gC.b0(interfaceC0845gC.readInt());
                byte[] bArrB02 = interfaceC0845gC.b0(interfaceC0845gC.readInt());
                C4015H c4015h = C4015H.f34254a;
                c.a(interfaceC0845gC, null);
                synchronized (this) {
                    AbstractC4862t.b(bArrB0);
                    this.f41578e = bArrB0;
                    AbstractC4862t.b(bArrB02);
                    this.f41579f = bArrB02;
                }
            } finally {
            }
        } finally {
            this.f41577d.countDown();
        }
    }

    public final void e() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    h.f493a.g().k("Failed to read public suffix list", 5, e10);
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final List f(String str) {
        List listH0 = F.H0(str, new char[]{'.'}, false, 0, 6, null);
        return AbstractC4862t.a(C4179C.s0(listH0), "") ? C4179C.c0(listH0, 1) : listH0;
    }

    public a(A path, AbstractC0849k fileSystem) {
        AbstractC4862t.e(path, "path");
        AbstractC4862t.e(fileSystem, "fileSystem");
        this.f41574a = path;
        this.f41575b = fileSystem;
        this.f41576c = new AtomicBoolean(false);
        this.f41577d = new CountDownLatch(1);
    }

    public /* synthetic */ a(A a10, AbstractC0849k abstractC0849k, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? f41570h : a10, (i10 & 2) != 0 ? AbstractC0849k.f4140d : abstractC0849k);
    }
}
