package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.material.timepicker.a f31011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.material.timepicker.a f31012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31017g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f31014d == cVar.f31014d && this.f31015e == cVar.f31015e && this.f31013c == cVar.f31013c && this.f31016f == cVar.f31016f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31013c), Integer.valueOf(this.f31014d), Integer.valueOf(this.f31015e), Integer.valueOf(this.f31016f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f31014d);
        parcel.writeInt(this.f31015e);
        parcel.writeInt(this.f31016f);
        parcel.writeInt(this.f31013c);
    }

    public c(int i10) {
        this(0, 0, 10, i10);
    }

    public c(int i10, int i11, int i12, int i13) {
        this.f31014d = i10;
        this.f31015e = i11;
        this.f31016f = i12;
        this.f31013c = i13;
        this.f31017g = c(i10);
        this.f31011a = new com.google.android.material.timepicker.a(59);
        this.f31012b = new com.google.android.material.timepicker.a(i13 == 1 ? 24 : 12);
    }

    public c(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
