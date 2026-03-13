package org.apache.tika.mime;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
interface Clause extends Serializable {
    boolean eval(byte[] bArr);

    int size();
}
