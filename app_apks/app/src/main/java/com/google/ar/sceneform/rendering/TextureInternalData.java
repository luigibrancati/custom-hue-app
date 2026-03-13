package com.google.ar.sceneform.rendering;

import com.google.android.filament.proguard.UsedByNative;
import com.google.ar.sceneform.rendering.Texture;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("material_java_wrappers.h")
public class TextureInternalData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.filament.Texture f31276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Texture.Sampler f31277b;

    @UsedByNative("material_java_wrappers.h")
    public TextureInternalData(com.google.android.filament.Texture texture, Texture.Sampler sampler) {
        this.f31276a = texture;
        this.f31277b = sampler;
    }
}
