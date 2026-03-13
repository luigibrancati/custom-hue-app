package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class s extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f30758a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends RecyclerView.E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f30759a;

        public a(TextView textView) {
            super(textView);
            this.f30759a = textView;
        }
    }

    public s(h hVar) {
        this.f30758a = hVar;
    }

    public int a(int i10) {
        return i10 - this.f30758a.u().i().f30735c;
    }

    public int b(int i10) {
        return this.f30758a.u().i().f30735c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i10) {
        int iB = b(i10);
        String string = aVar.f30759a.getContext().getString(c7.h.f25970k);
        aVar.f30759a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iB)));
        aVar.f30759a.setContentDescription(String.format(string, Integer.valueOf(iB)));
        c cVarV = this.f30758a.v();
        if (r.g().get(1) == iB) {
            b bVar = cVarV.f30661f;
        } else {
            b bVar2 = cVarV.f30659d;
        }
        this.f30758a.x();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(c7.g.f25957p, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f30758a.u().j();
    }
}
