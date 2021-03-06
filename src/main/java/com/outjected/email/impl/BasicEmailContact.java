/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.outjected.email.impl;

import com.outjected.email.api.EmailContact;

/**
 * @author Cody Lerum
 */
public class BasicEmailContact implements EmailContact {

    private String address;
    private String name;

    public BasicEmailContact(String address) {
        this.address = address;
    }

    public BasicEmailContact(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        EmailContact e = (EmailContact) o;

        return toString().equals(e.toString());
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public String toString() {
        if (name == null || name.length() == 0) {
            return address;
        }
        else {
            return name + " <" + address + ">";
        }
    }
}
