package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.ClassLoaderUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ManifestModulesLoader extends ModulesLoader {
    private final Pattern NAME_AND_VERSION;
    private final Pattern URL_LIB_PATTERN;
    private final ClassLoader classLoader;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Module {
        private final String name;
        private final String version;

        public Module(String str, String str2) {
            this.name = str;
            this.version = str2;
        }
    }

    public ManifestModulesLoader(ILogger iLogger) {
        this(ManifestModulesLoader.class.getClassLoader(), iLogger);
    }

    private Module convertOriginalNameToModule(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.NAME_AND_VERSION.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            return new Module(matcher.group(1), matcher.group(2));
        }
        return null;
    }

    private List<Module> detectModulesViaManifestFiles() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.classLoader.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Module moduleConvertOriginalNameToModule = convertOriginalNameToModule(extractDependencyNameFromUrl(resources.nextElement()));
                if (moduleConvertOriginalNameToModule != null) {
                    arrayList.add(moduleConvertOriginalNameToModule);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Unable to detect modules via manifest files.", th);
            return arrayList;
        }
    }

    private String extractDependencyNameFromUrl(URL url) {
        Matcher matcher = this.URL_LIB_PATTERN.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public Map<String, String> loadModules() {
        HashMap map = new HashMap();
        for (Module module : detectModulesViaManifestFiles()) {
            map.put(module.name, module.version);
        }
        return map;
    }

    public ManifestModulesLoader(ClassLoader classLoader, ILogger iLogger) {
        super(iLogger);
        this.URL_LIB_PATTERN = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.NAME_AND_VERSION = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.classLoader = ClassLoaderUtils.classLoaderOrDefault(classLoader);
    }
}
