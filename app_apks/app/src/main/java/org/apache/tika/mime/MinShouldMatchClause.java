package org.apache.tika.mime;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class MinShouldMatchClause implements Clause {
    private final List<Clause> clauses;
    private final int min;

    public MinShouldMatchClause(int i10, List<Clause> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("clauses must be not null with size > 0");
        }
        if (i10 <= list.size()) {
            if (i10 > 0) {
                this.min = i10;
                this.clauses = list;
                return;
            } else {
                throw new IllegalArgumentException("min cannot be <= 0: " + i10);
            }
        }
        throw new IllegalArgumentException("min (" + i10 + ") cannot be > clauses.size (" + list.size() + ")");
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        Iterator<Clause> it = this.clauses.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().eval(bArr) && (i10 = i10 + 1) >= this.min) {
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
        return "minShouldMatch (min: " + this.min + ") " + String.valueOf(this.clauses);
    }
}
