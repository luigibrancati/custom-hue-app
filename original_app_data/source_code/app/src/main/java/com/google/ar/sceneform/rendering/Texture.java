package com.google.ar.sceneform.rendering;

import com.google.android.filament.proguard.UsedByNative;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("material_java_wrappers.h")
public class Texture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextureInternalData f31275a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @UsedByNative("material_java_wrappers.h")
    public static class Sampler {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        @UsedByNative("material_java_wrappers.h")
        public enum MagFilter {
            NEAREST,
            LINEAR
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        @UsedByNative("material_java_wrappers.h")
        public enum MinFilter {
            NEAREST,
            LINEAR,
            NEAREST_MIPMAP_NEAREST,
            LINEAR_MIPMAP_NEAREST,
            NEAREST_MIPMAP_LINEAR,
            LINEAR_MIPMAP_LINEAR
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        @UsedByNative("material_java_wrappers.h")
        public enum WrapMode {
            CLAMP_TO_EDGE,
            REPEAT,
            MIRRORED_REPEAT
        }
    }

    @UsedByNative("material_java_wrappers.h")
    private Texture(TextureInternalData textureInternalData) {
        this.f31275a = textureInternalData;
    }
}
