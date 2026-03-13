package p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.ar.core.ImageMetadata;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: p.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5325D {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f41758l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static ConcurrentHashMap f41759m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f41767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f41768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f41769j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41760a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41761b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f41762c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f41763d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f41764e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f41765f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41766g = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f41770k = new c();

    /* JADX INFO: renamed from: p.D$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: renamed from: p.D$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends d {
    }

    /* JADX INFO: renamed from: p.D$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends b {
        @Override // p.C5325D.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // p.C5325D.d
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: renamed from: p.D$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {
        public abstract void a(StaticLayout.Builder builder, TextView textView);

        public abstract boolean b(TextView textView);
    }

    public C5325D(TextView textView) {
        this.f41768i = textView;
        this.f41769j = textView.getContext();
    }

    public static Method k(String str) {
        try {
            Method declaredMethod = (Method) f41759m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f41759m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public void a() {
        if (n()) {
            if (this.f41761b) {
                if (this.f41768i.getMeasuredHeight() <= 0 || this.f41768i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f41770k.b(this.f41768i) ? ImageMetadata.SHADING_MODE : (this.f41768i.getMeasuredWidth() - this.f41768i.getTotalPaddingLeft()) - this.f41768i.getTotalPaddingRight();
                int height = (this.f41768i.getHeight() - this.f41768i.getCompoundPaddingBottom()) - this.f41768i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f41758l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f41768i.getTextSize()) {
                            t(0, fE);
                        }
                    } finally {
                    }
                }
            }
            this.f41761b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final void c() {
        this.f41760a = 0;
        this.f41763d = -1.0f;
        this.f41764e = -1.0f;
        this.f41762c = -1.0f;
        this.f41765f = new int[0];
        this.f41761b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f41768i, this.f41767h, this.f41770k);
    }

    public final int e(RectF rectF) {
        int length = this.f41765f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f41765f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f41765f[i12];
    }

    public int f() {
        return Math.round(this.f41764e);
    }

    public int g() {
        return Math.round(this.f41763d);
    }

    public int h() {
        return Math.round(this.f41762c);
    }

    public int[] i() {
        return this.f41765f;
    }

    public int j() {
        return this.f41760a;
    }

    public void l(int i10) {
        TextPaint textPaint = this.f41767h;
        if (textPaint == null) {
            this.f41767h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f41767h.set(this.f41768i.getPaint());
        this.f41767h.setTextSize(i10);
    }

    public boolean n() {
        return y() && this.f41760a != 0;
    }

    public void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f41769j.obtainStyledAttributes(attributeSet, h.j.f36077g0, i10, 0);
        TextView textView = this.f41768i;
        Y0.E.d0(textView, textView.getContext(), h.j.f36077g0, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        if (typedArrayObtainStyledAttributes.hasValue(h.j.f36102l0)) {
            this.f41760a = typedArrayObtainStyledAttributes.getInt(h.j.f36102l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(h.j.f36097k0) ? typedArrayObtainStyledAttributes.getDimension(h.j.f36097k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(h.j.f36087i0) ? typedArrayObtainStyledAttributes.getDimension(h.j.f36087i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(h.j.f36082h0) ? typedArrayObtainStyledAttributes.getDimension(h.j.f36082h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(h.j.f36092j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(h.j.f36092j0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f41760a = 0;
            return;
        }
        if (this.f41760a == 1) {
            if (!this.f41766g) {
                DisplayMetrics displayMetrics = this.f41769j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    public void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f41769j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    public void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f41769j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f41765f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f41766g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    public void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f41769j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    public final void s(float f10) {
        if (f10 != this.f41768i.getPaint().getTextSize()) {
            this.f41768i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f41768i.isInLayout();
            if (this.f41768i.getLayout() != null) {
                this.f41761b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f41768i, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f41768i.forceLayout();
                } else {
                    this.f41768i.requestLayout();
                }
                this.f41768i.invalidate();
            }
        }
    }

    public void t(int i10, float f10) {
        Context context = this.f41769j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean u() {
        if (y() && this.f41760a == 1) {
            if (!this.f41766g || this.f41765f.length == 0) {
                int iFloor = ((int) Math.floor((this.f41764e - this.f41763d) / this.f41762c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f41763d + (i10 * this.f41762c));
                }
                this.f41765f = b(iArr);
            }
            this.f41761b = true;
        } else {
            this.f41761b = false;
        }
        return this.f41761b;
    }

    public final void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f41765f = b(iArr);
            w();
        }
    }

    public final boolean w() {
        boolean z10 = this.f41765f.length > 0;
        this.f41766g = z10;
        if (z10) {
            this.f41760a = 1;
            this.f41763d = r0[0];
            this.f41764e = r0[r1 - 1];
            this.f41762c = -1.0f;
        }
        return z10;
    }

    public final boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f41768i.getText();
        TransformationMethod transformationMethod = this.f41768i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f41768i)) != null) {
            text = transformation;
        }
        int maxLines = this.f41768i.getMaxLines();
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f41768i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    public final boolean y() {
        return !(this.f41768i instanceof C5349k);
    }

    public final void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f41760a = 1;
        this.f41763d = f10;
        this.f41764e = f11;
        this.f41762c = f12;
        this.f41766g = false;
    }
}
