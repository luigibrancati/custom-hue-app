package org.apache.tika.detect;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class NNTrainedModel extends TrainedModel {
    private final float[][] Theta1;
    private final float[][] Theta2;
    private final int numOfHidden;
    private final int numOfInputs;
    private final int numOfOutputs;

    public NNTrainedModel(int i10, int i11, int i12, float[] fArr) {
        this.numOfInputs = i10;
        this.numOfHidden = i11;
        this.numOfOutputs = i12;
        Class cls = Float.TYPE;
        this.Theta1 = (float[][]) Array.newInstance((Class<?>) cls, i11, i10 + 1);
        this.Theta2 = (float[][]) Array.newInstance((Class<?>) cls, i12, i11 + 1);
        populateThetas(fArr);
    }

    private void populateThetas(float[] fArr) {
        float[][] fArr2 = this.Theta1;
        int length = fArr2.length;
        int length2 = fArr2[0].length;
        int i10 = 0;
        for (int i11 = 0; i11 < length2; i11++) {
            for (int i12 = 0; i12 < length; i12++) {
                this.Theta1[i12][i11] = fArr[i10];
                i10++;
            }
        }
        float[][] fArr3 = this.Theta2;
        int length3 = fArr3.length;
        int length4 = fArr3[0].length;
        for (int i13 = 0; i13 < length4; i13++) {
            for (int i14 = 0; i14 < length3; i14++) {
                this.Theta2[i14][i13] = fArr[i10];
                i10++;
            }
        }
    }

    @Override // org.apache.tika.detect.TrainedModel
    public double predict(double[] dArr) {
        return 0.0d;
    }

    @Override // org.apache.tika.detect.TrainedModel
    public float predict(float[] fArr) {
        float[][] fArr2 = this.Theta1;
        int length = fArr2.length;
        int length2 = fArr2[0].length;
        float[] fArr3 = new float[length + 1];
        fArr3[0] = 1.0f;
        int i10 = 0;
        while (true) {
            double d10 = 0.0d;
            if (i10 >= length) {
                break;
            }
            for (int i11 = 0; i11 < length2; i11++) {
                d10 += (double) (this.Theta1[i10][i11] * fArr[i11]);
            }
            i10++;
            fArr3[i10] = (float) (1.0d / (Math.exp(-d10) + 1.0d));
        }
        float[][] fArr4 = this.Theta2;
        int length3 = fArr4.length;
        int length4 = fArr4[0].length;
        float[] fArr5 = new float[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            double d11 = 0.0d;
            for (int i13 = 0; i13 < length4; i13++) {
                d11 += (double) (this.Theta2[i12][i13] * fArr3[i13]);
            }
            fArr5[i12] = (float) (1.0d / (Math.exp(-d11) + 1.0d));
        }
        return fArr5[0];
    }
}
