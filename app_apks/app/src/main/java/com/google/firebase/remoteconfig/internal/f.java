package com.google.firebase.remoteconfig.internal;

import k9.s;
import k9.u;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class f implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f31979c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f31980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f31981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u f31982c;

        public f a() {
            return new f(this.f31980a, this.f31981b, this.f31982c);
        }

        public b b(u uVar) {
            this.f31982c = uVar;
            return this;
        }

        public b c(int i10) {
            this.f31981b = i10;
            return this;
        }

        public b d(long j10) {
            this.f31980a = j10;
            return this;
        }

        public b() {
        }
    }

    public static b d() {
        return new b();
    }

    @Override // k9.s
    public long a() {
        return this.f31977a;
    }

    @Override // k9.s
    public u b() {
        return this.f31979c;
    }

    @Override // k9.s
    public int c() {
        return this.f31978b;
    }

    public f(long j10, int i10, u uVar) {
        this.f31977a = j10;
        this.f31978b = i10;
        this.f31979c = uVar;
    }
}
