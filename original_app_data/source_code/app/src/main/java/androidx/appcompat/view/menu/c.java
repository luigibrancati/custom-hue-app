package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c implements i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f21543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f21544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f21545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f21546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i.a f21550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f21551i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21552a = -1;

        public a() {
            a();
        }

        public void a() {
            g gVarV = c.this.f21545c.v();
            if (gVarV != null) {
                ArrayList arrayListZ = c.this.f21545c.z();
                int size = arrayListZ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((g) arrayListZ.get(i10)) == gVarV) {
                        this.f21552a = i10;
                        return;
                    }
                }
            }
            this.f21552a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList arrayListZ = c.this.f21545c.z();
            int i11 = i10 + c.this.f21547e;
            int i12 = this.f21552a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (g) arrayListZ.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f21545c.z().size() - c.this.f21547e;
            return this.f21552a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f21544b.inflate(cVar.f21549g, viewGroup, false);
            }
            ((j.a) view).c(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f21543a = context;
        this.f21544b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f21551i == null) {
            this.f21551i = new a();
        }
        return this.f21551i;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        i.a aVar = this.f21550h;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f21550h = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        new f(lVar).d(null);
        i.a aVar = this.f21550h;
        if (aVar == null) {
            return true;
        }
        aVar.c(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        a aVar = this.f21551i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, e eVar) {
        if (this.f21548f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f21548f);
            this.f21543a = contextThemeWrapper;
            this.f21544b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f21543a != null) {
            this.f21543a = context;
            if (this.f21544b == null) {
                this.f21544b = LayoutInflater.from(context);
            }
        }
        this.f21545c = eVar;
        a aVar = this.f21551i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public j j(ViewGroup viewGroup) {
        if (this.f21546d == null) {
            this.f21546d = (ExpandedMenuView) this.f21544b.inflate(h.g.f35914g, viewGroup, false);
            if (this.f21551i == null) {
                this.f21551i = new a();
            }
            this.f21546d.setAdapter((ListAdapter) this.f21551i);
            this.f21546d.setOnItemClickListener(this);
        }
        return this.f21546d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f21545c.N(this.f21551i.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f21549g = i10;
        this.f21548f = i11;
    }
}
