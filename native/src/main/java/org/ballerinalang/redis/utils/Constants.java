/*
 * Copyright (c) 2023 WSO2 LLC. (http://www.wso2.org)
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.ballerinalang.redis.utils;

/**
 * Constants for Redis client.
 *
 * @since 0.5.0
 */
public class Constants {

    // Redis client config name constants
    public static final String CONFIG_HOST = "host";
    public static final String CONFIG_PASSWORD = "password";
    public static final String CONFIG_OPTIONS = "options";
    public static final String CONFIG_CLUSTERING_ENABLED = "isClusterConnection";
    public static final String CONFIG_POOLING_ENABLED = "connectionPooling";
    public static final String CONFIG_CLIENT_NAME = "clientName";
    public static final String CONFIG_DATABASE = "database";
    public static final String CONFIG_CONNECTION_TIMEOUT = "connectionTimeout";
    public static final String CONFIG_SSL_ENABLED = "ssl";
    public static final String CONFIG_START_TLS_ENABLED = "startTls";
    public static final String CONFIG_VERIFY_PEER_ENABLED = "verifyPeer";

    // Native redis connection object, which is stored in Ballerina redis client object
    public static final String CONN_OBJ = "CONNECTION_OBJECT";

    // Redis error type name constants
    public static final String REDIS_ERROR_TYPE = "Error";

    // Redis Error message constants
    public static final String MUST_NOT_BE_NULL = "must not be null";
    public static final String KEY_MUST_NOT_BE_NULL = "Key " + MUST_NOT_BE_NULL;
    public static final String KEYS_MUST_NOT_BE_NULL = "Key(s) " + MUST_NOT_BE_NULL;
    public static final String ARGUMENTS_MUST_NOT_BE_NULL = "Arguments " + MUST_NOT_BE_NULL;
    public static final String REDIS_SERVER_ERROR = "Redis server error: ";

}
