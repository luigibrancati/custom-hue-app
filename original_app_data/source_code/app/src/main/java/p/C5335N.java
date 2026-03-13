package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: p.N, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5335N extends C5333L implements InterfaceC5334M {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public InterfaceC5334M f41847G;

    /* JADX INFO: renamed from: p.N$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: renamed from: p.N$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* JADX INFO: renamed from: p.N$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends C5330I {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f41848n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f41849o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public InterfaceC5334M f41850p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public MenuItem f41851q;

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f41848n = 21;
                this.f41849o = 22;
            } else {
                this.f41848n = 22;
                this.f41849o = 21;
            }
        }

        @Override // p.C5330I
        public /* bridge */ /* synthetic */ int d(int i10, int i11, int i12, int i13, int i14) {
            return super.d(i10, i11, i12, i13, i14);
        }

        @Override // p.C5330I
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i10) {
            return super.e(motionEvent, i10);
        }

        @Override // p.C5330I, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // p.C5330I, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // p.C5330I, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // p.C5330I, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // p.C5330I, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.f41850p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= dVar.getCount()) ? null : dVar.getItem(i10);
                MenuItem menuItem = this.f41851q;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.f41850p.m(eVarB, menuItem);
                    }
                    this.f41851q = item;
                    if (item != null) {
                        this.f41850p.c(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f41848n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f41849o) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) adapter).b().e(false);
            return true;
        }

        @Override // p.C5330I, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC5334M interfaceC5334M) {
            this.f41850p = interfaceC5334M;
        }

        @Override // p.C5330I, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    public C5335N(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void Q(Object obj) {
        a.a(this.f41813F, (Transition) obj);
    }

    public void R(Object obj) {
        a.b(this.f41813F, (Transition) obj);
    }

    public void S(InterfaceC5334M interfaceC5334M) {
        this.f41847G = interfaceC5334M;
    }

    public void T(boolean z10) {
        b.a(this.f41813F, z10);
    }

    @Override // p.InterfaceC5334M
    public void c(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        InterfaceC5334M interfaceC5334M = this.f41847G;
        if (interfaceC5334M != null) {
            interfaceC5334M.c(eVar, menuItem);
        }
    }

    @Override // p.InterfaceC5334M
    public void m(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        InterfaceC5334M interfaceC5334M = this.f41847G;
        if (interfaceC5334M != null) {
            interfaceC5334M.m(eVar, menuItem);
        }
    }

    @Override // p.C5333L
    public C5330I r(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
