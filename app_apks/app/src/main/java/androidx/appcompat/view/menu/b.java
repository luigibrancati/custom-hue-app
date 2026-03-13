package androidx.appcompat.view.menu;

import Y0.AbstractC2554h;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AbstractC5181d;
import p.C5335N;
import p.InterfaceC5334M;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC5181d implements i, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f21506B = h.g.f35912e;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f21507A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f21508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f21513g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f21521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f21522p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21527u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i.a f21530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f21531y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f21532z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f21514h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f21515i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f21516j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f21517k = new ViewOnAttachStateChangeListenerC0271b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC5334M f21518l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21519m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21520n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21528v = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21523q = C();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f21515i.size() <= 0 || ((d) b.this.f21515i.get(0)).f21540a.A()) {
                return;
            }
            View view = b.this.f21522p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f21515i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f21540a.show();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements InterfaceC5334M {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f21536a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MenuItem f21537b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f21538c;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f21536a = dVar;
                this.f21537b = menuItem;
                this.f21538c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f21536a;
                if (dVar != null) {
                    b.this.f21507A = true;
                    dVar.f21541b.e(false);
                    b.this.f21507A = false;
                }
                if (this.f21537b.isEnabled() && this.f21537b.hasSubMenu()) {
                    this.f21538c.M(this.f21537b, 4);
                }
            }
        }

        public c() {
        }

        @Override // p.InterfaceC5334M
        public void c(e eVar, MenuItem menuItem) {
            b.this.f21513g.removeCallbacksAndMessages(null);
            int size = b.this.f21515i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == ((d) b.this.f21515i.get(i10)).f21541b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f21513g.postAtTime(new a(i11 < b.this.f21515i.size() ? (d) b.this.f21515i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // p.InterfaceC5334M
        public void m(e eVar, MenuItem menuItem) {
            b.this.f21513g.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5335N f21540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f21541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21542c;

        public d(C5335N c5335n, e eVar, int i10) {
            this.f21540a = c5335n;
            this.f21541b = eVar;
            this.f21542c = i10;
        }

        public ListView a() {
            return this.f21540a.n();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f21508b = context;
        this.f21521o = view;
        this.f21510d = i10;
        this.f21511e = i11;
        this.f21512f = z10;
        Resources resources = context.getResources();
        this.f21509c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.d.f35828b));
        this.f21513g = new Handler();
    }

    public final MenuItem A(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View B(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemA = A(dVar.f21541b, eVar);
        if (menuItemA == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemA == dVar2.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int C() {
        return this.f21521o.getLayoutDirection() == 1 ? 0 : 1;
    }

    public final int D(int i10) {
        List list = this.f21515i;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f21522p.getWindowVisibleDisplayFrame(rect);
        return this.f21523q == 1 ? (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    public final void E(e eVar) {
        d dVar;
        View viewB;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f21508b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f21512f, f21506B);
        if (!a() && this.f21528v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(AbstractC5181d.w(eVar));
        }
        int iM = AbstractC5181d.m(dVar2, null, this.f21508b, this.f21509c);
        C5335N c5335nY = y();
        c5335nY.l(dVar2);
        c5335nY.E(iM);
        c5335nY.F(this.f21520n);
        if (this.f21515i.size() > 0) {
            List list = this.f21515i;
            dVar = (d) list.get(list.size() - 1);
            viewB = B(dVar, eVar);
        } else {
            dVar = null;
            viewB = null;
        }
        if (viewB != null) {
            c5335nY.T(false);
            c5335nY.Q(null);
            int iD = D(iM);
            boolean z10 = iD == 1;
            this.f21523q = iD;
            c5335nY.C(viewB);
            if ((this.f21520n & 5) != 5) {
                iM = z10 ? viewB.getWidth() : 0 - iM;
            } else if (!z10) {
                iM = 0 - viewB.getWidth();
            }
            c5335nY.d(iM);
            c5335nY.L(true);
            c5335nY.h(0);
        } else {
            if (this.f21524r) {
                c5335nY.d(this.f21526t);
            }
            if (this.f21525s) {
                c5335nY.h(this.f21527u);
            }
            c5335nY.G(l());
        }
        this.f21515i.add(new d(c5335nY, eVar, this.f21523q));
        c5335nY.show();
        ListView listViewN = c5335nY.n();
        listViewN.setOnKeyListener(this);
        if (dVar == null && this.f21529w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(h.g.f35919l, (ViewGroup) listViewN, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewN.addHeaderView(frameLayout, null, false);
            c5335nY.show();
        }
    }

    @Override // o.InterfaceC5183f
    public boolean a() {
        return this.f21515i.size() > 0 && ((d) this.f21515i.get(0)).f21540a.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        int iZ = z(eVar);
        if (iZ < 0) {
            return;
        }
        int i10 = iZ + 1;
        if (i10 < this.f21515i.size()) {
            ((d) this.f21515i.get(i10)).f21541b.e(false);
        }
        d dVar = (d) this.f21515i.remove(iZ);
        dVar.f21541b.P(this);
        if (this.f21507A) {
            dVar.f21540a.R(null);
            dVar.f21540a.D(0);
        }
        dVar.f21540a.dismiss();
        int size = this.f21515i.size();
        if (size > 0) {
            this.f21523q = ((d) this.f21515i.get(size - 1)).f21542c;
        } else {
            this.f21523q = C();
        }
        if (size != 0) {
            if (z10) {
                ((d) this.f21515i.get(0)).f21541b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.f21530x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f21531y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f21531y.removeGlobalOnLayoutListener(this.f21516j);
            }
            this.f21531y = null;
        }
        this.f21522p.removeOnAttachStateChangeListener(this.f21517k);
        this.f21532z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f21530x = aVar;
    }

    @Override // o.InterfaceC5183f
    public void dismiss() {
        int size = this.f21515i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f21515i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f21540a.a()) {
                    dVar.f21540a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        for (d dVar : this.f21515i) {
            if (lVar == dVar.f21541b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        j(lVar);
        i.a aVar = this.f21530x;
        if (aVar != null) {
            aVar.c(lVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        Iterator it = this.f21515i.iterator();
        while (it.hasNext()) {
            AbstractC5181d.x(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        return false;
    }

    @Override // o.AbstractC5181d
    public void j(e eVar) {
        eVar.c(this, this.f21508b);
        if (a()) {
            E(eVar);
        } else {
            this.f21514h.add(eVar);
        }
    }

    @Override // o.AbstractC5181d
    public boolean k() {
        return false;
    }

    @Override // o.InterfaceC5183f
    public ListView n() {
        if (this.f21515i.isEmpty()) {
            return null;
        }
        return ((d) this.f21515i.get(r1.size() - 1)).a();
    }

    @Override // o.AbstractC5181d
    public void o(View view) {
        if (this.f21521o != view) {
            this.f21521o = view;
            this.f21520n = AbstractC2554h.b(this.f21519m, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f21515i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f21515i.get(i10);
            if (!dVar.f21540a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f21541b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.AbstractC5181d
    public void q(boolean z10) {
        this.f21528v = z10;
    }

    @Override // o.AbstractC5181d
    public void r(int i10) {
        if (this.f21519m != i10) {
            this.f21519m = i10;
            this.f21520n = AbstractC2554h.b(i10, this.f21521o.getLayoutDirection());
        }
    }

    @Override // o.AbstractC5181d
    public void s(int i10) {
        this.f21524r = true;
        this.f21526t = i10;
    }

    @Override // o.InterfaceC5183f
    public void show() {
        if (a()) {
            return;
        }
        Iterator it = this.f21514h.iterator();
        while (it.hasNext()) {
            E((e) it.next());
        }
        this.f21514h.clear();
        View view = this.f21521o;
        this.f21522p = view;
        if (view != null) {
            boolean z10 = this.f21531y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f21531y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f21516j);
            }
            this.f21522p.addOnAttachStateChangeListener(this.f21517k);
        }
    }

    @Override // o.AbstractC5181d
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f21532z = onDismissListener;
    }

    @Override // o.AbstractC5181d
    public void u(boolean z10) {
        this.f21529w = z10;
    }

    @Override // o.AbstractC5181d
    public void v(int i10) {
        this.f21525s = true;
        this.f21527u = i10;
    }

    public final C5335N y() {
        C5335N c5335n = new C5335N(this.f21508b, null, this.f21510d, this.f21511e);
        c5335n.S(this.f21518l);
        c5335n.K(this);
        c5335n.J(this);
        c5335n.C(this.f21521o);
        c5335n.F(this.f21520n);
        c5335n.I(true);
        c5335n.H(2);
        return c5335n;
    }

    public final int z(e eVar) {
        int size = this.f21515i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == ((d) this.f21515i.get(i10)).f21541b) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class ViewOnAttachStateChangeListenerC0271b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0271b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f21531y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f21531y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f21531y.removeGlobalOnLayoutListener(bVar.f21516j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
