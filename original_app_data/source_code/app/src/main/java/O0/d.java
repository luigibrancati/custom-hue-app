package O0;

import N0.d;
import N0.f;
import V0.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.CancellationSignal;
import android.os.Handler;
import b0.t;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import s3.AbstractC5712a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f10751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f10752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Paint f10753c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f.e f10754a;

        public a(f.e eVar) {
            this.f10754a = eVar;
        }

        @Override // V0.g.c
        public void a(int i10) {
            f.e eVar = this.f10754a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // V0.g.c
        public void b(Typeface typeface) {
            f.e eVar = this.f10754a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        AbstractC5712a.b("TypefaceCompat static init");
        f10751a = new f();
        f10752b = new t(16);
        f10753c = null;
        AbstractC5712a.d();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        AbstractC5712a.b("TypefaceCompat.createFromFontInfo");
        try {
            return f10751a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            AbstractC5712a.d();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        AbstractC5712a.b("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f10751a.c(context, cancellationSignal, list, i10);
        } finally {
            AbstractC5712a.d();
        }
    }

    public static Typeface d(Context context, d.b bVar, Resources resources, int i10, String str, int i11, int i12, f.e eVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof d.e) {
            d.e eVar2 = (d.e) bVar;
            Typeface typefaceI = i(eVar2);
            if (typefaceI != null) {
                if (eVar != null) {
                    eVar.d(typefaceI, handler);
                }
                f10752b.f(f(resources, i10, str, i11, i12), typefaceI);
                return typefaceI;
            }
            typefaceA = V0.g.c(context, eVar2.b(), i12, !z10 ? eVar != null : eVar2.a() != 0, z10 ? eVar2.d() : -1, f.e.e(handler), new a(eVar));
        } else {
            typefaceA = f10751a.a(context, (d.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f10752b.f(f(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceD = f10751a.d(context, resources, i10, str, i12);
        if (typefaceD != null) {
            f10752b.f(f(resources, i10, str, i11, i12), typefaceD);
        }
        return typefaceD;
    }

    public static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f10752b.d(f(resources, i10, str, i11, i12));
    }

    public static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        return r0.build();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface i(N0.d.e r9) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.d.i(N0.d$e):android.graphics.Typeface");
    }

    public static Font j(Typeface typeface) {
        if (f10753c == null) {
            f10753c = new Paint();
        }
        f10753c.setTextSize(10.0f);
        f10753c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) StringUtils.SPACE, 0, 1, 0, 1, 0.0f, 0.0f, false, f10753c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
