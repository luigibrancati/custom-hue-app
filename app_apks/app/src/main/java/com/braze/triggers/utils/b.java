package com.braze.triggers.utils;

import com.braze.triggers.actions.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator f28759b = new Comparator() { // from class: x5.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return com.braze.triggers.utils.b.a((com.braze.triggers.actions.a) obj, (com.braze.triggers.actions.a) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityQueue f28760a;

    public b(ArrayList fallbackActions) {
        AbstractC4862t.e(fallbackActions, "fallbackActions");
        PriorityQueue priorityQueue = new PriorityQueue(12, f28759b);
        this.f28760a = priorityQueue;
        priorityQueue.addAll(fallbackActions);
    }

    public static final int a(com.braze.triggers.actions.a actionA, com.braze.triggers.actions.a actionB) {
        AbstractC4862t.e(actionA, "actionA");
        AbstractC4862t.e(actionB, "actionB");
        g gVar = (g) actionA;
        int i10 = gVar.f28670b.f28696c;
        g gVar2 = (g) actionB;
        int i11 = gVar2.f28670b.f28696c;
        if (i10 > i11) {
            return -1;
        }
        if (i10 < i11) {
            return 1;
        }
        return gVar.f28669a.compareTo(gVar2.f28669a);
    }
}
