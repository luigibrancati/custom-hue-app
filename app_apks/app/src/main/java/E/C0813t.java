package E;

import L.AbstractC1124t0;
import L.C1092d;
import gc.C4179C;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: E.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0813t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3022c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1124t0 f3024b;

    /* JADX INFO: renamed from: E.t$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ C0813t d(a aVar, String str, String str2, AbstractC1124t0 abstractC1124t0, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                abstractC1124t0 = null;
            }
            return aVar.b(str, str2, abstractC1124t0);
        }

        public final C0813t a(String primaryCameraId) {
            AbstractC4862t.e(primaryCameraId, "primaryCameraId");
            return d(this, primaryCameraId, null, null, 6, null);
        }

        public final C0813t b(String primaryCameraId, String str, AbstractC1124t0 abstractC1124t0) {
            AbstractC4862t.e(primaryCameraId, "primaryCameraId");
            List listQ = C4206t.q(primaryCameraId);
            if (str != null) {
                listQ.add(str);
            }
            return c(listQ, abstractC1124t0);
        }

        public final C0813t c(List cameraIds, AbstractC1124t0 abstractC1124t0) {
            AbstractC4862t.e(cameraIds, "cameraIds");
            return new C0813t(cameraIds, abstractC1124t0, null);
        }

        public final C0813t e(C1092d primaryInfo, C1092d c1092d) {
            AbstractC4862t.e(primaryInfo, "primaryInfo");
            String strD = c1092d != null ? c1092d.d() : null;
            AbstractC1124t0 abstractC1124t0W = primaryInfo.s().W();
            AbstractC4862t.d(abstractC1124t0W, "getCompatibilityId(...)");
            String strD2 = primaryInfo.d();
            AbstractC4862t.d(strD2, "getCameraId(...)");
            return b(strD2, strD, abstractC1124t0W);
        }

        public a() {
        }
    }

    public /* synthetic */ C0813t(List list, AbstractC1124t0 abstractC1124t0, AbstractC4854k abstractC4854k) {
        this(list, abstractC1124t0);
    }

    public static final C0813t a(String str) {
        return f3022c.a(str);
    }

    public static final C0813t b(C1092d c1092d, C1092d c1092d2) {
        return f3022c.e(c1092d, c1092d2);
    }

    public final String c() {
        X0.h.j(this.f3023a.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (String) C4179C.h0(this.f3023a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0813t)) {
            return false;
        }
        C0813t c0813t = (C0813t) obj;
        return AbstractC4862t.a(this.f3023a, c0813t.f3023a) && AbstractC4862t.a(this.f3024b, c0813t.f3024b);
    }

    public int hashCode() {
        int iHashCode = this.f3023a.hashCode() * 31;
        AbstractC1124t0 abstractC1124t0 = this.f3024b;
        return iHashCode + (abstractC1124t0 != null ? abstractC1124t0.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CameraIdentifier{cameraIds="
            r0.append(r1)
            java.util.List r2 = r11.f3023a
            r9 = 62
            r10 = 0
            java.lang.String r3 = ","
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r1 = gc.C4179C.q0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.append(r1)
            L.t0 r11 = r11.f3024b
            if (r11 == 0) goto L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ", compatId="
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            if (r11 != 0) goto L36
        L34:
            java.lang.String r11 = ""
        L36:
            r0.append(r11)
            r11 = 125(0x7d, float:1.75E-43)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: E.C0813t.toString():java.lang.String");
    }

    public C0813t(List list, AbstractC1124t0 abstractC1124t0) {
        this.f3023a = list;
        this.f3024b = abstractC1124t0;
        X0.h.b(!list.isEmpty(), "Camera ID set cannot be empty.");
    }
}
