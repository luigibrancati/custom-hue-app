package com.google.android.filament;

import java.nio.Buffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class SurfaceOrientation {
    private long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Builder {
        private Buffer mNormals;
        private int mNormalsStride;
        private Buffer mPositions;
        private int mPositionsStride;
        private Buffer mTangents;
        private int mTangentsStride;
        private Buffer mTexCoords;
        private int mTexCoordsStride;
        private int mTriangleCount;
        private Buffer mTrianglesUint16;
        private Buffer mTrianglesUint32;
        private int mVertexCount;

        public SurfaceOrientation build() {
            long jNCreateBuilder = SurfaceOrientation.nCreateBuilder();
            SurfaceOrientation.nBuilderVertexCount(jNCreateBuilder, this.mVertexCount);
            SurfaceOrientation.nBuilderTriangleCount(jNCreateBuilder, this.mTriangleCount);
            Buffer buffer = this.mNormals;
            if (buffer != null) {
                SurfaceOrientation.nBuilderNormals(jNCreateBuilder, buffer, buffer.remaining(), this.mNormalsStride);
            }
            Buffer buffer2 = this.mTangents;
            if (buffer2 != null) {
                SurfaceOrientation.nBuilderTangents(jNCreateBuilder, buffer2, buffer2.remaining(), this.mTangentsStride);
            }
            Buffer buffer3 = this.mTexCoords;
            if (buffer3 != null) {
                SurfaceOrientation.nBuilderUVs(jNCreateBuilder, buffer3, buffer3.remaining(), this.mTexCoordsStride);
            }
            Buffer buffer4 = this.mPositions;
            if (buffer4 != null) {
                SurfaceOrientation.nBuilderPositions(jNCreateBuilder, buffer4, buffer4.remaining(), this.mPositionsStride);
            }
            Buffer buffer5 = this.mTrianglesUint16;
            if (buffer5 != null) {
                SurfaceOrientation.nBuilderTriangles16(jNCreateBuilder, buffer5, buffer5.remaining());
            }
            Buffer buffer6 = this.mTrianglesUint32;
            if (buffer6 != null) {
                SurfaceOrientation.nBuilderTriangles32(jNCreateBuilder, buffer6, buffer6.remaining());
            }
            long jNBuilderBuild = SurfaceOrientation.nBuilderBuild(jNCreateBuilder);
            SurfaceOrientation.nDestroyBuilder(jNCreateBuilder);
            if (jNBuilderBuild != 0) {
                return new SurfaceOrientation(jNBuilderBuild);
            }
            throw new IllegalStateException("Could not create SurfaceOrientation");
        }

        public Builder normals(Buffer buffer) {
            this.mNormals = buffer;
            this.mNormalsStride = 0;
            return this;
        }

        public Builder positions(Buffer buffer) {
            this.mPositions = buffer;
            this.mPositionsStride = 0;
            return this;
        }

        public Builder tangents(Buffer buffer) {
            this.mTangents = buffer;
            this.mTangentsStride = 0;
            return this;
        }

        public Builder triangleCount(int i10) {
            this.mTriangleCount = i10;
            return this;
        }

        public Builder triangles_uint16(Buffer buffer) {
            this.mTrianglesUint16 = buffer;
            return this;
        }

        public Builder triangles_uint32(Buffer buffer) {
            this.mTrianglesUint32 = buffer;
            return this;
        }

        public Builder uvs(Buffer buffer) {
            this.mTexCoords = buffer;
            this.mTexCoordsStride = 0;
            return this;
        }

        public Builder vertexCount(int i10) {
            this.mVertexCount = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderNormals(long j10, Buffer buffer, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPositions(long j10, Buffer buffer, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTangents(long j10, Buffer buffer, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTriangleCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTriangles16(long j10, Buffer buffer, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTriangles32(long j10, Buffer buffer, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderUVs(long j10, Buffer buffer, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVertexCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    private static native void nDestroy(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nGetQuatsAsFloat(long j10, Buffer buffer, int i10);

    private static native void nGetQuatsAsHalf(long j10, Buffer buffer, int i10);

    private static native void nGetQuatsAsShort(long j10, Buffer buffer, int i10);

    private static native int nGetVertexCount(long j10);

    public void destroy() {
        nDestroy(this.mNativeObject);
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed SurfaceOrientation");
    }

    public void getQuatsAsFloat(Buffer buffer) {
        nGetQuatsAsFloat(this.mNativeObject, buffer, buffer.remaining());
    }

    public void getQuatsAsHalf(Buffer buffer) {
        nGetQuatsAsHalf(this.mNativeObject, buffer, buffer.remaining());
    }

    public void getQuatsAsShort(Buffer buffer) {
        nGetQuatsAsShort(this.mNativeObject, buffer, buffer.remaining());
    }

    public int getVertexCount() {
        return nGetVertexCount(this.mNativeObject);
    }

    private SurfaceOrientation(long j10) {
        this.mNativeObject = j10;
    }
}
