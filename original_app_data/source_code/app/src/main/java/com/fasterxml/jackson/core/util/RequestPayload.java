package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class RequestPayload implements Serializable {
    private static final long serialVersionUID = 1;
    protected String _charset;
    protected byte[] _payloadAsBytes;
    protected CharSequence _payloadAsText;

    public RequestPayload(byte[] bArr, String str) {
        if (bArr == null) {
            throw new IllegalArgumentException();
        }
        this._payloadAsBytes = bArr;
        this._charset = (str == null || str.isEmpty()) ? "UTF-8" : str;
    }

    public Object getRawPayload() {
        byte[] bArr = this._payloadAsBytes;
        return bArr != null ? bArr : this._payloadAsText;
    }

    public String toString() {
        byte[] bArr = this._payloadAsBytes;
        if (bArr == null) {
            return this._payloadAsText.toString();
        }
        try {
            return new String(bArr, this._charset);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public RequestPayload(CharSequence charSequence) {
        if (charSequence != null) {
            this._payloadAsText = charSequence;
            return;
        }
        throw new IllegalArgumentException();
    }
}
