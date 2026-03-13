package androidx.compose.ui.semantics;

import b0.AbstractC2776G;
import b0.C2771B;
import b0.C2772C;
import b0.I;
import fc.InterfaceC4023f;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import wc.InterfaceC6184a;
import x0.C6281a;
import x0.C6288h;
import x0.InterfaceC6289i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class SemanticsConfiguration implements InterfaceC6289i, Iterable, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2771B f22174a = AbstractC2776G.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f22175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2772C f22176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22178e;

    @Override // x0.InterfaceC6289i
    public void c(C6288h c6288h, Object obj) {
        if ((obj instanceof C6281a) && d(c6288h)) {
            Object objD = this.f22174a.d(c6288h);
            AbstractC4862t.c(objD, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            C6281a c6281a = (C6281a) objD;
            C2771B c2771b = this.f22174a;
            C6281a c6281a2 = (C6281a) obj;
            String strB = c6281a2.b();
            if (strB == null) {
                strB = c6281a.b();
            }
            InterfaceC4023f interfaceC4023fA = c6281a2.a();
            if (interfaceC4023fA == null) {
                interfaceC4023fA = c6281a.a();
            }
            c2771b.s(c6288h, new C6281a(strB, interfaceC4023fA));
        } else {
            this.f22174a.s(c6288h, obj);
        }
        if (c6288h.a() != null) {
            if (this.f22176c == null) {
                this.f22176c = I.a();
            }
            C2772C c2772c = this.f22176c;
            if (c2772c != null) {
                c2772c.f(c6288h);
            }
        }
    }

    public final boolean d(C6288h c6288h) {
        return this.f22174a.b(c6288h);
    }

    public final Object e(C6288h c6288h, InterfaceC6082a interfaceC6082a) {
        Object objD = this.f22174a.d(c6288h);
        return objD == null ? interfaceC6082a.invoke() : objD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return AbstractC4862t.a(this.f22174a, semanticsConfiguration.f22174a) && this.f22177d == semanticsConfiguration.f22177d && this.f22178e == semanticsConfiguration.f22178e;
    }

    public int hashCode() {
        return (((this.f22174a.hashCode() * 31) + Boolean.hashCode(this.f22177d)) * 31) + Boolean.hashCode(this.f22178e);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map mapA = this.f22175b;
        if (mapA == null) {
            mapA = this.f22174a.a();
            this.f22175b = mapA;
        }
        return mapA.entrySet().iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[PHI: r4
      0x007b: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v5 java.lang.String) binds: [B:12:0x0042, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f22177d
            java.lang.String r3 = ", "
            java.lang.String r4 = ""
            if (r2 == 0) goto L18
            r1.append(r4)
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r4 = r3
        L18:
            boolean r2 = r0.f22178e
            if (r2 == 0) goto L25
            r1.append(r4)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r4 = r3
        L25:
            b0.B r2 = r0.f22174a
            java.lang.Object[] r5 = r2.f24839b
            java.lang.Object[] r6 = r2.f24840c
            long[] r2 = r2.f24838a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L80
            r8 = 0
            r9 = r8
        L34:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L7b
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L4e:
            if (r14 >= r12) goto L79
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L75
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            x0.h r16 = (x0.C6288h) r16
            r1.append(r4)
            java.lang.String r4 = r16.b()
            r1.append(r4)
            java.lang.String r4 = " : "
            r1.append(r4)
            r1.append(r15)
            r4 = r3
        L75:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4e
        L79:
            if (r12 != r13) goto L80
        L7b:
            if (r9 == r7) goto L80
            int r9 = r9 + 1
            goto L34
        L80:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            java.lang.String r0 = w0.AbstractC6114a.a(r0, r3)
            r2.append(r0)
            java.lang.String r0 = "{ "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsConfiguration.toString():java.lang.String");
    }
}
