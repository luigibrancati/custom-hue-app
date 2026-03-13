package io.sentry.util;

import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class DebugMetaPropertiesApplier {
    public static String DEBUG_META_PROPERTIES_FILENAME = "sentry-debug-meta.properties";

    public static void apply(SentryOptions sentryOptions, List<Properties> list) {
        if (list != null) {
            applyToOptions(sentryOptions, list);
            applyBuildTool(sentryOptions, list);
            applyDistributionOptions(sentryOptions, list);
        }
    }

    private static void applyBuildTool(SentryOptions sentryOptions, List<Properties> list) {
        for (Properties properties : list) {
            String buildTool = getBuildTool(properties);
            if (buildTool != null) {
                String buildToolVersion = getBuildToolVersion(properties);
                if (buildToolVersion == null) {
                    buildToolVersion = "unknown";
                }
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Build tool found: %s, version %s", buildTool, buildToolVersion);
                SentryIntegrationPackageStorage.getInstance().addPackage(buildTool, buildToolVersion);
                return;
            }
        }
    }

    private static void applyBundleIds(SentryOptions sentryOptions, List<Properties> list) {
        if (sentryOptions.getBundleIds().isEmpty()) {
            Iterator<Properties> it = list.iterator();
            while (it.hasNext()) {
                String property = it.next().getProperty("io.sentry.bundle-ids");
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Bundle IDs found: %s", property);
                if (property != null) {
                    for (String str : property.split(",", -1)) {
                        sentryOptions.addBundleId(str);
                    }
                }
            }
        }
    }

    private static void applyDistributionOptions(SentryOptions sentryOptions, List<Properties> list) {
        for (Properties properties : list) {
            String distributionOrgSlug = getDistributionOrgSlug(properties);
            String distributionProjectSlug = getDistributionProjectSlug(properties);
            String distributionAuthToken = getDistributionAuthToken(properties);
            String distributionBuildConfiguration = getDistributionBuildConfiguration(properties);
            if (distributionOrgSlug != null || distributionProjectSlug != null || distributionAuthToken != null || distributionBuildConfiguration != null) {
                SentryOptions.DistributionOptions distribution = sentryOptions.getDistribution();
                if (distributionOrgSlug != null && !distributionOrgSlug.isEmpty() && distribution.orgSlug.isEmpty()) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Distribution org slug found: %s", distributionOrgSlug);
                    distribution.orgSlug = distributionOrgSlug;
                }
                if (distributionProjectSlug != null && !distributionProjectSlug.isEmpty() && distribution.projectSlug.isEmpty()) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Distribution project slug found: %s", distributionProjectSlug);
                    distribution.projectSlug = distributionProjectSlug;
                }
                if (distributionAuthToken != null && !distributionAuthToken.isEmpty() && distribution.orgAuthToken.isEmpty()) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Distribution org auth token found", new Object[0]);
                    distribution.orgAuthToken = distributionAuthToken;
                }
                if (distributionBuildConfiguration == null || distributionBuildConfiguration.isEmpty() || distribution.buildConfiguration != null) {
                    return;
                }
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Distribution build configuration found: %s", distributionBuildConfiguration);
                distribution.buildConfiguration = distributionBuildConfiguration;
                return;
            }
        }
    }

    private static void applyProguardUuid(SentryOptions sentryOptions, List<Properties> list) {
        if (sentryOptions.getProguardUuid() == null) {
            Iterator<Properties> it = list.iterator();
            while (it.hasNext()) {
                String proguardUuid = getProguardUuid(it.next());
                if (proguardUuid != null) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Proguard UUID found: %s", proguardUuid);
                    sentryOptions.setProguardUuid(proguardUuid);
                    return;
                }
            }
        }
    }

    public static void applyToOptions(SentryOptions sentryOptions, List<Properties> list) {
        if (list != null) {
            applyBundleIds(sentryOptions, list);
            applyProguardUuid(sentryOptions, list);
        }
    }

    public static String getBuildTool(Properties properties) {
        return properties.getProperty("io.sentry.build-tool");
    }

    public static String getBuildToolVersion(Properties properties) {
        return properties.getProperty("io.sentry.build-tool-version");
    }

    private static String getDistributionAuthToken(Properties properties) {
        return properties.getProperty("io.sentry.distribution.auth-token");
    }

    private static String getDistributionBuildConfiguration(Properties properties) {
        return properties.getProperty("io.sentry.distribution.build-configuration");
    }

    private static String getDistributionOrgSlug(Properties properties) {
        return properties.getProperty("io.sentry.distribution.org-slug");
    }

    private static String getDistributionProjectSlug(Properties properties) {
        return properties.getProperty("io.sentry.distribution.project-slug");
    }

    public static String getProguardUuid(Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
