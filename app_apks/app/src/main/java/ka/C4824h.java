package ka;

import java.util.concurrent.ExecutorService;
import ka.InterfaceC4817a;

/* JADX INFO: renamed from: ka.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4824h implements W3.c {

    /* JADX INFO: renamed from: ka.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4824h f39489a = new C4824h();
    }

    public static C4824h a() {
        return a.f39489a;
    }

    public static ExecutorService c() {
        return (ExecutorService) W3.e.d(InterfaceC4817a.c.g());
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExecutorService get() {
        return c();
    }
}
