package y6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import t6.InterfaceC5848f;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f48480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f48481b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f48482a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Executor f48483b;

        public a a(InterfaceC5848f interfaceC5848f) {
            this.f48482a.add(interfaceC5848f);
            return this;
        }

        public f b() {
            return new f(this.f48482a, null, this.f48483b, true, null);
        }
    }

    public /* synthetic */ f(List list, InterfaceC6439a interfaceC6439a, Executor executor, boolean z10, byte[] bArr) {
        AbstractC6056k.m(list, "APIs must not be null.");
        AbstractC6056k.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            AbstractC6056k.m(interfaceC6439a, "Listener must not be null when listener executor is set.");
        }
        this.f48480a = list;
        this.f48481b = executor;
    }

    public static a d() {
        return new a();
    }

    public List a() {
        return this.f48480a;
    }

    public InterfaceC6439a b() {
        return null;
    }

    public Executor c() {
        return this.f48481b;
    }
}
