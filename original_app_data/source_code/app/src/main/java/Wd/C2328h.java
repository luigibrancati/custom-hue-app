package Wd;

import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Wd.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2328h extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC4992i f17923a;

    public C2328h(InterfaceC4992i interfaceC4992i) {
        this.f17923a = interfaceC4992i;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return String.valueOf(this.f17923a);
    }
}
