package org.apache.tika.renderer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class RenderingTracker {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f41602id = 0;

    public synchronized int getNextId() {
        int i10;
        i10 = this.f41602id + 1;
        this.f41602id = i10;
        return i10;
    }
}
