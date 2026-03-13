package com.google.android.filament.gltfio;

import com.google.android.filament.Engine;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.gltfio.MaterialProvider;
import com.google.android.filament.proguard.UsedByNative;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class UbershaderProvider implements MaterialProvider {
    private static final VertexBuffer.VertexAttribute[] sVertexAttributesValues = VertexBuffer.VertexAttribute.values();
    private long mNativeObject;

    /* JADX INFO: renamed from: com.google.android.filament.gltfio.UbershaderProvider$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$VertexBuffer$VertexAttribute;

        static {
            int[] iArr = new int[VertexBuffer.VertexAttribute.values().length];
            $SwitchMap$com$google$android$filament$VertexBuffer$VertexAttribute = iArr;
            try {
                iArr[VertexBuffer.VertexAttribute.UV0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$filament$VertexBuffer$VertexAttribute[VertexBuffer.VertexAttribute.UV1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$filament$VertexBuffer$VertexAttribute[VertexBuffer.VertexAttribute.COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public UbershaderProvider(Engine engine) {
        this.mNativeObject = nCreateUbershaderProvider(engine.getNativeObject());
    }

    private static native long nCreateMaterialInstance(long j10, MaterialProvider.MaterialKey materialKey, int[] iArr, String str, String str2);

    private static native long nCreateUbershaderProvider(long j10);

    private static native void nDestroyMaterials(long j10);

    private static native void nDestroyUbershaderProvider(long j10);

    private static native long nGetMaterial(long j10, MaterialProvider.MaterialKey materialKey, int[] iArr, String str);

    private static native int nGetMaterialCount(long j10);

    private static native void nGetMaterials(long j10, long[] jArr);

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public MaterialInstance createMaterialInstance(MaterialProvider.MaterialKey materialKey, int[] iArr, String str, String str2) {
        long jNCreateMaterialInstance = nCreateMaterialInstance(this.mNativeObject, materialKey, iArr, str, str2);
        if (jNCreateMaterialInstance == 0) {
            return null;
        }
        return new MaterialInstance((Engine) null, jNCreateMaterialInstance);
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public void destroy() {
        nDestroyUbershaderProvider(this.mNativeObject);
        this.mNativeObject = 0L;
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public void destroyMaterials() {
        nDestroyMaterials(this.mNativeObject);
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public Material getMaterial(MaterialProvider.MaterialKey materialKey, int[] iArr, String str) {
        long jNGetMaterial = nGetMaterial(this.mNativeObject, materialKey, iArr, str);
        if (jNGetMaterial == 0) {
            return null;
        }
        return new Material(jNGetMaterial);
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public Material[] getMaterials() {
        int iNGetMaterialCount = nGetMaterialCount(this.mNativeObject);
        Material[] materialArr = new Material[iNGetMaterialCount];
        long[] jArr = new long[iNGetMaterialCount];
        nGetMaterials(this.mNativeObject, jArr);
        for (int i10 = 0; i10 < iNGetMaterialCount; i10++) {
            materialArr[i10] = new Material(jArr[i10]);
        }
        return materialArr;
    }

    @UsedByNative("AssetLoader.cpp")
    public long getNativeObject() {
        return this.mNativeObject;
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public boolean needsDummyData(int i10) {
        int i11 = AnonymousClass1.$SwitchMap$com$google$android$filament$VertexBuffer$VertexAttribute[sVertexAttributesValues[i10].ordinal()];
        return i11 == 1 || i11 == 2 || i11 == 3;
    }
}
