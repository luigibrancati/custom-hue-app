package T7;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f16256a = new C0198a(false);

    /* JADX INFO: renamed from: T7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0198a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f16257a;

        public C0198a(boolean z10) {
            this.f16257a = new AtomicBoolean(z10);
        }

        @Override // T7.c
        public boolean getValue() {
            return this.f16257a.get();
        }
    }
}
