package org.apache.tika.pipes.emitter;

import java.util.List;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface Emitter {
    void emit(String str, List<Metadata> list, ParseContext parseContext);

    void emit(List<? extends EmitData> list);

    String getName();
}
