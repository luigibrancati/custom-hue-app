package org.apache.tika.parser;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((Process) obj).destroyForcibly();
    }
}
