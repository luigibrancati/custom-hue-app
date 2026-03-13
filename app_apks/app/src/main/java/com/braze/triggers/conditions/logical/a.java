package com.braze.triggers.conditions.logical;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public a(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        Iterator it = this.f28692a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (!((com.braze.triggers.conditions.c) it.next()).a(bVar)) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }
}
