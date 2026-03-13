package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l.AbstractC4864a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u3.AbstractC5912b;

/* JADX INFO: renamed from: p.O, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5336O {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static C5336O f41853i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f41855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0.J f41856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0.K f41857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f41858d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f41859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f41861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f41852h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f41854j = new a(6);

    /* JADX INFO: renamed from: p.O$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends b0.t {
        public a(int i10) {
            super(i10);
        }

        public static int m(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter n(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) d(Integer.valueOf(m(i10, mode)));
        }

        public PorterDuffColorFilter o(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) f(Integer.valueOf(m(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: renamed from: p.O$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: renamed from: p.O$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        Drawable a(C5336O c5336o, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    public static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized C5336O g() {
        try {
            if (f41853i == null) {
                C5336O c5336o = new C5336O();
                f41853i = c5336o;
                o(c5336o);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f41853i;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterN;
        a aVar = f41854j;
        porterDuffColorFilterN = aVar.n(i10, mode);
        if (porterDuffColorFilterN == null) {
            porterDuffColorFilterN = new PorterDuffColorFilter(i10, mode);
            aVar.o(i10, mode, porterDuffColorFilterN);
        }
        return porterDuffColorFilterN;
    }

    public static boolean p(Drawable drawable) {
        return (drawable instanceof AbstractC5912b) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void v(Drawable drawable, U u10, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = u10.f41888d;
        if (z10 || u10.f41887c) {
            drawable.setColorFilter(f(z10 ? u10.f41885a : null, u10.f41887c ? u10.f41886b : f41852h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public final synchronized boolean a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            b0.r rVar = (b0.r) this.f41858d.get(context);
            if (rVar == null) {
                rVar = new b0.r();
                this.f41858d.put(context, rVar);
            }
            rVar.m(j10, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f41855a == null) {
            this.f41855a = new WeakHashMap();
        }
        b0.K k10 = (b0.K) this.f41855a.get(context);
        if (k10 == null) {
            k10 = new b0.K();
            this.f41855a.put(context, k10);
        }
        k10.a(i10, colorStateList);
    }

    public final void c(Context context) {
        if (this.f41860f) {
            return;
        }
        this.f41860f = true;
        Drawable drawableI = i(context, AbstractC4864a.f39798a);
        if (drawableI == null || !p(drawableI)) {
            this.f41860f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable e(Context context, int i10) {
        if (this.f41859e == null) {
            this.f41859e = new TypedValue();
        }
        TypedValue typedValue = this.f41859e;
        context.getResources().getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f41861g;
        Drawable drawableA = cVar == null ? null : cVar.a(this, context, i10);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableA);
        }
        return drawableA;
    }

    public final synchronized Drawable h(Context context, long j10) {
        b0.r rVar = (b0.r) this.f41858d.get(context);
        if (rVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) rVar.g(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            rVar.n(j10);
        }
        return null;
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    public synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = e(context, i10);
            }
            if (drawableQ == null) {
                drawableQ = L0.a.f(context, i10);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i10, z10, drawableQ);
            }
            if (drawableQ != null) {
                AbstractC5329H.b(drawableQ);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableQ;
    }

    public synchronized ColorStateList l(Context context, int i10) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            c cVar = this.f41861g;
            colorStateListM = cVar == null ? null : cVar.b(context, i10);
            if (colorStateListM != null) {
                b(context, i10, colorStateListM);
            }
        }
        return colorStateListM;
    }

    public final ColorStateList m(Context context, int i10) {
        b0.K k10;
        WeakHashMap weakHashMap = this.f41855a;
        if (weakHashMap == null || (k10 = (b0.K) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) k10.i(i10);
    }

    public PorterDuff.Mode n(int i10) {
        c cVar = this.f41861g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i10);
    }

    public final Drawable q(Context context, int i10) {
        int next;
        b0.J j10 = this.f41856b;
        if (j10 == null || j10.isEmpty()) {
            return null;
        }
        b0.K k10 = this.f41857c;
        if (k10 != null) {
            String str = (String) k10.i(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f41856b.get(str) == null)) {
                return null;
            }
        } else {
            this.f41857c = new b0.K();
        }
        if (this.f41859e == null) {
            this.f41859e = new TypedValue();
        }
        TypedValue typedValue = this.f41859e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f41857c.a(i10, name);
                b bVar = (b) this.f41856b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableH == null) {
            this.f41857c.a(i10, "appcompat_skip_skip");
        }
        return drawableH;
    }

    public synchronized void r(Context context) {
        b0.r rVar = (b0.r) this.f41858d.get(context);
        if (rVar != null) {
            rVar.a();
        }
    }

    public synchronized Drawable s(Context context, b0 b0Var, int i10) {
        try {
            Drawable drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = b0Var.a(i10);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i10, false, drawableQ);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.f41861g = cVar;
    }

    public final Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i10);
        if (colorStateListL != null) {
            Drawable drawableL = P0.a.l(drawable.mutate());
            P0.a.i(drawableL, colorStateListL);
            PorterDuff.Mode modeN = n(i10);
            if (modeN != null) {
                P0.a.j(drawableL, modeN);
            }
            return drawableL;
        }
        c cVar = this.f41861g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    public boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f41861g;
        return cVar != null && cVar.c(context, i10, drawable);
    }

    public static void o(C5336O c5336o) {
    }
}
