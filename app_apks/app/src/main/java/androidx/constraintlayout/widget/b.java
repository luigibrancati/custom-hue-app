package androidx.constraintlayout.widget;

import F0.e;
import F0.h;
import H0.d;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f22291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f22293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f22294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f22296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View[] f22297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f22298h;

    public b(Context context) {
        super(context);
        this.f22291a = new int[32];
        this.f22295e = false;
        this.f22297g = null;
        this.f22298h = new HashMap();
        this.f22293c = context;
        e(null);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.f22293c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iD = d(strTrim);
        if (iD != 0) {
            this.f22298h.put(Integer.valueOf(iD), strTrim);
            b(iD);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    public final void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f22292b + 1;
        int[] iArr = this.f22291a;
        if (i11 > iArr.length) {
            this.f22291a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f22291a;
        int i12 = this.f22292b;
        iArr2[i12] = i10;
        this.f22292b = i12 + 1;
    }

    public final int c(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f22293c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int d(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iC = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objF = constraintLayout.f(0, str);
            if (objF instanceof Integer) {
                iC = ((Integer) objF).intValue();
            }
        }
        if (iC == 0 && constraintLayout != null) {
            iC = c(constraintLayout, str);
        }
        if (iC == 0) {
            try {
                iC = H0.c.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iC == 0 ? this.f22293c.getResources().getIdentifier(str, "id", this.f22293c.getPackageName()) : iC;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f4960a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.f5020k1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f22296f = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(e eVar, boolean z10);

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f22291a, this.f22292b);
    }

    public void j(ConstraintLayout constraintLayout) {
        String str;
        int iC;
        if (isInEditMode()) {
            setIds(this.f22296f);
        }
        h hVar = this.f22294d;
        if (hVar == null) {
            return;
        }
        hVar.c();
        for (int i10 = 0; i10 < this.f22292b; i10++) {
            int i11 = this.f22291a[i10];
            View viewH = constraintLayout.h(i11);
            if (viewH == null && (iC = c(constraintLayout, (str = (String) this.f22298h.get(Integer.valueOf(i11))))) != 0) {
                this.f22291a[i10] = iC;
                this.f22298h.put(Integer.valueOf(iC), str);
                viewH = constraintLayout.h(iC);
            }
            if (viewH != null) {
                this.f22294d.b(constraintLayout.i(viewH));
            }
        }
        this.f22294d.a(constraintLayout.f22184c);
    }

    public void k() {
        if (this.f22294d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f22260n0 = (e) this.f22294d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f22296f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f22295e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f22296f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f22292b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f22296f = null;
        this.f22292b = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22291a = new int[32];
        this.f22295e = false;
        this.f22297g = null;
        this.f22298h = new HashMap();
        this.f22293c = context;
        e(attributeSet);
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public void h(ConstraintLayout constraintLayout) {
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }
}
