package com.google.android.filament;

import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class VertexBuffer {
    private long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum AttributeType {
        BYTE,
        BYTE2,
        BYTE3,
        BYTE4,
        UBYTE,
        UBYTE2,
        UBYTE3,
        UBYTE4,
        SHORT,
        SHORT2,
        SHORT3,
        SHORT4,
        USHORT,
        USHORT2,
        USHORT3,
        USHORT4,
        INT,
        UINT,
        FLOAT,
        FLOAT2,
        FLOAT3,
        FLOAT4,
        HALF,
        HALF2,
        HALF3,
        HALF4
    }

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
                VertexBuffer.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long jNCreateBuilder = VertexBuffer.nCreateBuilder();
            this.mNativeBuilder = jNCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(jNCreateBuilder);
        }

        public Builder attribute(VertexAttribute vertexAttribute, int i10, AttributeType attributeType, int i11, int i12) {
            VertexBuffer.nBuilderAttribute(this.mNativeBuilder, vertexAttribute.ordinal(), i10, attributeType.ordinal(), i11, i12);
            return this;
        }

        public Builder bufferCount(int i10) {
            VertexBuffer.nBuilderBufferCount(this.mNativeBuilder, i10);
            return this;
        }

        public VertexBuffer build(Engine engine) {
            long jNBuilderBuild = VertexBuffer.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new VertexBuffer(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create VertexBuffer");
        }

        public Builder enableBufferObjects(boolean z10) {
            VertexBuffer.nBuilderEnableBufferObjects(this.mNativeBuilder, z10);
            return this;
        }

        public Builder normalized(VertexAttribute vertexAttribute) {
            VertexBuffer.nBuilderNormalized(this.mNativeBuilder, vertexAttribute.ordinal(), true);
            return this;
        }

        public Builder vertexCount(int i10) {
            VertexBuffer.nBuilderVertexCount(this.mNativeBuilder, i10);
            return this;
        }

        public Builder normalized(VertexAttribute vertexAttribute, boolean z10) {
            VertexBuffer.nBuilderNormalized(this.mNativeBuilder, vertexAttribute.ordinal(), z10);
            return this;
        }

        public Builder attribute(VertexAttribute vertexAttribute, int i10, AttributeType attributeType) {
            return attribute(vertexAttribute, i10, attributeType, 0, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum VertexAttribute {
        POSITION,
        TANGENTS,
        COLOR,
        UV0,
        UV1,
        BONE_INDICES,
        BONE_WEIGHTS,
        UNUSED,
        CUSTOM0,
        CUSTOM1,
        CUSTOM2,
        CUSTOM3,
        CUSTOM4,
        CUSTOM5,
        CUSTOM6,
        CUSTOM7
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderAttribute(long j10, int i10, int i11, int i12, int i13, int i14);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBufferCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderEnableBufferObjects(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderNormalized(long j10, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVertexCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetVertexCount(long j10);

    private static native int nSetBufferAt(long j10, long j11, int i10, Buffer buffer, int i11, int i12, int i13, Object obj, Runnable runnable);

    private static native void nSetBufferObjectAt(long j10, long j11, int i10, long j12);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed VertexBuffer");
    }

    public int getVertexCount() {
        return nGetVertexCount(getNativeObject());
    }

    public void setBufferAt(Engine engine, int i10, Buffer buffer) {
        setBufferAt(engine, i10, buffer, 0, 0, null, null);
    }

    public void setBufferObjectAt(Engine engine, int i10, BufferObject bufferObject) {
        nSetBufferObjectAt(getNativeObject(), engine.getNativeObject(), i10, bufferObject.getNativeObject());
    }

    private VertexBuffer(long j10) {
        this.mNativeObject = j10;
    }

    public void setBufferAt(Engine engine, int i10, Buffer buffer, int i11, int i12) {
        setBufferAt(engine, i10, buffer, i11, i12, null, null);
    }

    public void setBufferAt(Engine engine, int i10, Buffer buffer, int i11, int i12, Object obj, Runnable runnable) {
        if (nSetBufferAt(getNativeObject(), engine.getNativeObject(), i10, buffer, buffer.remaining(), i11, i12 == 0 ? buffer.remaining() : i12, obj, runnable) < 0) {
            throw new BufferOverflowException();
        }
    }
}
