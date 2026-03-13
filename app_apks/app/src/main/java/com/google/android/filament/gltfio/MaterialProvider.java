package com.google.android.filament.gltfio;

import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.proguard.UsedByNative;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("AssetLoader.cpp")
public interface MaterialProvider {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @UsedByNative("MaterialKey.cpp")
    public static class MaterialKey {

        @UsedByNative("MaterialKey.cpp")
        public int alphaMode;

        @UsedByNative("MaterialKey.cpp")
        public int aoUV;

        @UsedByNative("MaterialKey.cpp")
        public int baseColorUV;

        @UsedByNative("MaterialKey.cpp")
        public int clearCoatNormalUV;

        @UsedByNative("MaterialKey.cpp")
        public int clearCoatRoughnessUV;

        @UsedByNative("MaterialKey.cpp")
        public int clearCoatUV;

        @UsedByNative("MaterialKey.cpp")
        public boolean doubleSided;

        @UsedByNative("MaterialKey.cpp")
        public int emissiveUV;

        @UsedByNative("MaterialKey.cpp")
        public boolean enableDiagnostics;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasBaseColorTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasClearCoat;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasClearCoatNormalTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasClearCoatRoughnessTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasClearCoatTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasEmissiveTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasIOR;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasMetallicRoughnessTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasNormalTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasOcclusionTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasSheen;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasSheenColorTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasSheenRoughnessTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasTextureTransforms;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasTransmission;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasTransmissionTexture;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasVertexColors;

        @UsedByNative("MaterialKey.cpp")
        public boolean hasVolumeThicknessTexture;

        @UsedByNative("MaterialKey.cpp")
        public int metallicRoughnessUV;

        @UsedByNative("MaterialKey.cpp")
        public int normalUV;

        @UsedByNative("MaterialKey.cpp")
        public int sheenColorUV;

        @UsedByNative("MaterialKey.cpp")
        public int sheenRoughnessUV;

        @UsedByNative("MaterialKey.cpp")
        public int transmissionUV;

        @UsedByNative("MaterialKey.cpp")
        public boolean unlit;

        @UsedByNative("MaterialKey.cpp")
        public boolean useSpecularGlossiness;

        @UsedByNative("MaterialKey.cpp")
        public int volumeThicknessUV;

        static {
            nGlobalInit();
        }

        private static native void nConstrainMaterial(MaterialKey materialKey, int[] iArr);

        private static native void nGlobalInit();

        public void constrainMaterial(int[] iArr) {
            nConstrainMaterial(this, iArr);
        }
    }

    MaterialInstance createMaterialInstance(MaterialKey materialKey, int[] iArr, String str, String str2);

    void destroy();

    void destroyMaterials();

    Material getMaterial(MaterialKey materialKey, int[] iArr, String str);

    Material[] getMaterials();

    boolean needsDummyData(int i10);
}
