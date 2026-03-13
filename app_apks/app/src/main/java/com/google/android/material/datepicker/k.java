package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Comparable, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f30733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f30738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f30739g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return k.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = r.d(calendar);
        this.f30733a = calendarD;
        this.f30734b = calendarD.get(2);
        this.f30735c = calendarD.get(1);
        this.f30736d = calendarD.getMaximum(7);
        this.f30737e = calendarD.getActualMaximum(5);
        this.f30738f = calendarD.getTimeInMillis();
    }

    public static k b(int i10, int i11) {
        Calendar calendarI = r.i();
        calendarI.set(1, i10);
        calendarI.set(2, i11);
        return new k(calendarI);
    }

    public static k j(long j10) {
        Calendar calendarI = r.i();
        calendarI.setTimeInMillis(j10);
        return new k(calendarI);
    }

    public static k q() {
        return new k(r.g());
    }

    public int A(k kVar) {
        if (this.f30733a instanceof GregorianCalendar) {
            return ((kVar.f30735c - this.f30735c) * 12) + (kVar.f30734b - this.f30734b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return this.f30733a.compareTo(kVar.f30733a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f30734b == kVar.f30734b && this.f30735c == kVar.f30735c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30734b), Integer.valueOf(this.f30735c)});
    }

    public int u() {
        int firstDayOfWeek = this.f30733a.get(7) - this.f30733a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f30736d : firstDayOfWeek;
    }

    public long v(int i10) {
        Calendar calendarD = r.d(this.f30733a);
        calendarD.set(5, i10);
        return calendarD.getTimeInMillis();
    }

    public int w(long j10) {
        Calendar calendarD = r.d(this.f30733a);
        calendarD.setTimeInMillis(j10);
        return calendarD.get(5);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f30735c);
        parcel.writeInt(this.f30734b);
    }

    public String x() {
        if (this.f30739g == null) {
            this.f30739g = e.c(this.f30733a.getTimeInMillis());
        }
        return this.f30739g;
    }

    public long y() {
        return this.f30733a.getTimeInMillis();
    }

    public k z(int i10) {
        Calendar calendarD = r.d(this.f30733a);
        calendarD.add(2, i10);
        return new k(calendarD);
    }
}
