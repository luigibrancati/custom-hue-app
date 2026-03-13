package com.google.android.play.core.splitinstall;

import A7.AbstractC0690n;
import A7.o;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class SplitInstallRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f31027b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f31028a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f31029b = new ArrayList();

        public /* synthetic */ a(AbstractC0690n abstractC0690n) {
        }

        public a a(String str) {
            this.f31028a.add(str);
            return this;
        }

        public SplitInstallRequest b() {
            return new SplitInstallRequest(this, null);
        }
    }

    public /* synthetic */ SplitInstallRequest(a aVar, o oVar) {
        this.f31026a = new ArrayList(aVar.f31028a);
        this.f31027b = new ArrayList(aVar.f31029b);
    }

    public static a a() {
        return new a(null);
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.f31026a, this.f31027b);
    }
}
