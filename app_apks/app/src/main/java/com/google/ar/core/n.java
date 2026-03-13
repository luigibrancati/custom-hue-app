package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class n extends com.google.ar.core.dependencies.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArImage f31210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31212c;

    public n(ArImage arImage, long j10, int i10) {
        Objects.requireNonNull(arImage);
        this.f31210a = arImage;
        this.f31211b = j10;
        this.f31212c = i10;
    }

    @Override // android.media.Image.Plane
    public final ByteBuffer getBuffer() {
        ArImage arImage = this.f31210a;
        return arImage.c(arImage.d().nativeWrapperHandle, this.f31211b, this.f31212c).asReadOnlyBuffer();
    }

    @Override // android.media.Image.Plane
    public final int getPixelStride() {
        ArImage arImage = this.f31210a;
        int iB = arImage.b(arImage.d().nativeWrapperHandle, this.f31211b, this.f31212c);
        if (iB != -1) {
            return iB;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getPixelStride().");
    }

    @Override // android.media.Image.Plane
    public final int getRowStride() {
        ArImage arImage = this.f31210a;
        int iA = arImage.a(arImage.d().nativeWrapperHandle, this.f31211b, this.f31212c);
        if (iA != -1) {
            return iA;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getRowStride().");
    }
}
