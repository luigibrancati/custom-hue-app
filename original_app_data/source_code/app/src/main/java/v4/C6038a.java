package v4;

import android.view.View;
import fc.C4034q;
import gc.C4179C;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import s4.C5717c;

/* JADX INFO: renamed from: v4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6038a implements InterfaceC6039b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0624a f45768b = new C0624a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f45769a = new int[2];

    /* JADX INFO: renamed from: v4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0624a {
        public /* synthetic */ C0624a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0624a() {
        }
    }

    /* JADX INFO: renamed from: v4.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f45770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f45771b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z10 = false;
            this(z10, z10, 3, null);
        }

        public final boolean a() {
            return this.f45771b;
        }

        public final boolean b() {
            return this.f45770a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f45770a == bVar.f45770a && this.f45771b == bVar.f45771b;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f45770a) * 31) + Boolean.hashCode(this.f45771b);
        }

        public String toString() {
            return "FrustrationSettings(ignoreRageClick=" + this.f45770a + ", ignoreDeadClick=" + this.f45771b + ')';
        }

        public b(boolean z10, boolean z11) {
            this.f45770a = z10;
            this.f45771b = z11;
        }

        public /* synthetic */ b(boolean z10, boolean z11, int i10, AbstractC4854k abstractC4854k) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
        }
    }

    @Override // v4.InterfaceC6039b
    public C5717c a(Object obj, C4034q targetPosition, C5717c.a targetType) {
        AbstractC4862t.e(obj, "<this>");
        AbstractC4862t.e(targetPosition, "targetPosition");
        AbstractC4862t.e(targetType, "targetType");
        View view = obj instanceof View ? (View) obj : null;
        if (view != null) {
            View view2 = (View) obj;
            if (!f(view2, targetPosition) || targetType != C5717c.a.Clickable || !d(view2)) {
                view = null;
            }
            if (view != null) {
                return b(view2);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s4.C5717c b(android.view.View r12) {
        /*
            r11 = this;
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            if (r0 != 0) goto L12
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L12:
            r3 = r0
            s4.b r0 = s4.C5716b.f44014a
            java.lang.String r4 = r0.b(r12)
            java.lang.String r8 = r11.c(r12)
            java.lang.Object r0 = r12.getTag()
            r1 = 0
            if (r0 == 0) goto L3e
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L36
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 != 0) goto L36
            boolean r2 = r0 instanceof java.lang.Boolean
            if (r2 != 0) goto L36
            boolean r2 = r0 instanceof java.lang.Character
            if (r2 == 0) goto L35
            goto L36
        L35:
            r0 = r1
        L36:
            if (r0 == 0) goto L3e
            java.lang.String r0 = r0.toString()
            r5 = r0
            goto L3f
        L3e:
            r5 = r1
        L3f:
            boolean r0 = r12 instanceof android.widget.Button
            if (r0 == 0) goto L47
            r0 = r12
            android.widget.Button r0 = (android.widget.Button) r0
            goto L48
        L47:
            r0 = r1
        L48:
            if (r0 == 0) goto L54
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L54
            java.lang.String r1 = r0.toString()
        L54:
            r6 = r1
            v4.a$b r11 = r11.e(r12)
            s4.c r1 = new s4.c
            boolean r9 = r11.b()
            boolean r10 = r11.a()
            java.lang.String r7 = "android_view"
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C6038a.b(android.view.View):s4.c");
    }

    public final String c(View view) {
        ArrayList arrayList = new ArrayList();
        while (view != null) {
            String simpleName = view.getClass().getSimpleName();
            AbstractC4862t.d(simpleName, "getSimpleName(...)");
            arrayList.add(simpleName);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return C4179C.q0(arrayList, " → ", null, null, 0, null, null, 62, null);
    }

    public final boolean d(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    public final b e(View view) {
        Object tag = view.getTag(-1989905945);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Object tag2 = view.getTag(-633031234);
        Boolean bool2 = tag2 instanceof Boolean ? (Boolean) tag2 : null;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Object tag3 = view.getTag(457577948);
        Boolean bool3 = tag3 instanceof Boolean ? (Boolean) tag3 : null;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        return new b(zBooleanValue || zBooleanValue3, zBooleanValue2 || zBooleanValue3);
    }

    public final boolean f(View view, C4034q c4034q) {
        float fFloatValue = ((Number) c4034q.a()).floatValue();
        float fFloatValue2 = ((Number) c4034q.b()).floatValue();
        view.getLocationOnScreen(this.f45769a);
        int[] iArr = this.f45769a;
        int i10 = iArr[0];
        int i11 = iArr[1];
        return fFloatValue >= ((float) i10) && fFloatValue <= ((float) (i10 + view.getWidth())) && fFloatValue2 >= ((float) i11) && fFloatValue2 <= ((float) (i11 + view.getHeight()));
    }
}
