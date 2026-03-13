package b7;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: b7.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2881o implements InterfaceC2882p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f25418a = new CountDownLatch(1);

    public /* synthetic */ C2881o(byte[] bArr) {
    }

    @Override // b7.InterfaceC2871e
    public final void a() {
        this.f25418a.countDown();
    }

    public final void b() throws InterruptedException {
        this.f25418a.await();
    }

    @Override // b7.InterfaceC2873g
    public final void c(Exception exc) {
        this.f25418a.countDown();
    }

    public final boolean d(long j10, TimeUnit timeUnit) {
        return this.f25418a.await(j10, timeUnit);
    }

    @Override // b7.InterfaceC2874h
    public final void onSuccess(Object obj) {
        this.f25418a.countDown();
    }
}
