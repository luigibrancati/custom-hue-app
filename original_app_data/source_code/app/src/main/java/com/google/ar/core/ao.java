package com.google.ar.core;

import android.media.ImageReader;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class ao implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ ao f31184a = new ao();

    private /* synthetic */ ao() {
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final /* synthetic */ void onImageAvailable(ImageReader imageReader) {
        SharedCamera.lambda$setDummyOnImageAvailableListener$0(imageReader);
    }
}
