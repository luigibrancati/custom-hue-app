package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f21554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21555b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f21558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21559f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f21557d = z10;
        this.f21558e = layoutInflater;
        this.f21554a = eVar;
        this.f21559f = i10;
        a();
    }

    public void a() {
        g gVarV = this.f21554a.v();
        if (gVarV != null) {
            ArrayList arrayListZ = this.f21554a.z();
            int size = arrayListZ.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((g) arrayListZ.get(i10)) == gVarV) {
                    this.f21555b = i10;
                    return;
                }
            }
        }
        this.f21555b = -1;
    }

    public e b() {
        return this.f21554a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList arrayListZ = this.f21557d ? this.f21554a.z() : this.f21554a.E();
        int i11 = this.f21555b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (g) arrayListZ.get(i10);
    }

    public void d(boolean z10) {
        this.f21556c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f21555b < 0 ? (this.f21557d ? this.f21554a.z() : this.f21554a.E()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f21558e.inflate(this.f21559f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f21554a.G() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        j.a aVar = (j.a) view;
        if (this.f21556c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
