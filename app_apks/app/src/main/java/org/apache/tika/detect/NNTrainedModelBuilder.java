package org.apache.tika.detect;

import org.apache.tika.mime.MediaType;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class NNTrainedModelBuilder {
    private int numOfHidden;
    private int numOfInputs;
    private int numOfOutputs;
    private float[] params;
    private MediaType type;

    public NNTrainedModel build() {
        return new NNTrainedModel(this.numOfInputs, this.numOfHidden, this.numOfOutputs, this.params);
    }

    public int getNumOfHidden() {
        return this.numOfHidden;
    }

    public int getNumOfInputs() {
        return this.numOfInputs;
    }

    public int getNumOfOutputs() {
        return this.numOfOutputs;
    }

    public float[] getParams() {
        return this.params;
    }

    public MediaType getType() {
        return this.type;
    }

    public void setNumOfHidden(int i10) {
        this.numOfHidden = i10;
    }

    public void setNumOfInputs(int i10) {
        this.numOfInputs = i10;
    }

    public void setNumOfOutputs(int i10) {
        this.numOfOutputs = i10;
    }

    public void setParams(float[] fArr) {
        this.params = fArr;
    }

    public void setType(MediaType mediaType) {
        this.type = mediaType;
    }
}
