package org.apache.tika.parser.external;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.parser.CompositeParser;
import org.apache.tika.parser.Parser;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ExternalParsersFactory {
    public static void attachExternalParsers(TikaConfig tikaConfig) {
        attachExternalParsers(create(), tikaConfig);
    }

    public static List<ExternalParser> create() {
        return create(new ServiceLoader());
    }

    public static void attachExternalParsers(List<ExternalParser> list, TikaConfig tikaConfig) {
        Parser parser = tikaConfig.getParser();
        if (parser instanceof CompositeParser) {
            ((CompositeParser) parser).getParsers();
        }
    }

    public static List<ExternalParser> create(ServiceLoader serviceLoader) {
        return create("tika-external-parsers.xml", serviceLoader);
    }

    public static List<ExternalParser> create(String str, ServiceLoader serviceLoader) {
        return create((URL[]) Collections.list(serviceLoader.findServiceResources(ExternalParsersFactory.class.getPackage().getName().replace('.', JsonPointer.SEPARATOR) + "/" + str)).toArray(new URL[0]));
    }

    public static List<ExternalParser> create(URL... urlArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (URL url : urlArr) {
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
            try {
                arrayList.addAll(ExternalParsersConfigReader.read(inputStreamOpenStream));
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            } catch (Throwable th) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return arrayList;
    }
}
