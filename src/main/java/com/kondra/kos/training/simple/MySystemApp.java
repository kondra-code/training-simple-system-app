/**
 * (C) Copyright 2025, TCCC, All rights reserved.
 */
package com.kondra.kos.training.simple;

import com.tccc.kos.core.service.app.BaseAppConfig;
import com.tccc.kos.core.service.app.SystemApplication;
import lombok.extern.slf4j.Slf4j;

/**
 * Simple system application for KOS.
 * <p>
 * When kOS boots, and finishes initializing all internal services, it will
 * load a single user-defined system application which takes control of
 * the device and defines how it works. This particular system application
 * as a minimal application that does virtually nothing. It is intended to
 * be a template for a real system application, including a pom.xml template
 * used to build the app.
 *
 * @author David Vogt
 * @version 2025-05-14
 */
@Slf4j
public class MySystemApp extends SystemApplication<BaseAppConfig> {
    /**
     * The {@code load()} lifecycle callback is used to create beans and add
     * them to the application context via {@code addToCtx()}. When this
     * method returns, the application loader will autowire all the beans
     * in the context and configure any beans that implement {@code ConfigAware}.
     * The loader will then call the {@code start()} lifecycle event.
     * <p>
     * If your application needs to use {@code RegionService} to manage
     * region-specific data, you should also setup your region information
     * in this lifecycle event so that it's available for use in KOS before
     * application autowiring occurs.
     * <p>
     * This method is not required, and only included in this demo to
     * educate about typical application lifecycle events.
     */
    @Override
    public void load() throws Exception {
        log.info("Called load()");
    }

    /**
     * The {@code start()} lifecycle callback is called after {@code load()} returns
     * and KOS has autowired and configured any beans placed into the application
     * context. This means that any of the beans created in {@code load()} are now
     * fully ready for use. This method is typically used to perform additional
     * setup of the application now that all the beans from {@code load()} are
     * available for use.
     * <p>
     * When this method returns, the application loader will make all application
     * endpoints and VFS mounts available for use.
     * <p>
     * This method is not required, and only included in this demo to
     * educate about typical application lifecycle events.
     */
    @Override
    public void start() throws Exception {
        log.info("Called start()");
    }

    /**
     * The {@code started()} lifecycle callback is called after {@code start()}
     * returns and KOS has enabled all endpoints and VFS mounts. At this point
     * the application is fully functional and able to process external requests.
     * <p>
     * This method is not required, and only included in this demo to
     * educate about typical application lifecycle events.
     */
    @Override
    public void started() throws Exception {
        log.info("Called started()");
    }
}
