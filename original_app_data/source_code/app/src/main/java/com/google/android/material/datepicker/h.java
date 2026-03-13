package com.google.android.material.datepicker;

import Y0.C2547a;
import Y0.E;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h<S> extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f30669k = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f30670l = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f30671m = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f30672n = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.material.datepicker.a f30674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.material.datepicker.k f30675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f30676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.material.datepicker.c f30677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f30678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f30679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f30680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f30681j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30682a;

        public a(int i10) {
            this.f30682a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f30679h.t1(this.f30682a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends C2547a {
        public b() {
        }

        @Override // Y0.C2547a
        public void g(View view, Z0.h hVar) {
            super.g(view, hVar);
            hVar.k0(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends p {

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public final /* synthetic */ int f30685I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f30685I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void N1(RecyclerView.B b10, int[] iArr) {
            if (this.f30685I == 0) {
                iArr[0] = h.this.f30679h.getWidth();
                iArr[1] = h.this.f30679h.getWidth();
            } else {
                iArr[0] = h.this.f30679h.getHeight();
                iArr[1] = h.this.f30679h.getHeight();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements l {
        public d() {
        }

        @Override // com.google.android.material.datepicker.h.l
        public void a(long j10) {
            if (h.this.f30674c.e().p(j10)) {
                h.p(h.this);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Calendar f30688a = r.i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Calendar f30689b = r.i();

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
            if ((recyclerView.getAdapter() instanceof s) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                h.p(h.this);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends C2547a {
        public f() {
        }

        @Override // Y0.C2547a
        public void g(View view, Z0.h hVar) {
            super.g(view, hVar);
            hVar.s0(h.this.f30681j.getVisibility() == 0 ? h.this.getString(c7.h.f25974o) : h.this.getString(c7.h.f25972m));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f30692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MaterialButton f30693b;

        public g(m mVar, MaterialButton materialButton) {
            this.f30692a = mVar;
            this.f30693b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f30693b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int iA2 = i10 < 0 ? h.this.A().a2() : h.this.A().d2();
            h.this.f30675d = this.f30692a.b(iA2);
            this.f30693b.setText(this.f30692a.c(iA2));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class ViewOnClickListenerC0361h implements View.OnClickListener {
        public ViewOnClickListenerC0361h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.F();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f30696a;

        public i(m mVar) {
            this.f30696a = mVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iA2 = h.this.A().a2() + 1;
            if (iA2 < h.this.f30679h.getAdapter().getItemCount()) {
                h.this.D(this.f30696a.b(iA2));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class j implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f30698a;

        public j(m mVar) {
            this.f30698a = mVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iD2 = h.this.A().d2() - 1;
            if (iD2 >= 0) {
                h.this.D(this.f30698a.b(iD2));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum k {
        DAY,
        YEAR
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface l {
        void a(long j10);
    }

    public static h B(com.google.android.material.datepicker.d dVar, int i10, com.google.android.material.datepicker.a aVar) {
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.h());
        hVar.setArguments(bundle);
        return hVar;
    }

    public static /* synthetic */ com.google.android.material.datepicker.d p(h hVar) {
        hVar.getClass();
        return null;
    }

    public static int y(Context context) {
        return context.getResources().getDimensionPixelSize(c7.c.f25892x);
    }

    public static int z(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(c7.c.f25858E) + resources.getDimensionPixelOffset(c7.c.f25859F) + resources.getDimensionPixelOffset(c7.c.f25857D);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(c7.c.f25894z);
        int i10 = com.google.android.material.datepicker.l.f30740e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(c7.c.f25892x) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(c7.c.f25856C)) + resources.getDimensionPixelOffset(c7.c.f25890v);
    }

    public LinearLayoutManager A() {
        return (LinearLayoutManager) this.f30679h.getLayoutManager();
    }

    public final void C(int i10) {
        this.f30679h.post(new a(i10));
    }

    public void D(com.google.android.material.datepicker.k kVar) {
        m mVar = (m) this.f30679h.getAdapter();
        int iD = mVar.d(kVar);
        int iD2 = iD - mVar.d(this.f30675d);
        boolean z10 = Math.abs(iD2) > 3;
        boolean z11 = iD2 > 0;
        this.f30675d = kVar;
        if (z10 && z11) {
            this.f30679h.l1(iD - 3);
            C(iD);
        } else if (!z10) {
            C(iD);
        } else {
            this.f30679h.l1(iD + 3);
            C(iD);
        }
    }

    public void E(k kVar) {
        this.f30676e = kVar;
        if (kVar == k.YEAR) {
            this.f30678g.getLayoutManager().y1(((s) this.f30678g.getAdapter()).a(this.f30675d.f30735c));
            this.f30680i.setVisibility(0);
            this.f30681j.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f30680i.setVisibility(8);
            this.f30681j.setVisibility(0);
            D(this.f30675d);
        }
    }

    public void F() {
        k kVar = this.f30676e;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            E(k.DAY);
        } else if (kVar == k.DAY) {
            E(kVar2);
        }
    }

    @Override // com.google.android.material.datepicker.o
    public boolean l(n nVar) {
        return super.l(nVar);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f30673b = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.a.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f30674c = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f30675d = (com.google.android.material.datepicker.k) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f30673b);
        this.f30677f = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.k kVarI = this.f30674c.i();
        if (com.google.android.material.datepicker.i.I(contextThemeWrapper)) {
            i10 = c7.g.f25956o;
            i11 = 1;
        } else {
            i10 = c7.g.f25954m;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(z(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(c7.e.f25935u);
        E.f0(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.g());
        gridView.setNumColumns(kVarI.f30736d);
        gridView.setEnabled(false);
        this.f30679h = (RecyclerView) viewInflate.findViewById(c7.e.f25938x);
        this.f30679h.setLayoutManager(new c(getContext(), i11, false, i11));
        this.f30679h.setTag(f30669k);
        m mVar = new m(contextThemeWrapper, null, this.f30674c, new d());
        this.f30679h.setAdapter(mVar);
        int integer = contextThemeWrapper.getResources().getInteger(c7.f.f25941a);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(c7.e.f25939y);
        this.f30678g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f30678g.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f30678g.setAdapter(new s(this));
            this.f30678g.h(t());
        }
        if (viewInflate.findViewById(c7.e.f25930p) != null) {
            s(viewInflate, mVar);
        }
        if (!com.google.android.material.datepicker.i.I(contextThemeWrapper)) {
            new androidx.recyclerview.widget.m().b(this.f30679h);
        }
        this.f30679h.l1(mVar.d(this.f30675d));
        return viewInflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f30673b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f30674c);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f30675d);
    }

    public final void s(View view, m mVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(c7.e.f25930p);
        materialButton.setTag(f30672n);
        E.f0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(c7.e.f25932r);
        materialButton2.setTag(f30670l);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(c7.e.f25931q);
        materialButton3.setTag(f30671m);
        this.f30680i = view.findViewById(c7.e.f25939y);
        this.f30681j = view.findViewById(c7.e.f25934t);
        E(k.DAY);
        materialButton.setText(this.f30675d.x());
        this.f30679h.l(new g(mVar, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC0361h());
        materialButton3.setOnClickListener(new i(mVar));
        materialButton2.setOnClickListener(new j(mVar));
    }

    public final RecyclerView.o t() {
        return new e();
    }

    public com.google.android.material.datepicker.a u() {
        return this.f30674c;
    }

    public com.google.android.material.datepicker.c v() {
        return this.f30677f;
    }

    public com.google.android.material.datepicker.k w() {
        return this.f30675d;
    }

    public com.google.android.material.datepicker.d x() {
        return null;
    }
}
