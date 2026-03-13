package org.apache.tika.mime;

import Ne.h;
import com.google.ar.core.ImageMetadata;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.xml.namespace.QName;
import org.apache.tika.Tika;
import org.apache.tika.detect.Detector;
import org.apache.tika.detect.TextDetector;
import org.apache.tika.detect.XmlRootExtractor;
import org.apache.tika.metadata.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class MimeTypes implements Detector, Serializable {
    private static final Map<ClassLoader, MimeTypes> CLASSLOADER_SPECIFIC_DEFAULT_TYPES = new HashMap();
    private static MimeTypes DEFAULT_TYPES = null;
    public static final String OCTET_STREAM = "application/octet-stream";
    public static final String PLAIN_TEXT = "text/plain";
    public static final String XML = "application/xml";
    private static final long serialVersionUID = -1350863170146349036L;
    private final MimeType htmlMimeType;
    private final List<Magic> magics;
    private final Patterns patterns;
    private final MediaTypeRegistry registry;
    private final MimeType rootMimeType;
    private final List<MimeType> rootMimeTypeL;
    private final MimeType textMimeType;
    private final Map<MediaType, MimeType> types;
    private final MimeType xmlMimeType;
    private final List<MimeType> xmls;

    public MimeTypes() {
        MediaTypeRegistry mediaTypeRegistry = new MediaTypeRegistry();
        this.registry = mediaTypeRegistry;
        this.types = new HashMap();
        this.patterns = new Patterns(mediaTypeRegistry);
        this.magics = new ArrayList();
        this.xmls = new ArrayList();
        MimeType mimeType = new MimeType(MediaType.OCTET_STREAM);
        this.rootMimeType = mimeType;
        MimeType mimeType2 = new MimeType(MediaType.TEXT_PLAIN);
        this.textMimeType = mimeType2;
        this.htmlMimeType = new MimeType(MediaType.TEXT_HTML);
        MimeType mimeType3 = new MimeType(MediaType.APPLICATION_XML);
        this.xmlMimeType = mimeType3;
        this.rootMimeTypeL = Collections.singletonList(mimeType);
        add(mimeType);
        add(mimeType2);
        add(mimeType3);
    }

    private List<MimeType> applyHint(List<MimeType> list, MimeType mimeType) {
        if (list == null || list.isEmpty()) {
            return Collections.singletonList(mimeType);
        }
        for (MimeType mimeType2 : list) {
            if (mimeType.equals(mimeType2) || this.registry.isSpecializationOf(mimeType.getType(), mimeType2.getType())) {
                return Collections.singletonList(mimeType);
            }
        }
        return list;
    }

    public static synchronized MimeTypes getDefaultMimeTypes() {
        return getDefaultMimeTypes(null);
    }

    public void add(MimeType mimeType) {
        this.registry.addType(mimeType.getType());
        this.types.put(mimeType.getType(), mimeType);
        if (mimeType.hasMagic()) {
            this.magics.addAll(mimeType.getMagics());
        }
        if (mimeType.hasRootXML()) {
            this.xmls.add(mimeType);
        }
    }

    public synchronized void addAlias(MimeType mimeType, MediaType mediaType) {
        this.registry.addAlias(mimeType.getType(), mediaType);
    }

    public void addPattern(MimeType mimeType, String str) {
        addPattern(mimeType, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    @Override // org.apache.tika.detect.Detector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.tika.mime.MediaType detect(java.io.InputStream r8, org.apache.tika.metadata.Metadata r9) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L1b
            int r1 = r7.getMinLength()
            r8.mark(r1)
            byte[] r1 = r7.readMagicHeader(r8)     // Catch: java.lang.Throwable -> L16
            java.util.List r1 = r7.getMimeType(r1)     // Catch: java.lang.Throwable -> L16
            r8.reset()
            goto L1c
        L16:
            r7 = move-exception
            r8.reset()
            throw r7
        L1b:
            r1 = r0
        L1c:
            java.lang.String r8 = "resourceName"
            java.lang.String r8 = r9.get(r8)
            r2 = 0
            if (r8 == 0) goto L68
            java.net.URI r3 = new java.net.URI     // Catch: java.net.URISyntaxException -> L3b
            r3.<init>(r8)     // Catch: java.net.URISyntaxException -> L3b
            java.lang.String r4 = r3.getScheme()     // Catch: java.net.URISyntaxException -> L3b
            r5 = 1
            if (r4 == 0) goto L3d
            java.lang.String r6 = "http"
            boolean r4 = r4.startsWith(r6)     // Catch: java.net.URISyntaxException -> L3b
            if (r4 == 0) goto L3d
            r4 = r5
            goto L3e
        L3b:
            r4 = r2
            goto L56
        L3d:
            r4 = r2
        L3e:
            java.lang.String r3 = r3.getPath()     // Catch: java.net.URISyntaxException -> L56
            if (r3 == 0) goto L55
            r6 = 47
            int r6 = r3.lastIndexOf(r6)     // Catch: java.net.URISyntaxException -> L56
            int r6 = r6 + r5
            int r5 = r3.length()     // Catch: java.net.URISyntaxException -> L56
            if (r6 >= r5) goto L55
            java.lang.String r0 = r3.substring(r6)     // Catch: java.net.URISyntaxException -> L56
        L55:
            r8 = r0
        L56:
            if (r8 == 0) goto L68
            org.apache.tika.mime.MimeType r8 = r7.getMimeType(r8)
            if (r4 == 0) goto L64
            boolean r0 = r8.isInterpreted()
            if (r0 != 0) goto L68
        L64:
            java.util.List r1 = r7.applyHint(r1, r8)
        L68:
            java.lang.String r8 = "Content-Type"
            java.lang.String r8 = r9.get(r8)
            if (r8 == 0) goto L78
            org.apache.tika.mime.MimeType r8 = r7.forName(r8)     // Catch: org.apache.tika.mime.MimeTypeException -> L78
            java.util.List r1 = r7.applyHint(r1, r8)     // Catch: org.apache.tika.mime.MimeTypeException -> L78
        L78:
            if (r1 == 0) goto L8c
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L81
            goto L8c
        L81:
            java.lang.Object r7 = r1.get(r2)
            org.apache.tika.mime.MimeType r7 = (org.apache.tika.mime.MimeType) r7
            org.apache.tika.mime.MediaType r7 = r7.getType()
            return r7
        L8c:
            org.apache.tika.mime.MediaType r7 = org.apache.tika.mime.MediaType.OCTET_STREAM
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.mime.MimeTypes.detect(java.io.InputStream, org.apache.tika.metadata.Metadata):org.apache.tika.mime.MediaType");
    }

    public MimeType forName(String str) throws MimeTypeException {
        MimeType mimeType;
        MediaType mediaType = MediaType.parse(str);
        if (mediaType == null) {
            throw new MimeTypeException("Invalid media type name: " + str);
        }
        MediaType mediaTypeNormalize = this.registry.normalize(mediaType);
        MimeType mimeType2 = this.types.get(mediaTypeNormalize);
        if (mimeType2 != null) {
            return mimeType2;
        }
        synchronized (this) {
            try {
                mimeType = this.types.get(mediaTypeNormalize);
                if (mimeType == null) {
                    mimeType = new MimeType(mediaType);
                    add(mimeType);
                    this.types.put(mediaType, mimeType);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mimeType;
    }

    public MediaTypeRegistry getMediaTypeRegistry() {
        return this.registry;
    }

    @Deprecated
    public MimeType getMimeType(String str) {
        MimeType mimeTypeMatches = this.patterns.matches(str);
        if (mimeTypeMatches != null) {
            return mimeTypeMatches;
        }
        MimeType mimeTypeMatches2 = this.patterns.matches(str.toLowerCase(Locale.ENGLISH));
        return mimeTypeMatches2 != null ? mimeTypeMatches2 : this.rootMimeType;
    }

    public int getMinLength() {
        return ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
    }

    public MimeType getRegisteredMimeType(String str) throws MimeTypeException {
        MediaType mediaType = MediaType.parse(str);
        if (mediaType == null) {
            throw new MimeTypeException("Invalid media type name: " + str);
        }
        MediaType mediaTypeNormalize = this.registry.normalize(mediaType);
        MimeType mimeType = this.types.get(mediaTypeNormalize);
        if (mimeType != null) {
            return mimeType;
        }
        if (mediaTypeNormalize.hasParameters()) {
            return this.types.get(mediaTypeNormalize.getBaseType());
        }
        return null;
    }

    public void init() {
        for (MimeType mimeType : this.types.values()) {
            this.magics.addAll(mimeType.getMagics());
            if (mimeType.hasRootXML()) {
                this.xmls.add(mimeType);
            }
        }
        Collections.sort(this.magics);
        Collections.sort(this.xmls);
    }

    public byte[] readMagicHeader(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream is missing");
        }
        int minLength = getMinLength();
        byte[] bArr = new byte[minLength];
        int i10 = inputStream.read(bArr);
        int i11 = 0;
        while (i10 != -1) {
            i11 += i10;
            if (i11 == minLength) {
                return bArr;
            }
            i10 = inputStream.read(bArr, i11, minLength - i11);
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }

    public synchronized void setSuperType(MimeType mimeType, MediaType mediaType) {
        this.registry.addSuperType(mimeType.getType(), mediaType);
    }

    public static synchronized MimeTypes getDefaultMimeTypes(ClassLoader classLoader) {
        MimeTypes mimeTypesCreate;
        mimeTypesCreate = DEFAULT_TYPES;
        if (classLoader != null) {
            mimeTypesCreate = CLASSLOADER_SPECIFIC_DEFAULT_TYPES.get(classLoader);
        }
        if (mimeTypesCreate == null) {
            try {
                try {
                    mimeTypesCreate = MimeTypesFactory.create("tika-mimetypes.xml", "custom-mimetypes.xml", classLoader);
                    if (classLoader == null) {
                        DEFAULT_TYPES = mimeTypesCreate;
                    } else {
                        CLASSLOADER_SPECIFIC_DEFAULT_TYPES.put(classLoader, mimeTypesCreate);
                    }
                } catch (MimeTypeException e10) {
                    throw new RuntimeException("Unable to parse the default media type registry", e10);
                }
            } catch (IOException e11) {
                throw new RuntimeException("Unable to read the default media type registry", e11);
            }
        }
        return mimeTypesCreate;
    }

    public void addPattern(MimeType mimeType, String str, boolean z10) {
        this.patterns.add(str, z10, mimeType);
    }

    @Deprecated
    public MimeType getMimeType(File file) {
        return forName(new Tika(this).detect(file));
    }

    public List<MimeType> getMimeType(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length == 0) {
                return this.rootMimeTypeL;
            }
            ArrayList arrayList = new ArrayList(1);
            int priority = -1;
            for (Magic magic : this.magics) {
                if (priority > 0 && priority > magic.getPriority()) {
                    break;
                }
                if (magic.eval(bArr)) {
                    arrayList.add(magic.getType());
                    priority = magic.getPriority();
                }
            }
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    MimeType mimeType = (MimeType) arrayList.get(i10);
                    if (XML.equals(mimeType.getName()) || "text/html".equals(mimeType.getName())) {
                        QName qNameExtractRootElement = new XmlRootExtractor().extractRootElement(bArr);
                        if (qNameExtractRootElement != null) {
                            Iterator<MimeType> it = this.xmls.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    MimeType next = it.next();
                                    if (next.matchesXML(qNameExtractRootElement.getNamespaceURI(), qNameExtractRootElement.getLocalPart())) {
                                        arrayList.set(i10, next);
                                        break;
                                    }
                                }
                            }
                        } else if (XML.equals(mimeType.getName())) {
                            Iterator<Magic> it2 = this.magics.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Magic next2 = it2.next();
                                    if (next2.getType().equals(this.htmlMimeType) && next2.eval(bArr)) {
                                        arrayList.set(i10, this.htmlMimeType);
                                        break;
                                    }
                                } else {
                                    arrayList.set(i10, this.textMimeType);
                                    break;
                                }
                            }
                        }
                    }
                }
                return arrayList;
            }
            try {
                return Collections.singletonList(forName(new TextDetector(getMinLength()).detect(h.a().p(bArr).o(), new Metadata()).toString()));
            } catch (Exception unused) {
                return this.rootMimeTypeL;
            }
        }
        throw new IllegalArgumentException("Data is missing");
    }
}
