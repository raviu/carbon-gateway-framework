/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 * <p>
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.gateway.message.readers.jsonreader;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.wso2.carbon.gateway.core.flow.contentaware.MIMEType;
import org.wso2.carbon.gateway.core.flow.contentaware.messagereaders.Reader;
import org.wso2.carbon.gateway.core.flow.contentaware.messagereaders.ReaderProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * A Service class which can be used to register JSONReader
 */
@Component(
        name = "org.wso2.carbon.gateway.message.readers.jsonreader.JSONReaderProvider",
        immediate = true,
        service = ReaderProvider.class)
public class JSONReaderProvider implements ReaderProvider {

    @Activate
    protected void start(BundleContext bundleContext) {

    }

    @Override
    public List<Reader> getReader() {
        List<Reader> readers = new ArrayList<>();
        readers.add(new JSONReader(MIMEType.APPLICATION_JSON));
        return readers;
    }
}
