package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f30665d = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f30666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30668c;

    public g() {
        Calendar calendarI = r.i();
        this.f30666a = calendarI;
        this.f30667b = calendarI.getMaximum(7);
        this.f30668c = calendarI.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f30667b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    public final int b(int i10) {
        int i11 = i10 + this.f30668c;
        int i12 = this.f30667b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f30667b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(c7.g.f25953l, viewGroup, false);
        }
        this.f30666a.set(7, b(i10));
        textView.setText(this.f30666a.getDisplayName(7, f30665d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(c7.h.f25969j), this.f30666a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
