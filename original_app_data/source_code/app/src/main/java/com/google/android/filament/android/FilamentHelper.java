package com.google.android.filament.android;

import com.google.android.filament.Engine;
import com.google.android.filament.Fence;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class FilamentHelper {
    public static void synchronizePendingFrames(Engine engine) {
        Fence fenceCreateFence = engine.createFence();
        fenceCreateFence.wait(Fence.Mode.FLUSH, -1L);
        engine.destroyFence(fenceCreateFence);
    }
}
