package org.apache.tika.config;

import org.apache.tika.detect.Detector;
import org.apache.tika.parser.Parser;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TikaActivator implements BundleActivator, ServiceTrackerCustomizer {
    private BundleContext bundleContext;
    private ServiceTracker detectorTracker;
    private ServiceTracker parserTracker;

    public Object addingService(ServiceReference serviceReference) {
        Object property = serviceReference.getProperty("service.ranking");
        int iIntValue = property instanceof Integer ? ((Integer) property).intValue() : 0;
        Object service = this.bundleContext.getService(serviceReference);
        ServiceLoader.addService(serviceReference, service, iIntValue);
        return service;
    }

    public void removedService(ServiceReference serviceReference, Object obj) {
        ServiceLoader.removeService(serviceReference);
        this.bundleContext.ungetService(serviceReference);
    }

    public void start(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
        this.detectorTracker = new ServiceTracker(bundleContext, Detector.class.getName(), this);
        this.parserTracker = new ServiceTracker(bundleContext, Parser.class.getName(), this);
        this.detectorTracker.open();
        this.parserTracker.open();
    }

    public void stop(BundleContext bundleContext) {
        this.parserTracker.close();
        this.detectorTracker.close();
    }

    public void modifiedService(ServiceReference serviceReference, Object obj) {
    }
}
