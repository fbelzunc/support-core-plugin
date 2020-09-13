/*
 * The MIT License
 *
 * Copyright (c) 2020, CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.cloudbees.jenkins.support;

import hudson.Extension;
import hudson.model.ManagementLink;
import hudson.model.Saveable;
import org.kohsuke.accmod.Restricted;
import org.kohsuke.accmod.restrictions.NoExternalUse;

import javax.annotation.Nonnull;
import java.io.IOException;

/**
 * Support Plugin Configuration
 *
 * @since TODO
 */
@Extension
@Restricted(NoExternalUse.class)
public class SupportPluginConfiguration extends ManagementLink implements Saveable {
    @Nonnull
    @Override
    public String getIconFileName() {
        return "/plugin/support-core/images/48x48/support.png";
    }

    @Nonnull
    @Override
    public String getDisplayName() {
        return Messages.SupportPluginConfig_DisplayName();
    }

    @Override
    public String getDescription() {
        return  Messages.SupportPluginConfig_Description();
    }

    @Nonnull
    @Override
    public String getUrlName() {
        return "supportCoreConfiguration";
    }

    @Override
    public void save() throws IOException {

    }
}
