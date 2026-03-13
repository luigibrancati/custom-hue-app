package b3;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: b3.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2808g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f25179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f25180b;

    public C2808g(t database) {
        AbstractC4862t.e(database, "database");
        this.f25179a = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        AbstractC4862t.d(setNewSetFromMap, "newSetFromMap(...)");
        this.f25180b = setNewSetFromMap;
    }
}
