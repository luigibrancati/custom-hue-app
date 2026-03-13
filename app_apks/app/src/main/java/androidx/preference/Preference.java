package androidx.preference;

import N0.i;
import T2.c;
import T2.e;
import T2.g;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f23918A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f23919B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public b f23920C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final View.OnClickListener f23921D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T2.a f23923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f23926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f23927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f23929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Intent f23930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f23931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f23935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f23936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f23938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f23940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f23941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f23942u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23943v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f23944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f23945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f23946y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f23947z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.M(view);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f23924c = Integer.MAX_VALUE;
        this.f23925d = 0;
        this.f23932k = true;
        this.f23933l = true;
        this.f23934m = true;
        this.f23937p = true;
        this.f23938q = true;
        this.f23939r = true;
        this.f23940s = true;
        this.f23941t = true;
        this.f23943v = true;
        this.f23946y = true;
        this.f23947z = e.f16077a;
        this.f23921D = new a();
        this.f23922a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f16095I, i10, i11);
        this.f23928g = i.e(typedArrayObtainStyledAttributes, g.f16149g0, g.f16097J, 0);
        this.f23929h = i.f(typedArrayObtainStyledAttributes, g.f16155j0, g.f16109P);
        this.f23926e = i.g(typedArrayObtainStyledAttributes, g.f16171r0, g.f16105N);
        this.f23927f = i.g(typedArrayObtainStyledAttributes, g.f16169q0, g.f16111Q);
        this.f23924c = i.d(typedArrayObtainStyledAttributes, g.f16159l0, g.f16113R, Integer.MAX_VALUE);
        this.f23931j = i.f(typedArrayObtainStyledAttributes, g.f16147f0, g.f16123W);
        this.f23947z = i.e(typedArrayObtainStyledAttributes, g.f16157k0, g.f16103M, e.f16077a);
        this.f23918A = i.e(typedArrayObtainStyledAttributes, g.f16173s0, g.f16115S, 0);
        this.f23932k = i.b(typedArrayObtainStyledAttributes, g.f16144e0, g.f16101L, true);
        this.f23933l = i.b(typedArrayObtainStyledAttributes, g.f16163n0, g.f16107O, true);
        this.f23934m = i.b(typedArrayObtainStyledAttributes, g.f16161m0, g.f16099K, true);
        this.f23935n = i.f(typedArrayObtainStyledAttributes, g.f16138c0, g.f16117T);
        int i12 = g.f16129Z;
        this.f23940s = i.b(typedArrayObtainStyledAttributes, i12, i12, this.f23933l);
        int i13 = g.f16132a0;
        this.f23941t = i.b(typedArrayObtainStyledAttributes, i13, i13, this.f23933l);
        if (typedArrayObtainStyledAttributes.hasValue(g.f16135b0)) {
            this.f23936o = J(typedArrayObtainStyledAttributes, g.f16135b0);
        } else if (typedArrayObtainStyledAttributes.hasValue(g.f16119U)) {
            this.f23936o = J(typedArrayObtainStyledAttributes, g.f16119U);
        }
        this.f23946y = i.b(typedArrayObtainStyledAttributes, g.f16165o0, g.f16121V, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(g.f16167p0);
        this.f23942u = zHasValue;
        if (zHasValue) {
            this.f23943v = i.b(typedArrayObtainStyledAttributes, g.f16167p0, g.f16125X, true);
        }
        this.f23944w = i.b(typedArrayObtainStyledAttributes, g.f16151h0, g.f16127Y, false);
        int i14 = g.f16153i0;
        this.f23939r = i.b(typedArrayObtainStyledAttributes, i14, i14, true);
        int i15 = g.f16141d0;
        this.f23945x = i.b(typedArrayObtainStyledAttributes, i15, i15, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final b A() {
        return this.f23920C;
    }

    public CharSequence B() {
        return this.f23926e;
    }

    public boolean C() {
        return !TextUtils.isEmpty(this.f23929h);
    }

    public boolean D() {
        return this.f23932k && this.f23937p && this.f23938q;
    }

    public boolean E() {
        return this.f23933l;
    }

    public void G(boolean z10) {
        List list = this.f23919B;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Preference) list.get(i10)).I(this, z10);
        }
    }

    public void I(Preference preference, boolean z10) {
        if (this.f23937p == z10) {
            this.f23937p = !z10;
            G(R());
            F();
        }
    }

    public Object J(TypedArray typedArray, int i10) {
        return null;
    }

    public void K(Preference preference, boolean z10) {
        if (this.f23938q == z10) {
            this.f23938q = !z10;
            G(R());
            F();
        }
    }

    public void L() {
        if (D() && E()) {
            H();
            y();
            if (this.f23930i != null) {
                j().startActivity(this.f23930i);
            }
        }
    }

    public void M(View view) {
        L();
    }

    public boolean N(boolean z10) {
        if (!S()) {
            return false;
        }
        if (z10 == u(!z10)) {
            return true;
        }
        T2.a aVarX = x();
        aVarX.getClass();
        aVarX.d(this.f23929h, z10);
        return true;
    }

    public boolean O(int i10) {
        if (!S()) {
            return false;
        }
        if (i10 == v(~i10)) {
            return true;
        }
        T2.a aVarX = x();
        aVarX.getClass();
        aVarX.e(this.f23929h, i10);
        return true;
    }

    public boolean P(String str) {
        if (!S()) {
            return false;
        }
        if (TextUtils.equals(str, w(null))) {
            return true;
        }
        T2.a aVarX = x();
        aVarX.getClass();
        aVarX.f(this.f23929h, str);
        return true;
    }

    public final void Q(b bVar) {
        this.f23920C = bVar;
        F();
    }

    public boolean R() {
        return !D();
    }

    public boolean S() {
        return false;
    }

    public boolean a(Object obj) {
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i10 = this.f23924c;
        int i11 = preference.f23924c;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f23926e;
        CharSequence charSequence2 = preference.f23926e;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f23926e.toString());
    }

    public Context j() {
        return this.f23922a;
    }

    public StringBuilder p() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequenceB = B();
        if (!TextUtils.isEmpty(charSequenceB)) {
            sb2.append(charSequenceB);
            sb2.append(' ');
        }
        CharSequence charSequenceZ = z();
        if (!TextUtils.isEmpty(charSequenceZ)) {
            sb2.append(charSequenceZ);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    public String q() {
        return this.f23931j;
    }

    public Intent s() {
        return this.f23930i;
    }

    public String toString() {
        return p().toString();
    }

    public boolean u(boolean z10) {
        if (!S()) {
            return z10;
        }
        T2.a aVarX = x();
        aVarX.getClass();
        return aVarX.a(this.f23929h, z10);
    }

    public int v(int i10) {
        if (!S()) {
            return i10;
        }
        T2.a aVarX = x();
        aVarX.getClass();
        return aVarX.b(this.f23929h, i10);
    }

    public String w(String str) {
        if (!S()) {
            return str;
        }
        T2.a aVarX = x();
        aVarX.getClass();
        return aVarX.c(this.f23929h, str);
    }

    public T2.a x() {
        T2.a aVar = this.f23923b;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public T2.b y() {
        return null;
    }

    public CharSequence z() {
        return A() != null ? A().a(this) : this.f23927f;
    }

    public void F() {
    }

    public void H() {
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f16072g, R.attr.preferenceStyle));
    }
}
