package org.apache.tika.pipes.emitter;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractEmitter implements Emitter {
    private String name;

    @Override // org.apache.tika.pipes.emitter.Emitter
    public void emit(List<? extends EmitData> list) {
        for (EmitData emitData : list) {
            emit(emitData.getEmitKey().getEmitKey(), emitData.getMetadataList(), emitData.getParseContext());
        }
    }

    @Override // org.apache.tika.pipes.emitter.Emitter
    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }
}
