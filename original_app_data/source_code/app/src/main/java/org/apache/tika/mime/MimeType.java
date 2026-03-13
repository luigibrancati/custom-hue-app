package org.apache.tika.mime;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class MimeType implements Comparable<MimeType>, Serializable {
    private static final long serialVersionUID = 4357830439860729201L;
    private final MediaType type;
    private final int minLength = 0;
    private String acronym = "";
    private String uti = "";
    private List<URI> links = Collections.EMPTY_LIST;
    private String description = "";
    private List<Magic> magics = null;
    private List<RootXML> rootXML = null;
    private List<String> extensions = null;
    private boolean isInterpreted = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class RootXML implements Serializable {
        private static final long serialVersionUID = 5140496601491000730L;
        private String localName;
        private String namespaceURI;
        private MimeType type;

        public RootXML(MimeType mimeType, String str, String str2) {
            this.type = null;
            this.namespaceURI = null;
            this.localName = null;
            if (isEmpty(str) && isEmpty(str2)) {
                throw new IllegalArgumentException("Both namespaceURI and localName cannot be empty");
            }
            this.type = mimeType;
            this.namespaceURI = str;
            this.localName = str2;
        }

        private boolean isEmpty(String str) {
            return str == null || str.equals("");
        }

        public String getLocalName() {
            return this.localName;
        }

        public String getNameSpaceURI() {
            return this.namespaceURI;
        }

        public MimeType getType() {
            return this.type;
        }

        public boolean matches(String str, String str2) {
            if (isEmpty(this.namespaceURI)) {
                if (!isEmpty(str)) {
                    return false;
                }
            } else if (!this.namespaceURI.equals(str)) {
                return false;
            }
            return !isEmpty(this.localName) ? this.localName.equals(str2) : isEmpty(str2);
        }

        public String toString() {
            return String.valueOf(this.type) + ", " + this.namespaceURI + ", " + this.localName;
        }
    }

    public MimeType(MediaType mediaType) {
        if (mediaType == null) {
            throw new IllegalArgumentException("Media type name is missing");
        }
        this.type = mediaType;
    }

    public static boolean isValid(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Name is missing");
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= ' ' || cCharAt >= 127 || cCharAt == '(' || cCharAt == ')' || cCharAt == '<' || cCharAt == '>' || cCharAt == '@' || cCharAt == ',' || cCharAt == ';' || cCharAt == ':' || cCharAt == '\\' || cCharAt == '\"' || cCharAt == '[' || cCharAt == ']' || cCharAt == '?' || cCharAt == '=') {
                return false;
            }
            if (cCharAt == '/') {
                if (z10 || i10 == 0 || i10 + 1 == str.length()) {
                    return false;
                }
                z10 = true;
            }
        }
        return z10;
    }

    public void addExtension(String str) {
        List<String> list = this.extensions;
        if (list == null) {
            this.extensions = Collections.singletonList(str);
        } else if (list.size() == 1) {
            this.extensions = new ArrayList(this.extensions);
        }
        if (this.extensions.contains(str)) {
            return;
        }
        this.extensions.add(str);
    }

    public void addLink(URI uri) {
        if (uri == null) {
            throw new IllegalArgumentException("Missing Link");
        }
        ArrayList arrayList = new ArrayList(this.links.size() + 1);
        arrayList.addAll(this.links);
        arrayList.add(uri);
        this.links = Collections.unmodifiableList(arrayList);
    }

    public void addMagic(Magic magic) {
        if (magic == null) {
            return;
        }
        if (this.magics == null) {
            this.magics = new ArrayList();
        }
        this.magics.add(magic);
    }

    public void addRootXML(String str, String str2) {
        if (this.rootXML == null) {
            this.rootXML = new ArrayList();
        }
        this.rootXML.add(new RootXML(this, str, str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof MimeType) {
            return this.type.equals(((MimeType) obj).type);
        }
        return false;
    }

    public String getAcronym() {
        return this.acronym;
    }

    public String getDescription() {
        return this.description;
    }

    public String getExtension() {
        List<String> list = this.extensions;
        return list == null ? "" : list.get(0);
    }

    public List<String> getExtensions() {
        List<String> list = this.extensions;
        return list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
    }

    public List<URI> getLinks() {
        return this.links;
    }

    public List<Magic> getMagics() {
        List<Magic> list = this.magics;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int getMinLength() {
        return 0;
    }

    public String getName() {
        return this.type.toString();
    }

    public MediaType getType() {
        return this.type;
    }

    public String getUniformTypeIdentifier() {
        return this.uti;
    }

    public boolean hasMagic() {
        return this.magics != null;
    }

    public boolean hasRootXML() {
        return this.rootXML != null;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public boolean isInterpreted() {
        return this.isInterpreted;
    }

    public boolean matches(byte[] bArr) {
        return matchesMagic(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean matchesMagic(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.List<org.apache.tika.mime.Magic> r2 = r3.magics
            if (r2 == 0) goto L1f
            int r2 = r2.size()
            if (r1 >= r2) goto L1f
            java.util.List<org.apache.tika.mime.Magic> r2 = r3.magics
            java.lang.Object r2 = r2.get(r1)
            org.apache.tika.mime.Magic r2 = (org.apache.tika.mime.Magic) r2
            boolean r2 = r2.eval(r4)
            if (r2 == 0) goto L1c
            r3 = 1
            return r3
        L1c:
            int r1 = r1 + 1
            goto L2
        L1f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.mime.MimeType.matchesMagic(byte[]):boolean");
    }

    public boolean matchesXML(String str, String str2) {
        List<RootXML> list = this.rootXML;
        if (list == null) {
            return false;
        }
        Iterator<RootXML> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().matches(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public void setAcronym(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Acronym is missing");
        }
        this.acronym = str;
    }

    public void setDescription(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Description is missing");
        }
        this.description = str;
    }

    public void setInterpreted(boolean z10) {
        this.isInterpreted = z10;
    }

    public void setUniformTypeIdentifier(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Uniform Type Identifier is missing");
        }
        this.uti = str;
    }

    public String toString() {
        return this.type.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(MimeType mimeType) {
        return this.type.compareTo(mimeType.type);
    }
}
