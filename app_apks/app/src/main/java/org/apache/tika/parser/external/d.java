package org.apache.tika.parser.external;

import java.io.Serializable;
import org.apache.tika.parser.external.ExternalParser;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements ExternalParser.LineConsumer, Serializable {
    @Override // org.apache.tika.parser.external.ExternalParser.LineConsumer
    public final void consume(String str) {
        ExternalParser.LineConsumer.H(str);
    }
}
