package com.google.android.gms.common.api;

import B6.l;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import s6.C5783b;
import t6.AbstractC5845c;
import t6.C5854l;
import t6.InterfaceC5851i;
import v6.AbstractC6055j;
import v6.AbstractC6056k;
import w6.AbstractC6157a;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Status extends AbstractC6157a implements InterfaceC5851i, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f29029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5783b f29030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f29019e = new Status(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f29020f = new Status(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f29021g = new Status(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f29022h = new Status(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Status f29023i = new Status(15);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Status f29024j = new Status(16);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Status f29025k = new Status(17);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Status f29026l = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new C5854l();

    public Status(int i10, String str, PendingIntent pendingIntent, C5783b c5783b) {
        this.f29027a = i10;
        this.f29028b = str;
        this.f29029c = pendingIntent;
        this.f29030d = c5783b;
    }

    public C5783b d() {
        return this.f29030d;
    }

    public int e() {
        return this.f29027a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f29027a == status.f29027a && AbstractC6055j.a(this.f29028b, status.f29028b) && AbstractC6055j.a(this.f29029c, status.f29029c) && AbstractC6055j.a(this.f29030d, status.f29030d);
    }

    public String f() {
        return this.f29028b;
    }

    public boolean h() {
        return this.f29029c != null;
    }

    public int hashCode() {
        return AbstractC6055j.b(Integer.valueOf(this.f29027a), this.f29028b, this.f29029c, this.f29030d);
    }

    public boolean k() {
        return this.f29027a <= 0;
    }

    public void l(Activity activity, int i10) throws IntentSender.SendIntentException {
        if (h()) {
            Bundle bundle = l.j() ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            PendingIntent pendingIntent = this.f29029c;
            AbstractC6056k.l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0, bundle);
        }
    }

    public final String n() {
        String str = this.f29028b;
        return str != null ? str : AbstractC5845c.a(this.f29027a);
    }

    public String toString() {
        AbstractC6055j.a aVarC = AbstractC6055j.c(this);
        aVarC.a("statusCode", n());
        aVarC.a("resolution", this.f29029c);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, e());
        c.w(parcel, 2, f(), false);
        c.u(parcel, 3, this.f29029c, i10, false);
        c.u(parcel, 4, d(), i10, false);
        c.b(parcel, iA);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(C5783b c5783b, String str) {
        this(c5783b, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    public Status(C5783b c5783b, String str, int i10) {
        this(i10, str, c5783b.h(), c5783b);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
