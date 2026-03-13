package org.apache.tika.mime;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class OrClause implements Clause {
    private final List<Clause> clauses;

    public OrClause(List<Clause> list) {
        this.clauses = list;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        Iterator<Clause> it = this.clauses.iterator();
        while (it.hasNext()) {
            if (it.next().eval(bArr)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        Iterator<Clause> it = this.clauses.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().size());
        }
        return iMax;
    }

    public String toString() {
        return "or" + String.valueOf(this.clauses);
    }
}
