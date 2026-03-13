package com.google.android.material.chip;

import Y0.E;
import Z0.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import c7.AbstractC3079a;
import c7.i;
import c7.j;
import java.util.List;
import java.util.Set;
import n7.AbstractC5142e;
import n7.C5138a;
import n7.l;
import u7.AbstractC5981a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ChipGroup extends AbstractC5142e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f30560k = i.f25983h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f30563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5138a f30564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f30565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f30566j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements C5138a.b {
        public a() {
        }

        @Override // n7.C5138a.b
        public void a(Set set) {
            if (ChipGroup.this.f30563g != null) {
                e eVar = ChipGroup.this.f30563g;
                ChipGroup chipGroup = ChipGroup.this;
                eVar.a(chipGroup, chipGroup.f30564h.j(ChipGroup.this));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements e {
        public b(d dVar) {
        }

        @Override // com.google.android.material.chip.ChipGroup.e
        public void a(ChipGroup chipGroup, List list) {
            if (ChipGroup.this.f30564h.l()) {
                ChipGroup.this.getCheckedChipId();
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        void a(ChipGroup chipGroup, List list);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f30569a;

        public f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(E.j());
                }
                ChipGroup.this.f30564h.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f30569a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f30564h.n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f30569a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        public /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3079a.f25825d);
    }

    private int getChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                i10++;
            }
        }
        return i10;
    }

    @Override // n7.AbstractC5142e
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    public int g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                if (((Chip) getChildAt(i11)) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f30564h.k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f30564h.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f30561e;
    }

    public int getChipSpacingVertical() {
        return this.f30562f;
    }

    public boolean h() {
        return this.f30564h.l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f30565i;
        if (i10 != -1) {
            this.f30564h.f(i10);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h.I0(accessibilityNodeInfo).k0(h.f.a(getRowCount(), c() ? getChipCount() : -1, false, h() ? 1 : 2));
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f30561e != i10) {
            this.f30561e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f30562f != i10) {
            this.f30562f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(e eVar) {
        this.f30563g = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f30566j.f30569a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f30564h.p(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // n7.AbstractC5142e
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        this.f30564h.q(z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f30560k;
        super(AbstractC5981a.c(context, attributeSet, i10, i11), attributeSet, i10);
        C5138a c5138a = new C5138a();
        this.f30564h = c5138a;
        f fVar = new f(this, null);
        this.f30566j = fVar;
        TypedArray typedArrayH = l.h(getContext(), attributeSet, j.f26055J0, i10, i11, new int[0]);
        int dimensionPixelOffset = typedArrayH.getDimensionPixelOffset(j.f26069L0, 0);
        setChipSpacingHorizontal(typedArrayH.getDimensionPixelOffset(j.f26076M0, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayH.getDimensionPixelOffset(j.f26083N0, dimensionPixelOffset));
        setSingleLine(typedArrayH.getBoolean(j.f26097P0, false));
        setSingleSelection(typedArrayH.getBoolean(j.f26104Q0, false));
        setSelectionRequired(typedArrayH.getBoolean(j.f26090O0, false));
        this.f30565i = typedArrayH.getResourceId(j.f26062K0, -1);
        typedArrayH.recycle();
        c5138a.o(new a());
        super.setOnHierarchyChangeListener(fVar);
        E.n0(this, 1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
