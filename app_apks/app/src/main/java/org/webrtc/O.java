package org.webrtc;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class O implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RenderSynchronizer f41650a;

    public /* synthetic */ O(RenderSynchronizer renderSynchronizer) {
        this.f41650a = renderSynchronizer;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f41650a.onDisplayRefreshCycleBegin(j10);
    }
}
