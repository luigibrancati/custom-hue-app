package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f31865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31866b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public /* synthetic */ l(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static l f(long j10) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j10);
        return new l(h() + (micros - a()), micros);
    }

    public static long h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public long b() {
        return this.f31865a + c();
    }

    public long c() {
        return d(new l());
    }

    public long d(l lVar) {
        return lVar.f31866b - this.f31866b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f31865a;
    }

    public void g() {
        this.f31865a = h();
        this.f31866b = a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f31865a);
        parcel.writeLong(this.f31866b);
    }

    public l() {
        this(h(), a());
    }

    public l(long j10, long j11) {
        this.f31865a = j10;
        this.f31866b = j11;
    }

    public l(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
