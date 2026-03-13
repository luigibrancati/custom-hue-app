package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class Stack {
    private final Deque<StackItem> items;
    private final AutoClosableReentrantLock itemsLock;
    private final ILogger logger;

    public Stack(ILogger iLogger, StackItem stackItem) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.items = linkedBlockingDeque;
        this.itemsLock = new AutoClosableReentrantLock();
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "logger is required");
        linkedBlockingDeque.push((StackItem) Objects.requireNonNull(stackItem, "rootStackItem is required"));
    }

    public StackItem peek() {
        return this.items.peek();
    }

    public void pop() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.itemsLock.acquire();
        try {
            if (this.items.size() != 1) {
                this.items.pop();
            } else {
                this.logger.log(SentryLevel.WARNING, "Attempt to pop the root scope.", new Object[0]);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void push(StackItem stackItem) {
        this.items.push(stackItem);
    }

    public int size() {
        return this.items.size();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class StackItem {
        private volatile ISentryClient client;
        private final SentryOptions options;
        private volatile IScope scope;

        public StackItem(SentryOptions sentryOptions, ISentryClient iSentryClient, IScope iScope) {
            this.client = (ISentryClient) Objects.requireNonNull(iSentryClient, "ISentryClient is required.");
            this.scope = (IScope) Objects.requireNonNull(iScope, "Scope is required.");
            this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "Options is required");
        }

        public ISentryClient getClient() {
            return this.client;
        }

        public SentryOptions getOptions() {
            return this.options;
        }

        public IScope getScope() {
            return this.scope;
        }

        public void setClient(ISentryClient iSentryClient) {
            this.client = iSentryClient;
        }

        public StackItem(StackItem stackItem) {
            this.options = stackItem.options;
            this.client = stackItem.client;
            this.scope = stackItem.scope.m251clone();
        }
    }

    public Stack(Stack stack) {
        this(stack.logger, new StackItem(stack.items.getLast()));
        Iterator<StackItem> itDescendingIterator = stack.items.descendingIterator();
        if (itDescendingIterator.hasNext()) {
            itDescendingIterator.next();
        }
        while (itDescendingIterator.hasNext()) {
            push(new StackItem(itDescendingIterator.next()));
        }
    }
}
