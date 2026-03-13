package b3;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class v {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(b3.t r9, b3.C2804c r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC4862t.e(r9, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.AbstractC4862t.e(r10, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r9.x()
            int r2 = r1.size()
            boolean[] r3 = new boolean[r2]
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r4 = r1.hasNext()
            r5 = -1
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r1.next()
            Cc.d r4 = (Cc.d) r4
            java.util.List r6 = r10.f25173s
            int r6 = r6.size()
            int r6 = r6 + r5
            if (r6 < 0) goto L4b
        L33:
            int r7 = r6 + (-1)
            java.util.List r8 = r10.f25173s
            java.lang.Object r8 = r8.get(r6)
            boolean r8 = r4.e(r8)
            if (r8 == 0) goto L46
            r5 = 1
            r3[r6] = r5
            r5 = r6
            goto L4b
        L46:
            if (r7 >= 0) goto L49
            goto L4b
        L49:
            r6 = r7
            goto L33
        L4b:
            if (r5 < 0) goto L57
            java.util.List r6 = r10.f25173s
            java.lang.Object r5 = r6.get(r5)
            r0.put(r4, r5)
            goto L1d
        L57:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "A required auto migration spec ("
            r9.append(r10)
            java.lang.String r10 = r4.j()
            r9.append(r10)
            java.lang.String r10 = ") is missing in the database configuration."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L7b:
            java.util.List r1 = r10.f25173s
            int r1 = r1.size()
            int r1 = r1 + r5
            if (r1 < 0) goto L99
        L84:
            int r4 = r1 + (-1)
            if (r1 >= r2) goto L91
            boolean r1 = r3[r1]
            if (r1 == 0) goto L91
            if (r4 >= 0) goto L8f
            goto L99
        L8f:
            r1 = r4
            goto L84
        L91:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            r9.<init>(r10)
            throw r9
        L99:
            java.util.List r9 = r9.j(r0)
            java.util.Iterator r9 = r9.iterator()
        La1:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lbf
            java.lang.Object r0 = r9.next()
            f3.b r0 = (f3.AbstractC3989b) r0
            b3.t$e r1 = r10.f25158d
            int r2 = r0.f34132a
            int r3 = r0.f34133b
            boolean r1 = r1.c(r2, r3)
            if (r1 != 0) goto La1
            b3.t$e r1 = r10.f25158d
            r1.a(r0)
            goto La1
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.v.a(b3.t, b3.c):void");
    }

    public static final void b(Set migrationStartAndEndVersions, Set migrationsNotRequiredFrom) {
        AbstractC4862t.e(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        AbstractC4862t.e(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (migrationStartAndEndVersions.isEmpty()) {
            return;
        }
        Iterator it = migrationStartAndEndVersions.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: " + iIntValue).toString());
            }
        }
    }

    public static final void c(t tVar, C2804c configuration) {
        AbstractC4862t.e(tVar, "<this>");
        AbstractC4862t.e(configuration, "configuration");
        Map mapA = tVar.A();
        boolean[] zArr = new boolean[mapA.size()];
        for (Map.Entry entry : mapA.entrySet()) {
            Cc.d dVar = (Cc.d) entry.getKey();
            for (Cc.d dVar2 : (List) entry.getValue()) {
                int size = configuration.f25172r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i10 = size - 1;
                        if (dVar2.e(configuration.f25172r.get(size))) {
                            zArr[size] = true;
                            break;
                        } else if (i10 < 0) {
                            break;
                        } else {
                            size = i10;
                        }
                    }
                    size = -1;
                } else {
                    size = -1;
                }
                if (size < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + dVar2.j() + ") for " + dVar.j() + " is missing in the database configuration.").toString());
                }
                tVar.e(dVar2, configuration.f25172r.get(size));
            }
        }
        int size2 = configuration.f25172r.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            if (!zArr[size2]) {
                throw new IllegalArgumentException("Unexpected type converter " + configuration.f25172r.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }
}
