package com.google.android.material.button;

import Y0.AbstractC2557k;
import Y0.C2547a;
import Y0.E;
import Z0.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c7.AbstractC3079a;
import c7.i;
import c7.j;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import n7.l;
import n7.n;
import s7.C5808a;
import s7.k;
import u7.AbstractC5981a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f30513k = "MaterialButtonToggleGroup";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f30514l = i.f25987l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f30516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f30517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Comparator f30518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer[] f30519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f30523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Set f30524j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends C2547a {
        public b() {
        }

        @Override // Y0.C2547a
        public void g(View view, h hVar) {
            super.g(view, hVar);
            hVar.l0(h.g.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final s7.c f30527e = new C5808a(0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s7.c f30528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s7.c f30529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s7.c f30530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public s7.c f30531d;

        public c(s7.c cVar, s7.c cVar2, s7.c cVar3, s7.c cVar4) {
            this.f30528a = cVar;
            this.f30529b = cVar3;
            this.f30530c = cVar4;
            this.f30531d = cVar2;
        }

        public static c a(c cVar) {
            s7.c cVar2 = f30527e;
            return new c(cVar2, cVar.f30531d, cVar2, cVar.f30530c);
        }

        public static c b(c cVar, View view) {
            return n.e(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            s7.c cVar2 = cVar.f30528a;
            s7.c cVar3 = cVar.f30531d;
            s7.c cVar4 = f30527e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            s7.c cVar2 = f30527e;
            return new c(cVar2, cVar2, cVar.f30529b, cVar.f30530c);
        }

        public static c e(c cVar, View view) {
            return n.e(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            s7.c cVar2 = cVar.f30528a;
            s7.c cVar3 = f30527e;
            return new c(cVar2, cVar3, cVar.f30529b, cVar3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements MaterialButton.a {
        public e() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3079a.f25839r);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (k(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return i10;
    }

    public static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f30528a).t(cVar.f30531d).F(cVar.f30529b).x(cVar.f30530c);
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(E.j());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f30516b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f30513k, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f30515a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        E.f0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f30517c.add(dVar);
    }

    public final void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButtonH = h(i10);
            int iMin = Math.min(materialButtonH.getStrokeWidth(), h(i10 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonH);
            if (getOrientation() == 0) {
                AbstractC2557k.c(layoutParamsD, 0);
                AbstractC2557k.d(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                AbstractC2557k.d(layoutParamsD, 0);
            }
            materialButtonH.setLayoutParams(layoutParamsD);
        }
        n(firstVisibleChildIndex);
    }

    public final LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public final void e(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e(f30513k, "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f30524j);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f30521g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f30522h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        q(hashSet);
    }

    public void f() {
        q(new HashSet());
    }

    public final void g(int i10, boolean z10) {
        Iterator it = this.f30517c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i10, z10);
        }
    }

    public int getCheckedButtonId() {
        if (!this.f30521g || this.f30524j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f30524j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = h(i10).getId();
            if (this.f30524j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f30519e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w(f30513k, "Child order wasn't updated");
        return i11;
    }

    public final MaterialButton h(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return -1;
    }

    public final c j(int i10, int i11, int i12) {
        c cVar = (c) this.f30515a.get(i10);
        if (i11 == i12) {
            return cVar;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i10 == i12) {
            return z10 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    public final boolean k(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public boolean l() {
        return this.f30521g;
    }

    public void m(MaterialButton materialButton, boolean z10) {
        if (this.f30520f) {
            return;
        }
        e(materialButton.getId(), z10);
    }

    public final void n(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            AbstractC2557k.c(layoutParams, 0);
            AbstractC2557k.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void o(int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f30520f = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f30520f = false;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f30523i;
        if (i10 != -1) {
            q(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h.I0(accessibilityNodeInfo).k0(h.f.a(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        s();
        c();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f30515a.remove(iIndexOfChild);
        }
        s();
        c();
    }

    public final void q(Set set) {
        Set set2 = this.f30524j;
        this.f30524j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = h(i10).getId();
            o(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                g(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    public final void r() {
        TreeMap treeMap = new TreeMap(this.f30518d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(h(i10), Integer.valueOf(i10));
        }
        this.f30519e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButtonH = h(i10);
            if (materialButtonH.getVisibility() != 8) {
                k.b bVarV = materialButtonH.getShapeAppearanceModel().v();
                p(bVarV, j(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonH.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f30522h = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f30521g != z10) {
            this.f30521g = z10;
            f();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f30514l;
        super(AbstractC5981a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f30515a = new ArrayList();
        this.f30516b = new e(this, null);
        this.f30517c = new LinkedHashSet();
        this.f30518d = new a();
        this.f30520f = false;
        this.f30524j = new HashSet();
        TypedArray typedArrayH = l.h(getContext(), attributeSet, j.f26317s2, i10, i11, new int[0]);
        setSingleSelection(typedArrayH.getBoolean(j.f26338v2, false));
        this.f30523i = typedArrayH.getResourceId(j.f26324t2, -1);
        this.f30522h = typedArrayH.getBoolean(j.f26331u2, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayH.recycle();
        E.n0(this, 1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
