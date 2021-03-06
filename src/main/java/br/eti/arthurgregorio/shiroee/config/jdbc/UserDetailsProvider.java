/*
 * Copyright 2018 Arthur Gregorio.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.eti.arthurgregorio.shiroee.config.jdbc;

import java.util.Optional;

/**
 * The user details provider definition
 *
 * @author Arthur Gregorio
 *
 * @version 1.0.0
 * @since 1.0.0, 03/02/2018
 */
public interface UserDetailsProvider {

    /**
     * Retrieve from a unknow datasource (mostly a database connection) the user
     * account details
     * 
     * @param username the username to search for the {@link UserDetails}
     * @return a {@link Optional} with the details
     */
    Optional<UserDetails> findUserDetailsByUsername(String username);
}
