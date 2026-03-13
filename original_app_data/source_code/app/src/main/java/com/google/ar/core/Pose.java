package com.google.ar.core;

import com.google.ar.core.annotations.UsedByNative;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("session_jni_wrapper.cc")
public class Pose {
    public static final Pose IDENTITY = new Pose(new float[]{0.0f, 0.0f, 0.0f}, Quaternion.f31088a);

    @UsedByNative("session_jni_wrapper.cc")
    private final Quaternion quaternion;

    @UsedByNative("session_jni_wrapper.cc")
    private final float[] translation;

    @UsedByNative("session_jni_wrapper.cc")
    private Pose(float[] fArr, Quaternion quaternion) {
        this.translation = fArr;
        this.quaternion = quaternion;
    }

    public static Pose makeInterpolated(Pose pose, Pose pose2, float f10) {
        if (f10 == 0.0f) {
            return pose;
        }
        if (f10 == 1.0f) {
            return pose2;
        }
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = (pose.translation[i10] * (1.0f - f10)) + (pose2.translation[i10] * f10);
        }
        return new Pose(fArr, Quaternion.i(pose.quaternion, pose2.quaternion, f10));
    }

    public static Pose makeRotation(float f10, float f11, float f12, float f13) {
        return new Pose(IDENTITY.translation, new Quaternion(f10, f11, f12, f13));
    }

    public static Pose makeTranslation(float f10, float f11, float f12) {
        return new Pose(new float[]{f10, f11, f12}, IDENTITY.quaternion);
    }

    public Pose compose(Pose pose) {
        float[] fArr = new float[3];
        Quaternion.j(this.quaternion, pose.translation, 0, fArr, 0);
        float f10 = fArr[0];
        float[] fArr2 = this.translation;
        fArr[0] = f10 + fArr2[0];
        fArr[1] = fArr[1] + fArr2[1];
        fArr[2] = fArr[2] + fArr2[2];
        return new Pose(fArr, this.quaternion.h(pose.quaternion));
    }

    public Pose extractRotation() {
        return new Pose(IDENTITY.translation, this.quaternion);
    }

    public Pose extractTranslation() {
        return new Pose(this.translation, IDENTITY.quaternion);
    }

    public Quaternion getQuaternion() {
        return this.quaternion;
    }

    public float[] getRotationQuaternion() {
        float[] fArr = new float[4];
        getRotationQuaternion(fArr, 0);
        return fArr;
    }

    public float[] getTransformedAxis(int i10, float f10) {
        float[] fArr = new float[3];
        getTransformedAxis(i10, f10, fArr, 0);
        return fArr;
    }

    public float[] getTranslation() {
        float[] fArr = new float[3];
        getTranslation(fArr, 0);
        return fArr;
    }

    public float[] getXAxis() {
        return getTransformedAxis(0, 1.0f);
    }

    public float[] getYAxis() {
        return getTransformedAxis(1, 1.0f);
    }

    public float[] getZAxis() {
        return getTransformedAxis(2, 1.0f);
    }

    public Pose inverse() {
        float[] fArr = new float[3];
        Quaternion quaternionG = this.quaternion.g();
        Quaternion.j(quaternionG, this.translation, 0, fArr, 0);
        fArr[0] = -fArr[0];
        fArr[1] = -fArr[1];
        fArr[2] = -fArr[2];
        return new Pose(fArr, quaternionG);
    }

    public float qw() {
        return this.quaternion.e();
    }

    public float qx() {
        return this.quaternion.b();
    }

    public float qy() {
        return this.quaternion.c();
    }

    public float qz() {
        return this.quaternion.d();
    }

    public float[] rotateVector(float[] fArr) {
        float[] fArr2 = new float[3];
        rotateVector(fArr, 0, fArr2, 0);
        return fArr2;
    }

    public void toMatrix(float[] fArr, int i10) {
        this.quaternion.k(fArr, i10);
        float[] fArr2 = this.translation;
        fArr[i10 + 12] = fArr2[0];
        fArr[i10 + 13] = fArr2[1];
        fArr[i10 + 14] = fArr2[2];
        fArr[i10 + 3] = 0.0f;
        fArr[i10 + 7] = 0.0f;
        fArr[i10 + 11] = 0.0f;
        fArr[i10 + 15] = 1.0f;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "t:[x:%.3f, y:%.3f, z:%.3f], q:[x:%.2f, y:%.2f, z:%.2f, w:%.2f]", Float.valueOf(this.translation[0]), Float.valueOf(this.translation[1]), Float.valueOf(this.translation[2]), Float.valueOf(this.quaternion.b()), Float.valueOf(this.quaternion.c()), Float.valueOf(this.quaternion.d()), Float.valueOf(this.quaternion.e()));
    }

    public float[] transformPoint(float[] fArr) {
        float[] fArr2 = new float[3];
        transformPoint(fArr, 0, fArr2, 0);
        return fArr2;
    }

    public float tx() {
        return this.translation[0];
    }

    public float ty() {
        return this.translation[1];
    }

    public float tz() {
        return this.translation[2];
    }

    private Pose(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.quaternion = new Quaternion(f13, f14, f15, f16);
        this.translation = new float[]{f10, f11, f12};
    }

    public static Pose makeRotation(float[] fArr) {
        return makeRotation(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public static Pose makeTranslation(float[] fArr) {
        return makeTranslation(fArr[0], fArr[1], fArr[2]);
    }

    public void getRotationQuaternion(float[] fArr, int i10) {
        this.quaternion.f(fArr, i10);
    }

    public void getTransformedAxis(int i10, float f10, float[] fArr, int i11) {
        float[] fArr2 = new float[3];
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[i10] = f10;
        Quaternion.j(this.quaternion, fArr2, 0, fArr, i11);
    }

    public void getTranslation(float[] fArr, int i10) {
        System.arraycopy(this.translation, 0, fArr, i10, 3);
    }

    public void rotateVector(float[] fArr, int i10, float[] fArr2, int i11) {
        Quaternion.j(this.quaternion, fArr, i10, fArr2, i11);
    }

    public void transformPoint(float[] fArr, int i10, float[] fArr2, int i11) {
        rotateVector(fArr, i10, fArr2, i11);
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = i12 + i11;
            fArr2[i13] = fArr2[i13] + this.translation[i12];
        }
    }

    public Pose(float[] fArr, float[] fArr2) {
        this(fArr[0], fArr[1], fArr[2], fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
    }
}
