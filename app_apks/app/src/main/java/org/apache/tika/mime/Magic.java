package org.apache.tika.mime;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class Magic implements Clause, Comparable<Magic> {
    private final Clause clause;
    private final int priority;
    private final String string;
    private final MimeType type;

    public Magic(MimeType mimeType, int i10, Clause clause) {
        this.type = mimeType;
        this.priority = i10;
        this.clause = clause;
        this.string = "[" + i10 + "/" + String.valueOf(clause) + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Magic) {
            Magic magic = (Magic) obj;
            if (this.type.equals(magic.type) && this.string.equals(magic.string)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        return this.clause.eval(bArr);
    }

    public int getPriority() {
        return this.priority;
    }

    public MimeType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.string.hashCode() ^ this.type.hashCode();
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        return this.clause.size();
    }

    public String toString() {
        return this.string;
    }

    @Override // java.lang.Comparable
    public int compareTo(Magic magic) {
        int iCompareTo2 = magic.priority - this.priority;
        if (iCompareTo2 == 0) {
            iCompareTo2 = magic.size() - size();
        }
        if (iCompareTo2 == 0) {
            iCompareTo2 = magic.type.compareTo(this.type);
        }
        return iCompareTo2 == 0 ? magic.string.compareTo(this.string) : iCompareTo2;
    }
}
