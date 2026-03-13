package org.apache.tika.parser;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class AutoDetectParserFactory extends ParserFactory {
    public static final String TIKA_CONFIG_PATH = "tika_config_path";

    public AutoDetectParserFactory(Map<String, String> map) {
        super(map);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    @Override // org.apache.tika.parser.ParserFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.tika.parser.Parser build() throws java.io.IOException {
        /*
            r3 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.args
            java.lang.String r1 = "tika_config_path"
            java.lang.Object r0 = r0.remove(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4f
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.nio.file.Path r2 = java.nio.file.Paths.get(r0, r2)
            boolean r2 = java.nio.file.Files.isReadable(r2)
            if (r2 == 0) goto L25
            org.apache.tika.config.TikaConfig r3 = new org.apache.tika.config.TikaConfig
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            r3.<init>(r0)
            goto L50
        L25:
            java.lang.Class r1 = r3.getClass()
            java.net.URL r1 = r1.getResource(r0)
            if (r1 == 0) goto L4f
            java.lang.Class r3 = r3.getClass()
            java.io.InputStream r3 = r3.getResourceAsStream(r0)
            org.apache.tika.config.TikaConfig r0 = new org.apache.tika.config.TikaConfig     // Catch: java.lang.Throwable -> L43
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L41
            r3.close()
        L41:
            r3 = r0
            goto L50
        L43:
            r0 = move-exception
            if (r3 == 0) goto L4e
            r3.close()     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4a:
            r3 = move-exception
            r0.addSuppressed(r3)
        L4e:
            throw r0
        L4f:
            r3 = 0
        L50:
            if (r3 != 0) goto L56
            org.apache.tika.config.TikaConfig r3 = org.apache.tika.config.TikaConfig.getDefaultConfig()
        L56:
            org.apache.tika.parser.AutoDetectParser r0 = new org.apache.tika.parser.AutoDetectParser
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.parser.AutoDetectParserFactory.build():org.apache.tika.parser.Parser");
    }
}
