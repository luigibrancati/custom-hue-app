package com.google.android.material.datepicker;

import Y0.E;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class m extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.material.datepicker.a f30745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.l f30746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30747c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f30748a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f30748a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f30748a.getAdapter().l(i10)) {
                m.this.f30746b.a(this.f30748a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends RecyclerView.E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f30750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MaterialCalendarGridView f30751b;

        public b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(c7.e.f25933s);
            this.f30750a = textView;
            E.g0(textView, true);
            this.f30751b = (MaterialCalendarGridView) linearLayout.findViewById(c7.e.f25929o);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public m(Context context, d dVar, com.google.android.material.datepicker.a aVar, h.l lVar) {
        k kVarI = aVar.i();
        k kVarF = aVar.f();
        k kVarH = aVar.h();
        if (kVarI.compareTo(kVarH) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (kVarH.compareTo(kVarF) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f30747c = (l.f30740e * h.y(context)) + (i.I(context) ? h.y(context) : 0);
        this.f30745a = aVar;
        this.f30746b = lVar;
        setHasStableIds(true);
    }

    public k b(int i10) {
        return this.f30745a.i().z(i10);
    }

    public CharSequence c(int i10) {
        return b(i10).x();
    }

    public int d(k kVar) {
        return this.f30745a.i().A(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        k kVarZ = this.f30745a.i().z(i10);
        bVar.f30750a.setText(kVarZ.x());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f30751b.findViewById(c7.e.f25929o);
        if (materialCalendarGridView.getAdapter() == null || !kVarZ.equals(materialCalendarGridView.getAdapter().f30741a)) {
            l lVar = new l(kVarZ, null, this.f30745a);
            materialCalendarGridView.setNumColumns(kVarZ.f30736d);
            materialCalendarGridView.setAdapter((ListAdapter) lVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().k(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(c7.g.f25955n, viewGroup, false);
        if (!i.I(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f30747c));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f30745a.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f30745a.i().z(i10).y();
    }
}
