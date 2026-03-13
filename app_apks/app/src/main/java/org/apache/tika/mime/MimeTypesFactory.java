package org.apache.tika.mime;

import af.c;
import af.e;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import org.w3c.dom.Document;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class MimeTypesFactory {
    public static final String CUSTOM_MIMES_SYS_PROP = "tika.custom-mimetypes";
    private static final c LOG = e.l(MimeTypesFactory.class);

    public static MimeTypes create() {
        return new MimeTypes();
    }

    public static MimeTypes create(Document document) {
        MimeTypes mimeTypes = new MimeTypes();
        new MimeTypesReader(mimeTypes).read(document);
        mimeTypes.init();
        return mimeTypes;
    }

    public static MimeTypes create(InputStream... inputStreamArr) {
        MimeTypes mimeTypes = new MimeTypes();
        MimeTypesReader mimeTypesReader = new MimeTypesReader(mimeTypes);
        for (InputStream inputStream : inputStreamArr) {
            mimeTypesReader.read(inputStream);
        }
        mimeTypes.init();
        return mimeTypes;
    }

    public static MimeTypes create(InputStream inputStream) {
        return create(inputStream);
    }

    public static MimeTypes create(URL... urlArr) throws IOException {
        int length = urlArr.length;
        InputStream[] inputStreamArr = new InputStream[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            inputStreamArr[i11] = FirebasePerfUrlConnection.openStream(urlArr[i11]);
        }
        try {
            return create(inputStreamArr);
        } finally {
            while (i10 < length) {
                inputStreamArr[i10].close();
                i10++;
            }
        }
    }

    public static MimeTypes create(URL url) {
        return create(url);
    }

    public static MimeTypes create(String str) {
        return create(MimeTypesReader.class.getResource(str));
    }

    public static MimeTypes create(String str, String str2) {
        return create(str, str2, null);
    }

    public static MimeTypes create(String str, String str2, ClassLoader classLoader) throws IOException {
        if (classLoader == null) {
            classLoader = MimeTypesReader.class.getClassLoader();
        }
        URL resource = classLoader.getResource((MimeTypesReader.class.getPackage().getName().replace('.', JsonPointer.SEPARATOR) + "/") + str);
        ArrayList list = Collections.list(classLoader.getResources(str2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(resource);
        arrayList.addAll(list);
        c cVar = LOG;
        if (cVar.f()) {
            arrayList.stream().forEach(new Consumer() { // from class: org.apache.tika.mime.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    MimeTypesFactory.LOG.t("Loaded custom mimes file: {}", (URL) obj);
                }
            });
        }
        String property = System.getProperty(CUSTOM_MIMES_SYS_PROP);
        if (property != null) {
            File file = new File(property);
            if (file.exists()) {
                arrayList.add(file.toURI().toURL());
                if (cVar.f()) {
                    cVar.t("Loaded external custom mimetypes file: {}", file.getAbsolutePath());
                }
            } else {
                throw new IOException("Specified custom mimetypes file not found: " + property);
            }
        }
        return create((URL[]) arrayList.toArray(new URL[0]));
    }
}
