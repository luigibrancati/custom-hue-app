package org.apache.tika.parser;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ParserFactory {
    final Map<String, String> args;

    public ParserFactory(Map<String, String> map) {
        this.args = map;
    }

    public abstract Parser build();
}
