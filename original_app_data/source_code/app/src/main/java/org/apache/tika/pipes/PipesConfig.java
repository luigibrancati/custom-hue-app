package org.apache.tika.pipes;

import af.e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import org.apache.tika.exception.TikaConfigException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PipesConfig extends PipesConfigBase {
    private static final af.c LOG = e.l(PipesClient.class);
    private long maxWaitForClientMillis = 60000;

    private PipesConfig() {
    }

    public static PipesConfig load(Path path) throws IOException {
        PipesConfig pipesConfig = new PipesConfig();
        InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            pipesConfig.configure("pipes", inputStreamNewInputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            if (pipesConfig.getTikaConfig() == null) {
                LOG.t("A separate tikaConfig was not specified in the <pipes/> element in the  config file; will use {} for pipes", path);
                pipesConfig.setTikaConfig(path);
            }
            return pipesConfig;
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public long getMaxWaitForClientMillis() {
        return this.maxWaitForClientMillis;
    }

    public void setMaxWaitForClientMillis(long j10) {
        this.maxWaitForClientMillis = j10;
    }

    public static PipesConfig load(InputStream inputStream) throws IOException, TikaConfigException {
        PipesConfig pipesConfig = new PipesConfig();
        pipesConfig.configure("pipes", inputStream);
        return pipesConfig;
    }
}
