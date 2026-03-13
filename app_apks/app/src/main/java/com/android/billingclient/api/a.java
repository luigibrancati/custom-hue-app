package com.android.billingclient.api;

import O4.AbstractC1617u0;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26603b;

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0341a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f26605b = "";

        public /* synthetic */ C0341a(AbstractC1617u0 abstractC1617u0) {
        }

        public a a() {
            a aVar = new a();
            aVar.f26602a = this.f26604a;
            aVar.f26603b = this.f26605b;
            return aVar;
        }

        public C0341a b(String str) {
            this.f26605b = str;
            return this;
        }

        public C0341a c(int i10) {
            this.f26604a = i10;
            return this;
        }
    }

    public static C0341a c() {
        return new C0341a(null);
    }

    public String a() {
        return this.f26603b;
    }

    public int b() {
        return this.f26602a;
    }

    public String toString() {
        return "Response Code: " + AbstractC3524e1.h(this.f26602a) + ", Debug Message: " + this.f26603b;
    }
}
