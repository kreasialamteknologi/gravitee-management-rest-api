/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.management.rest.builder;

import io.gravitee.management.model.ApiEntity;

import java.net.URI;
import java.util.Date;

/**
 * @author David BRASSELY (brasseld at gmail.com)
 */
public class ApiBuilder {

    private final ApiEntity api = new ApiEntity();

    public ApiBuilder name(String name) {
        this.api.setName(name);
        return this;
    }

    public ApiBuilder target(String target) {
        this.api.setTargetURI(URI.create(target));
        return this;
    }

    public ApiBuilder origin(String origin) {
        this.api.setPublicURI(URI.create(origin));
        return this;
    }

    public ApiBuilder createdAt(Date createdAt) {
        this.api.setCreatedAt(createdAt);
        this.api.setUpdatedAt(createdAt);
        return this;
    }

    public ApiBuilder updatedAt(Date updatedAt) {
        this.api.setUpdatedAt(updatedAt);
        return this;
    }

    public ApiEntity build() {
        return this.api;
    }
}