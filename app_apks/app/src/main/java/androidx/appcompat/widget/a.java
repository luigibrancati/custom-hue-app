package androidx.appcompat.widget;

import Y0.AbstractC2548b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import h.AbstractC4262a;
import java.util.ArrayList;
import n.C5056a;
import o.InterfaceC5183f;
import p.AbstractViewOnTouchListenerC5332K;
import p.C5355q;
import p.a0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.appcompat.view.menu.a implements AbstractC2548b.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public c f21866A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public b f21867B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final f f21868C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f21869D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f21870k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f21871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21879t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f21880u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21881v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SparseBooleanArray f21883x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f21884y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0272a f21885z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0272a extends h {
        public C0272a(Context context, l lVar, View view) {
            super(context, lVar, view, false, AbstractC4262a.f35800i);
            if (!((g) lVar.getItem()).l()) {
                View view2 = a.this.f21870k;
                f(view2 == null ? (View) a.this.f21504i : view2);
            }
            j(a.this.f21868C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            a aVar = a.this;
            aVar.f21885z = null;
            aVar.f21869D = 0;
            super.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public InterfaceC5183f a() {
            C0272a c0272a = a.this.f21885z;
            if (c0272a != null) {
                return c0272a.c();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f21888a;

        public c(e eVar) {
            this.f21888a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f21498c != null) {
                a.this.f21498c.d();
            }
            View view = (View) a.this.f21504i;
            if (view != null && view.getWindowToken() != null && this.f21888a.m()) {
                a.this.f21884y = this.f21888a;
            }
            a.this.f21866A = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends C5355q implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0273a extends AbstractViewOnTouchListenerC5332K {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ a f21891j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0273a(View view, a aVar) {
                super(view);
                this.f21891j = aVar;
            }

            @Override // p.AbstractViewOnTouchListenerC5332K
            public InterfaceC5183f b() {
                e eVar = a.this.f21884y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // p.AbstractViewOnTouchListenerC5332K
            public boolean c() {
                a.this.K();
                return true;
            }

            @Override // p.AbstractViewOnTouchListenerC5332K
            public boolean d() {
                a aVar = a.this;
                if (aVar.f21866A != null) {
                    return false;
                }
                aVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC4262a.f35799h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            a0.a(this, getContentDescription());
            setOnTouchListener(new C0273a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                P0.a.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, AbstractC4262a.f35800i);
            h(8388613);
            j(a.this.f21868C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            if (a.this.f21498c != null) {
                a.this.f21498c.close();
            }
            a.this.f21884y = null;
            super.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof l) {
                eVar.D().e(false);
            }
            i.a aVarM = a.this.m();
            if (aVarM != null) {
                aVarM.b(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == a.this.f21498c) {
                return false;
            }
            a.this.f21869D = ((l) eVar).getItem().getItemId();
            i.a aVarM = a.this.m();
            if (aVarM != null) {
                return aVarM.c(eVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, h.g.f35910c, h.g.f35909b);
        this.f21883x = new SparseBooleanArray();
        this.f21868C = new f();
    }

    public Drawable A() {
        d dVar = this.f21870k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f21872m) {
            return this.f21871l;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        c cVar = this.f21866A;
        if (cVar != null && (obj = this.f21504i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f21866A = null;
            return true;
        }
        e eVar = this.f21884y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        C0272a c0272a = this.f21885z;
        if (c0272a == null) {
            return false;
        }
        c0272a.b();
        return true;
    }

    public boolean D() {
        return this.f21866A != null || E();
    }

    public boolean E() {
        e eVar = this.f21884y;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f21878s) {
            this.f21877r = C5056a.b(this.f21497b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f21498c;
        if (eVar != null) {
            eVar.L(true);
        }
    }

    public void G(boolean z10) {
        this.f21881v = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f21504i = actionMenuView;
        actionMenuView.a(this.f21498c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f21870k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f21872m = true;
            this.f21871l = drawable;
        }
    }

    public void J(boolean z10) {
        this.f21873n = z10;
        this.f21874o = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f21873n || E() || (eVar = this.f21498c) == null || this.f21504i == null || this.f21866A != null || eVar.z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f21497b, this.f21498c, this.f21870k, true));
        this.f21866A = cVar;
        ((View) this.f21504i).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        y();
        super.b(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        boolean z10 = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l lVar2 = lVar;
        while (lVar2.f0() != this.f21498c) {
            lVar2 = (l) lVar2.f0();
        }
        View viewZ = z(lVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.f21869D = lVar.getItem().getItemId();
        int size = lVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = lVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        C0272a c0272a = new C0272a(this.f21497b, lVar, viewZ);
        this.f21885z = c0272a;
        c0272a.g(z10);
        this.f21885z.k();
        super.e(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        super.f(z10);
        ((View) this.f21504i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f21498c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList arrayListS = eVar.s();
            int size = arrayListS.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC2548b abstractC2548bA = ((g) arrayListS.get(i10)).a();
                if (abstractC2548bA != null) {
                    abstractC2548bA.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f21498c;
        ArrayList arrayListZ = eVar2 != null ? eVar2.z() : null;
        if (this.f21873n && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z11 = !((g) arrayListZ.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f21870k == null) {
                this.f21870k = new d(this.f21496a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f21870k.getParent();
            if (viewGroup != this.f21504i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f21870k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f21504i;
                actionMenuView.addView(this.f21870k, actionMenuView.D());
            }
        } else {
            d dVar = this.f21870k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f21504i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f21870k);
                }
            }
        }
        ((ActionMenuView) this.f21504i).setOverflowReserved(this.f21873n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.a] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        ArrayList arrayListE;
        int size;
        int i10;
        int iJ;
        ?? r02;
        int i11;
        a aVar = this;
        androidx.appcompat.view.menu.e eVar = aVar.f21498c;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayListE = eVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i12 = aVar.f21877r;
        int i13 = aVar.f21876q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f21504i;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            g gVar = (g) arrayListE.get(i16);
            if (gVar.o()) {
                i14++;
            } else if (gVar.n()) {
                i15++;
            } else {
                z10 = true;
            }
            if (aVar.f21881v && gVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (aVar.f21873n && (z10 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = aVar.f21883x;
        sparseBooleanArray.clear();
        if (aVar.f21879t) {
            int i18 = aVar.f21882w;
            iJ = i13 / i18;
            i10 = i18 + ((i13 % i18) / iJ);
        } else {
            i10 = 0;
            iJ = 0;
        }
        int i19 = 0;
        int i20 = 0;
        ?? r03 = aVar;
        while (i19 < size) {
            ?? r15 = (g) arrayListE.get(i19);
            if (r15.o()) {
                View viewN = r03.n(r15, view, viewGroup);
                if (r03.f21879t) {
                    iJ -= ActionMenuView.J(viewN, i10, iJ, iMakeMeasureSpec, r32);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.u(true);
                r02 = r32;
                i11 = size;
            } else if (r15.n()) {
                int groupId2 = r15.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i17 > 0 || z11) && i13 > 0 && (!r03.f21879t || iJ > 0);
                boolean z13 = z12;
                i11 = size;
                if (z12) {
                    View viewN2 = r03.n(r15, null, viewGroup);
                    if (r03.f21879t) {
                        int iJ2 = ActionMenuView.J(viewN2, i10, iJ, iMakeMeasureSpec, 0);
                        iJ -= iJ2;
                        if (iJ2 == 0) {
                            z13 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z12 = z14 & (!r03.f21879t ? i13 + i20 <= 0 : i13 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i21 = 0; i21 < i19; i21++) {
                        g gVar2 = (g) arrayListE.get(i21);
                        if (gVar2.getGroupId() == groupId2) {
                            if (gVar2.l()) {
                                i17++;
                            }
                            gVar2.u(false);
                        }
                    }
                }
                if (z12) {
                    i17--;
                }
                r15.u(z12);
                r02 = 0;
            } else {
                r02 = r32;
                i11 = size;
                r15.u(r02);
            }
            i19++;
            r32 = r02;
            size = i11;
            view = null;
            r03 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        C5056a c5056aB = C5056a.b(context);
        if (!this.f21874o) {
            this.f21873n = c5056aB.f();
        }
        if (!this.f21880u) {
            this.f21875p = c5056aB.c();
        }
        if (!this.f21878s) {
            this.f21877r = c5056aB.d();
        }
        int measuredWidth = this.f21875p;
        if (this.f21873n) {
            if (this.f21870k == null) {
                d dVar = new d(this.f21496a);
                this.f21870k = dVar;
                if (this.f21872m) {
                    dVar.setImageDrawable(this.f21871l);
                    this.f21871l = null;
                    this.f21872m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f21870k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f21870k.getMeasuredWidth();
        } else {
            this.f21870k = null;
        }
        this.f21876q = measuredWidth;
        this.f21882w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void j(g gVar, j.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f21504i);
        if (this.f21867B == null) {
            this.f21867B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f21867B);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f21870k) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public j o(ViewGroup viewGroup) {
        j jVar = this.f21504i;
        j jVarO = super.o(viewGroup);
        if (jVar != jVarO) {
            ((ActionMenuView) jVarO).setPresenter(this);
        }
        return jVarO;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i10, g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return C() | B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f21504i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }
}
