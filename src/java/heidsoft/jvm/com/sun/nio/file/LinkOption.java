/*
 * Copyright (c) 2007, 2011, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package heidsoft.jvm.com.sun.nio.file;

/**
 * Defines the options as to how symbolic links are handled.
 *
 * @since 1.7
 */

public enum LinkOption implements OpenOption, CopyOption {
    /**
     * Do not follow symbolic links.
     *
     * @see Files#getFileAttributeView(Path,Class, heidsoft.jvm.com.sun.nio.file.LinkOption[])
     * @see Files#copy
     * @see SecureDirectoryStream#newByteChannel
     */
    NOFOLLOW_LINKS;
}
