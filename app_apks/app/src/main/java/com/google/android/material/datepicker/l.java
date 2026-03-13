package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class l extends BaseAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30740e = r.i().getMaximum(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f30741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f30742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f30743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f30744d;

    public l(k kVar, d dVar, a aVar) {
        this.f30741a = kVar;
        this.f30744d = aVar;
        this.f30742b = dVar.s();
    }

    public int a(int i10) {
        return b() + (i10 - 1);
    }

    public int b() {
        return this.f30741a.u();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < this.f30741a.u() || i10 > g()) {
            return null;
        }
        return Long.valueOf(this.f30741a.v(h(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = c7.g.f25952k
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.k r8 = r5.f30741a
            int r2 = r8.f30737e
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.k r8 = r5.f30741a
            long r7 = r8.v(r7)
            com.google.android.material.datepicker.k r3 = r5.f30741a
            int r3 = r3.f30735c
            com.google.android.material.datepicker.k r4 = com.google.android.material.datepicker.k.q()
            int r4 = r4.f30735c
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.e.d(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.i(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.l.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void e(Context context) {
        if (this.f30743c == null) {
            this.f30743c = new c(context);
        }
    }

    public final boolean f(long j10) {
        throw null;
    }

    public int g() {
        return (this.f30741a.u() + this.f30741a.f30737e) - 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f30741a.f30737e + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f30741a.f30736d;
    }

    public int h(int i10) {
        return (i10 - this.f30741a.u()) + 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public final void i(TextView textView, long j10) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.f30744d.e().p(j10)) {
            textView.setEnabled(true);
            bVar = f(j10) ? this.f30743c.f30657b : r.g().getTimeInMillis() == j10 ? this.f30743c.f30658c : this.f30743c.f30656a;
        } else {
            textView.setEnabled(false);
            bVar = this.f30743c.f30662g;
        }
        bVar.b(textView);
    }

    public final void j(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (k.j(j10).equals(this.f30741a)) {
            i((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f30741a.w(j10)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    public void k(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f30742b.iterator();
        while (it.hasNext()) {
            j(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    public boolean l(int i10) {
        return i10 >= b() && i10 <= g();
    }
}
