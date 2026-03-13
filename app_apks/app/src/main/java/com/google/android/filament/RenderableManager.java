package com.google.android.filament;

import com.google.android.filament.VertexBuffer;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class RenderableManager {
    private static final String LOG_TAG = "Filament";
    private static final VertexBuffer.VertexAttribute[] sVertexAttributeValues = VertexBuffer.VertexAttribute.values();
    private long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j10) {
                this.mNativeObject = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                RenderableManager.nDestroyBuilder(this.mNativeObject);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum GeometryType {
            DYNAMIC,
            STATIC_BOUNDS,
            STATIC
        }

        public Builder(int i10) {
            long jNCreateBuilder = RenderableManager.nCreateBuilder(i10);
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public Builder blendOrder(int i10, int i11) {
            RenderableManager.nBuilderBlendOrder(this.mNativeBuilder, i10, i11);
            return this;
        }

        public Builder boundingBox(Box box) {
            RenderableManager.nBuilderBoundingBox(this.mNativeBuilder, box.getCenter()[0], box.getCenter()[1], box.getCenter()[2], box.getHalfExtent()[0], box.getHalfExtent()[1], box.getHalfExtent()[2]);
            return this;
        }

        public void build(Engine engine, @Entity int i10) {
            if (RenderableManager.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject(), i10)) {
                return;
            }
            throw new IllegalStateException("Couldn't create Renderable component for entity " + i10 + ", see log.");
        }

        public Builder castShadows(boolean z10) {
            RenderableManager.nBuilderCastShadows(this.mNativeBuilder, z10);
            return this;
        }

        public Builder channel(int i10) {
            RenderableManager.nBuilderChannel(this.mNativeBuilder, i10);
            return this;
        }

        public Builder culling(boolean z10) {
            RenderableManager.nBuilderCulling(this.mNativeBuilder, z10);
            return this;
        }

        public Builder enableSkinningBuffers(boolean z10) {
            RenderableManager.nBuilderEnableSkinningBuffers(this.mNativeBuilder, z10);
            return this;
        }

        public Builder fog(boolean z10) {
            RenderableManager.nBuilderFog(this.mNativeBuilder, z10);
            return this;
        }

        public Builder geometry(int i10, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i11, int i12, int i13, int i14) {
            RenderableManager.nBuilderGeometry(this.mNativeBuilder, i10, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), i11, i12, i13, i14);
            return this;
        }

        public Builder geometryType(GeometryType geometryType) {
            RenderableManager.nBuilderGeometryType(this.mNativeBuilder, geometryType.ordinal());
            return this;
        }

        public Builder globalBlendOrderEnabled(int i10, boolean z10) {
            RenderableManager.nBuilderGlobalBlendOrderEnabled(this.mNativeBuilder, i10, z10);
            return this;
        }

        public Builder instances(int i10) {
            RenderableManager.nBuilderInstances(this.mNativeBuilder, i10);
            return this;
        }

        public Builder layerMask(int i10, int i11) {
            RenderableManager.nBuilderLayerMask(this.mNativeBuilder, i10 & 255, i11 & 255);
            return this;
        }

        public Builder lightChannel(int i10, boolean z10) {
            RenderableManager.nBuilderLightChannel(this.mNativeBuilder, i10, z10);
            return this;
        }

        public Builder material(int i10, MaterialInstance materialInstance) {
            RenderableManager.nBuilderMaterial(this.mNativeBuilder, i10, materialInstance.getNativeObject());
            return this;
        }

        public Builder morphing(int i10) {
            RenderableManager.nBuilderMorphing(this.mNativeBuilder, i10);
            return this;
        }

        public Builder priority(int i10) {
            RenderableManager.nBuilderPriority(this.mNativeBuilder, i10);
            return this;
        }

        public Builder receiveShadows(boolean z10) {
            RenderableManager.nBuilderReceiveShadows(this.mNativeBuilder, z10);
            return this;
        }

        public Builder screenSpaceContactShadows(boolean z10) {
            RenderableManager.nBuilderScreenSpaceContactShadows(this.mNativeBuilder, z10);
            return this;
        }

        public Builder skinning(SkinningBuffer skinningBuffer, int i10, int i11) {
            RenderableManager.nBuilderSkinningBuffer(this.mNativeBuilder, skinningBuffer != null ? skinningBuffer.getNativeObject() : 0L, i10, i11);
            return this;
        }

        public Builder morphing(MorphTargetBuffer morphTargetBuffer) {
            RenderableManager.nBuilderMorphingStandard(this.mNativeBuilder, morphTargetBuffer.getNativeObject());
            return this;
        }

        public Builder morphing(int i10, int i11, int i12) {
            RenderableManager.nBuilderSetMorphTargetBufferOffsetAt(this.mNativeBuilder, i10, i11, i12);
            return this;
        }

        public Builder geometry(int i10, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i11, int i12) {
            RenderableManager.nBuilderGeometry(this.mNativeBuilder, i10, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), i11, i12);
            return this;
        }

        public Builder skinning(int i10) {
            RenderableManager.nBuilderSkinning(this.mNativeBuilder, i10);
            return this;
        }

        public Builder skinning(int i10, Buffer buffer) {
            if (RenderableManager.nBuilderSkinningBones(this.mNativeBuilder, i10, buffer, buffer.remaining()) >= 0) {
                return this;
            }
            throw new BufferOverflowException();
        }

        public Builder geometry(int i10, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer) {
            RenderableManager.nBuilderGeometry(this.mNativeBuilder, i10, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject());
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum PrimitiveType {
        POINTS(0),
        LINES(1),
        LINE_STRIP(3),
        TRIANGLES(4),
        TRIANGLE_STRIP(5);

        private final int mType;

        PrimitiveType(int i10) {
            this.mType = i10;
        }

        public int getValue() {
            return this.mType;
        }
    }

    public RenderableManager(long j10) {
        this.mNativeObject = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBlendOrder(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBoundingBox(long j10, float f10, float f11, float f12, float f13, float f14, float f15);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nBuilderBuild(long j10, long j11, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCastShadows(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderChannel(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCulling(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderEnableSkinningBuffers(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFog(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j10, int i10, int i11, long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j10, int i10, int i11, long j11, long j12, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j10, int i10, int i11, long j11, long j12, int i12, int i13, int i14, int i15);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometryType(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGlobalBlendOrderEnabled(long j10, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderInstances(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLayerMask(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLightChannel(long j10, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMaterial(long j10, int i10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMorphing(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMorphingStandard(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPriority(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderReceiveShadows(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderScreenSpaceContactShadows(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSetMorphTargetBufferOffsetAt(long j10, int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSkinning(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nBuilderSkinningBones(long j10, int i10, Buffer buffer, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSkinningBuffer(long j10, long j11, int i10, int i11);

    private static native void nClearMaterialInstanceAt(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder(int i10);

    private static native void nDestroy(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nGetAxisAlignedBoundingBox(long j10, int i10, float[] fArr, float[] fArr2);

    private static native int nGetEnabledAttributesAt(long j10, int i10, int i11);

    private static native boolean nGetFogEnabled(long j10, int i10);

    private static native int nGetInstance(long j10, int i10);

    private static native int nGetInstanceCount(long j10, int i10);

    private static native boolean nGetLightChannel(long j10, int i10, int i11);

    private static native long nGetMaterialInstanceAt(long j10, int i10, int i11);

    private static native int nGetMorphTargetCount(long j10, int i10);

    private static native int nGetPrimitiveCount(long j10, int i10);

    private static native boolean nHasComponent(long j10, int i10);

    private static native boolean nIsShadowCaster(long j10, int i10);

    private static native boolean nIsShadowReceiver(long j10, int i10);

    private static native void nSetAxisAlignedBoundingBox(long j10, int i10, float f10, float f11, float f12, float f13, float f14, float f15);

    private static native void nSetBlendOrderAt(long j10, int i10, int i11, int i12);

    private static native int nSetBonesAsMatrices(long j10, int i10, Buffer buffer, int i11, int i12, int i13);

    private static native int nSetBonesAsQuaternions(long j10, int i10, Buffer buffer, int i11, int i12, int i13);

    private static native void nSetCastShadows(long j10, int i10, boolean z10);

    private static native void nSetChannel(long j10, int i10, int i11);

    private static native void nSetCulling(long j10, int i10, boolean z10);

    private static native void nSetFogEnabled(long j10, int i10, boolean z10);

    private static native void nSetGeometryAt(long j10, int i10, int i11, int i12, long j11, long j12, int i13, int i14);

    private static native void nSetGlobalBlendOrderEnabledAt(long j10, int i10, int i11, boolean z10);

    private static native void nSetLayerMask(long j10, int i10, int i11, int i12);

    private static native void nSetLightChannel(long j10, int i10, int i11, boolean z10);

    private static native void nSetMaterialInstanceAt(long j10, int i10, int i11, long j11);

    private static native void nSetMorphTargetBufferOffsetAt(long j10, int i10, int i11, int i12, long j11, int i13);

    private static native void nSetMorphWeights(long j10, int i10, float[] fArr, int i11);

    private static native void nSetPriority(long j10, int i10, int i11);

    private static native void nSetReceiveShadows(long j10, int i10, boolean z10);

    private static native void nSetScreenSpaceContactShadows(long j10, int i10, boolean z10);

    private static native void nSetSkinningBuffer(long j10, int i10, long j11, int i11, int i12);

    public void clearMaterialInstanceAt(@EntityInstance int i10, int i11) {
        nClearMaterialInstanceAt(this.mNativeObject, i10, i11);
    }

    public void destroy(@Entity int i10) {
        nDestroy(this.mNativeObject, i10);
    }

    public Box getAxisAlignedBoundingBox(@EntityInstance int i10, Box box) {
        if (box == null) {
            box = new Box();
        }
        nGetAxisAlignedBoundingBox(this.mNativeObject, i10, box.getCenter(), box.getHalfExtent());
        return box;
    }

    public Set<VertexBuffer.VertexAttribute> getEnabledAttributesAt(@EntityInstance int i10, int i11) {
        int iNGetEnabledAttributesAt = nGetEnabledAttributesAt(this.mNativeObject, i10, i11);
        EnumSet enumSetNoneOf = EnumSet.noneOf(VertexBuffer.VertexAttribute.class);
        VertexBuffer.VertexAttribute[] vertexAttributeArr = sVertexAttributeValues;
        for (int i12 = 0; i12 < vertexAttributeArr.length; i12++) {
            if (((1 << i12) & iNGetEnabledAttributesAt) != 0) {
                enumSetNoneOf.add(vertexAttributeArr[i12]);
            }
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public boolean getFogEnabled(@EntityInstance int i10) {
        return nGetFogEnabled(this.mNativeObject, i10);
    }

    @EntityInstance
    public int getInstance(@Entity int i10) {
        return nGetInstance(this.mNativeObject, i10);
    }

    public int getInstanceCount(@EntityInstance int i10) {
        return nGetInstanceCount(this.mNativeObject, i10);
    }

    public boolean getLightChannel(@EntityInstance int i10, int i11) {
        return nGetLightChannel(this.mNativeObject, i10, i11);
    }

    public MaterialInstance getMaterialInstanceAt(@EntityInstance int i10, int i11) {
        return new MaterialInstance(nGetMaterialInstanceAt(this.mNativeObject, i10, i11));
    }

    public int getMorphTargetCount(@EntityInstance int i10) {
        return nGetMorphTargetCount(this.mNativeObject, i10);
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    public int getPrimitiveCount(@EntityInstance int i10) {
        return nGetPrimitiveCount(this.mNativeObject, i10);
    }

    public boolean hasComponent(@Entity int i10) {
        return nHasComponent(this.mNativeObject, i10);
    }

    public boolean isShadowCaster(@EntityInstance int i10) {
        return nIsShadowCaster(this.mNativeObject, i10);
    }

    public boolean isShadowReceiver(@EntityInstance int i10) {
        return nIsShadowReceiver(this.mNativeObject, i10);
    }

    public void setAxisAlignedBoundingBox(@EntityInstance int i10, Box box) {
        nSetAxisAlignedBoundingBox(this.mNativeObject, i10, box.getCenter()[0], box.getCenter()[1], box.getCenter()[2], box.getHalfExtent()[0], box.getHalfExtent()[1], box.getHalfExtent()[2]);
    }

    public void setBlendOrderAt(@EntityInstance int i10, int i11, int i12) {
        nSetBlendOrderAt(this.mNativeObject, i10, i11, i12);
    }

    public void setBonesAsMatrices(@EntityInstance int i10, Buffer buffer, int i11, int i12) {
        if (nSetBonesAsMatrices(this.mNativeObject, i10, buffer, buffer.remaining(), i11, i12) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void setBonesAsQuaternions(@EntityInstance int i10, Buffer buffer, int i11, int i12) {
        if (nSetBonesAsQuaternions(this.mNativeObject, i10, buffer, buffer.remaining(), i11, i12) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void setCastShadows(@EntityInstance int i10, boolean z10) {
        nSetCastShadows(this.mNativeObject, i10, z10);
    }

    public void setChannel(@EntityInstance int i10, int i11) {
        nSetChannel(this.mNativeObject, i10, i11);
    }

    public void setCulling(@EntityInstance int i10, boolean z10) {
        nSetCulling(this.mNativeObject, i10, z10);
    }

    public void setFogEnabled(@EntityInstance int i10, boolean z10) {
        nSetFogEnabled(this.mNativeObject, i10, z10);
    }

    public void setGeometryAt(@EntityInstance int i10, int i11, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i12, int i13) {
        nSetGeometryAt(this.mNativeObject, i10, i11, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), i12, i13);
    }

    public void setGlobalBlendOrderEnabledAt(@EntityInstance int i10, int i11, boolean z10) {
        nSetGlobalBlendOrderEnabledAt(this.mNativeObject, i10, i11, z10);
    }

    public void setLayerMask(@EntityInstance int i10, int i11, int i12) {
        nSetLayerMask(this.mNativeObject, i10, i11, i12);
    }

    public void setLightChannel(@EntityInstance int i10, int i11, boolean z10) {
        nSetLightChannel(this.mNativeObject, i10, i11, z10);
    }

    public void setMaterialInstanceAt(@EntityInstance int i10, int i11, MaterialInstance materialInstance) {
        int requiredAttributesAsInt = materialInstance.getMaterial().getRequiredAttributesAsInt();
        if ((nGetEnabledAttributesAt(this.mNativeObject, i10, i11) & requiredAttributesAsInt) != requiredAttributesAsInt) {
            Platform.get().warn("setMaterialInstanceAt() on primitive " + i11 + " of Renderable at " + i10 + ": declared attributes " + getEnabledAttributesAt(i10, i11) + " do no satisfy required attributes " + materialInstance.getMaterial().getRequiredAttributes());
        }
        nSetMaterialInstanceAt(this.mNativeObject, i10, i11, materialInstance.getNativeObject());
    }

    public void setMorphTargetBufferOffsetAt(@EntityInstance int i10, int i11, int i12, int i13) {
        nSetMorphTargetBufferOffsetAt(this.mNativeObject, i10, i11, i12, 0L, i13);
    }

    public void setMorphWeights(@EntityInstance int i10, float[] fArr, int i11) {
        nSetMorphWeights(this.mNativeObject, i10, fArr, i11);
    }

    public void setPriority(@EntityInstance int i10, int i11) {
        nSetPriority(this.mNativeObject, i10, i11);
    }

    public void setReceiveShadows(@EntityInstance int i10, boolean z10) {
        nSetReceiveShadows(this.mNativeObject, i10, z10);
    }

    public void setScreenSpaceContactShadows(@EntityInstance int i10, boolean z10) {
        nSetScreenSpaceContactShadows(this.mNativeObject, i10, z10);
    }

    public void setSkinningBuffer(@EntityInstance int i10, SkinningBuffer skinningBuffer, int i11, int i12) {
        nSetSkinningBuffer(this.mNativeObject, i10, skinningBuffer.getNativeObject(), i11, i12);
    }

    public void setGeometryAt(@EntityInstance int i10, int i11, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer) {
        nSetGeometryAt(this.mNativeObject, i10, i11, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), 0, indexBuffer.getIndexCount());
    }
}
