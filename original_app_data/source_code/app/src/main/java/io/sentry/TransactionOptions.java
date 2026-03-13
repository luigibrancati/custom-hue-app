package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class TransactionOptions extends SpanOptions {
    public static final long DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION = 30000;
    private CustomSamplingContext customSamplingContext = null;
    private boolean isAppStartTransaction = false;
    private boolean waitForChildren = false;
    private Long idleTimeout = null;
    private Long deadlineTimeout = null;
    private TransactionFinishedCallback transactionFinishedCallback = null;
    private ISpanFactory spanFactory = null;

    public CustomSamplingContext getCustomSamplingContext() {
        return this.customSamplingContext;
    }

    public Long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public ISpanFactory getSpanFactory() {
        return this.spanFactory;
    }

    public TransactionFinishedCallback getTransactionFinishedCallback() {
        return this.transactionFinishedCallback;
    }

    public boolean isAppStartTransaction() {
        return this.isAppStartTransaction;
    }

    public boolean isBindToScope() {
        return ScopeBindingMode.ON == getScopeBindingMode();
    }

    public boolean isWaitForChildren() {
        return this.waitForChildren;
    }

    public void setAppStartTransaction(boolean z10) {
        this.isAppStartTransaction = z10;
    }

    public void setBindToScope(boolean z10) {
        setScopeBindingMode(z10 ? ScopeBindingMode.ON : ScopeBindingMode.OFF);
    }

    public void setCustomSamplingContext(CustomSamplingContext customSamplingContext) {
        this.customSamplingContext = customSamplingContext;
    }

    public void setDeadlineTimeout(Long l10) {
        this.deadlineTimeout = l10;
    }

    public void setIdleTimeout(Long l10) {
        this.idleTimeout = l10;
    }

    public void setSpanFactory(ISpanFactory iSpanFactory) {
        this.spanFactory = iSpanFactory;
    }

    public void setTransactionFinishedCallback(TransactionFinishedCallback transactionFinishedCallback) {
        this.transactionFinishedCallback = transactionFinishedCallback;
    }

    public void setWaitForChildren(boolean z10) {
        this.waitForChildren = z10;
    }
}
