package androidx.constraintlayout.widget;

import F0.e;
import F0.f;
import F0.g;
import G0.b;
import H0.d;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.flutter.Build;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f22182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f22183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f22184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.constraintlayout.widget.c f22191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public H0.a f22192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashMap f22194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22195n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22198q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22200s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SparseArray f22201t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public H0.b f22202u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f22203v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22204w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22205x;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22206a;

        static {
            int[] iArr = new int[e.b.values().length];
            f22206a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22206a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22206a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22206a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements b.InterfaceC0066b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintLayout f22275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22280f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22281g;

        public c(ConstraintLayout constraintLayout) {
            this.f22275a = constraintLayout;
        }

        @Override // G0.b.InterfaceC0066b
        public final void a() {
            int childCount = this.f22275a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f22275a.getChildAt(i10);
            }
            int size = this.f22275a.f22183b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f22275a.f22183b.get(i11)).h(this.f22275a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0180 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01f2  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0231  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x016e  */
        @Override // G0.b.InterfaceC0066b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(F0.e r20, G0.b.a r21) {
            /*
                Method dump skipped, instruction units count: 592
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(F0.e, G0.b$a):void");
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f22276b = i12;
            this.f22277c = i13;
            this.f22278d = i14;
            this.f22279e = i15;
            this.f22280f = i10;
            this.f22281g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22182a = new SparseArray();
        this.f22183b = new ArrayList(4);
        this.f22184c = new f();
        this.f22185d = 0;
        this.f22186e = 0;
        this.f22187f = Integer.MAX_VALUE;
        this.f22188g = Integer.MAX_VALUE;
        this.f22189h = true;
        this.f22190i = 263;
        this.f22191j = null;
        this.f22192k = null;
        this.f22193l = -1;
        this.f22194m = new HashMap();
        this.f22195n = -1;
        this.f22196o = -1;
        this.f22197p = -1;
        this.f22198q = -1;
        this.f22199r = 0;
        this.f22200s = 0;
        this.f22201t = new SparseArray();
        this.f22203v = new c(this);
        this.f22204w = 0;
        this.f22205x = 0;
        j(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(boolean r17, android.view.View r18, F0.e r19, androidx.constraintlayout.widget.ConstraintLayout.b r20, android.util.SparseArray r21) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c(boolean, android.view.View, F0.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f22183b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.constraintlayout.widget.b) this.f22183b.get(i10)).i(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f22194m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f22194m.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public final e g(int i10) {
        if (i10 == 0) {
            return this.f22184c;
        }
        View viewFindViewById = (View) this.f22182a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f22184c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f22260n0;
    }

    public int getMaxHeight() {
        return this.f22188g;
    }

    public int getMaxWidth() {
        return this.f22187f;
    }

    public int getMinHeight() {
        return this.f22186e;
    }

    public int getMinWidth() {
        return this.f22185d;
    }

    public int getOptimizationLevel() {
        return this.f22184c.S0();
    }

    public View h(int i10) {
        return (View) this.f22182a.get(i10);
    }

    public final e i(View view) {
        if (view == this) {
            return this.f22184c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f22260n0;
    }

    public final void j(AttributeSet attributeSet, int i10, int i11) {
        this.f22184c.Z(this);
        this.f22184c.b1(this.f22203v);
        this.f22182a.put(getId(), this);
        this.f22191j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f4960a1, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == d.f4984e1) {
                    this.f22185d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22185d);
                } else if (index == d.f4990f1) {
                    this.f22186e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22186e);
                } else if (index == d.f4972c1) {
                    this.f22187f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22187f);
                } else if (index == d.f4978d1) {
                    this.f22188g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22188g);
                } else if (index == d.f5021k2) {
                    this.f22190i = typedArrayObtainStyledAttributes.getInt(index, this.f22190i);
                } else if (index == d.f5026l1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f22192k = null;
                        }
                    }
                } else if (index == d.f5014j1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f22191j = cVar;
                        cVar.l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f22191j = null;
                    }
                    this.f22193l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f22184c.c1(this.f22190i);
    }

    public boolean k() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public final void l() {
        this.f22189h = true;
        this.f22195n = -1;
        this.f22196o = -1;
        this.f22197p = -1;
        this.f22198q = -1;
        this.f22199r = 0;
        this.f22200s = 0;
    }

    public void m(int i10) {
        this.f22192k = new H0.a(getContext(), this, i10);
    }

    public void n(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f22203v;
        int i14 = cVar.f22279e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f22278d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f22187f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f22188g, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f22195n = iMin;
        this.f22196o = iMin2;
    }

    public void o(f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f22203v.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (k()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            r(fVar, mode, i15, mode2, i16);
            fVar.Y0(i10, mode, i15, mode2, i16, this.f22195n, this.f22196o, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i152 = size - paddingWidth;
        int i162 = size2 - i14;
        r(fVar, mode, i152, mode2, i162);
        fVar.Y0(i10, mode, i152, mode2, i162, this.f22195n, this.f22196o, i13, iMax);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            e eVar = bVar.f22260n0;
            if ((childAt.getVisibility() != 8 || bVar.f22232Z || bVar.f22234a0 || bVar.f22238c0 || zIsInEditMode) && !bVar.f22236b0) {
                int iO = eVar.O();
                int iP = eVar.P();
                childAt.layout(iO, iP, eVar.N() + iO, eVar.t() + iP);
            }
        }
        int size = this.f22183b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((androidx.constraintlayout.widget.b) this.f22183b.get(i15)).g(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.f22204w = i10;
        this.f22205x = i11;
        this.f22184c.d1(k());
        if (this.f22189h) {
            this.f22189h = false;
            if (s()) {
                this.f22184c.f1();
            }
        }
        o(this.f22184c, this.f22190i, i10, i11);
        n(i10, i11, this.f22184c.N(), this.f22184c.t(), this.f22184c.X0(), this.f22184c.V0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e eVarI = i(view);
        if ((view instanceof Guideline) && !(eVarI instanceof g)) {
            b bVar = (b) view.getLayoutParams();
            g gVar = new g();
            bVar.f22260n0 = gVar;
            bVar.f22232Z = true;
            gVar.O0(bVar.f22225S);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.k();
            ((b) view.getLayoutParams()).f22234a0 = true;
            if (!this.f22183b.contains(bVar2)) {
                this.f22183b.add(bVar2);
            }
        }
        this.f22182a.put(view.getId(), view);
        this.f22189h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f22182a.remove(view.getId());
        this.f22184c.I0(i(view));
        this.f22183b.remove(view);
        this.f22189h = true;
    }

    public final void p() {
        ConstraintLayout constraintLayout;
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            e eVarI = i(getChildAt(i10));
            if (eVarI != null) {
                eVarI.W();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    g(childAt.getId()).a0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f22193l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).getId();
            }
        }
        androidx.constraintlayout.widget.c cVar = this.f22191j;
        if (cVar != null) {
            cVar.d(this, true);
        }
        this.f22184c.J0();
        int size = this.f22183b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.constraintlayout.widget.b) this.f22183b.get(i13)).j(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14);
        }
        this.f22201t.clear();
        this.f22201t.put(0, this.f22184c);
        this.f22201t.put(getId(), this.f22184c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            this.f22201t.put(childAt2.getId(), i(childAt2));
        }
        int i16 = 0;
        while (i16 < childCount) {
            View childAt3 = this.getChildAt(i16);
            e eVarI2 = this.i(childAt3);
            if (eVarI2 == null) {
                constraintLayout = this;
            } else {
                b bVar = (b) childAt3.getLayoutParams();
                this.f22184c.b(eVarI2);
                constraintLayout = this;
                constraintLayout.c(zIsInEditMode, childAt3, eVarI2, bVar, this.f22201t);
            }
            i16++;
            this = constraintLayout;
        }
    }

    public void q(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f22194m == null) {
                this.f22194m = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f22194m.put(strSubstring, (Integer) obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 F0.e$b) = (r2v3 F0.e$b), (r2v0 F0.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(F0.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f22203v
            int r1 = r0.f22279e
            int r0 = r0.f22278d
            F0.e$b r2 = F0.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r6) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r5
            goto L38
        L1a:
            int r9 = r7.f22187f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            F0.e$b r9 = F0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f22185d
            int r10 = java.lang.Math.max(r5, r10)
            goto L38
        L2e:
            F0.e$b r9 = F0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f22185d
            int r10 = java.lang.Math.max(r5, r10)
        L38:
            if (r11 == r6) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r5
            goto L5d
        L40:
            int r11 = r7.f22188g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            F0.e$b r2 = F0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f22186e
            int r12 = java.lang.Math.max(r5, r11)
            goto L5d
        L53:
            F0.e$b r2 = F0.e.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f22186e
            int r12 = java.lang.Math.max(r5, r11)
        L5d:
            int r11 = r8.N()
            if (r10 != r11) goto L69
            int r11 = r8.t()
            if (r12 == r11) goto L6c
        L69:
            r8.U0()
        L6c:
            r8.C0(r5)
            r8.D0(r5)
            int r11 = r7.f22187f
            int r11 = r11 - r0
            r8.p0(r11)
            int r11 = r7.f22188g
            int r11 = r11 - r1
            r8.o0(r11)
            r8.r0(r5)
            r8.q0(r5)
            r8.i0(r9)
            r8.B0(r10)
            r8.x0(r2)
            r8.e0(r12)
            int r9 = r7.f22185d
            int r9 = r9 - r0
            r8.r0(r9)
            int r7 = r7.f22186e
            int r7 = r7 - r1
            r8.q0(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r(F0.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public final boolean s() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            p();
        }
        return z10;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.f22191j = cVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f22182a.remove(getId());
        super.setId(i10);
        this.f22182a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f22188g) {
            return;
        }
        this.f22188g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f22187f) {
            return;
        }
        this.f22187f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f22186e) {
            return;
        }
        this.f22186e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f22185d) {
            return;
        }
        this.f22185d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(H0.b bVar) {
        this.f22202u = bVar;
        H0.a aVar = this.f22192k;
        if (aVar != null) {
            aVar.c(bVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f22190i = i10;
        this.f22184c.c1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22182a = new SparseArray();
        this.f22183b = new ArrayList(4);
        this.f22184c = new f();
        this.f22185d = 0;
        this.f22186e = 0;
        this.f22187f = Integer.MAX_VALUE;
        this.f22188g = Integer.MAX_VALUE;
        this.f22189h = true;
        this.f22190i = 263;
        this.f22191j = null;
        this.f22192k = null;
        this.f22193l = -1;
        this.f22194m = new HashMap();
        this.f22195n = -1;
        this.f22196o = -1;
        this.f22197p = -1;
        this.f22198q = -1;
        this.f22199r = 0;
        this.f22200s = 0;
        this.f22201t = new SparseArray();
        this.f22203v = new c(this);
        this.f22204w = 0;
        this.f22205x = 0;
        j(attributeSet, i10, 0);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public float f22207A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public String f22208B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public float f22209C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f22210D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f22211E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f22212F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f22213G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f22214H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f22215I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f22216J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f22217K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f22218L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f22219M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f22220N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f22221O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f22222P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f22223Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f22224R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f22225S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public boolean f22226T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public boolean f22227U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public String f22228V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public boolean f22229W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public boolean f22230X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f22231Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public boolean f22232Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22233a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f22234a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22235b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f22236b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f22237c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public boolean f22238c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22239d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f22240d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22241e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f22242e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22243f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public int f22244f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22245g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f22246g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22247h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f22248h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f22249i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f22250i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f22251j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public float f22252j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f22253k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int f22254k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f22255l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f22256l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f22257m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public float f22258m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f22259n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public e f22260n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f22261o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f22262o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f22263p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f22264q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f22265r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f22266s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22267t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22268u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22269v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22270w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f22271x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f22272y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f22273z;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f22274a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f22274a = sparseIntArray;
                sparseIntArray.append(d.f4869K1, 8);
                sparseIntArray.append(d.f4875L1, 9);
                sparseIntArray.append(d.f4887N1, 10);
                sparseIntArray.append(d.f4893O1, 11);
                sparseIntArray.append(d.f4929U1, 12);
                sparseIntArray.append(d.f4923T1, 13);
                sparseIntArray.append(d.f5068s1, 14);
                sparseIntArray.append(d.f5062r1, 15);
                sparseIntArray.append(d.f5050p1, 16);
                sparseIntArray.append(d.f5074t1, 2);
                sparseIntArray.append(d.f5086v1, 3);
                sparseIntArray.append(d.f5080u1, 4);
                sparseIntArray.append(d.f4973c2, 49);
                sparseIntArray.append(d.f4979d2, 50);
                sparseIntArray.append(d.f5110z1, 5);
                sparseIntArray.append(d.f4809A1, 6);
                sparseIntArray.append(d.f4815B1, 7);
                sparseIntArray.append(d.f4966b1, 1);
                sparseIntArray.append(d.f4899P1, 17);
                sparseIntArray.append(d.f4905Q1, 18);
                sparseIntArray.append(d.f5104y1, 19);
                sparseIntArray.append(d.f5098x1, 20);
                sparseIntArray.append(d.f4997g2, 21);
                sparseIntArray.append(d.f5015j2, 22);
                sparseIntArray.append(d.f5003h2, 23);
                sparseIntArray.append(d.f4985e2, 24);
                sparseIntArray.append(d.f5009i2, 25);
                sparseIntArray.append(d.f4991f2, 26);
                sparseIntArray.append(d.f4845G1, 29);
                sparseIntArray.append(d.f4935V1, 30);
                sparseIntArray.append(d.f5092w1, 44);
                sparseIntArray.append(d.f4857I1, 45);
                sparseIntArray.append(d.f4945X1, 46);
                sparseIntArray.append(d.f4851H1, 47);
                sparseIntArray.append(d.f4940W1, 48);
                sparseIntArray.append(d.f5038n1, 27);
                sparseIntArray.append(d.f5032m1, 28);
                sparseIntArray.append(d.f4950Y1, 31);
                sparseIntArray.append(d.f4821C1, 32);
                sparseIntArray.append(d.f4961a2, 33);
                sparseIntArray.append(d.f4955Z1, 34);
                sparseIntArray.append(d.f4967b2, 35);
                sparseIntArray.append(d.f4833E1, 36);
                sparseIntArray.append(d.f4827D1, 37);
                sparseIntArray.append(d.f4839F1, 38);
                sparseIntArray.append(d.f4863J1, 39);
                sparseIntArray.append(d.f4917S1, 40);
                sparseIntArray.append(d.f4881M1, 41);
                sparseIntArray.append(d.f5056q1, 42);
                sparseIntArray.append(d.f5044o1, 43);
                sparseIntArray.append(d.f4911R1, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            int i10;
            super(context, attributeSet);
            this.f22233a = -1;
            this.f22235b = -1;
            this.f22237c = -1.0f;
            this.f22239d = -1;
            this.f22241e = -1;
            this.f22243f = -1;
            this.f22245g = -1;
            this.f22247h = -1;
            this.f22249i = -1;
            this.f22251j = -1;
            this.f22253k = -1;
            this.f22255l = -1;
            this.f22257m = -1;
            this.f22259n = 0;
            this.f22261o = 0.0f;
            this.f22263p = -1;
            this.f22264q = -1;
            this.f22265r = -1;
            this.f22266s = -1;
            this.f22267t = -1;
            this.f22268u = -1;
            this.f22269v = -1;
            this.f22270w = -1;
            this.f22271x = -1;
            this.f22272y = -1;
            this.f22273z = 0.5f;
            this.f22207A = 0.5f;
            this.f22208B = null;
            this.f22209C = 0.0f;
            this.f22210D = 1;
            this.f22211E = -1.0f;
            this.f22212F = -1.0f;
            this.f22213G = 0;
            this.f22214H = 0;
            this.f22215I = 0;
            this.f22216J = 0;
            this.f22217K = 0;
            this.f22218L = 0;
            this.f22219M = 0;
            this.f22220N = 0;
            this.f22221O = 1.0f;
            this.f22222P = 1.0f;
            this.f22223Q = -1;
            this.f22224R = -1;
            this.f22225S = -1;
            this.f22226T = false;
            this.f22227U = false;
            this.f22228V = null;
            this.f22229W = true;
            this.f22230X = true;
            this.f22231Y = false;
            this.f22232Z = false;
            this.f22234a0 = false;
            this.f22236b0 = false;
            this.f22238c0 = false;
            this.f22240d0 = -1;
            this.f22242e0 = -1;
            this.f22244f0 = -1;
            this.f22246g0 = -1;
            this.f22248h0 = -1;
            this.f22250i0 = -1;
            this.f22252j0 = 0.5f;
            this.f22260n0 = new e();
            this.f22262o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f4960a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = a.f22274a.get(index);
                switch (i12) {
                    case 1:
                        this.f22225S = typedArrayObtainStyledAttributes.getInt(index, this.f22225S);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f22257m);
                        this.f22257m = resourceId;
                        if (resourceId == -1) {
                            this.f22257m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f22259n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22259n);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f22261o) % 360.0f;
                        this.f22261o = f10;
                        if (f10 < 0.0f) {
                            this.f22261o = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f22233a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22233a);
                        break;
                    case 6:
                        this.f22235b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22235b);
                        break;
                    case 7:
                        this.f22237c = typedArrayObtainStyledAttributes.getFloat(index, this.f22237c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22239d);
                        this.f22239d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f22239d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22241e);
                        this.f22241e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f22241e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22243f);
                        this.f22243f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f22243f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22245g);
                        this.f22245g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f22245g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22247h);
                        this.f22247h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f22247h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22249i);
                        this.f22249i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f22249i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22251j);
                        this.f22251j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f22251j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22253k);
                        this.f22253k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f22253k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22255l);
                        this.f22255l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f22255l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22263p);
                        this.f22263p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f22263p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22264q);
                        this.f22264q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f22264q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22265r);
                        this.f22265r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f22265r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22266s);
                        this.f22266s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f22266s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f22267t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22267t);
                        break;
                    case 22:
                        this.f22268u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22268u);
                        break;
                    case 23:
                        this.f22269v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22269v);
                        break;
                    case 24:
                        this.f22270w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22270w);
                        break;
                    case 25:
                        this.f22271x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22271x);
                        break;
                    case 26:
                        this.f22272y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22272y);
                        break;
                    case 27:
                        this.f22226T = typedArrayObtainStyledAttributes.getBoolean(index, this.f22226T);
                        break;
                    case 28:
                        this.f22227U = typedArrayObtainStyledAttributes.getBoolean(index, this.f22227U);
                        break;
                    case 29:
                        this.f22273z = typedArrayObtainStyledAttributes.getFloat(index, this.f22273z);
                        break;
                    case Build.API_LEVELS.API_30 /* 30 */:
                        this.f22207A = typedArrayObtainStyledAttributes.getFloat(index, this.f22207A);
                        break;
                    case 31:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f22215I = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i14 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f22216J = i14;
                        if (i14 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f22217K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22217K);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f22217K) == -2) {
                                this.f22217K = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f22219M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22219M);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f22219M) == -2) {
                                this.f22219M = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f22221O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f22221O));
                        this.f22215I = 2;
                        break;
                    case 36:
                        try {
                            this.f22218L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22218L);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f22218L) == -2) {
                                this.f22218L = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f22220N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22220N);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f22220N) == -2) {
                                this.f22220N = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f22222P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f22222P));
                        this.f22216J = 2;
                        break;
                    default:
                        switch (i12) {
                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f22208B = string;
                                this.f22209C = Float.NaN;
                                this.f22210D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f22208B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i10 = 0;
                                    } else {
                                        String strSubstring = this.f22208B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f22210D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f22210D = 1;
                                        }
                                        i10 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f22208B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f22208B.substring(i10);
                                        if (strSubstring2.length() > 0) {
                                            this.f22209C = Float.parseFloat(strSubstring2);
                                        }
                                    } else {
                                        String strSubstring3 = this.f22208B.substring(i10, iIndexOf2);
                                        String strSubstring4 = this.f22208B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f11 = Float.parseFloat(strSubstring3);
                                                float f12 = Float.parseFloat(strSubstring4);
                                                if (f11 > 0.0f && f12 > 0.0f) {
                                                    if (this.f22210D == 1) {
                                                        this.f22209C = Math.abs(f12 / f11);
                                                    } else {
                                                        this.f22209C = Math.abs(f11 / f12);
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                this.f22211E = typedArrayObtainStyledAttributes.getFloat(index, this.f22211E);
                                break;
                            case 46:
                                this.f22212F = typedArrayObtainStyledAttributes.getFloat(index, this.f22212F);
                                break;
                            case 47:
                                this.f22213G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f22214H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f22223Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22223Q);
                                break;
                            case 50:
                                this.f22224R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22224R);
                                break;
                            case 51:
                                this.f22228V = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f22232Z = false;
            this.f22229W = true;
            this.f22230X = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f22226T) {
                this.f22229W = false;
                if (this.f22215I == 0) {
                    this.f22215I = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f22227U) {
                this.f22230X = false;
                if (this.f22216J == 0) {
                    this.f22216J = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f22229W = false;
                if (i10 == 0 && this.f22215I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f22226T = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f22230X = false;
                if (i11 == 0 && this.f22216J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f22227U = true;
                }
            }
            if (this.f22237c == -1.0f && this.f22233a == -1 && this.f22235b == -1) {
                return;
            }
            this.f22232Z = true;
            this.f22229W = true;
            this.f22230X = true;
            if (!(this.f22260n0 instanceof g)) {
                this.f22260n0 = new g();
            }
            ((g) this.f22260n0).O0(this.f22225S);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instruction units count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f22233a = -1;
            this.f22235b = -1;
            this.f22237c = -1.0f;
            this.f22239d = -1;
            this.f22241e = -1;
            this.f22243f = -1;
            this.f22245g = -1;
            this.f22247h = -1;
            this.f22249i = -1;
            this.f22251j = -1;
            this.f22253k = -1;
            this.f22255l = -1;
            this.f22257m = -1;
            this.f22259n = 0;
            this.f22261o = 0.0f;
            this.f22263p = -1;
            this.f22264q = -1;
            this.f22265r = -1;
            this.f22266s = -1;
            this.f22267t = -1;
            this.f22268u = -1;
            this.f22269v = -1;
            this.f22270w = -1;
            this.f22271x = -1;
            this.f22272y = -1;
            this.f22273z = 0.5f;
            this.f22207A = 0.5f;
            this.f22208B = null;
            this.f22209C = 0.0f;
            this.f22210D = 1;
            this.f22211E = -1.0f;
            this.f22212F = -1.0f;
            this.f22213G = 0;
            this.f22214H = 0;
            this.f22215I = 0;
            this.f22216J = 0;
            this.f22217K = 0;
            this.f22218L = 0;
            this.f22219M = 0;
            this.f22220N = 0;
            this.f22221O = 1.0f;
            this.f22222P = 1.0f;
            this.f22223Q = -1;
            this.f22224R = -1;
            this.f22225S = -1;
            this.f22226T = false;
            this.f22227U = false;
            this.f22228V = null;
            this.f22229W = true;
            this.f22230X = true;
            this.f22231Y = false;
            this.f22232Z = false;
            this.f22234a0 = false;
            this.f22236b0 = false;
            this.f22238c0 = false;
            this.f22240d0 = -1;
            this.f22242e0 = -1;
            this.f22244f0 = -1;
            this.f22246g0 = -1;
            this.f22248h0 = -1;
            this.f22250i0 = -1;
            this.f22252j0 = 0.5f;
            this.f22260n0 = new e();
            this.f22262o0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22233a = -1;
            this.f22235b = -1;
            this.f22237c = -1.0f;
            this.f22239d = -1;
            this.f22241e = -1;
            this.f22243f = -1;
            this.f22245g = -1;
            this.f22247h = -1;
            this.f22249i = -1;
            this.f22251j = -1;
            this.f22253k = -1;
            this.f22255l = -1;
            this.f22257m = -1;
            this.f22259n = 0;
            this.f22261o = 0.0f;
            this.f22263p = -1;
            this.f22264q = -1;
            this.f22265r = -1;
            this.f22266s = -1;
            this.f22267t = -1;
            this.f22268u = -1;
            this.f22269v = -1;
            this.f22270w = -1;
            this.f22271x = -1;
            this.f22272y = -1;
            this.f22273z = 0.5f;
            this.f22207A = 0.5f;
            this.f22208B = null;
            this.f22209C = 0.0f;
            this.f22210D = 1;
            this.f22211E = -1.0f;
            this.f22212F = -1.0f;
            this.f22213G = 0;
            this.f22214H = 0;
            this.f22215I = 0;
            this.f22216J = 0;
            this.f22217K = 0;
            this.f22218L = 0;
            this.f22219M = 0;
            this.f22220N = 0;
            this.f22221O = 1.0f;
            this.f22222P = 1.0f;
            this.f22223Q = -1;
            this.f22224R = -1;
            this.f22225S = -1;
            this.f22226T = false;
            this.f22227U = false;
            this.f22228V = null;
            this.f22229W = true;
            this.f22230X = true;
            this.f22231Y = false;
            this.f22232Z = false;
            this.f22234a0 = false;
            this.f22236b0 = false;
            this.f22238c0 = false;
            this.f22240d0 = -1;
            this.f22242e0 = -1;
            this.f22244f0 = -1;
            this.f22246g0 = -1;
            this.f22248h0 = -1;
            this.f22250i0 = -1;
            this.f22252j0 = 0.5f;
            this.f22260n0 = new e();
            this.f22262o0 = false;
        }
    }
}
