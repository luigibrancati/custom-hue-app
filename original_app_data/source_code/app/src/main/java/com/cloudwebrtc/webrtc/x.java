package com.cloudwebrtc.webrtc;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f28854a;

    @Override // java.lang.Runnable
    public final void run() {
        this.f28854a.countDown();
    }
}
