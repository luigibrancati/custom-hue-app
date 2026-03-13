package z7;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: z7.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6544p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f48824b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6535g f48825a;

    public C6544p(C6535g c6535g) {
        this.f48825a = c6535g;
    }

    public static /* bridge */ /* synthetic */ Set a(C6544p c6544p, Set set, AbstractC6550v abstractC6550v, ZipFile zipFile) {
        HashSet hashSet = new HashSet();
        c6544p.f(abstractC6550v, set, new C6540l(c6544p, hashSet, abstractC6550v, zipFile));
        return hashSet;
    }

    public static void e(AbstractC6550v abstractC6550v, InterfaceC6541m interfaceC6541m) throws IllegalAccessException, IOException, InvocationTargetException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(abstractC6550v.a());
            try {
                String strB = abstractC6550v.b();
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = f48824b.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", strB, strGroup2, strGroup));
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new C6543o(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str)) {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str));
                        for (C6543o c6543o : (Set) map.get(str)) {
                            if (map2.containsKey(c6543o.f48822a)) {
                                Log.d("SplitCompat", String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", c6543o.f48822a, str));
                            } else {
                                map2.put(c6543o.f48822a, c6543o);
                                Log.d("SplitCompat", String.format("NativeLibraryExtractor: using library %s for ABI %s", c6543o.f48822a, str));
                            }
                        }
                    } else {
                        Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str));
                    }
                }
                interfaceC6541m.a(zipFile, new HashSet(map2.values()));
                zipFile.close();
            } catch (IOException e10) {
                e = e10;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e11) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e11);
                    }
                }
                throw e;
            }
        } catch (IOException e12) {
            e = e12;
            zipFile = null;
        }
    }

    public final Set b(AbstractC6550v abstractC6550v) throws IllegalAccessException, IOException, InvocationTargetException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        e(abstractC6550v, new C6538j(this, abstractC6550v, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    public final Set c() throws IllegalAccessException, IOException, InvocationTargetException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        Set<AbstractC6550v> setJ = this.f48825a.j();
        for (String str : this.f48825a.h()) {
            Iterator it = setJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    this.f48825a.n(str);
                    break;
                }
                if (((AbstractC6550v) it.next()).b().equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (AbstractC6550v abstractC6550v : setJ) {
            HashSet hashSet2 = new HashSet();
            e(abstractC6550v, new C6539k(this, hashSet2, abstractC6550v));
            for (File file : this.f48825a.i(abstractC6550v.b())) {
                if (!hashSet2.contains(file)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), abstractC6550v.b(), abstractC6550v.a().getAbsolutePath()));
                    this.f48825a.o(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void f(AbstractC6550v abstractC6550v, Set set, InterfaceC6542n interfaceC6542n) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C6543o c6543o = (C6543o) it.next();
            File fileC = this.f48825a.c(abstractC6550v.b(), c6543o.f48822a);
            boolean z10 = false;
            if (fileC.exists() && fileC.length() == c6543o.f48823b.getSize() && C6535g.p(fileC)) {
                z10 = true;
            }
            interfaceC6542n.a(c6543o, fileC, z10);
        }
    }
}
