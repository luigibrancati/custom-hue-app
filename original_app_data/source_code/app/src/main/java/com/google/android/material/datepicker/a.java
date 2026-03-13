package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0360a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f30638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f30639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f30640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f30641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30643f;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0360a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((k) parcel.readParcelable(k.class.getClassLoader()), (k) parcel.readParcelable(k.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (k) parcel.readParcelable(k.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c extends Parcelable {
        boolean p(long j10);
    }

    public /* synthetic */ a(k kVar, k kVar2, c cVar, k kVar3, C0360a c0360a) {
        this(kVar, kVar2, cVar, kVar3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public c e() {
        return this.f30640c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f30638a.equals(aVar.f30638a) && this.f30639b.equals(aVar.f30639b) && X0.c.a(this.f30641d, aVar.f30641d) && this.f30640c.equals(aVar.f30640c);
    }

    public k f() {
        return this.f30639b;
    }

    public int g() {
        return this.f30643f;
    }

    public k h() {
        return this.f30641d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30638a, this.f30639b, this.f30641d, this.f30640c});
    }

    public k i() {
        return this.f30638a;
    }

    public int j() {
        return this.f30642e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f30638a, 0);
        parcel.writeParcelable(this.f30639b, 0);
        parcel.writeParcelable(this.f30641d, 0);
        parcel.writeParcelable(this.f30640c, 0);
    }

    public a(k kVar, k kVar2, c cVar, k kVar3) {
        this.f30638a = kVar;
        this.f30639b = kVar2;
        this.f30641d = kVar3;
        this.f30640c = cVar;
        if (kVar3 != null && kVar.compareTo(kVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (kVar3 != null && kVar3.compareTo(kVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f30643f = kVar.A(kVar2) + 1;
        this.f30642e = (kVar2.f30735c - kVar.f30735c) + 1;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f30644e = r.a(k.b(1900, 0).f30738f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f30645f = r.a(k.b(2100, 11).f30738f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f30646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f30647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f30648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f30649d;

        public b() {
            this.f30646a = f30644e;
            this.f30647b = f30645f;
            this.f30649d = f.a(Long.MIN_VALUE);
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f30649d);
            k kVarJ = k.j(this.f30646a);
            k kVarJ2 = k.j(this.f30647b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f30648c;
            return new a(kVarJ, kVarJ2, cVar, l10 == null ? null : k.j(l10.longValue()), null);
        }

        public b b(long j10) {
            this.f30648c = Long.valueOf(j10);
            return this;
        }

        public b(a aVar) {
            this.f30646a = f30644e;
            this.f30647b = f30645f;
            this.f30649d = f.a(Long.MIN_VALUE);
            this.f30646a = aVar.f30638a.f30738f;
            this.f30647b = aVar.f30639b.f30738f;
            this.f30648c = Long.valueOf(aVar.f30641d.f30738f);
            this.f30649d = aVar.f30640c;
        }
    }
}
