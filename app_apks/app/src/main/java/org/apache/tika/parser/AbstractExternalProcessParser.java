package org.apache.tika.parser;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractExternalProcessParser implements Parser {
    private static final ConcurrentHashMap<String, Process> PROCESS_MAP = new ConcurrentHashMap<>();
    private static final long serialVersionUID = 7186985395903074255L;

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() { // from class: org.apache.tika.parser.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractExternalProcessParser.PROCESS_MAP.forEachValue(1L, new b());
            }
        }));
    }

    public String register(Process process) {
        String string = UUID.randomUUID().toString();
        PROCESS_MAP.put(string, process);
        return string;
    }

    public Process release(String str) {
        return PROCESS_MAP.remove(str);
    }
}
