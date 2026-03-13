package io.sentry;

import io.sentry.util.Objects;
import io.sentry.util.SentryRandom;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SamplingContext {
    private final Map<String, Object> attributes;
    private final CustomSamplingContext customSamplingContext;
    private final Double sampleRand;
    private final TransactionContext transactionContext;

    @Deprecated
    public SamplingContext(TransactionContext transactionContext, CustomSamplingContext customSamplingContext) {
        this(transactionContext, customSamplingContext, Double.valueOf(SentryRandom.current().nextDouble()), null);
    }

    public Object getAttribute(String str) {
        if (str == null) {
            return null;
        }
        return this.attributes.get(str);
    }

    public CustomSamplingContext getCustomSamplingContext() {
        return this.customSamplingContext;
    }

    public Double getSampleRand() {
        return this.sampleRand;
    }

    public TransactionContext getTransactionContext() {
        return this.transactionContext;
    }

    public SamplingContext(TransactionContext transactionContext, CustomSamplingContext customSamplingContext, Double d10, Map<String, Object> map) {
        this.transactionContext = (TransactionContext) Objects.requireNonNull(transactionContext, "transactionContexts is required");
        this.customSamplingContext = customSamplingContext;
        this.sampleRand = d10;
        this.attributes = map == null ? Collections.EMPTY_MAP : map;
    }
}
